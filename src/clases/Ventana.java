package clases;

import javax.swing.*;

import control.EngineGraphics;
import net.ClientThread;
import net.ServerThread;
import principal.Principal;

public class Ventana extends JFrame {

    private boolean server;
    private Tablero canvas;
    private volatile boolean running;
    private final Principal p;
    private String ip;
    private Menu m;
    
    public Ventana(boolean server, Principal p, String ip, double velocity, int score, Menu menu) {
        this.server = server;
        this.m = menu;
        setTitle("PONG");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        canvas = new Tablero(this, p, server, velocity, score);
        add(canvas);
        this.p = p;
        this.ip = ip;
        iniciar();
    }

    private synchronized void iniciar() {
        Tablero v = canvas;
        Runnable nuevo;
        if (server) {
            nuevo = new ServerThread(this, p);
        } else {
            nuevo = new ClientThread(this, p, ip);
            String vec[] = p.getPosiciones();
            v.setMaxScore(Integer.parseInt(vec[6]));
            v.setVelocity(Double.parseDouble(vec[5]));
            System.out.println(vec[5]+";"+vec[6]);
            abrir();
        }
        Thread hilo = new Thread(nuevo);
        hilo.start();
    }

    private synchronized void detener() {
        running = false;
    }

    public void abrir() {
        running = true;
        setVisible(true);
        addKeyListener(new EventoTeclado());
        new EngineGraphics(canvas).start();
        m.dispose();
    }
}
