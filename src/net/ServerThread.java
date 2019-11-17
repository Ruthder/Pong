package net;

import clases.Ventana;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import principal.Principal;

public class ServerThread implements Runnable {

    private final int PORT = 6969;
    private ServerSocket sc;
    private Socket socket;
    private boolean state = false;
    private Ventana v1;
    private Principal p;

    public ServerThread(Ventana v1, Principal pal) {
        this.v1 = v1;
        this.p = pal;
    }

    @Override
    public synchronized void run() {

        final int nsporsegundo = 1000000000;
        final byte apsObjetivo = 60;
        final double nsporactualización = nsporsegundo / apsObjetivo;

        long referenciaAct = System.nanoTime();

        double tiempoTranscurrido;
        double delta = 0;

        try {
            sc = new ServerSocket(PORT);
        } catch (IOException ex) {}

        while (true) {
            final long inicioBucle = System.nanoTime();
            tiempoTranscurrido = inicioBucle - referenciaAct;
            referenciaAct = inicioBucle;
            delta += tiempoTranscurrido / nsporactualización;

            while (delta >= 1) {
                recibir();
                delta--;
            }
        }
    }

    void recibir() {
        try {
            socket = new Socket();
            socket = sc.accept();
            if (!state) {
                v1.abrir();
                state = true; 
            }
            DataInputStream entrada = new DataInputStream(socket.getInputStream());
            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
            String auxiliar = entrada.readUTF();
            p.setCadena(auxiliar);
            String auxiliar2 = p.getCadenaS();
            salida.writeUTF(auxiliar2);       
            socket.close();
        } catch (IOException ex) {
            //System.out.println(ex.getMessage());
        }
    }

}
