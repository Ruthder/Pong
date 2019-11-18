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

public class ClientThread extends Thread {

    private final int PUERTO = 6870;
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

    //Hilo Cliente
    @Override
    public synchronized void run() {
        
        //Conversiones mátematicas
        final int nsporsegundo = 1000000000;
        final byte apsObjetivo = 60;
        final double nsporactualización = nsporsegundo / apsObjetivo;

        long referenciaAct = System.nanoTime();

        double tiempoTranscurrido;
        double delta = 0;

        while (!Pelota.finJuego) {
            //Fórmula para enviar y recibir datos 60 veces por segundo
            final long inicioBucle = System.nanoTime();
            tiempoTranscurrido = inicioBucle - referenciaAct;
            referenciaAct = inicioBucle;
            delta += tiempoTranscurrido / nsporactualización;

            //ejecutar "mandar" 60 veces por segundo
            while (delta >= 1) {
                mandar();
                delta--;
            }
        }
    }
    
    public static void cerrarCliente(){
        //Cerrar cliente
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void mandar() {
        try {
            //Nueva conexión
            socket = new Socket(IP, PUERTO);
            if (!socket.isClosed()) {
                mensaje = new DataOutputStream(socket.getOutputStream());
                mensajeS = new DataInputStream(socket.getInputStream());
                
                /*Enviar la posicion de la raqueta del cliente*/
                String auxiliar = p.getCadena();
                mensaje.writeUTF(auxiliar);
                
                /*Recibe los puntajes y las posiciones de la raqueta del servidor y de la pelota para
                **posteriormente actualizar los gráficos del tablero*/
                String auxiliar2 = mensajeS.readUTF();
                p.setCadenaS(auxiliar2);
            }
            
            //Cerrar Conexión
            socket.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
