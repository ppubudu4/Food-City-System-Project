/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


public class AdvertiseType extends javax.swing.JPanel {

    /**
     * Creates new form AdvertiseType
     */
    public AdvertiseType() {
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

        AdvType_Label_Heading = new javax.swing.JLabel();
        AdvType_Label_AdvTypeID = new javax.swing.JLabel();
        AdvType_CmbBox_AdvTypeID = new javax.swing.JComboBox<>();
        AdvType_Label_AdvTypeName = new javax.swing.JLabel();
        AdvType_CmbBox_AdvTypeName = new javax.swing.JComboBox<>();
        AdvType_Search_Btn_Search = new javax.swing.JButton();
        AdvType_Search_Btn_ShowAllAdvType = new javax.swing.JButton();
        AdvType_Btn_Ok = new javax.swing.JButton();
        AdvType_Btn_Back = new javax.swing.JButton();
        CustStage_Scp_2 = new javax.swing.JScrollPane();
        AdvType_Table_AdvType = new javax.swing.JTable();
        AdvType_Label_Discription = new javax.swing.JLabel();
        AddCustStage_Scp_2 = new javax.swing.JScrollPane();
        AdvType_TextA_Discription = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        AdvType_Label_Heading.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        AdvType_Label_Heading.setForeground(new java.awt.Color(51, 51, 51));
        AdvType_Label_Heading.setText("Advertising Type");

        AdvType_Label_AdvTypeID.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        AdvType_Label_AdvTypeID.setForeground(new java.awt.Color(51, 51, 51));
        AdvType_Label_AdvTypeID.setText("Advertise Type ID : ");

        AdvType_CmbBox_AdvTypeID.setEditable(true);
        AdvType_CmbBox_AdvTypeID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        AdvType_CmbBox_AdvTypeID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Item 1", "Item 2", "Item 3", "Item 4" }));
        AdvType_CmbBox_AdvTypeID.setToolTipText("Advertise Type ID");
        AdvType_CmbBox_AdvTypeID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdvType_CmbBox_AdvTypeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdvType_CmbBox_AdvTypeIDActionPerformed(evt);
            }
        });

        AdvType_Label_AdvTypeName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        AdvType_Label_AdvTypeName.setForeground(new java.awt.Color(51, 51, 51));
        AdvType_Label_AdvTypeName.setText("Advertise Type Name : ");

        AdvType_CmbBox_AdvTypeName.setEditable(true);
        AdvType_CmbBox_AdvTypeName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        AdvType_CmbBox_AdvTypeName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Item 1", "Item 2", "Item 3", "Item 4" }));
        AdvType_CmbBox_AdvTypeName.setToolTipText("Advertise Type Name");
        AdvType_CmbBox_AdvTypeName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdvType_CmbBox_AdvTypeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdvType_CmbBox_AdvTypeNameActionPerformed(evt);
            }
        });

        AdvType_Search_Btn_Search.setBackground(new java.awt.Color(204, 204, 204));
        AdvType_Search_Btn_Search.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        AdvType_Search_Btn_Search.setForeground(new java.awt.Color(51, 51, 51));
        AdvType_Search_Btn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/search (2).png"))); // NOI18N
        AdvType_Search_Btn_Search.setText("Search");
        AdvType_Search_Btn_Search.setToolTipText("Search");
        AdvType_Search_Btn_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdvType_Search_Btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdvType_Search_Btn_SearchActionPerformed(evt);
            }
        });

        AdvType_Search_Btn_ShowAllAdvType.setBackground(new java.awt.Color(204, 204, 204));
        AdvType_Search_Btn_ShowAllAdvType.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        AdvType_Search_Btn_ShowAllAdvType.setForeground(new java.awt.Color(51, 51, 51));
        AdvType_Search_Btn_ShowAllAdvType.setText("Show All Advertising Types");
        AdvType_Search_Btn_ShowAllAdvType.setToolTipText("Show All Advertising Types");
        AdvType_Search_Btn_ShowAllAdvType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdvType_Search_Btn_ShowAllAdvType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdvType_Search_Btn_ShowAllAdvTypeActionPerformed(evt);
            }
        });

        AdvType_Btn_Ok.setBackground(new java.awt.Color(204, 204, 204));
        AdvType_Btn_Ok.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        AdvType_Btn_Ok.setForeground(new java.awt.Color(51, 51, 51));
        AdvType_Btn_Ok.setText("Ok");
        AdvType_Btn_Ok.setToolTipText("Ok");
        AdvType_Btn_Ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdvType_Btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdvType_Btn_OkActionPerformed(evt);
            }
        });

        AdvType_Btn_Back.setBackground(new java.awt.Color(204, 204, 204));
        AdvType_Btn_Back.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        AdvType_Btn_Back.setForeground(new java.awt.Color(51, 51, 51));
        AdvType_Btn_Back.setText("Back");
        AdvType_Btn_Back.setToolTipText("Back");
        AdvType_Btn_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdvType_Btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdvType_Btn_BackActionPerformed(evt);
            }
        });

        AdvType_Table_AdvType.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        AdvType_Table_AdvType.setForeground(new java.awt.Color(51, 51, 51));
        AdvType_Table_AdvType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Advertise Type ID", "Advertise Type Name", "Discription"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AdvType_Table_AdvType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdvType_Table_AdvType.setGridColor(new java.awt.Color(102, 102, 102));
        AdvType_Table_AdvType.setIntercellSpacing(new java.awt.Dimension(1, 0));
        AdvType_Table_AdvType.setRowHeight(17);
        AdvType_Table_AdvType.setSelectionBackground(new java.awt.Color(46, 141, 216));
        AdvType_Table_AdvType.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        CustStage_Scp_2.setViewportView(AdvType_Table_AdvType);

        AdvType_Label_Discription.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        AdvType_Label_Discription.setForeground(new java.awt.Color(51, 51, 51));
        AdvType_Label_Discription.setText("Discription : ");

        AddCustStage_Scp_2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        AddCustStage_Scp_2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        AdvType_TextA_Discription.setColumns(20);
        AdvType_TextA_Discription.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        AdvType_TextA_Discription.setLineWrap(true);
        AdvType_TextA_Discription.setRows(5);
        AdvType_TextA_Discription.setToolTipText("Discription about this Advertise Tpye");
        AdvType_TextA_Discription.setWrapStyleWord(true);
        AddCustStage_Scp_2.setViewportView(AdvType_TextA_Discription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AdvType_Label_Heading)
                        .addGap(443, 443, 443))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AdvType_Btn_Back)
                        .addGap(6, 6, 6)
                        .addComponent(AdvType_Btn_Ok)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AdvType_Label_Discription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddCustStage_Scp_2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CustStage_Scp_2)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(AdvType_Label_AdvTypeID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdvType_CmbBox_AdvTypeID, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AdvType_Label_AdvTypeName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdvType_CmbBox_AdvTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AdvType_Search_Btn_Search)
                .addGap(26, 26, 26)
                .addComponent(AdvType_Search_Btn_ShowAllAdvType)
                .addGap(0, 86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(AdvType_Label_Heading)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdvType_Label_AdvTypeID)
                    .addComponent(AdvType_CmbBox_AdvTypeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdvType_Label_AdvTypeName)
                    .addComponent(AdvType_CmbBox_AdvTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdvType_Search_Btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdvType_Search_Btn_ShowAllAdvType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AdvType_Label_Discription)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CustStage_Scp_2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(AddCustStage_Scp_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdvType_Btn_Back)
                    .addComponent(AdvType_Btn_Ok))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AdvType_CmbBox_AdvTypeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdvType_CmbBox_AdvTypeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdvType_CmbBox_AdvTypeIDActionPerformed

    private void AdvType_CmbBox_AdvTypeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdvType_CmbBox_AdvTypeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdvType_CmbBox_AdvTypeNameActionPerformed

    private void AdvType_Search_Btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdvType_Search_Btn_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdvType_Search_Btn_SearchActionPerformed

    private void AdvType_Search_Btn_ShowAllAdvTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdvType_Search_Btn_ShowAllAdvTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdvType_Search_Btn_ShowAllAdvTypeActionPerformed

    private void AdvType_Btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdvType_Btn_OkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdvType_Btn_OkActionPerformed

    private void AdvType_Btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdvType_Btn_BackActionPerformed
        // TODSup_Label_Headingcode here:
    }//GEN-LAST:event_AdvType_Btn_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AddCustStage_Scp_2;
    private javax.swing.JButton AdvType_Btn_Back;
    private javax.swing.JButton AdvType_Btn_Ok;
    private javax.swing.JComboBox<String> AdvType_CmbBox_AdvTypeID;
    private javax.swing.JComboBox<String> AdvType_CmbBox_AdvTypeName;
    private javax.swing.JLabel AdvType_Label_AdvTypeID;
    private javax.swing.JLabel AdvType_Label_AdvTypeName;
    private javax.swing.JLabel AdvType_Label_Discription;
    private javax.swing.JLabel AdvType_Label_Heading;
    private javax.swing.JButton AdvType_Search_Btn_Search;
    private javax.swing.JButton AdvType_Search_Btn_ShowAllAdvType;
    private javax.swing.JTable AdvType_Table_AdvType;
    private javax.swing.JTextArea AdvType_TextA_Discription;
    private javax.swing.JScrollPane CustStage_Scp_2;
    // End of variables declaration//GEN-END:variables
}
