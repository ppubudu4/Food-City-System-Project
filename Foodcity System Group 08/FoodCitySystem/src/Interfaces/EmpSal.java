/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

public class EmpSal extends javax.swing.JPanel {

    /**
     * Creates new form EmpSal
     */
    public EmpSal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmpSal_Label_Heading = new javax.swing.JLabel();
        Emp_Scp_3 = new javax.swing.JScrollPane();
        EmpSal_Table_Emp = new javax.swing.JTable();
        EmpSal_Label_EmpID = new javax.swing.JLabel();
        EmpSal_CmbBox_EmpID = new javax.swing.JComboBox<>();
        EmpSal_CmbBox_Month = new javax.swing.JComboBox<>();
        EmpSal_Label_Month = new javax.swing.JLabel();
        EmpSal_Label_Year = new javax.swing.JLabel();
        EmpSal_CmbBox_Year = new javax.swing.JComboBox<>();
        EmpSal_Btn_Search = new javax.swing.JButton();
        EmpSal_Btn_ShowAllEmp = new javax.swing.JButton();
        Emp_Scp_4 = new javax.swing.JScrollPane();
        EmpSal_Table_EmpSal = new javax.swing.JTable();
        EmpSal_Btn_Back = new javax.swing.JButton();
        EmpSal_Btn_Ok = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        EmpSal_Label_Heading.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        EmpSal_Label_Heading.setForeground(new java.awt.Color(51, 51, 51));
        EmpSal_Label_Heading.setText("Employee Salary");

        EmpSal_Table_Emp.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        EmpSal_Table_Emp.setForeground(new java.awt.Color(51, 51, 51));
        EmpSal_Table_Emp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmpSal_Table_Emp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmpSal_Table_Emp.setGridColor(new java.awt.Color(102, 102, 102));
        EmpSal_Table_Emp.setIntercellSpacing(new java.awt.Dimension(1, 0));
        EmpSal_Table_Emp.setRowHeight(17);
        EmpSal_Table_Emp.setSelectionBackground(new java.awt.Color(46, 141, 216));
        EmpSal_Table_Emp.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Emp_Scp_3.setViewportView(EmpSal_Table_Emp);

        EmpSal_Label_EmpID.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        EmpSal_Label_EmpID.setForeground(new java.awt.Color(51, 51, 51));
        EmpSal_Label_EmpID.setText("Employee ID : ");

