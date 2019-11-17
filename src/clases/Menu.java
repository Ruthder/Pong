
package clases;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import principal.Principal;


public class Menu extends javax.swing.JFrame {

    Principal p;
    
    
    public Menu(Principal p) {
        initComponents();
        this.p = p;
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jSlider1.setValue(5);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 387));
        setMinimumSize(new java.awt.Dimension(550, 387));
        setPreferredSize(new java.awt.Dimension(550, 387));
        setResizable(false);
        setSize(new java.awt.Dimension(550, 387));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(550, 387));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 387));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 387));
        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cp2.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cp3.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cp1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 220, 130, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/up2.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/up3.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/up1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 290, 130, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/l52.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 2, 220, 170);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bg.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 630, 390);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 390);

        jPanel2.setMaximumSize(new java.awt.Dimension(550, 387));
        jPanel2.setMinimumSize(new java.awt.Dimension(550, 387));
        jPanel2.setPreferredSize(new java.awt.Dimension(550, 387));
        jPanel2.setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(30, 90, 130, 50);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/a2.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/a3.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/a1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(30, 150, 130, 50);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/r2.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/r3.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/r1.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(30, 270, 130, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 160, 61));
        jLabel6.setText("Ingrese dirección IP");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 30, 390, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bg.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 550, 390);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 560, 400);

        jPanel4.setMaximumSize(new java.awt.Dimension(550, 387));
        jPanel4.setMinimumSize(new java.awt.Dimension(550, 387));
        jPanel4.setPreferredSize(new java.awt.Dimension(550, 387));
        jPanel4.setLayout(null);

        jSlider1.setMaximum(30);
        jSlider1.setMinimum(3);
        jSlider1.setOpaque(false);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jPanel4.add(jSlider1);
        jSlider1.setBounds(30, 40, 140, 26);

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setText("Muy fácil");
        jPanel4.add(jToggleButton1);
        jToggleButton1.setBounds(30, 80, 140, 25);

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setText("Fácil");
        jPanel4.add(jToggleButton2);
        jToggleButton2.setBounds(30, 110, 139, 23);

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setText("Media");
        jPanel4.add(jToggleButton3);
        jToggleButton3.setBounds(30, 140, 139, 23);

        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setText("URF");
        jPanel4.add(jToggleButton4);
        jToggleButton4.setBounds(30, 170, 139, 23);

        jButton8.setText("Aceptar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8);
        jButton8.setBounds(40, 260, 124, 23);

        jLabel1.setForeground(new java.awt.Color(0, 66, 255));
        jLabel1.setText("Puntaje máximo:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(30, 20, 120, 20);

        jLabel8.setForeground(new java.awt.Color(0, 66, 255));
        jPanel4.add(jLabel8);
        jLabel8.setBounds(420, 300, 120, 30);

        jLabel9.setForeground(new java.awt.Color(0, 66, 255));
        jPanel4.add(jLabel9);
        jLabel9.setBounds(40, 234, 120, 20);

        jButton5.setText("Regresar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(40, 290, 120, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bg.png"))); // NOI18N
        jPanel4.add(jLabel7);
        jLabel7.setBounds(0, 0, 560, 390);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 550, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.setVisible(false);
        jPanel4.setVisible(true);
        try {
            InetAddress address = InetAddress.getLocalHost();
            jLabel8.setText("IP: "+address.getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!"".equals(jTextField1.getText())){
            Ventana ventana = new Ventana(false, p, jTextField1.getText(), -1, -1, this);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }else{
            //error
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        if(jToggleButton1.isSelected()){
            dificultad(1);
        }else if(jToggleButton2.isSelected()){
            dificultad(2);
        }else if(jToggleButton3.isSelected()){
            dificultad(3);
        }else if(jToggleButton4.isSelected()){
            dificultad(4);
        }
            
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        jLabel1.setText("Puntaje máximo: "+ jSlider1.getValue());
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jPanel2.setVisible(false);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jPanel4.setVisible(false);
        jPanel1.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(Principal p) {
        java.awt.EventQueue.invokeLater(() -> {
            new Menu(p).setVisible(true);
        });
    }
    
    private void dificultad(double d){
        jLabel9.setText("Esperando conexión");
        Ventana ventana = new Ventana(true, p, "", d, jSlider1.getValue(), this);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
