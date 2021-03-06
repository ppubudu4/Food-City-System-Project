/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodCityMain;

import ConnectDB.ConnectDB;
import Interfaces.Login.EmpID;
import Interfaces.Login.FogotPWS_1;
import Interfaces.Login.SetPW;
import java.awt.Frame;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    int posX, posY;// set var for move frame

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

        /*try {
            UIManager.setLookAndFeel(new  SubstanceFindingNemoLookAndFeel());
        } catch (Exception ex) {
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Minimize = new javax.swing.JLabel();
        Main_Close = new javax.swing.JLabel();
        Main_Top = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LogIn_Btn_Cancel = new javax.swing.JButton();
        LogIn_Btn_LogIn = new javax.swing.JButton();
        LogIn_Label_EmpId = new javax.swing.JLabel();
        LogIn_Label_EmpPaswd = new javax.swing.JLabel();
        LogIn_Label_FogotPW = new javax.swing.JLabel();
        LogIn_TextF_EmpID = new javax.swing.JTextField();
        LogIn_PaswdF_EmpPaswd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(Main_Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 0, -1, -1));

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
        getContentPane().add(Main_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 0, -1, -1));

        Main_Top.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Main_Top.setForeground(new java.awt.Color(153, 153, 153));
        Main_Top.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/LoginTop.png"))); // NOI18N
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
        getContentPane().add(Main_Top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 341, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        LogIn_Btn_Cancel.setBackground(new java.awt.Color(204, 204, 204));
        LogIn_Btn_Cancel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LogIn_Btn_Cancel.setForeground(new java.awt.Color(51, 51, 51));
        LogIn_Btn_Cancel.setText("Cancel");
        LogIn_Btn_Cancel.setToolTipText("Cancel");
        LogIn_Btn_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogIn_Btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn_Btn_CancelActionPerformed(evt);
            }
        });

        LogIn_Btn_LogIn.setBackground(new java.awt.Color(204, 204, 204));
        LogIn_Btn_LogIn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LogIn_Btn_LogIn.setForeground(new java.awt.Color(51, 51, 51));
        LogIn_Btn_LogIn.setText("Log In");
        LogIn_Btn_LogIn.setToolTipText("Log In");
        LogIn_Btn_LogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogIn_Btn_LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn_Btn_LogInActionPerformed(evt);
            }
        });

        LogIn_Label_EmpId.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        LogIn_Label_EmpId.setForeground(new java.awt.Color(51, 51, 51));
        LogIn_Label_EmpId.setText("Employee ID :");

        LogIn_Label_EmpPaswd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        LogIn_Label_EmpPaswd.setForeground(new java.awt.Color(51, 51, 51));
        LogIn_Label_EmpPaswd.setText("Password :");

        LogIn_Label_FogotPW.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        LogIn_Label_FogotPW.setForeground(new java.awt.Color(78, 122, 253));
        LogIn_Label_FogotPW.setText(" Fogot password");
        LogIn_Label_FogotPW.setToolTipText(" Fogot password");
        LogIn_Label_FogotPW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogIn_Label_FogotPW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogIn_Label_FogotPWMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogIn_Label_FogotPWMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogIn_Label_FogotPWMouseExited(evt);
            }
        });

        LogIn_TextF_EmpID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        LogIn_TextF_EmpID.setToolTipText("Employee ID");
        LogIn_TextF_EmpID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LogIn_TextF_EmpIDKeyTyped(evt);
            }
        });

        LogIn_PaswdF_EmpPaswd.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        LogIn_PaswdF_EmpPaswd.setToolTipText("Password");
        LogIn_PaswdF_EmpPaswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LogIn_PaswdF_EmpPaswdKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(LogIn_Btn_LogIn))
                    .addComponent(LogIn_Btn_Cancel))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogIn_Label_EmpId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogIn_Label_EmpPaswd, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LogIn_PaswdF_EmpPaswd)
                    .addComponent(LogIn_Label_FogotPW)
                    .addComponent(LogIn_TextF_EmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LogIn_Label_EmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LogIn_TextF_EmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LogIn_Label_EmpPaswd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogIn_PaswdF_EmpPaswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(LogIn_Label_FogotPW)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogIn_Btn_LogIn)
                    .addComponent(LogIn_Btn_Cancel))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 405, 150));

        setSize(new java.awt.Dimension(405, 180));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void Main_TopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_TopMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - posX, this.getLocation().y + evt.getY() - posY);//Set moving JFrame
    }//GEN-LAST:event_Main_TopMouseDragged

    private void Main_TopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_TopMousePressed
        posX = evt.getX();//Mouse Get X
        posY = evt.getY();//Mouse Get Y
    }//GEN-LAST:event_Main_TopMousePressed

    private void LogIn_Btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn_Btn_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_LogIn_Btn_CancelActionPerformed

    private void LogIn_Btn_LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn_Btn_LogInActionPerformed
        try {
            if (LogIn_TextF_EmpID.getText().equals("") || LogIn_TextF_EmpID.getText() == null) {
                JOptionPane.showMessageDialog(this, "Plese fill the ID No", "Error", 0);
            } else {
                ResultSet resUserName = ConnectDB.DBConnection().createStatement().executeQuery("SELECT Emp_ID FROM employee WHERE Emp_ID='" + LogIn_TextF_EmpID.getText() + "'");
                ResultSet resUserPW = ConnectDB.DBConnection().createStatement().executeQuery("SELECT EmpPassword FROM emppassword WHERE Emp_ID='" + LogIn_TextF_EmpID.getText() + "'");

                if (resUserName.next() && resUserPW.next()) {
                    if (LogIn_PaswdF_EmpPaswd.getText().equals("") || LogIn_PaswdF_EmpPaswd.getText() == null) {
                        JOptionPane.showMessageDialog(this, "Plese fill the Password", "Error", 0);
                    } else if (LogIn_PaswdF_EmpPaswd.getText().equals(resUserPW.getString("EmpPassword"))) {

                        String pw = (String) resUserPW.getString("EmpPassword");

                        if (pw.equals("12345")) {

                            new EmpID().SetEID(LogIn_TextF_EmpID.getText());
                            new SetPW().setVisible(true);
							ConnectDB.DBConnection().createStatement().executeUpdate("UPDATE emppassword SET Login_Status='" + 1 + "' WHERE Emp_ID='" + LogIn_TextF_EmpID.getText() + "'");
                            this.dispose();

                        } else {

                            new EmpID().SetEID(LogIn_TextF_EmpID.getText());
                            FoodCityMain aa = new FoodCityMain();
                            aa.setVisible(true);
                            ConnectDB.DBConnection().createStatement().executeUpdate("UPDATE emppassword SET Login_Status='" + 1 + "' WHERE Emp_ID='" + LogIn_TextF_EmpID.getText() + "'");
                            this.dispose();

                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Password is incorrect", "Error", 0);
                        LogIn_PaswdF_EmpPaswd.setText("");
                        LogIn_PaswdF_EmpPaswd.grabFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Plese enter a valid ID no", "Error", 0);
                    LogIn_TextF_EmpID.setText("");
                    LogIn_TextF_EmpID.grabFocus();
                }
            }

//            ResultSet resUserName = ConnectDB.DBConnection().createStatement().executeQuery("SELECT Emp_ID FROM employee WHERE Emp_ID='" + LogIn_TextF_EmpID.getText() + "'");
//            if (LogIn_TextF_EmpID.getText().equals("") || LogIn_TextF_EmpID.getText() == null) {
//                JOptionPane.showMessageDialog(this, "Plese fill the ID No", "Error", 0);
//            } else if (resUserName.next()) {
//                ResultSet resUserPW = ConnectDB.DBConnection().createStatement().executeQuery("SELECT EmpPassword FROM emppassword WHERE Emp_ID='" + LogIn_TextF_EmpID.getText() + "'");
//                String pw = "";
//                while (resUserPW.next()) {
//                    pw = resUserPW.getString("EmpPassword");
//                }
//                if (LogIn_PaswdF_EmpPaswd.getText().equals("") || LogIn_PaswdF_EmpPaswd.getText() == null) {
//                    JOptionPane.showMessageDialog(this, "Plese fill the Password", "Error", 0);
//                } else if (LogIn_PaswdF_EmpPaswd.getText().equals(pw)) {
//                    new EmpID().SetEID(LogIn_TextF_EmpID.getText());
//                    FoodCityMain aa = new FoodCityMain();
//                    aa.setVisible(true);
//                    // aa.abcdUN="admin";
//                    ConnectDB.DBConnection().createStatement().executeUpdate("UPDATE emppassword SET Login_Status='" + 1 + "' WHERE Emp_ID='" + LogIn_TextF_EmpID.getText() + "'");
//                    this.dispose();
//                } else {
//                    JOptionPane.showMessageDialog(this, "Password is incorrect", "Error", 0);
//                    LogIn_PaswdF_EmpPaswd.setText("");
//                    LogIn_PaswdF_EmpPaswd.grabFocus();
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "Plese enter a valid ID no", "Error", 0);
//                LogIn_TextF_EmpID.setText("");
//                LogIn_TextF_EmpID.grabFocus();
//            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_LogIn_Btn_LogInActionPerformed

    private void LogIn_Label_FogotPWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogIn_Label_FogotPWMouseClicked
        if (!(LogIn_TextF_EmpID.getText() == null || LogIn_TextF_EmpID.getText().equals(""))) {
            try {
                ResultSet resEmpID = ConnectDB.DBConnection().createStatement().executeQuery("SELECT Emp_ID FROM employee WHERE Emp_ID='" + LogIn_TextF_EmpID.getText() + "'");
                if (resEmpID.next()) {
                    new EmpID().SetEID(LogIn_TextF_EmpID.getText());
                    new FogotPWS_1().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Plese enter a valid ID no", "Error", 0);
                    LogIn_TextF_EmpID.setText("");
                    LogIn_TextF_EmpID.grabFocus();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Plese enter the employee ID", "Error", 0);
            LogIn_TextF_EmpID.setText("");
            LogIn_TextF_EmpID.grabFocus();
        }
    }//GEN-LAST:event_LogIn_Label_FogotPWMouseClicked

    private void LogIn_Label_FogotPWMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogIn_Label_FogotPWMouseEntered
        LogIn_Label_FogotPW.setForeground(new java.awt.Color(5, 67, 253));
    }//GEN-LAST:event_LogIn_Label_FogotPWMouseEntered

    private void LogIn_Label_FogotPWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogIn_Label_FogotPWMouseExited
        LogIn_Label_FogotPW.setForeground(new java.awt.Color(78, 122, 253));
    }//GEN-LAST:event_LogIn_Label_FogotPWMouseExited

    private void LogIn_TextF_EmpIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LogIn_TextF_EmpIDKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_LogIn_TextF_EmpIDKeyTyped

    private void LogIn_PaswdF_EmpPaswdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LogIn_PaswdF_EmpPaswdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_LogIn_PaswdF_EmpPaswdKeyTyped

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogIn_Btn_Cancel;
    private javax.swing.JButton LogIn_Btn_LogIn;
    private javax.swing.JLabel LogIn_Label_EmpId;
    private javax.swing.JLabel LogIn_Label_EmpPaswd;
    private javax.swing.JLabel LogIn_Label_FogotPW;
    private javax.swing.JPasswordField LogIn_PaswdF_EmpPaswd;
    private javax.swing.JTextField LogIn_TextF_EmpID;
    private javax.swing.JLabel Main_Close;
    private javax.swing.JLabel Main_Minimize;
    private javax.swing.JLabel Main_Top;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
