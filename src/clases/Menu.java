
package clases;

import javax.swing.JFrame;
import principal.Principal;


public class Menu extends javax.swing.JFrame {

    Principal p;
    
    public Menu(Principal p) {
        initComponents();
        this.p = p;
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jSlider1.setValue(5);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jButton1.setText("Crear partida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(208, 146, 109, 23);

        jButton2.setText("Unirse a partida");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(208, 175, 109, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 544, 387);

        jPanel2.setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(195, 143, 130, 20);

        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(195, 174, 130, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-8, -7, 560, 400);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 550, 390);

        jPanel4.setLayout(null);

        jSlider1.setMaximum(30);
        jSlider1.setMinimum(1);
        jSlider1.setOpaque(false);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jPanel4.add(jSlider1);
        jSlider1.setBounds(140, 40, 280, 26);

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setText("Muy fácil");
        jPanel4.add(jToggleButton1);
        jToggleButton1.setBounds(172, 91, 139, 23);

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setText("Fácil");
        jPanel4.add(jToggleButton2);
        jToggleButton2.setBounds(172, 120, 139, 23);

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setText("Media");
        jPanel4.add(jToggleButton3);
        jToggleButton3.setBounds(172, 149, 139, 23);

        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setText("URF");
        jPanel4.add(jToggleButton4);
        jToggleButton4.setBounds(172, 181, 139, 23);

        jButton8.setText("Aceptar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8);
        jButton8.setBounds(187, 356, 124, 23);

        jLabel1.setText("Puntaje máximo:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(200, 20, 120, 20);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 550, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.setVisible(false);
        jPanel4.setVisible(true);
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
            Ventana ventana = new Ventana(false, p, jTextField1.getText(), -1, -1);
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

    public static void main(Principal p) {
        java.awt.EventQueue.invokeLater(() -> {
            new Menu(p).setVisible(true);
        });
    }
    
    private void dificultad(double d){
        Ventana ventana = new Ventana(true, p, "", d, jSlider1.getValue());
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
