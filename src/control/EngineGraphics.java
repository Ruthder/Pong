
package control;

import clases.Tablero;
import clases.Pelota;


public class EngineGraphics extends Thread {

    private final Tablero lienzo;
    
    public EngineGraphics(Tablero canvas) {
        this.lienzo = canvas;
    }

    @Override
    public synchronized void run() {
        
        while (!Pelota.finJuego) {
            lienzo.repaint();
            try {
                //Paint Velocity 
                Thread.sleep(5);
            } catch (Exception ex) {
                System.out.println("error in graphics engine: " + ex.getMessage());
            }
        }
    }
}
