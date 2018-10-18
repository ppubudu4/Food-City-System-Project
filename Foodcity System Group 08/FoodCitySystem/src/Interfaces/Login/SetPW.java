/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Login;

import ConnectDB.ConnectDB;
import FoodCityMain.FoodCityMain;
import java.awt.Frame;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class SetPW extends javax.swing.JFrame {

    int posX, posY;

    /**
     * Creates new form SetPW
     */
    public SetPW() {
        initComponents();
        setFirst();
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
        jPanel1 = new javax.swing.JPanel();
        SetPaswd_ComB_SecQue_1 = new javax.swing.JComboBox<>();
        SetPaswd_TextF_EmpId = new javax.swing.JTextField();
        SetPaswd_Btn_SetPaswd = new javax.swing.JButton();
        SetPaswd_PogBar_EmpCPaswd = new javax.swing.JProgressBar();
        SetPaswd_ComB_SecQue_3 = new javax.swing.JComboBox<>();
        exsitPW = new javax.swing.JLabel();
        SetPaswd_PaswdF_Paswd = new javax.swing.JPasswordField();
        SetPaswd_ComB_SecQue_2 = new javax.swing.JComboBox<>();
        SetPaswd_Label_SecQue_2 = new javax.swing.JLabel();
        SetPaswd_Label_Answer_1 = new javax.swing.JLabel();
        SetPaswd_Label_EmpCPaswd = new javax.swing.JLabel();
        SetPaswd_Label_EmpId = new javax.swing.JLabel();
        SetPaswd_Label_SecQue_3 = new javax.swing.JLabel();
        SetPaswd_TextF_Answer_1 = new javax.swing.JTextField();
        SetPaswd_Label_Answer_3 = new javax.swing.JLabel();
        SetPaswd_TextF_Answer_2 = new javax.swing.JTextField();
        SetPaswd_PogBar_EmpPaswd = new javax.swing.JProgressBar();
        SetPaswd_Label_EmpPaswd = new javax.swing.JLabel();
        SetPaswd_Label_SecQue_1 = new javax.swing.JLabel();
        SetPaswd_PaswdF_CPaswd = new javax.swing.JPasswordField();
        SetPaswd_Label_Answer_2 = new javax.swing.JLabel();
        SetPaswd_TextF_Answer_3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main_Top.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Main_Top.setForeground(new java.awt.Color(153, 153, 153));
        Main_Top.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/SetPW.png"))); // NOI18N
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

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        SetPaswd_ComB_SecQue_1.setBackground(new java.awt.Color(51, 51, 51));
        SetPaswd_ComB_SecQue_1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        SetPaswd_ComB_SecQue_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "What was your childhood nickname ?", "What is the name of your favorite childhood friend ?", "In what city or town did your mother and father meet ?", "What is the middle name of your oldest child ?", "What is your favorite team ?", "What is your favorite movie ?", "What was your favorite sport in high school ?", "What was your favorite food as a child ?", "What was the make and model of your first car ?", "Who is your childhood sports hero ?", "What school did you attend for sixth grade ?", "What was the last name of your third grade teacher ?", "In what town was your first job ?" }));
        SetPaswd_ComB_SecQue_1.setToolTipText("Security Question 1");
        SetPaswd_ComB_SecQue_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        SetPaswd_TextF_EmpId.setEditable(false);
        SetPaswd_TextF_EmpId.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        SetPaswd_TextF_EmpId.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_TextF_EmpId.setToolTipText("Employee ID");

        SetPaswd_Btn_SetPaswd.setBackground(new java.awt.Color(204, 204, 204));
        SetPaswd_Btn_SetPaswd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        SetPaswd_Btn_SetPaswd.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_Btn_SetPaswd.setText("Set Password");
        SetPaswd_Btn_SetPaswd.setToolTipText("Set Password");
        SetPaswd_Btn_SetPaswd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SetPaswd_Btn_SetPaswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetPaswd_Btn_SetPaswdActionPerformed(evt);
            }
        });

        SetPaswd_PogBar_EmpCPaswd.setForeground(new java.awt.Color(204, 0, 0));
        SetPaswd_PogBar_EmpCPaswd.setMaximum(80);
        SetPaswd_PogBar_EmpCPaswd.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        SetPaswd_PogBar_EmpCPaswd.setString("");
        SetPaswd_PogBar_EmpCPaswd.setStringPainted(true);

        SetPaswd_ComB_SecQue_3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        SetPaswd_ComB_SecQue_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "What was your childhood nickname ?", "What is the name of your favorite childhood friend ?", "In what city or town did your mother and father meet ?", "What is the middle name of your oldest child ?", "What is your favorite team ?", "What is your favorite movie ?", "What was your favorite sport in high school ?", "What was your favorite food as a child ?", "What was the make and model of your first car ?", "Who is your childhood sports hero ?", "What school did you attend for sixth grade ?", "What was the last name of your third grade teacher ?", "In what town was your first job ?" }));
        SetPaswd_ComB_SecQue_3.setToolTipText("Security Question 3");
        SetPaswd_ComB_SecQue_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        exsitPW.setForeground(new java.awt.Color(204, 0, 0));
        exsitPW.setText(" Do not enter the exsisting password ");
        exsitPW.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        SetPaswd_PaswdF_Paswd.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        SetPaswd_PaswdF_Paswd.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_PaswdF_Paswd.setToolTipText("Password");
        SetPaswd_PaswdF_Paswd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SetPaswd_PaswdF_PaswdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SetPaswd_PaswdF_PaswdFocusLost(evt);
            }
        });
        SetPaswd_PaswdF_Paswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SetPaswd_PaswdF_PaswdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SetPaswd_PaswdF_PaswdKeyTyped(evt);
            }
        });

        SetPaswd_ComB_SecQue_2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        SetPaswd_ComB_SecQue_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "What was your childhood nickname ?", "What is the name of your favorite childhood friend ?", "In what city or town did your mother and father meet ?", "What is the middle name of your oldest child ?", "What is your favorite team ?", "What is your favorite movie ?", "What was your favorite sport in high school ?", "What was your favorite food as a child ?", "What was the make and model of your first car ?", "Who is your childhood sports hero ?", "What school did you attend for sixth grade ?", "What was the last name of your third grade teacher ?", "In what town was your first job ?" }));
        SetPaswd_ComB_SecQue_2.setToolTipText("Security Question 2");
        SetPaswd_ComB_SecQue_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        SetPaswd_Label_SecQue_2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        SetPaswd_Label_SecQue_2.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_Label_SecQue_2.setText("Security Question  2  :");

        SetPaswd_Label_Answer_1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        SetPaswd_Label_Answer_1.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_Label_Answer_1.setText("Answer  1 :");

        SetPaswd_Label_EmpCPaswd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        SetPaswd_Label_EmpCPaswd.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_Label_EmpCPaswd.setText("Confirm Password :");

        SetPaswd_Label_EmpId.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        SetPaswd_Label_EmpId.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_Label_EmpId.setText("Employee ID :");

        SetPaswd_Label_SecQue_3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        SetPaswd_Label_SecQue_3.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_Label_SecQue_3.setText("Security Question  3  :");

        SetPaswd_TextF_Answer_1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        SetPaswd_TextF_Answer_1.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_TextF_Answer_1.setToolTipText("Answer 1");

        SetPaswd_Label_Answer_3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        SetPaswd_Label_Answer_3.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_Label_Answer_3.setText("Answer  3 :");

        SetPaswd_TextF_Answer_2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        SetPaswd_TextF_Answer_2.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_TextF_Answer_2.setToolTipText("Answer 2");

        SetPaswd_PogBar_EmpPaswd.setBackground(new java.awt.Color(204, 204, 204));
        SetPaswd_PogBar_EmpPaswd.setForeground(new java.awt.Color(204, 0, 0));
        SetPaswd_PogBar_EmpPaswd.setMaximum(80);
        SetPaswd_PogBar_EmpPaswd.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        SetPaswd_PogBar_EmpPaswd.setString("");
        SetPaswd_PogBar_EmpPaswd.setStringPainted(true);

        SetPaswd_Label_EmpPaswd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        SetPaswd_Label_EmpPaswd.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_Label_EmpPaswd.setText("New Password :");

        SetPaswd_Label_SecQue_1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        SetPaswd_Label_SecQue_1.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_Label_SecQue_1.setText("Security Question  1  :");

        SetPaswd_PaswdF_CPaswd.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        SetPaswd_PaswdF_CPaswd.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_PaswdF_CPaswd.setToolTipText("Confirm Password");
        SetPaswd_PaswdF_CPaswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SetPaswd_PaswdF_CPaswdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SetPaswd_PaswdF_CPaswdKeyTyped(evt);
            }
        });

        SetPaswd_Label_Answer_2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        SetPaswd_Label_Answer_2.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_Label_Answer_2.setText("Answer  2  :");

        SetPaswd_TextF_Answer_3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        SetPaswd_TextF_Answer_3.setForeground(new java.awt.Color(51, 51, 51));
        SetPaswd_TextF_Answer_3.setToolTipText("Answer 3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SetPaswd_Btn_SetPaswd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SetPaswd_Label_EmpId)
                            .addComponent(SetPaswd_Label_EmpPaswd))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SetPaswd_PaswdF_Paswd)
                            .addComponent(SetPaswd_TextF_EmpId)
                            .addComponent(SetPaswd_PogBar_EmpPaswd, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exsitPW))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SetPaswd_Label_SecQue_1)
                            .addComponent(SetPaswd_Label_Answer_1)
                            .addComponent(SetPaswd_Label_SecQue_2)
                            .addComponent(SetPaswd_Label_Answer_2)
                            .addComponent(SetPaswd_Label_SecQue_3)
                            .addComponent(SetPaswd_Label_Answer_3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SetPaswd_ComB_SecQue_3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SetPaswd_TextF_Answer_2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SetPaswd_ComB_SecQue_2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SetPaswd_TextF_Answer_1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SetPaswd_TextF_Answer_3)
                            .addComponent(SetPaswd_ComB_SecQue_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(SetPaswd_Label_EmpCPaswd)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SetPaswd_PogBar_EmpCPaswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SetPaswd_PaswdF_CPaswd, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetPaswd_TextF_EmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetPaswd_Label_EmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetPaswd_PaswdF_Paswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exsitPW)
                    .addComponent(SetPaswd_Label_EmpPaswd))
                .addGap(0, 0, 0)
                .addComponent(SetPaswd_PogBar_EmpPaswd, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetPaswd_Label_EmpCPaswd)
                    .addComponent(SetPaswd_PaswdF_CPaswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(SetPaswd_PogBar_EmpCPaswd, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetPaswd_ComB_SecQue_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetPaswd_Label_SecQue_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetPaswd_TextF_Answer_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetPaswd_Label_Answer_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetPaswd_ComB_SecQue_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetPaswd_Label_SecQue_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetPaswd_TextF_Answer_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetPaswd_Label_Answer_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetPaswd_ComB_SecQue_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetPaswd_Label_SecQue_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetPaswd_TextF_Answer_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetPaswd_Label_Answer_3))
                .addGap(18, 18, 18)
                .addComponent(SetPaswd_Btn_SetPaswd)
                .addContainerGap())
        );

        exsitPW.setVisible(false);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, 520, 344));

        setSize(new java.awt.Dimension(520, 376));
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

    private void SetPaswd_Btn_SetPaswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetPaswd_Btn_SetPaswdActionPerformed
        if (!(SetPaswd_TextF_EmpId.getText().equals("") || SetPaswd_TextF_EmpId.getText() == null)) {
            if (SetPaswd_PaswdF_Paswd.getText().equals("") || SetPaswd_PaswdF_Paswd.getText() == null) {
                JOptionPane.showMessageDialog(this, "Plese enter a new password", "Error", 0);
            } else if (SetPaswd_PaswdF_CPaswd.getText().equals("") || SetPaswd_PaswdF_CPaswd.getText() == null) {
                JOptionPane.showMessageDialog(this, "Plese confirm the password", "Error", 0);
            } else if (!SetPaswd_PaswdF_CPaswd.getText().equals(SetPaswd_PaswdF_Paswd.getText())) {
                JOptionPane.showMessageDialog(this, "Confirm password does't match to the New password", "Error", 0);
            } else if (SetPaswd_ComB_SecQue_1.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Plese choose the Security Question  1", "Error", 0);
            } else if (SetPaswd_TextF_Answer_1.getText().equals("") || SetPaswd_TextF_Answer_1.getText() == null) {
                JOptionPane.showMessageDialog(this, "Plese enter the answer 1", "Error", 0);
            } else if (SetPaswd_ComB_SecQue_2.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Plese choose the Security Question  2", "Error", 0);
            } else if (SetPaswd_TextF_Answer_2.getText().equals("") || SetPaswd_TextF_Answer_2.getText() == null) {
                JOptionPane.showMessageDialog(this, "Plese enter the answer 2", "Error", 0);
            } else if (SetPaswd_ComB_SecQue_3.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Plese choose the Security Question  3", "Error", 0);
            } else if (SetPaswd_TextF_Answer_3.getText().equals("") || SetPaswd_TextF_Answer_3.getText() == null) {
                JOptionPane.showMessageDialog(this, "Plese enter the answer 3", "Error", 0);
            } else if ((SetPaswd_PaswdF_CPaswd.getText().equals(SetPaswd_PaswdF_Paswd.getText()))) {
                try {
                    ConnectDB.DBConnection().createStatement().executeUpdate("UPDATE emppassword SET EmpPassword='" + SetPaswd_PaswdF_Paswd.getText() + "', Sec_Que_1='" + SetPaswd_ComB_SecQue_1.getSelectedItem() + "', Answer_1='" + SetPaswd_TextF_Answer_1.getText() + "', Sec_Que_2='" + SetPaswd_ComB_SecQue_2.getSelectedItem() + "', Answer_2='" + SetPaswd_TextF_Answer_2.getText() + "', Sec_Que_3='" + SetPaswd_ComB_SecQue_3.getSelectedItem() + "', Answer_3='" + SetPaswd_TextF_Answer_3.getText() + "', Login_Status='" + 1 + "' WHERE Emp_ID='" + SetPaswd_TextF_EmpId.getText() + "'");
                    JOptionPane.showMessageDialog(this, "New password was saved", "Success", 1);
                    this.dispose();
                    new FoodCityMain().setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_SetPaswd_Btn_SetPaswdActionPerformed

    private void SetPaswd_PaswdF_PaswdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SetPaswd_PaswdF_PaswdFocusGained
        if (empPassW.equals(SetPaswd_PaswdF_Paswd.getText())) {
            exsitPW.setVisible(true);
        } else {
            exsitPW.setVisible(false);
        }
    }//GEN-LAST:event_SetPaswd_PaswdF_PaswdFocusGained

    private void SetPaswd_PaswdF_PaswdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SetPaswd_PaswdF_PaswdFocusLost
        if (empPassW.equals(SetPaswd_PaswdF_Paswd.getText())) {
            exsitPW.setVisible(true);
        } else {
            exsitPW.setVisible(false);
        }
    }//GEN-LAST:event_SetPaswd_PaswdF_PaswdFocusLost

    private void SetPaswd_PaswdF_PaswdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SetPaswd_PaswdF_PaswdKeyReleased
        if (!SetPaswd_PaswdF_Paswd.getText().equals(SetPaswd_PaswdF_CPaswd.getText())) {
            exsitPW.setVisible(false);
        }
        if (!SetPaswd_PaswdF_CPaswd.getText().equals(SetPaswd_PaswdF_Paswd.getText())) {
            SetPaswd_PogBar_EmpCPaswd.setForeground(new java.awt.Color(204, 0, 0));
        } else {
            SetPaswd_PogBar_EmpCPaswd.setForeground(new java.awt.Color(0, 153, 51));
        }
    }//GEN-LAST:event_SetPaswd_PaswdF_PaswdKeyReleased

    private void SetPaswd_PaswdF_PaswdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SetPaswd_PaswdF_PaswdKeyTyped
        if (Character.isSpace(evt.getKeyChar())) {
            evt.consume();
        } else {
            switch (SetPaswd_PaswdF_Paswd.getText().length()) {
                case 0:
                    SetPaswd_PogBar_EmpPaswd.setValue(0);
                    break;
                case 1:
                    SetPaswd_PogBar_EmpPaswd.setValue(12);
                    break;
                case 2:
                    SetPaswd_PogBar_EmpPaswd.setValue(24);
                    break;
                case 3:
                    SetPaswd_PogBar_EmpPaswd.setValue(36);
                    break;
                case 4:
                    SetPaswd_PogBar_EmpPaswd.setValue(48);
                    break;
                case 5:
                    SetPaswd_PogBar_EmpPaswd.setValue(60);
                    break;
                case 6:
                    SetPaswd_PogBar_EmpPaswd.setValue(72);
                    break;
                case 7:
                    SetPaswd_PogBar_EmpPaswd.setValue(84);
                    break;
                case 8:
                    SetPaswd_PogBar_EmpPaswd.setValue(96);
                    break;
            }
            if (((SetPaswd_PaswdF_Paswd.getText().length() >= 0) && (SetPaswd_PaswdF_Paswd.getText().length() <= 2))) {
                SetPaswd_PogBar_EmpPaswd.setForeground(new java.awt.Color(204, 0, 0));
            } else if (((SetPaswd_PaswdF_Paswd.getText().length() >= 3) && (SetPaswd_PaswdF_Paswd.getText().length() <= 5))) {
                SetPaswd_PogBar_EmpPaswd.setForeground(new java.awt.Color(204, 102, 0));
            } else if (((SetPaswd_PaswdF_Paswd.getText().length() >= 6) && (SetPaswd_PaswdF_Paswd.getText().length() <= 8))) {
                SetPaswd_PogBar_EmpPaswd.setForeground(new java.awt.Color(0, 153, 51));
            }
        }
    }//GEN-LAST:event_SetPaswd_PaswdF_PaswdKeyTyped

    private void SetPaswd_PaswdF_CPaswdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SetPaswd_PaswdF_CPaswdKeyReleased
        if (!SetPaswd_PaswdF_CPaswd.getText().equals(SetPaswd_PaswdF_Paswd.getText())) {
            SetPaswd_PogBar_EmpCPaswd.setForeground(new java.awt.Color(204, 0, 0));
        } else {
            SetPaswd_PogBar_EmpCPaswd.setForeground(new java.awt.Color(0, 153, 51));
        }
    }//GEN-LAST:event_SetPaswd_PaswdF_CPaswdKeyReleased

    private void SetPaswd_PaswdF_CPaswdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SetPaswd_PaswdF_CPaswdKeyTyped
        if (Character.isSpace(evt.getKeyChar())) {
            evt.consume();
        } else {
            switch (SetPaswd_PaswdF_CPaswd.getText().length()) {
                case 0:
                    SetPaswd_PogBar_EmpCPaswd.setValue(0);
                    break;
                case 1:
                    SetPaswd_PogBar_EmpCPaswd.setValue(12);
                    break;
                case 2:
                    SetPaswd_PogBar_EmpCPaswd.setValue(24);
                    break;
                case 3:
                    SetPaswd_PogBar_EmpCPaswd.setValue(36);
                    break;
                case 4:
                    SetPaswd_PogBar_EmpCPaswd.setValue(48);
                    break;
                case 5:
                    SetPaswd_PogBar_EmpCPaswd.setValue(60);
                    break;
                case 6:
                    SetPaswd_PogBar_EmpCPaswd.setValue(72);
                    break;
                case 7:
                    SetPaswd_PogBar_EmpCPaswd.setValue(84);
                    break;
                case 8:
                    SetPaswd_PogBar_EmpCPaswd.setValue(96);
                    break;
            }
        }
    }//GEN-LAST:event_SetPaswd_PaswdF_CPaswdKeyTyped

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
            java.util.logging.Logger.getLogger(SetPW.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetPW.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetPW.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetPW.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetPW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Main_Close;
    private javax.swing.JLabel Main_Minimize;
    private javax.swing.JLabel Main_Top;
    private javax.swing.JButton SetPaswd_Btn_SetPaswd;
    private javax.swing.JComboBox<String> SetPaswd_ComB_SecQue_1;
    private javax.swing.JComboBox<String> SetPaswd_ComB_SecQue_2;
    private javax.swing.JComboBox<String> SetPaswd_ComB_SecQue_3;
    private javax.swing.JLabel SetPaswd_Label_Answer_1;
    private javax.swing.JLabel SetPaswd_Label_Answer_2;
    private javax.swing.JLabel SetPaswd_Label_Answer_3;
    private javax.swing.JLabel SetPaswd_Label_EmpCPaswd;
    private javax.swing.JLabel SetPaswd_Label_EmpId;
    private javax.swing.JLabel SetPaswd_Label_EmpPaswd;
    private javax.swing.JLabel SetPaswd_Label_SecQue_1;
    private javax.swing.JLabel SetPaswd_Label_SecQue_2;
    private javax.swing.JLabel SetPaswd_Label_SecQue_3;
    private javax.swing.JPasswordField SetPaswd_PaswdF_CPaswd;
    private javax.swing.JPasswordField SetPaswd_PaswdF_Paswd;
    private javax.swing.JProgressBar SetPaswd_PogBar_EmpCPaswd;
    private javax.swing.JProgressBar SetPaswd_PogBar_EmpPaswd;
    private javax.swing.JTextField SetPaswd_TextF_Answer_1;
    private javax.swing.JTextField SetPaswd_TextF_Answer_2;
    private javax.swing.JTextField SetPaswd_TextF_Answer_3;
    private javax.swing.JTextField SetPaswd_TextF_EmpId;
    private javax.swing.JLabel exsitPW;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private String empPassW;

    private void setFirst() {
        try {
            ResultSet empPw = ConnectDB.DBConnection().createStatement().executeQuery("SELECT EmpPassword, Sec_Que_1, Answer_1, Sec_Que_2, Answer_2, Sec_Que_3, Answer_3 FROM emppassword WHERE Emp_ID='" + new EmpID().GetEID() + "'");
            while (empPw.next()) {
                empPassW = empPw.getString("EmpPassword");
                SetPaswd_ComB_SecQue_1.setSelectedItem(empPw.getString("Sec_Que_1"));
                SetPaswd_TextF_Answer_1.setText(empPw.getString("Answer_1"));
                SetPaswd_ComB_SecQue_2.setSelectedItem(empPw.getString("Sec_Que_2"));
                SetPaswd_TextF_Answer_2.setText(empPw.getString("Answer_2"));
                SetPaswd_ComB_SecQue_3.setSelectedItem(empPw.getString("Sec_Que_3"));
                SetPaswd_TextF_Answer_3.setText(empPw.getString("Answer_3"));
            }
            SetPaswd_TextF_EmpId.setText(new EmpID().GetEID());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
