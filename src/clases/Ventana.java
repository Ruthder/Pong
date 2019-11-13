package clases;

import javax.swing.*;

import control.EngineGraphics;
import net.ClientThread;
import net.ServerThread;
import principal.Principal;

public class Ventana extends JFrame {

    boolean server;
    public Tablero canvas;
    volatile boolean running;
    private final Principal p;
    
    public Ventana(boolean server, Principal p) {
        this.server = server;
        setTitle("JUEGO HOCKEY");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        canvas = new Tablero(this, p, server);
        add(canvas);
        this.p = p;
        iniciar();
    }

    private synchronized void iniciar() {
        Tablero v = canvas;
        Runnable nuevo;
        if (server) {
            nuevo = new ServerThread(v, this, p);
        } else {
            nuevo = new ClientThread(v, this, p);
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
