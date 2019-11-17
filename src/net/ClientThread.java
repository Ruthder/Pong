package net;

import clases.Pelota;
import clases.Ventana;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.Principal;

public class ClientThread implements Runnable {

    private final int PUERTO = 6969;
    private static Socket socket;
    private DataOutputStream mensaje;
    private DataInputStream mensajeS;
    private Ventana n1;
    private Principal p;
    private final String IP;

    public ClientThread(Ventana n1, Principal p, String ip) {
        this.n1 = n1;
        this.p = p;
        this.IP = ip;
    }

    @Override
    public synchronized void run() {
        final int nsporsegundo = 1000000000;
        final byte apsObjetivo = 60;
        final double nsporactualización = nsporsegundo / apsObjetivo;

        long referenciaAct = System.nanoTime();

        double tiempoTranscurrido;
        double delta = 0;

        while (!Pelota.finJuego) {
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
    
    public static void cerrarCliente(){
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void mandar() {
        try {
            socket = new Socket(IP, PUERTO);
            if (!socket.isClosed()) {
                mensaje = new DataOutputStream(socket.getOutputStream());
                mensajeS = new DataInputStream(socket.getInputStream());
                String auxiliar = p.getCadena();
                mensaje.writeUTF(auxiliar);
                String auxiliar2 = mensajeS.readUTF();
                p.setCadenaS(auxiliar2);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
