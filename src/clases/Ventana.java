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
    
    public Ventana(boolean server, Principal p, String ip) {
        this.server = server;
        setTitle("JUEGO HOCKEY");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        canvas = new Tablero(this, p, server);
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
        addKeyListener(new EventoTeclado());
        new EngineGraphics(canvas).start();
    }
}
