package net;

import clases.Pelota;
import clases.Ventana;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.Principal;



public class ServerThread implements Runnable {

    private final int PORT = 6870;
    private static  ServerSocket sc;
    private Socket socket;
    private boolean state = false;
    private Ventana v1;
    private Principal p;

    public ServerThread(Ventana v1, Principal pal) {
        this.v1 = v1;
        this.p = pal;
        
        //Creación del servidor
        try {
            sc = new ServerSocket(PORT);
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void cerrarServer(){
        
        //Cerrar servidor
        try {
            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //Hilo Servidor
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

            //ejecutar "recibir" 60 veces por segundo
            while (delta >= 1) {
                recibir();
                delta--;
            }
        }
    }

    void recibir() {
        try {
            socket = new Socket();
            
            //Esperar la conexión con el cliente
            socket = sc.accept();
            if (!state) {
                v1.abrir();
                state = true; 
            }
            DataInputStream entrada = new DataInputStream(socket.getInputStream());
            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
            
            /*Recibir la posicion de la raqueta del cliente para posteriormente
            **actualizar los gráficos del tablero*/
            String auxiliar = entrada.readUTF();
            p.setCadena(auxiliar);
            
            /*Enviar los puntajes y las posiciones de la raqueta del servidor y de la pelota*/
            String auxiliar2 = p.getCadenaS();
            salida.writeUTF(auxiliar2);
            
            //Cerrar conexión
            socket.close();
        } catch (IOException ex) {
            
        }
    }

}
