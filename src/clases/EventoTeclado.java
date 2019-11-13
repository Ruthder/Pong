package clases;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventoTeclado implements KeyListener {

    static boolean w, s, up, down, enter, esc;
    
    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        teclas(true, e);
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        teclas(false, e);
    }
    
    public void teclas(boolean presionada, KeyEvent e){
        
        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W) {
            w = presionada;
        }
        if (id == KeyEvent.VK_S) {
            s = presionada;
        }
        if (id == KeyEvent.VK_UP) {
            up = presionada;
        }
        if (id == KeyEvent.VK_DOWN) {
            down = presionada;
        }
    } 

}
