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

public class tabung extends Perhitungan6 {
    double  vol, are;
    DecimalFormat df = new DecimalFormat("#.##");
    
    public tabung() {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        radius = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tall = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        volume = new javax.swing.JTextField();
        result2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        radius1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tall1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        area = new javax.swing.JTextField();
        result1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setMinimumSize(new java.awt.Dimension(500, 400));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Radius");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        radius.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                radiusKeyTyped(evt);
            }
        });
        jPanel3.add(radius, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 31, 130, -1));

        jLabel13.setText("Tall");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 32, -1));

        tall.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tallKeyTyped(evt);
            }
        });
        jPanel3.add(tall, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, -1));

        jLabel14.setText("Volume");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 43, -1));

        volume.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        volume.setEnabled(false);
        jPanel3.add(volume, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, -1));

        result2.setBackground(new java.awt.Color(0, 153, 204));
        result2.setText("RESULT");
        result2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result2ActionPerformed(evt);
            }
        });
        jPanel3.add(result2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 240, 190));

        jPanel6.setBackground(new java.awt.Color(0, 153, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Radius");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        radius1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                radius1KeyTyped(evt);
            }
        });
        jPanel6.add(radius1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, -1));

        jLabel10.setText("Tall");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 32, -1));

        tall1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tall1KeyTyped(evt);
            }
        });
        jPanel6.add(tall1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, -1));

        jLabel11.setText("area");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 43, -1));

        area.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        area.setEnabled(false);
        jPanel6.add(area, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, -1));

        result1.setBackground(new java.awt.Color(0, 153, 204));
        result1.setText("RESULT");
        result1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result1ActionPerformed(evt);
            }
        });
        jPanel6.add(result1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 200, 250, 190));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\png\\002-cylinder.png")); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\png\\002-cylinder.png")); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\png\\003-cylinder-1.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\png\\003-cylinder-1.png")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 130));

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Area=2 x π x r x (r+t)");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Volume= π x r x r x t");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("t = tall");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("π = 22/7 or 3,14");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("r = radius");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, 70));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 10, 190, 180));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("----------Cylinder----------");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 40));

        Back.setBackground(new java.awt.Color(0, 153, 204));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel4.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 410, 80, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\My-Journal-PPT-Backgrounds-800x600.jpg")); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 450));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 450));

        setSize(new java.awt.Dimension(536, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void result2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result2ActionPerformed
        if (radius.getText().equals("") || tall.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Masukan Data");
        }else{
            double rad = Double.parseDouble(radius.getText());
            double tal = Double.parseDouble(tall.getText());
            tabung1(rad, tal);
        }
    }//GEN-LAST:event_result2ActionPerformed

public Double hitung10 (Double rad, Double tal){
    return (3.14*rad*rad*tal);
}
    
    private void result1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result1ActionPerformed
         if (radius1.getText().equals("") || tall1.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Masukan Data");
        }else{
            double rad1 = Double.parseDouble(radius1.getText());
            double tal1 = Double.parseDouble(tall1.getText());
            tabung2(rad1, tal1);
        }
    }//GEN-LAST:event_result1ActionPerformed
   
    public Double hitung11 (Double rad1,Double tal1){
        return (2*3.14*rad1*(rad1+tal1));
    }
    
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        mainmenusaja mm = new mainmenusaja();
        mm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void radiusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radiusKeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_radiusKeyTyped

    private void tallKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tallKeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_tallKeyTyped

    private void radius1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radius1KeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_radius1KeyTyped

    private void tall1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tall1KeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_tall1KeyTyped

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
            java.util.logging.Logger.getLogger(tabung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField radius;
    private javax.swing.JTextField radius1;
    private javax.swing.JButton result1;
    private javax.swing.JButton result2;
    private javax.swing.JTextField tall;
    private javax.swing.JTextField tall1;
    private javax.swing.JTextField volume;
    // End of variables declaration//GEN-END:variables

    public double tabung1(double radd, double tall){
        vol = hitung10 (radd, tall);
        volume.setText(String.valueOf(df.format(vol)));
        
        return vol;
    }
    
    public double tabung2(double radd, double tall){
        are = hitung11 (radd, tall);
        area.setText(String.valueOf(df.format(are)));
        
        return are;
    }

}
