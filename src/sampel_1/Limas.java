/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampel_1;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Limas extends Perhitungan {

double sd1, sd2, hg, vol, ar;
DecimalFormat df = new DecimalFormat("#.##");
 
    public Limas() {
        initComponents();
    }
    
    void filterhuruf(KeyEvent b ){
        if(Character.isAlphabetic(b.getKeyChar())){
            b.consume();
            JOptionPane.showMessageDialog(null,"Input number only");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        volume = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        side1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        area = new javax.swing.JTextField();
        side2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-----------Prism-----------");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 40));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Volume : 1/3 x S x S x H");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Base Area : S x S");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("S = Side");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("H = Height");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 90));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 220, 190));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\png\\002-pyramids.png")); // NOI18N
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\png\\002-pyramids.png")); // NOI18N
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\png\\002-pyramids.png")); // NOI18N
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\png\\002-pyramids.png")); // NOI18N
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 140));

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Volume");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        volume.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        volume.setEnabled(false);
        jPanel8.add(volume, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, -1));

        jLabel13.setText("Height");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        height.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                heightKeyTyped(evt);
            }
        });
        jPanel8.add(height, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, -1));

        jLabel14.setText("Side");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        side1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                side1KeyTyped(evt);
            }
        });
        jPanel8.add(side1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, -1));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setText("RESULT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 250, 180));

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Base Area");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        area.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        area.setEnabled(false);
        jPanel9.add(area, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, -1));

        side2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                side2KeyTyped(evt);
            }
        });
        jPanel9.add(side2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, -1));

        jLabel15.setText("Side");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setText("RESULT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 270, 180));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 410, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\My-Journal-PPT-Backgrounds-800x600.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 450));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 450));

        setSize(new java.awt.Dimension(566, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mainmenusaja mm = new mainmenusaja();
        mm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            double sd = Double.parseDouble(side1.getText());
            double hi = Double.parseDouble(height.getText());
            limas1(sd, hi);
       

    }//GEN-LAST:event_jButton4ActionPerformed
@Override
    public Double hitung1(Double sd1, Double hg){
        return (sd1 * sd1 * hg)/3;
        
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double sdd = Double.parseDouble(side2.getText());
        limas2(sdd);
    }//GEN-LAST:event_jButton3ActionPerformed
@Override
    public Double hitung1(Double sd2){
        return (sd2 * sd2);
    }
    
    private void side1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_side1KeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_side1KeyTyped

    private void heightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightKeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_heightKeyTyped

    private void side2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_side2KeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_side2KeyTyped

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
            java.util.logging.Logger.getLogger(Limas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Limas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Limas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Limas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Limas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField area;
    private javax.swing.JTextField height;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField side1;
    private javax.swing.JTextField side2;
    private javax.swing.JTextField volume;
    // End of variables declaration//GEN-END:variables

    public double limas1(double sid1, double hig1){
        vol = hitung1(sid1, hig1);
        volume.setText(String.valueOf(df.format(vol)));
        
        return vol;
    }
    
    public double limas2(double sid2){
        ar = hitung1(sid2);
        area.setText(String.valueOf(df.format(ar)));
        
        return ar;
    }
    
}