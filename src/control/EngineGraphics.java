
package control;

import clases.Tablero;
import clases.Pelota;


public class EngineGraphics extends Thread {

    private final Tablero lienzo;
    final int nsporsegundo = 1000000000;
    final byte apsObjetivo = 60;
    final double nsporactualización = nsporsegundo / apsObjetivo;

    long referenciaAct = System.nanoTime();

    double tiempoTranscurrido;
    double delta = 0;
    
    public EngineGraphics(Tablero canvas) {
        this.lienzo = canvas;
    }

    @Override
    public synchronized void run() {
        
        while (!Pelota.finJuego) {
            final long inicioBucle = System.nanoTime();
            tiempoTranscurrido = inicioBucle - referenciaAct;
            referenciaAct = inicioBucle;
            delta += tiempoTranscurrido / nsporactualización;

            while (delta >= 1) {
                lienzo.repaint();
                delta--;
            }
        }
    }
}
