
package principal;

import clases.Menu;
import javax.swing.JFrame;


public class Principal {
    
    volatile String cadena, cadenaS;
    volatile String[] posiciones;
    
    public String getCadena() {
        return cadena;
    }

    public String[] getPosiciones() {
        return posiciones;
    }

    public String getCadenaS() {
        return cadenaS;
    }

    public void setCadenaS(String cadenaS) {
        this.cadenaS = cadenaS;
        posiciones = cadenaS.split(";");
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        Menu ventana = new Menu(p);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
