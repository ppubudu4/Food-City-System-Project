/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

public class InvoiceR extends javax.swing.JPanel {

    /**
     * Creates new form InvoiceR
     */
    public InvoiceR() {
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

        INR_Label_Heading = new javax.swing.JLabel();
        INR_Label_INRNo = new javax.swing.JLabel();
        INR_Sep = new javax.swing.JSeparator();
        INR_TextF_INRNo = new javax.swing.JTextField();
        INR_CmbBox_ItemID = new javax.swing.JComboBox<>();
        INR_TextF_Date = new javax.swing.JTextField();
        INR_Label_ItemName = new javax.swing.JLabel();
        INR_Label_INRDate = new javax.swing.JLabel();
        INR_CmbBox_ItemName = new javax.swing.JComboBox<>();
        INR_Label_Time = new javax.swing.JLabel();
        INR_Label_Quant = new javax.swing.JLabel();
        INR_TextF_Quant = new javax.swing.JTextField();
        INR_Btn_AddItem = new javax.swing.JButton();
        INR_CBox_RegCust = new javax.swing.JCheckBox();
        INR_Btn_RemoveItem = new javax.swing.JButton();
        INR_Label_CustID = new javax.swing.JLabel();
        INR_TextF_Time = new javax.swing.JTextField();
        INR_Label_EmpID = new javax.swing.JLabel();
        INR_TextF_EmpID = new javax.swing.JTextField();
        INR_Label_PostMNo = new javax.swing.JLabel();
        INR_TextF_PostMNo = new javax.swing.JTextField();
        INR_Label_ItemID = new javax.swing.JLabel();
        INR_Label_OldINNo = new javax.swing.JLabel();
        INR_TextF_OldINNo = new javax.swing.JTextField();
        INR_Label_Reson = new javax.swing.JLabel();
        AddCustStage_Scp_2 = new javax.swing.JScrollPane();
        INR_TextA_Reson = new javax.swing.JTextArea();
        CustStage_Scp_1 = new javax.swing.JScrollPane();
        INR_Table_Item = new javax.swing.JTable();
        INR_Btn_Back = new javax.swing.JButton();
        INR_Btn_Ok = new javax.swing.JButton();
        INR_Label_Total = new javax.swing.JLabel();
        INR_TextF_Total = new javax.swing.JTextField();
        INR_Btn_Done = new javax.swing.JButton();
        IN_CmbBox_CustID = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        INR_Label_Heading.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        INR_Label_Heading.setForeground(new java.awt.Color(179, 14, 34));
        INR_Label_Heading.setText("Invoice Return");

        INR_Label_INRNo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        INR_Label_INRNo.setForeground(new java.awt.Color(51, 51, 51));
        INR_Label_INRNo.setText("Invoice Return No : ");

        INR_Sep.setBackground(new java.awt.Color(204, 204, 204));
        INR_Sep.setForeground(new java.awt.Color(153, 153, 153));

        INR_TextF_INRNo.setEditable(false);
        INR_TextF_INRNo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        INR_TextF_INRNo.setToolTipText("Invoice Return Number");
        INR_TextF_INRNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_TextF_INRNoActionPerformed(evt);
            }
        });

        INR_CmbBox_ItemID.setEditable(true);
        INR_CmbBox_ItemID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        INR_CmbBox_ItemID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Item 1", "Item 2", "Item 3", "Item 4" }));
        INR_CmbBox_ItemID.setToolTipText("Item ID");
        INR_CmbBox_ItemID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INR_CmbBox_ItemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_CmbBox_ItemIDActionPerformed(evt);
            }
        });

        INR_TextF_Date.setEditable(false);
        INR_TextF_Date.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        INR_TextF_Date.setToolTipText("Invoice Return Date");
        INR_TextF_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_TextF_DateActionPerformed(evt);
            }
        });

        INR_Label_ItemName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        INR_Label_ItemName.setForeground(new java.awt.Color(51, 51, 51));
        INR_Label_ItemName.setText("Item Name : ");

        INR_Label_INRDate.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        INR_Label_INRDate.setForeground(new java.awt.Color(51, 51, 51));
        INR_Label_INRDate.setText("Date : ");

        INR_CmbBox_ItemName.setEditable(true);
        INR_CmbBox_ItemName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        INR_CmbBox_ItemName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Item 1", "Item 2", "Item 3", "Item 4" }));
        INR_CmbBox_ItemName.setToolTipText("Item Name");
        INR_CmbBox_ItemName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INR_CmbBox_ItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_CmbBox_ItemNameActionPerformed(evt);
            }
        });

        INR_Label_Time.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        INR_Label_Time.setForeground(new java.awt.Color(51, 51, 51));
        INR_Label_Time.setText("Time : ");

        INR_Label_Quant.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        INR_Label_Quant.setForeground(new java.awt.Color(51, 51, 51));
        INR_Label_Quant.setText("Quantity : ");

        INR_TextF_Quant.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        INR_TextF_Quant.setToolTipText("Quantity");
        INR_TextF_Quant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_TextF_QuantActionPerformed(evt);
            }
        });

        INR_Btn_AddItem.setBackground(new java.awt.Color(204, 204, 204));
        INR_Btn_AddItem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        INR_Btn_AddItem.setForeground(new java.awt.Color(51, 51, 51));
        INR_Btn_AddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/Add_plus.png"))); // NOI18N
        INR_Btn_AddItem.setText("Add");
        INR_Btn_AddItem.setToolTipText("Add Item");
        INR_Btn_AddItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INR_Btn_AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_Btn_AddItemActionPerformed(evt);
            }
        });

        INR_CBox_RegCust.setBackground(new java.awt.Color(204, 204, 204));
        INR_CBox_RegCust.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        INR_CBox_RegCust.setText("Registerd Customer");
        INR_CBox_RegCust.setToolTipText("Check the Customer Registerd or Non-Registerd");
        INR_CBox_RegCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_CBox_RegCustActionPerformed(evt);
            }
        });

        INR_Btn_RemoveItem.setBackground(new java.awt.Color(204, 204, 204));
        INR_Btn_RemoveItem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        INR_Btn_RemoveItem.setForeground(new java.awt.Color(51, 51, 51));
        INR_Btn_RemoveItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/trash_bin.png"))); // NOI18N
        INR_Btn_RemoveItem.setText("Remove");
        INR_Btn_RemoveItem.setToolTipText("Remove Added Item");
        INR_Btn_RemoveItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INR_Btn_RemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_Btn_RemoveItemActionPerformed(evt);
            }
        });

        INR_Label_CustID.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        INR_Label_CustID.setForeground(new java.awt.Color(51, 51, 51));
        INR_Label_CustID.setText("Customer ID : ");

        INR_TextF_Time.setEditable(false);
        INR_TextF_Time.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        INR_TextF_Time.setToolTipText("Invoice Return Time");
        INR_TextF_Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_TextF_TimeActionPerformed(evt);
            }
        });

        INR_Label_EmpID.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        INR_Label_EmpID.setForeground(new java.awt.Color(51, 51, 51));
        INR_Label_EmpID.setText("Employee ID : ");

        INR_TextF_EmpID.setEditable(false);
        INR_TextF_EmpID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        INR_TextF_EmpID.setToolTipText("Employee ID");
        INR_TextF_EmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_TextF_EmpIDActionPerformed(evt);
            }
        });

        INR_Label_PostMNo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        INR_Label_PostMNo.setForeground(new java.awt.Color(51, 51, 51));
        INR_Label_PostMNo.setText("Post Machine No : ");

        INR_TextF_PostMNo.setEditable(false);
        INR_TextF_PostMNo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        INR_TextF_PostMNo.setToolTipText("Post Machine No");
        INR_TextF_PostMNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_TextF_PostMNoActionPerformed(evt);
            }
        });

        INR_Label_ItemID.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        INR_Label_ItemID.setForeground(new java.awt.Color(51, 51, 51));
        INR_Label_ItemID.setText("Item ID : ");

        INR_Label_OldINNo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        INR_Label_OldINNo.setForeground(new java.awt.Color(51, 51, 51));
        INR_Label_OldINNo.setText("Old Invoice No : ");

        INR_TextF_OldINNo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        INR_TextF_OldINNo.setToolTipText("Old Invoice No");
        INR_TextF_OldINNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_TextF_OldINNoActionPerformed(evt);
            }
        });

        INR_Label_Reson.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        INR_Label_Reson.setForeground(new java.awt.Color(51, 51, 51));
        INR_Label_Reson.setText("Reson : ");

        AddCustStage_Scp_2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        AddCustStage_Scp_2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        INR_TextA_Reson.setColumns(20);
        INR_TextA_Reson.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        INR_TextA_Reson.setLineWrap(true);
        INR_TextA_Reson.setRows(5);
        INR_TextA_Reson.setToolTipText("Reson for Return this Item");
        INR_TextA_Reson.setWrapStyleWord(true);
        AddCustStage_Scp_2.setViewportView(INR_TextA_Reson);

        CustStage_Scp_1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        INR_Table_Item.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        INR_Table_Item.setForeground(new java.awt.Color(51, 51, 51));
        INR_Table_Item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Quantity", "Reson", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        INR_Table_Item.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INR_Table_Item.setGridColor(new java.awt.Color(102, 102, 102));
        INR_Table_Item.setIntercellSpacing(new java.awt.Dimension(1, 0));
        INR_Table_Item.setRowHeight(17);
        INR_Table_Item.setSelectionBackground(new java.awt.Color(46, 141, 216));
        INR_Table_Item.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        CustStage_Scp_1.setViewportView(INR_Table_Item);

        INR_Btn_Back.setBackground(new java.awt.Color(204, 204, 204));
        INR_Btn_Back.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        INR_Btn_Back.setForeground(new java.awt.Color(51, 51, 51));
        INR_Btn_Back.setText("Back");
        INR_Btn_Back.setToolTipText("Back");
        INR_Btn_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INR_Btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_Btn_BackActionPerformed(evt);
            }
        });

        INR_Btn_Ok.setBackground(new java.awt.Color(204, 204, 204));
        INR_Btn_Ok.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        INR_Btn_Ok.setForeground(new java.awt.Color(51, 51, 51));
        INR_Btn_Ok.setText("Ok");
        INR_Btn_Ok.setToolTipText("Ok");
        INR_Btn_Ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INR_Btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_Btn_OkActionPerformed(evt);
            }
        });

        INR_Label_Total.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        INR_Label_Total.setForeground(new java.awt.Color(102, 102, 102));
        INR_Label_Total.setText("Total : ");

        INR_TextF_Total.setEditable(false);
        INR_TextF_Total.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        INR_TextF_Total.setToolTipText("Last Total");
        INR_TextF_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INR_TextF_TotalActionPerformed(evt);
            }
        });

        INR_Btn_Done.setBackground(new java.awt.Color(204, 204, 204));
        INR_Btn_Done.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        INR_Btn_Done.setForeground(new java.awt.Color(51, 51, 51));
        INR_Btn_Done.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/check.png"))); // NOI18N
        INR_Btn_Done.setText("Done");
        INR_Btn_Done.setToolTipText("Done");
        INR_Btn_Done.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        IN_CmbBox_CustID.setEditable(true);
        IN_CmbBox_CustID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        IN_CmbBox_CustID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Item 1", "Item 2", "Item 3", "Item 4" }));
        IN_CmbBox_CustID.setToolTipText("Bill Type Name");
        IN_CmbBox_CustID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(INR_Label_Heading))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(INR_Label_INRDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(INR_TextF_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(INR_Label_INRNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(INR_TextF_INRNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(INR_Label_Time)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(INR_TextF_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(INR_Label_OldINNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(INR_TextF_OldINNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(INR_Label_CustID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IN_CmbBox_CustID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(INR_CBox_RegCust, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(INR_Label_EmpID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INR_TextF_EmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(INR_Label_PostMNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INR_TextF_PostMNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(INR_Sep, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CustStage_Scp_1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(INR_Btn_Back)
                                .addGap(6, 6, 6)
                                .addComponent(INR_Btn_Ok)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(INR_Label_Reson)
                                    .addComponent(INR_Label_ItemID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(INR_CmbBox_ItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(INR_Label_ItemName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(INR_CmbBox_ItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(INR_Label_Quant)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(INR_TextF_Quant, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(INR_Btn_AddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(INR_Btn_RemoveItem))
                                    .addComponent(AddCustStage_Scp_2))
                                .addGap(134, 134, 134))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(INR_Label_Total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(INR_Btn_Done, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                    .addComponent(INR_TextF_Total))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(INR_Label_Heading)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(INR_CBox_RegCust))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(INR_Label_EmpID)
                                        .addComponent(INR_TextF_EmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(9, 9, 9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(INR_Label_PostMNo)
                                        .addComponent(INR_TextF_PostMNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(INR_Label_CustID)
                                .addComponent(IN_CmbBox_CustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(INR_Label_OldINNo)
                            .addComponent(INR_TextF_OldINNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(INR_Label_INRNo)
                            .addComponent(INR_TextF_INRNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(INR_TextF_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INR_Label_INRDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(INR_TextF_Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INR_Label_Time))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(INR_Sep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INR_Label_ItemID)
                    .addComponent(INR_CmbBox_ItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INR_Label_ItemName)
                    .addComponent(INR_CmbBox_ItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INR_Label_Quant)
                    .addComponent(INR_TextF_Quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INR_Btn_AddItem)
                    .addComponent(INR_Btn_RemoveItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INR_Label_Reson)
                    .addComponent(AddCustStage_Scp_2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CustStage_Scp_1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INR_Label_Total)
                    .addComponent(INR_TextF_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INR_Btn_Done, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INR_Btn_Back)
                    .addComponent(INR_Btn_Ok))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void INR_TextF_INRNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_TextF_INRNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INR_TextF_INRNoActionPerformed

    private void INR_CmbBox_ItemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_CmbBox_ItemIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INR_CmbBox_ItemIDActionPerformed

    private void INR_TextF_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_TextF_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INR_TextF_DateActionPerformed

    private void INR_CmbBox_ItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_CmbBox_ItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INR_CmbBox_ItemNameActionPerformed

    private void INR_TextF_QuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_TextF_QuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INR_TextF_QuantActionPerformed

    private void INR_Btn_AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_Btn_AddItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INR_Btn_AddItemActionPerformed

    private void INR_Btn_RemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_Btn_RemoveItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INR_Btn_RemoveItemActionPerformed

    private void INR_TextF_TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_TextF_TimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INR_TextF_TimeActionPerformed

    private void INR_TextF_EmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_TextF_EmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INR_TextF_EmpIDActionPerformed

    private void INR_TextF_PostMNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_TextF_PostMNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INR_TextF_PostMNoActionPerformed

    private void INR_TextF_OldINNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_TextF_OldINNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INR_TextF_OldINNoActionPerformed

    private void INR_CBox_RegCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_CBox_RegCustActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INR_CBox_RegCustActionPerformed

    private void INR_Btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_Btn_BackActionPerformed
        // TODSup_Label_Headingcode here:
    }//GEN-LAST:event_INR_Btn_BackActionPerformed

    private void INR_Btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_Btn_OkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INR_Btn_OkActionPerformed

    private void INR_TextF_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INR_TextF_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INR_TextF_TotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AddCustStage_Scp_2;
    private javax.swing.JScrollPane CustStage_Scp_1;
    private javax.swing.JButton INR_Btn_AddItem;
    private javax.swing.JButton INR_Btn_Back;
    private javax.swing.JButton INR_Btn_Done;
    private javax.swing.JButton INR_Btn_Ok;
    private javax.swing.JButton INR_Btn_RemoveItem;
    private javax.swing.JCheckBox INR_CBox_RegCust;
    private javax.swing.JComboBox<String> INR_CmbBox_ItemID;
    private javax.swing.JComboBox<String> INR_CmbBox_ItemName;
    private javax.swing.JLabel INR_Label_CustID;
    private javax.swing.JLabel INR_Label_EmpID;
    private javax.swing.JLabel INR_Label_Heading;
    private javax.swing.JLabel INR_Label_INRDate;
    private javax.swing.JLabel INR_Label_INRNo;
    private javax.swing.JLabel INR_Label_ItemID;
    private javax.swing.JLabel INR_Label_ItemName;
    private javax.swing.JLabel INR_Label_OldINNo;
    private javax.swing.JLabel INR_Label_PostMNo;
    private javax.swing.JLabel INR_Label_Quant;
    private javax.swing.JLabel INR_Label_Reson;
    private javax.swing.JLabel INR_Label_Time;
    private javax.swing.JLabel INR_Label_Total;
    private javax.swing.JSeparator INR_Sep;
    private javax.swing.JTable INR_Table_Item;
    private javax.swing.JTextArea INR_TextA_Reson;
    private javax.swing.JTextField INR_TextF_Date;
    private javax.swing.JTextField INR_TextF_EmpID;
    private javax.swing.JTextField INR_TextF_INRNo;
    private javax.swing.JTextField INR_TextF_OldINNo;
    private javax.swing.JTextField INR_TextF_PostMNo;
    private javax.swing.JTextField INR_TextF_Quant;
    private javax.swing.JTextField INR_TextF_Time;
    private javax.swing.JTextField INR_TextF_Total;
    private javax.swing.JComboBox<String> IN_CmbBox_CustID;
    // End of variables declaration//GEN-END:variables
}
