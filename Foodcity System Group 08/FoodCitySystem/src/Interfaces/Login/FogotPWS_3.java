/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Login;

import java.awt.Frame;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class FogotPWS_3 extends javax.swing.JFrame {

    int posX, posY;

    /**
     * Creates new form FogotPWS_3
     */
    public FogotPWS_3() {
        initComponents();
        SetF();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Top = new javax.swing.JLabel();
        Main_Minimize = new javax.swing.JLabel();
        Main_Close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Sep_4 = new javax.swing.JSeparator();
        FogotPaswdS_3_Btn_Next = new javax.swing.JButton();
        Sep_3 = new javax.swing.JSeparator();
        FogotPaswdS_3_Label_SecQue_3 = new javax.swing.JLabel();
        FogotPaswdS_3_Label_S_1 = new javax.swing.JLabel();
        FoogtPaswdS_3_Label_Answer_3 = new javax.swing.JLabel();
        FogotPaswdS_3_TextF_Answer_3 = new javax.swing.JTextField();
        FogotPaswdS_3_Label_S_2 = new javax.swing.JLabel();
        FogotPaswdS_3_LabelS_SecQue_3 = new javax.swing.JLabel();
        FogotPaswdS_3_Label_S_3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main_Top.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Main_Top.setForeground(new java.awt.Color(153, 153, 153));
        Main_Top.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/FogotPW.png"))); // NOI18N
        Main_Top.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Main_TopMouseDragged(evt);
            }
        });
        Main_Top.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Main_TopMousePressed(evt);
            }
        });
        getContentPane().add(Main_Top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 456, -1));

        Main_Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/MINI.png"))); // NOI18N
        Main_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Main_MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Main_MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Main_MinimizeMouseExited(evt);
            }
        });
        getContentPane().add(Main_Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 0, -1, -1));

        Main_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/MAIN_CLOSE_2.png"))); // NOI18N
        Main_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Main_Close.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Main_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Main_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Main_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Main_CloseMouseExited(evt);
            }
        });
        getContentPane().add(Main_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        Sep_4.setBackground(new java.awt.Color(204, 204, 204));
        Sep_4.setForeground(new java.awt.Color(51, 51, 51));
        Sep_4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        FogotPaswdS_3_Btn_Next.setBackground(new java.awt.Color(204, 204, 204));
        FogotPaswdS_3_Btn_Next.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        FogotPaswdS_3_Btn_Next.setForeground(new java.awt.Color(51, 51, 51));
        FogotPaswdS_3_Btn_Next.setText("Next");
        FogotPaswdS_3_Btn_Next.setToolTipText("Next");
        FogotPaswdS_3_Btn_Next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FogotPaswdS_3_Btn_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FogotPaswdS_3_Btn_NextActionPerformed(evt);
            }
        });

        Sep_3.setBackground(new java.awt.Color(204, 204, 204));
        Sep_3.setForeground(new java.awt.Color(51, 51, 51));
        Sep_3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        FogotPaswdS_3_Label_SecQue_3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        FogotPaswdS_3_Label_SecQue_3.setForeground(new java.awt.Color(51, 51, 51));
        FogotPaswdS_3_Label_SecQue_3.setText("Security Question  3  :");

        FogotPaswdS_3_Label_S_1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        FogotPaswdS_3_Label_S_1.setForeground(new java.awt.Color(109, 177, 117));
        FogotPaswdS_3_Label_S_1.setText("Step 1");

        FoogtPaswdS_3_Label_Answer_3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        FoogtPaswdS_3_Label_Answer_3.setForeground(new java.awt.Color(51, 51, 51));
        FoogtPaswdS_3_Label_Answer_3.setText("Answer  3  :");

        FogotPaswdS_3_TextF_Answer_3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        FogotPaswdS_3_TextF_Answer_3.setForeground(new java.awt.Color(51, 51, 51));
        FogotPaswdS_3_TextF_Answer_3.setToolTipText("Answer 1");

        FogotPaswdS_3_Label_S_2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        FogotPaswdS_3_Label_S_2.setForeground(new java.awt.Color(109, 177, 117));
        FogotPaswdS_3_Label_S_2.setText("Step 2");

        FogotPaswdS_3_LabelS_SecQue_3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        FogotPaswdS_3_LabelS_SecQue_3.setForeground(new java.awt.Color(0, 102, 102));
        FogotPaswdS_3_LabelS_SecQue_3.setToolTipText("Secqurity Question 3");
        FogotPaswdS_3_LabelS_SecQue_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        FogotPaswdS_3_Label_S_3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        FogotPaswdS_3_Label_S_3.setForeground(new java.awt.Color(51, 51, 51));
        FogotPaswdS_3_Label_S_3.setText("Step 3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(FogotPaswdS_3_Label_S_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Sep_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FogotPaswdS_3_Label_S_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Sep_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FogotPaswdS_3_Label_S_3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FogotPaswdS_3_Label_SecQue_3)
                            .addComponent(FoogtPaswdS_3_Label_Answer_3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FogotPaswdS_3_LabelS_SecQue_3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FogotPaswdS_3_TextF_Answer_3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FogotPaswdS_3_Btn_Next)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FogotPaswdS_3_Label_S_2)
                    .addComponent(FogotPaswdS_3_Label_S_1)
                    .addComponent(Sep_3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sep_4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FogotPaswdS_3_Label_S_3))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FogotPaswdS_3_Label_SecQue_3)
                    .addComponent(FogotPaswdS_3_LabelS_SecQue_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FogotPaswdS_3_TextF_Answer_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FoogtPaswdS_3_Label_Answer_3))
                .addGap(46, 46, 46)
                .addComponent(FogotPaswdS_3_Btn_Next)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, 520, 230));

        setSize(new java.awt.Dimension(520, 264));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Main_TopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_TopMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - posX, this.getLocation().y + evt.getY() - posY);//Set moving JFrame
    }//GEN-LAST:event_Main_TopMouseDragged

    private void Main_TopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_TopMousePressed
        posX = evt.getX();//Mouse Get X
        posY = evt.getY();//Mouse Get Y
    }//GEN-LAST:event_Main_TopMousePressed

    private void Main_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_MinimizeMouseClicked
        this.setState(Frame.ICONIFIED);// Minimize
    }//GEN-LAST:event_Main_MinimizeMouseClicked

    private void Main_MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_MinimizeMouseEntered
        Main_Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/MINI_2.png")));
    }//GEN-LAST:event_Main_MinimizeMouseEntered

    private void Main_MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_MinimizeMouseExited
        Main_Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/MINI.png")));
    }//GEN-LAST:event_Main_MinimizeMouseExited

    private void Main_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_CloseMouseClicked
        this.dispose();// MouseEvent Close Button
    }//GEN-LAST:event_Main_CloseMouseClicked

    private void Main_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_CloseMouseEntered
        Main_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/MAIN_CLOSE.png")));//Mouse Entering
    }//GEN-LAST:event_Main_CloseMouseEntered

    private void Main_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_CloseMouseExited
        Main_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/MAIN_CLOSE_2.png")));//Mouse Exiting
    }//GEN-LAST:event_Main_CloseMouseExited

    private void FogotPaswdS_3_Btn_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FogotPaswdS_3_Btn_NextActionPerformed
        try {
            ResultSet res_A_3 = ConnectDB.ConnectDB.DBConnection().createStatement().executeQuery("SELECT Answer_3 FROM emppassword WHERE Emp_ID='" + new EmpID().GetEID() + "'");
            if (res_A_3.next()) {
                if (FogotPaswdS_3_TextF_Answer_3.getText().equals("") || FogotPaswdS_3_TextF_Answer_3.getText() == null) {
                    JOptionPane.showMessageDialog(this, "Plese fill the answer", "Error", 0);
                    FogotPaswdS_3_TextF_Answer_3.grabFocus();
                } else if (FogotPaswdS_3_TextF_Answer_3.getText().equals(res_A_3.getString("Answer_3"))) {
                    new SetPW().setVisible(true);
                    this.dispose();
                } else if (!FogotPaswdS_3_TextF_Answer_3.getText().equals(res_A_3.getString("Answer_3"))) {
                    JOptionPane.showMessageDialog(this, "Answer is incorrect", "Error", 0);
                    FogotPaswdS_3_TextF_Answer_3.setText("");
                    FogotPaswdS_3_TextF_Answer_3.grabFocus();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_FogotPaswdS_3_Btn_NextActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FogotPWS_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FogotPWS_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FogotPWS_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FogotPWS_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FogotPWS_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FogotPaswdS_3_Btn_Next;
    private javax.swing.JLabel FogotPaswdS_3_LabelS_SecQue_3;
    private javax.swing.JLabel FogotPaswdS_3_Label_S_1;
    private javax.swing.JLabel FogotPaswdS_3_Label_S_2;
    private javax.swing.JLabel FogotPaswdS_3_Label_S_3;
    private javax.swing.JLabel FogotPaswdS_3_Label_SecQue_3;
    private javax.swing.JTextField FogotPaswdS_3_TextF_Answer_3;
    private javax.swing.JLabel FoogtPaswdS_3_Label_Answer_3;
    private javax.swing.JLabel Main_Close;
    private javax.swing.JLabel Main_Minimize;
    private javax.swing.JLabel Main_Top;
    private javax.swing.JSeparator Sep_3;
    private javax.swing.JSeparator Sep_4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void SetF() {
        try {
            ResultSet res_Q_3 = ConnectDB.ConnectDB.DBConnection().createStatement().executeQuery("SELECT Sec_Que_3 FROM emppassword WHERE Emp_ID='" + new EmpID().GetEID() + "'");
            while (res_Q_3.next()) {
                FogotPaswdS_3_LabelS_SecQue_3.setText(res_Q_3.getString("Sec_Que_3"));
                FogotPaswdS_3_TextF_Answer_3.grabFocus();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
