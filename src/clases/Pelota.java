package clases;

import java.applet.AudioClip;
import java.awt.geom.Rectangle2D;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import obtenerRecursos.Audio;

public class Pelota {

    private final int TAMX = 15;
    private final int TAMY = 15;
    private double x = 0;
    private double y = 0;
    private double dx = 1;
    private double dy = 1;

    private int score1 = 0;
    private int score2 = 0;
    public static volatile boolean finJuego = false;

    private final Audio audio = new Audio();
    private final AudioClip rebote_1 = audio.getAudio("/recursos/rebote_pelota1.wav");
    private final AudioClip rebote_2 = audio.getAudio("/recursos/rebote_pelota2.wav");
    private final AudioClip falta = audio.getAudio("/recursos/falta.wav");

    public Pelota(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public void setY(double y) {
        this.y = y;
    }

    //retorna la pelota (Rectangle2D implementa la interface Shape)
    Rectangle2D getShape() {
        return new Rectangle2D.Double(x, y, TAMX, TAMY);
    }

    void moverPelota(Rectangle2D limites, boolean colisionR1, boolean colisionR2) {
        x += dx;
        y += dy;

        boolean b = false;

        if (colisionR1) {
            dx = -dx;
            x = 20;
            rebote_1.play();
        }

        if (colisionR2) {
            dx = -dx;
            x = 755;
            rebote_1.play();
        }

        if (x < limites.getMinX()) {
            //score2++; //el puntaje del jugador 2 aumenta en uno

            x = limites.getCenterX();
            y = limites.getCenterY();
            dx = -dx;
            falta.play();
            b = true;
        }

        if (x + TAMX >= limites.getMaxX()) {
            //score1++; //el puntaje del jugador 1 aumenta en uno

            x = limites.getCenterX();
            y = limites.getCenterY();
            dx = -dx;
            falta.play();
            b = true;
        }

        if (y < limites.getMinY()) {
            y = limites.getMinY();
            dy = -dy;
            rebote_2.play();
        }

        if (y + TAMY >= limites.getMaxY()) {
            y = limites.getMaxY() - TAMY;
            dy = -dy;
            rebote_2.play();
        }

        if (b) {
            delay(250);
        }
    }

    int getScore1() {
        return score1;
    }

    int getScore2() {
        return score2;
    }

    private void delay(int ms) {
        try {
            TimeUnit.MILLISECONDS.sleep(ms);
        } catch (InterruptedException ex) {
            Logger.getLogger(Pelota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
