 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampel_1;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import sampel_1.mainmenusaja;

/**
 *
 * @author Rafif Agdyaputra
 */
public class kerucut extends Perhitungan5 {
    double  vol, ar;
    DecimalFormat df = new DecimalFormat("#.##");
    
    public kerucut() {
        initComponents();
    }
    void filterhuruf(KeyEvent b){
        if(Character.isAlphabetic(b.getKeyChar())){
            b.consume();
            JOptionPane.showMessageDialog(null,"Input number only");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        radius1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tall = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        volume = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        radius2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        side = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        area = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-----------Cone-----------");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 40));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Volume = 1/3 x π x r x r x t");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Area = π x r x s");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 20));

        jPanel6.setBackground(new java.awt.Color(255, 102, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("π = 3,14");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("r = radius");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("t = tall");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("s = side");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 190, 180));

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\png\\010-cone.png")); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\png\\005-cone-3.png")); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\png\\005-cone-3.png")); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\png\\010-cone.png")); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 130));

        jPanel4.setBackground(new java.awt.Color(255, 102, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 102, 51));
        jButton3.setText("RESULT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jLabel7.setText("Radius");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        radius1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                radius1KeyTyped(evt);
            }
        });
        jPanel4.add(radius1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, -1));

        jLabel8.setText("Tall");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        tall.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tallKeyTyped(evt);
            }
        });
        jPanel4.add(tall, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, -1));

        jLabel9.setText("Volume");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        volume.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        volume.setEnabled(false);
        jPanel4.add(volume, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 240, 190));

        jPanel5.setBackground(new java.awt.Color(255, 102, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 102, 51));
        jButton2.setText("RESULT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel4.setText("Radius");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        radius2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                radius2KeyTyped(evt);
            }
        });
        jPanel5.add(radius2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, -1));

        jLabel3.setText("Side");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        side.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sideKeyTyped(evt);
            }
        });
        jPanel5.add(side, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, -1));

        jLabel2.setText("Area");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        area.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        area.setEnabled(false);
        jPanel5.add(area, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 250, 190));

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 70, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\My-Journal-PPT-Backgrounds-800x600.jpg")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(536, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double rad1 = Double.parseDouble(radius1.getText());
        double tl = Double.parseDouble(tall.getText());
        kerucut1(rad1, tl);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    @Override
    public Double hitung8 (Double rad1, Double tl){
    return (3.14*rad1*rad1*rad1*tl)/3;
}
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double rad2 = Double.parseDouble(radius2.getText());
        double sd = Double.parseDouble(side.getText());
        kerucut2(rad2, sd);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    @Override
    public Double hitung9 (Double rad2, Double sd){
    return (3.14*rad2*sd);
}
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mainmenusaja mm = new mainmenusaja();
        mm.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radius1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radius1KeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_radius1KeyTyped

    private void tallKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tallKeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_tallKeyTyped

    private void radius2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radius2KeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_radius2KeyTyped

    private void sideKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sideKeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_sideKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kerucut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kerucut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kerucut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kerucut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kerucut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField radius1;
    private javax.swing.JTextField radius2;
    private javax.swing.JTextField side;
    private javax.swing.JTextField tall;
    private javax.swing.JTextField volume;
    // End of variables declaration//GEN-END:variables

    public double kerucut1(double rad1, double tl){
        vol = hitung8(rad1,tl);
        volume.setText(String.valueOf(df.format(vol)));
        
        return vol;
    }
    
    public double kerucut2(double rad2, double sd){
        ar = hitung9(rad2,sd);
        area.setText(String.valueOf(df.format(ar)));
        
        return ar;
    }
}
