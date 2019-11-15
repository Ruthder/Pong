package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;

public class Raqueta implements Serializable {

    private final int x;
    private int y;
    static final int ANCHO = 10, ALTO = 50;

    Raqueta(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setY(int y) {
        this.y = y;
    }

    Rectangle2D getRaqueta() {
        return new Rectangle2D.Double(x, y, ANCHO, ALTO);
    }

    void moverR1(Rectangle limites) {
        if (EventoTeclado.w && y > limites.getMinY()) {
            y = y - 2;
        }
        if (EventoTeclado.s && y < limites.getMaxY() - ALTO) {
            y = y + 2;
        }
    }

    void moverR2(Rectangle limites) {
        if (EventoTeclado.up && y > limites.getMinY()) {
            y = y - 2;
        }
        if (EventoTeclado.down && y < limites.getMaxY() - ALTO) {
            y = y + 2;
        }
    }
}
