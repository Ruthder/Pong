
package control;

import clases.Tablero;
import clases.Pelota;


public class EngineGraphics extends Thread {

    //Conversiones mátematicas
    private final Tablero lienzo;
    final int nsporsegundo = 1000000000;
    final byte apsObjetivo = 60;
    final double nsporactualización = nsporsegundo / apsObjetivo;

    long referenciaAct = System.nanoTime();

    double tiempoTranscurrido;
    double delta = 0;
    
    public EngineGraphics(Tablero tablero) {
        this.lienzo = tablero;
    }

    @Override
    public synchronized void run() {
        
        while (!Pelota.finJuego) {
            //Fórmula para actualizar el tablero 60 veces por segundo
            final long inicioBucle = System.nanoTime();
            tiempoTranscurrido = inicioBucle - referenciaAct;
            referenciaAct = inicioBucle;
            delta += tiempoTranscurrido / nsporactualización;

            while (delta >= 1) {
                //actualizar el tablero
                lienzo.repaint();
                delta--;
            }
        }
    }
}
