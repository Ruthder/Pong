package clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import principal.Principal;

public class Tablero extends JPanel implements Runnable {

    public Raqueta r1 = new Raqueta(10, 200);
    public Raqueta r2 = new Raqueta(784 - Raqueta.ANCHO, 200);
    public Pelota p;
    boolean fin = false;
    private Ventana v;
    private Principal principal;
    boolean server;
    String aux, aux2;

    public Tablero(Ventana v, Principal principal, boolean server, double velocity) {
        p = new Pelota(velocity, velocity);
        this.v = v;
        this.server = server;
        this.setBackground(Color.BLACK);
        this.principal = principal;
        aux = "" + (int) r2.getRaqueta().getY();
        aux2 = (int) r1.getRaqueta().getY() + ";"
                + (int) p.getShape().getX() + ";"
                + (int) p.getShape().getY() + ";" + p.getScore1() + ";" + p.getScore2();
        principal.setCadena(aux);
        principal.setCadenaS(aux2);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.YELLOW);
        dibujarPuntaje(g2);
        g2.setPaint(Color.red);
        dibujar(g2);
    }

    private synchronized void dibujar(Graphics2D g) {
        Line2D.Double linea = new Line2D.Double(getBounds().getCenterX(), 0,
                getBounds().getCenterX(), getBounds().getMaxY());

        g.draw(linea);
        g.drawOval(300, 130, 200, 200);

        g.setPaint(Color.BLUE);
        g.fill(r1.getRaqueta());
        update();

        g.setPaint(Color.ORANGE);
        g.fill(r2.getRaqueta());
        update();

        g.setPaint(Color.magenta);
        g.fill(p.getShape());
        update();
    }

    //actualiza el estado (posicion) de las raquetas y pelota
    private void update() {
        if (server) {
            r2.setY(Integer.parseInt(principal.getCadena()));
            aux2 = (int) r1.getRaqueta().getY() + ";"
                    + (int) p.getShape().getX() + ";"
                    + (int) p.getShape().getY() + ";" + p.getScore1() + ";" + p.getScore2();
            principal.setCadenaS(aux2);
            r1.moverR1(getBounds());
            p.moverPelota(getBounds(), colision(r1.getRaqueta()), colision(r2.getRaqueta()));
        } else {
            String vec[] = principal.getPosiciones();
            r1.setY(Integer.parseInt(vec[0]));
            p.setX(Integer.parseInt(vec[1]));
            p.setY(Integer.parseInt(vec[2]));
            p.setScore1(Integer.parseInt(vec[3]));
            p.setScore2(Integer.parseInt(vec[4]));
            aux = "" + (int) r2.getRaqueta().getY();
            principal.setCadena(aux);
            r2.moverR2(getBounds());
        }

    }

    //detecta si existe una colision entre la raqueta y la pelota
    private boolean colision(Rectangle2D r) {
        return p.getShape().intersects(r);
    }

    private void dibujarPuntaje(Graphics2D g) {
        Graphics2D g1 = g, g2 = g;
        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);

        g1.drawString(Integer.toString(p.getScore1()), (float) getBounds().getCenterX() - 50, 30);
        g2.drawString(Integer.toString(p.getScore2()), (float) getBounds().getCenterX() + 25, 30);

        if (p.getScore1() == 5) {
            g.drawString("GANÓ El JUGADOR 1", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Pelota.finJuego = true;
            fin = true;
        }
        if (p.getScore2() == 5) {
            g.drawString("GANÓ EL JUGADOR 2", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Pelota.finJuego = true;
            fin = true;
        }
        if (Pelota.finJuego && fin) {
//            try {
//                TimeUnit.MILLISECONDS.sleep(1000);
//                Menu ventana = new Menu();
//                ventana.setVisible(true);
//                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            Component comp = SwingUtilities.getRoot(this);
//            ((Window) comp).dispose();

        }
    }

    public static void main(Principal b, Ventana v, boolean server, double velocity) {
        java.awt.EventQueue.invokeLater(() -> {
            new Tablero(v, b, server, velocity).setVisible(true);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void run() {

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
