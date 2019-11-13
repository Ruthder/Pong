
package principal;

import clases.Menu;
import javax.swing.JFrame;


public class Principal {
    
    volatile String cadena, cadenaS;
    volatile String[] posiciones, posicionesS;
    
    public String getCadena() {
        return cadena;
    }

    public String[] getPosiciones() {
        return posiciones;
    }
    
    public void setCadena(String cadena) {
        this.cadena = cadena;
        posiciones = cadena.split(";");
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        Menu ventana = new Menu(p);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
