package net;

import clases.Tablero;
import clases.Ventana;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import principal.Principal;

public class ClientThread implements Runnable {

    private final String HOST = "localhost";
    private final int PUERTO = 6969;
    private Socket socket;
    private DataOutputStream mensaje;
    private DataInputStream mensajeS;
    private Tablero v;
    private Ventana n1;
    private Principal p;

    public ClientThread(Tablero v, Ventana n1, Principal p) {
        this.v = v;
        this.n1 = n1;
        this.p = p;
    }

    @Override
    public synchronized void run() {
        final int nsporsegundo = 1000000000;
        final byte apsObjetivo = 60;
        final double nsporactualización = nsporsegundo / apsObjetivo;

        long referenciaAct = System.nanoTime();

        double tiempoTranscurrido;
        double delta = 0;

        while (true) {
            final long inicioBucle = System.nanoTime();
            tiempoTranscurrido = inicioBucle - referenciaAct;
            referenciaAct = inicioBucle;
            delta += tiempoTranscurrido / nsporactualización;

            while (delta >= 1) {
                mandar();
                delta--;
            }
        }
    }

    void mandar() {
        try {
            socket = new Socket(HOST, PUERTO);
            if (!socket.isClosed()) {
                mensaje = new DataOutputStream(socket.getOutputStream());
                mensajeS = new DataInputStream(socket.getInputStream());
                String auxiliar = p.getCadena();
                mensaje.writeUTF(auxiliar);
                String auxiliar2 = mensajeS.readUTF();
                System.out.println(auxiliar2);
            }
            socket.close();
        } catch (IOException ex) {
            //System.out.println(ex.getMessage());
        }
    }
}