        EmpSal_CmbBox_EmpID.setEditable(true);
        EmpSal_CmbBox_EmpID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        EmpSal_CmbBox_EmpID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Item 1", "Item 2", "Item 3", "Item 4" }));
        EmpSal_CmbBox_EmpID.setToolTipText("Employee ID");
        EmpSal_CmbBox_EmpID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmpSal_CmbBox_EmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpSal_CmbBox_EmpIDActionPerformed(evt);
            }
        });

        EmpSal_CmbBox_Month.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        EmpSal_CmbBox_Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        EmpSal_CmbBox_Month.setToolTipText("Month");
        EmpSal_CmbBox_Month.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmpSal_CmbBox_Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpSal_CmbBox_MonthActionPerformed(evt);
            }
        });

        EmpSal_Label_Month.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        EmpSal_Label_Month.setForeground(new java.awt.Color(51, 51, 51));
        EmpSal_Label_Month.setText("Month : ");

        EmpSal_Label_Year.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        EmpSal_Label_Year.setForeground(new java.awt.Color(51, 51, 51));
        EmpSal_Label_Year.setText("Year : ");

        EmpSal_CmbBox_Year.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        EmpSal_CmbBox_Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2017", "2018", "2019", "2020" }));
        EmpSal_CmbBox_Year.setToolTipText("Year");
        EmpSal_CmbBox_Year.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmpSal_CmbBox_Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpSal_CmbBox_YearActionPerformed(evt);
            }
        });

        EmpSal_Btn_Search.setBackground(new java.awt.Color(204, 204, 204));
        EmpSal_Btn_Search.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        EmpSal_Btn_Search.setForeground(new java.awt.Color(51, 51, 51));
        EmpSal_Btn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/search (2).png"))); // NOI18N
        EmpSal_Btn_Search.setText("Search");
        EmpSal_Btn_Search.setToolTipText("Search");
        EmpSal_Btn_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmpSal_Btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpSal_Btn_SearchActionPerformed(evt);
            }
        });

        EmpSal_Btn_ShowAllEmp.setBackground(new java.awt.Color(204, 204, 204));
        EmpSal_Btn_ShowAllEmp.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        EmpSal_Btn_ShowAllEmp.setForeground(new java.awt.Color(51, 51, 51));
        EmpSal_Btn_ShowAllEmp.setText("Show All Employees");
        EmpSal_Btn_ShowAllEmp.setToolTipText("Show All Employees");
        EmpSal_Btn_ShowAllEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmpSal_Btn_ShowAllEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpSal_Btn_ShowAllEmpActionPerformed(evt);
            }
        });

        EmpSal_Table_EmpSal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        EmpSal_Table_EmpSal.setForeground(new java.awt.Color(51, 51, 51));
        EmpSal_Table_EmpSal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "Month", "Salary Advance", "OT Amount", "Salary", "Pay / Not Pay"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmpSal_Table_EmpSal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmpSal_Table_EmpSal.setGridColor(new java.awt.Color(102, 102, 102));
        EmpSal_Table_EmpSal.setIntercellSpacing(new java.awt.Dimension(1, 0));
        EmpSal_Table_EmpSal.setRowHeight(17);
        EmpSal_Table_EmpSal.setSelectionBackground(new java.awt.Color(46, 141, 216));
        EmpSal_Table_EmpSal.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Emp_Scp_4.setViewportView(EmpSal_Table_EmpSal);

        EmpSal_Btn_Back.setBackground(new java.awt.Color(204, 204, 204));
        EmpSal_Btn_Back.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        EmpSal_Btn_Back.setForeground(new java.awt.Color(51, 51, 51));
        EmpSal_Btn_Back.setText("Back");
        EmpSal_Btn_Back.setToolTipText("Back");
        EmpSal_Btn_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmpSal_Btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpSal_Btn_BackActionPerformed(evt);
            }
        });

        EmpSal_Btn_Ok.setBackground(new java.awt.Color(204, 204, 204));
        EmpSal_Btn_Ok.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        EmpSal_Btn_Ok.setForeground(new java.awt.Color(51, 51, 51));
        EmpSal_Btn_Ok.setText("Ok");
        EmpSal_Btn_Ok.setToolTipText("Ok");
        EmpSal_Btn_Ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmpSal_Btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpSal_Btn_OkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EmpSal_Btn_Back)
                        .addGap(6, 6, 6)
                        .addComponent(EmpSal_Btn_Ok))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(445, 445, 445)
                                .addComponent(EmpSal_Label_Heading))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(EmpSal_Label_EmpID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmpSal_CmbBox_EmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EmpSal_Label_Month)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmpSal_CmbBox_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EmpSal_Label_Year)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmpSal_CmbBox_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(EmpSal_Btn_Search)
                                .addGap(26, 26, 26)
                                .addComponent(EmpSal_Btn_ShowAllEmp)))
                        .addGap(0, 175, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Emp_Scp_3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Emp_Scp_4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(EmpSal_Label_Heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpSal_Label_EmpID)
                    .addComponent(EmpSal_CmbBox_EmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmpSal_CmbBox_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmpSal_Label_Month)
                    .addComponent(EmpSal_CmbBox_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmpSal_Label_Year)
                    .addComponent(EmpSal_Btn_Search)
                    .addComponent(EmpSal_Btn_ShowAllEmp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Emp_Scp_3, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(Emp_Scp_4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmpSal_Btn_Back)
                    .addComponent(EmpSal_Btn_Ok))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EmpSal_CmbBox_EmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpSal_CmbBox_EmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpSal_CmbBox_EmpIDActionPerformed

    private void EmpSal_CmbBox_MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpSal_CmbBox_MonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpSal_CmbBox_MonthActionPerformed

    private void EmpSal_CmbBox_YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpSal_CmbBox_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpSal_CmbBox_YearActionPerformed

    private void EmpSal_Btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpSal_Btn_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpSal_Btn_SearchActionPerformed

    private void EmpSal_Btn_ShowAllEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpSal_Btn_ShowAllEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpSal_Btn_ShowAllEmpActionPerformed

    private void EmpSal_Btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpSal_Btn_BackActionPerformed
        // TODSup_Label_Headingcode here:
    }//GEN-LAST:event_EmpSal_Btn_BackActionPerformed

    private void EmpSal_Btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpSal_Btn_OkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpSal_Btn_OkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmpSal_Btn_Back;
    private javax.swing.JButton EmpSal_Btn_Ok;
    private javax.swing.JButton EmpSal_Btn_Search;
    private javax.swing.JButton EmpSal_Btn_ShowAllEmp;
    private javax.swing.JComboBox<String> EmpSal_CmbBox_EmpID;
    private javax.swing.JComboBox<String> EmpSal_CmbBox_Month;
    private javax.swing.JComboBox<String> EmpSal_CmbBox_Year;
    private javax.swing.JLabel EmpSal_Label_EmpID;
    private javax.swing.JLabel EmpSal_Label_Heading;
    private javax.swing.JLabel EmpSal_Label_Month;
    private javax.swing.JLabel EmpSal_Label_Year;
    private javax.swing.JTable EmpSal_Table_Emp;
    private javax.swing.JTable EmpSal_Table_EmpSal;
    private javax.swing.JScrollPane Emp_Scp_3;
    private javax.swing.JScrollPane Emp_Scp_4;
    // End of variables declaration//GEN-END:variables
}
