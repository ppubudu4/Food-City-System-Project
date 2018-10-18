/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


public class Cat extends javax.swing.JPanel {

    /**
     * Creates new form Cat
     */
    public Cat() {
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

        Cat_Label_Heading = new javax.swing.JLabel();
        Cat_LPane_AdEdReCat = new javax.swing.JLayeredPane();
        Cat_AdEdReCat_Label_CatID = new javax.swing.JLabel();
        Cat_AdEdReCat_TextF_CatID = new javax.swing.JTextField();
        Cat_AdEdReCat_Label_CatName = new javax.swing.JLabel();
        Cat_AdEdReCat_TextF_CatName = new javax.swing.JTextField();
        Cat_AdEdReCat_Btn_AddCat = new javax.swing.JButton();
        Cat_AdEdReCat_Btn_EditCat = new javax.swing.JButton();
        Cat_AdEdReCat_Btn_RemoveCat = new javax.swing.JButton();
        AddCat_ScP_1 = new javax.swing.JScrollPane();
        Cat_AdEdReCat_Table_Cat = new javax.swing.JTable();
        Cat_AdEdReCat_Btn_RemoveUpdate = new javax.swing.JButton();
        Cat_AdEdReCat_Btn_Update = new javax.swing.JButton();
        Cat_LPane_SearchCat = new javax.swing.JLayeredPane();
        Cat_ScP_1 = new javax.swing.JScrollPane();
        Cat_Search_Table_Cat = new javax.swing.JTable();
        Cat_ScP_2 = new javax.swing.JScrollPane();
        Cat_Search_Table_Item = new javax.swing.JTable();
        Car_Search_ComBox_CatID = new javax.swing.JComboBox<>();
        Cat_Search_ComBox_CatName = new javax.swing.JComboBox<>();
        Cat_Search_Btn_ShowAll = new javax.swing.JButton();
        Cat_Search_Label_CatID = new javax.swing.JLabel();
        Cat_Search_Label_CatName = new javax.swing.JLabel();
        Cat_Search_Btn_Search = new javax.swing.JButton();
        Cat_Btn_Ok = new javax.swing.JButton();
        Cat_Btn_Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        Cat_Label_Heading.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Cat_Label_Heading.setForeground(new java.awt.Color(51, 51, 51));
        Cat_Label_Heading.setText("Categories");

        Cat_LPane_AdEdReCat.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Add / Edit / Remove Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 11), new java.awt.Color(104, 2, 5))); // NOI18N

        Cat_AdEdReCat_Label_CatID.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Cat_AdEdReCat_Label_CatID.setForeground(new java.awt.Color(51, 51, 51));
        Cat_AdEdReCat_Label_CatID.setText("Category ID : ");

        Cat_AdEdReCat_TextF_CatID.setEditable(false);
        Cat_AdEdReCat_TextF_CatID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Cat_AdEdReCat_TextF_CatID.setToolTipText("Category ID");
        Cat_AdEdReCat_TextF_CatID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_AdEdReCat_TextF_CatIDActionPerformed(evt);
            }
        });

        Cat_AdEdReCat_Label_CatName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Cat_AdEdReCat_Label_CatName.setForeground(new java.awt.Color(51, 51, 51));
        Cat_AdEdReCat_Label_CatName.setText("Category Name : ");

        Cat_AdEdReCat_TextF_CatName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Cat_AdEdReCat_TextF_CatName.setToolTipText("Category Name");
        Cat_AdEdReCat_TextF_CatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_AdEdReCat_TextF_CatNameActionPerformed(evt);
            }
        });

        Cat_AdEdReCat_Btn_AddCat.setBackground(new java.awt.Color(204, 204, 204));
        Cat_AdEdReCat_Btn_AddCat.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Cat_AdEdReCat_Btn_AddCat.setForeground(new java.awt.Color(51, 51, 51));
        Cat_AdEdReCat_Btn_AddCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/Add_plus.png"))); // NOI18N
        Cat_AdEdReCat_Btn_AddCat.setText("Add");
        Cat_AdEdReCat_Btn_AddCat.setToolTipText("Add Category");
        Cat_AdEdReCat_Btn_AddCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cat_AdEdReCat_Btn_AddCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_AdEdReCat_Btn_AddCatActionPerformed(evt);
            }
        });

        Cat_AdEdReCat_Btn_EditCat.setBackground(new java.awt.Color(204, 204, 204));
        Cat_AdEdReCat_Btn_EditCat.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Cat_AdEdReCat_Btn_EditCat.setForeground(new java.awt.Color(51, 51, 51));
        Cat_AdEdReCat_Btn_EditCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/Edit_pencil.png"))); // NOI18N
        Cat_AdEdReCat_Btn_EditCat.setText("Edit");
        Cat_AdEdReCat_Btn_EditCat.setToolTipText("Edit Category");
        Cat_AdEdReCat_Btn_EditCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cat_AdEdReCat_Btn_EditCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_AdEdReCat_Btn_EditCatActionPerformed(evt);
            }
        });

        Cat_AdEdReCat_Btn_RemoveCat.setBackground(new java.awt.Color(204, 204, 204));
        Cat_AdEdReCat_Btn_RemoveCat.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Cat_AdEdReCat_Btn_RemoveCat.setForeground(new java.awt.Color(51, 51, 51));
        Cat_AdEdReCat_Btn_RemoveCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/trash_bin.png"))); // NOI18N
        Cat_AdEdReCat_Btn_RemoveCat.setText("Remove");
        Cat_AdEdReCat_Btn_RemoveCat.setToolTipText("Remove Category");
        Cat_AdEdReCat_Btn_RemoveCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cat_AdEdReCat_Btn_RemoveCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_AdEdReCat_Btn_RemoveCatActionPerformed(evt);
            }
        });

        Cat_AdEdReCat_Table_Cat.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Cat_AdEdReCat_Table_Cat.setForeground(new java.awt.Color(51, 51, 51));
        Cat_AdEdReCat_Table_Cat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Category Name"
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
        Cat_AdEdReCat_Table_Cat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cat_AdEdReCat_Table_Cat.setIntercellSpacing(new java.awt.Dimension(1, 0));
        Cat_AdEdReCat_Table_Cat.setRowHeight(17);
        Cat_AdEdReCat_Table_Cat.setSelectionBackground(new java.awt.Color(46, 141, 216));
        Cat_AdEdReCat_Table_Cat.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        AddCat_ScP_1.setViewportView(Cat_AdEdReCat_Table_Cat);

        Cat_AdEdReCat_Btn_RemoveUpdate.setBackground(new java.awt.Color(204, 204, 204));
        Cat_AdEdReCat_Btn_RemoveUpdate.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Cat_AdEdReCat_Btn_RemoveUpdate.setForeground(new java.awt.Color(51, 51, 51));
        Cat_AdEdReCat_Btn_RemoveUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/trash_bin.png"))); // NOI18N
        Cat_AdEdReCat_Btn_RemoveUpdate.setText("Remove");
        Cat_AdEdReCat_Btn_RemoveUpdate.setToolTipText("Remove Edit");
        Cat_AdEdReCat_Btn_RemoveUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cat_AdEdReCat_Btn_RemoveUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_AdEdReCat_Btn_RemoveUpdateActionPerformed(evt);
            }
        });

        Cat_AdEdReCat_Btn_Update.setBackground(new java.awt.Color(204, 204, 204));
        Cat_AdEdReCat_Btn_Update.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Cat_AdEdReCat_Btn_Update.setForeground(new java.awt.Color(51, 51, 51));
        Cat_AdEdReCat_Btn_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/check.png"))); // NOI18N
        Cat_AdEdReCat_Btn_Update.setText("Update");
        Cat_AdEdReCat_Btn_Update.setToolTipText("Update");
        Cat_AdEdReCat_Btn_Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cat_AdEdReCat_Btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_AdEdReCat_Btn_UpdateActionPerformed(evt);
            }
        });

        Cat_LPane_AdEdReCat.setLayer(Cat_AdEdReCat_Label_CatID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_AdEdReCat.setLayer(Cat_AdEdReCat_TextF_CatID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_AdEdReCat.setLayer(Cat_AdEdReCat_Label_CatName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_AdEdReCat.setLayer(Cat_AdEdReCat_TextF_CatName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_AdEdReCat.setLayer(Cat_AdEdReCat_Btn_AddCat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_AdEdReCat.setLayer(Cat_AdEdReCat_Btn_EditCat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_AdEdReCat.setLayer(Cat_AdEdReCat_Btn_RemoveCat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_AdEdReCat.setLayer(AddCat_ScP_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_AdEdReCat.setLayer(Cat_AdEdReCat_Btn_RemoveUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_AdEdReCat.setLayer(Cat_AdEdReCat_Btn_Update, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Cat_LPane_AdEdReCatLayout = new javax.swing.GroupLayout(Cat_LPane_AdEdReCat);
        Cat_LPane_AdEdReCat.setLayout(Cat_LPane_AdEdReCatLayout);
        Cat_LPane_AdEdReCatLayout.setHorizontalGroup(
            Cat_LPane_AdEdReCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cat_LPane_AdEdReCatLayout.createSequentialGroup()
                .addGroup(Cat_LPane_AdEdReCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cat_LPane_AdEdReCatLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(Cat_AdEdReCat_Btn_AddCat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cat_AdEdReCat_Btn_EditCat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cat_AdEdReCat_Btn_RemoveCat))
                    .addGroup(Cat_LPane_AdEdReCatLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(Cat_LPane_AdEdReCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cat_AdEdReCat_Label_CatName)
                            .addComponent(Cat_AdEdReCat_Label_CatID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Cat_LPane_AdEdReCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cat_AdEdReCat_TextF_CatName)
                            .addComponent(Cat_AdEdReCat_TextF_CatID, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(AddCat_ScP_1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Cat_LPane_AdEdReCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cat_AdEdReCat_Btn_Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cat_AdEdReCat_Btn_RemoveUpdate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(46, 46, 46))
        );
        Cat_LPane_AdEdReCatLayout.setVerticalGroup(
            Cat_LPane_AdEdReCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cat_LPane_AdEdReCatLayout.createSequentialGroup()
                .addGroup(Cat_LPane_AdEdReCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddCat_ScP_1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(Cat_LPane_AdEdReCatLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(Cat_LPane_AdEdReCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cat_AdEdReCat_Label_CatID)
                            .addComponent(Cat_AdEdReCat_TextF_CatID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Cat_LPane_AdEdReCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cat_AdEdReCat_Label_CatName)
                            .addComponent(Cat_AdEdReCat_TextF_CatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(Cat_LPane_AdEdReCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cat_AdEdReCat_Btn_AddCat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cat_AdEdReCat_Btn_EditCat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cat_AdEdReCat_Btn_RemoveCat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Cat_LPane_AdEdReCatLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Cat_AdEdReCat_Btn_RemoveUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cat_AdEdReCat_Btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        Cat_LPane_SearchCat.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Search Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 11), new java.awt.Color(104, 2, 5))); // NOI18N

        Cat_Search_Table_Cat.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Cat_Search_Table_Cat.setForeground(new java.awt.Color(51, 51, 51));
        Cat_Search_Table_Cat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Category Name"
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
        Cat_Search_Table_Cat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cat_Search_Table_Cat.setIntercellSpacing(new java.awt.Dimension(1, 0));
        Cat_Search_Table_Cat.setRowHeight(17);
        Cat_Search_Table_Cat.setSelectionBackground(new java.awt.Color(46, 141, 216));
        Cat_Search_Table_Cat.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Cat_ScP_1.setViewportView(Cat_Search_Table_Cat);

        Cat_Search_Table_Item.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Cat_Search_Table_Item.setForeground(new java.awt.Color(51, 51, 51));
        Cat_Search_Table_Item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Brand", "Sub Category", "Quantity"
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
        Cat_Search_Table_Item.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cat_Search_Table_Item.setIntercellSpacing(new java.awt.Dimension(1, 0));
        Cat_Search_Table_Item.setRowHeight(17);
        Cat_Search_Table_Item.setRowSelectionAllowed(false);
        Cat_Search_Table_Item.setSelectionBackground(new java.awt.Color(46, 141, 216));
        Cat_Search_Table_Item.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Cat_ScP_2.setViewportView(Cat_Search_Table_Item);

        Car_Search_ComBox_CatID.setEditable(true);
        Car_Search_ComBox_CatID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Car_Search_ComBox_CatID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Item 1", "Item 2", "Item 3", "Item 4" }));
        Car_Search_ComBox_CatID.setToolTipText("Category ID");
        Car_Search_ComBox_CatID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Car_Search_ComBox_CatID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Car_Search_ComBox_CatIDActionPerformed(evt);
            }
        });

        Cat_Search_ComBox_CatName.setEditable(true);
        Cat_Search_ComBox_CatName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Cat_Search_ComBox_CatName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Item 1", "Item 2", "Item 3", "Item 4" }));
        Cat_Search_ComBox_CatName.setToolTipText("Category Name");
        Cat_Search_ComBox_CatName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cat_Search_ComBox_CatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_Search_ComBox_CatNameActionPerformed(evt);
            }
        });

        Cat_Search_Btn_ShowAll.setBackground(new java.awt.Color(204, 204, 204));
        Cat_Search_Btn_ShowAll.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Cat_Search_Btn_ShowAll.setForeground(new java.awt.Color(51, 51, 51));
        Cat_Search_Btn_ShowAll.setText("Show All");
        Cat_Search_Btn_ShowAll.setToolTipText("Show All Categories");
        Cat_Search_Btn_ShowAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cat_Search_Btn_ShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_Search_Btn_ShowAllActionPerformed(evt);
            }
        });

        Cat_Search_Label_CatID.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Cat_Search_Label_CatID.setForeground(new java.awt.Color(51, 51, 51));
        Cat_Search_Label_CatID.setText("Category ID : ");

        Cat_Search_Label_CatName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Cat_Search_Label_CatName.setForeground(new java.awt.Color(51, 51, 51));
        Cat_Search_Label_CatName.setText("Name : ");

        Cat_Search_Btn_Search.setBackground(new java.awt.Color(204, 204, 204));
        Cat_Search_Btn_Search.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Cat_Search_Btn_Search.setForeground(new java.awt.Color(51, 51, 51));
        Cat_Search_Btn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn_icon/search (2).png"))); // NOI18N
        Cat_Search_Btn_Search.setText("Search");
        Cat_Search_Btn_Search.setToolTipText("Search");
        Cat_Search_Btn_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cat_Search_Btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_Search_Btn_SearchActionPerformed(evt);
            }
        });

        Cat_LPane_SearchCat.setLayer(Cat_ScP_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_SearchCat.setLayer(Cat_ScP_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_SearchCat.setLayer(Car_Search_ComBox_CatID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_SearchCat.setLayer(Cat_Search_ComBox_CatName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_SearchCat.setLayer(Cat_Search_Btn_ShowAll, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_SearchCat.setLayer(Cat_Search_Label_CatID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_SearchCat.setLayer(Cat_Search_Label_CatName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cat_LPane_SearchCat.setLayer(Cat_Search_Btn_Search, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Cat_LPane_SearchCatLayout = new javax.swing.GroupLayout(Cat_LPane_SearchCat);
        Cat_LPane_SearchCat.setLayout(Cat_LPane_SearchCatLayout);
        Cat_LPane_SearchCatLayout.setHorizontalGroup(
            Cat_LPane_SearchCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cat_LPane_SearchCatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cat_ScP_2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cat_ScP_1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(Cat_LPane_SearchCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cat_LPane_SearchCatLayout.createSequentialGroup()
                        .addGroup(Cat_LPane_SearchCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cat_Search_Label_CatID)
                            .addComponent(Cat_Search_Label_CatName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Cat_LPane_SearchCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Car_Search_ComBox_CatID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cat_Search_ComBox_CatName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cat_LPane_SearchCatLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(Cat_LPane_SearchCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cat_Search_Btn_ShowAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cat_Search_Btn_Search, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(59, 59, 59))))
        );
        Cat_LPane_SearchCatLayout.setVerticalGroup(
            Cat_LPane_SearchCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cat_LPane_SearchCatLayout.createSequentialGroup()
                .addGroup(Cat_LPane_SearchCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cat_ScP_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Cat_ScP_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Cat_LPane_SearchCatLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Cat_Search_Btn_ShowAll)
                        .addGap(18, 18, 18)
                        .addGroup(Cat_LPane_SearchCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cat_Search_Label_CatID)
                            .addComponent(Car_Search_ComBox_CatID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Cat_LPane_SearchCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cat_Search_Label_CatName)
                            .addComponent(Cat_Search_ComBox_CatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Cat_Search_Btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Cat_Btn_Ok.setBackground(new java.awt.Color(204, 204, 204));
        Cat_Btn_Ok.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Cat_Btn_Ok.setForeground(new java.awt.Color(51, 51, 51));
        Cat_Btn_Ok.setText("Ok");
        Cat_Btn_Ok.setToolTipText("Ok");
        Cat_Btn_Ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cat_Btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_Btn_OkActionPerformed(evt);
            }
        });

        Cat_Btn_Back.setBackground(new java.awt.Color(204, 204, 204));
        Cat_Btn_Back.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Cat_Btn_Back.setForeground(new java.awt.Color(51, 51, 51));
        Cat_Btn_Back.setText("Back");
        Cat_Btn_Back.setToolTipText("Back");
        Cat_Btn_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cat_Btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cat_Btn_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cat_LPane_AdEdReCat)
                    .addComponent(Cat_LPane_SearchCat)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Cat_Btn_Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cat_Btn_Ok)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cat_Label_Heading)
                .addGap(477, 477, 477))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Cat_Label_Heading)
                .addGap(0, 0, 0)
                .addComponent(Cat_LPane_SearchCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cat_LPane_AdEdReCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cat_Btn_Ok)
                    .addComponent(Cat_Btn_Back))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Cat_AdEdReCat_TextF_CatIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_AdEdReCat_TextF_CatIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_AdEdReCat_TextF_CatIDActionPerformed

    private void Cat_AdEdReCat_TextF_CatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_AdEdReCat_TextF_CatNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_AdEdReCat_TextF_CatNameActionPerformed

    private void Cat_AdEdReCat_Btn_AddCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_AdEdReCat_Btn_AddCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_AdEdReCat_Btn_AddCatActionPerformed

    private void Cat_AdEdReCat_Btn_EditCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_AdEdReCat_Btn_EditCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_AdEdReCat_Btn_EditCatActionPerformed

    private void Cat_AdEdReCat_Btn_RemoveCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_AdEdReCat_Btn_RemoveCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_AdEdReCat_Btn_RemoveCatActionPerformed

    private void Cat_AdEdReCat_Btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_AdEdReCat_Btn_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_AdEdReCat_Btn_UpdateActionPerformed

    private void Cat_AdEdReCat_Btn_RemoveUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_AdEdReCat_Btn_RemoveUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_AdEdReCat_Btn_RemoveUpdateActionPerformed

    private void Cat_Btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_Btn_OkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_Btn_OkActionPerformed

    private void Cat_Btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_Btn_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_Btn_BackActionPerformed

    private void Car_Search_ComBox_CatIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Car_Search_ComBox_CatIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Car_Search_ComBox_CatIDActionPerformed

    private void Cat_Search_ComBox_CatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_Search_ComBox_CatNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_Search_ComBox_CatNameActionPerformed

    private void Cat_Search_Btn_ShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_Search_Btn_ShowAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_Search_Btn_ShowAllActionPerformed

    private void Cat_Search_Btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cat_Search_Btn_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cat_Search_Btn_SearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AddCat_ScP_1;
    private javax.swing.JComboBox<String> Car_Search_ComBox_CatID;
    private javax.swing.JButton Cat_AdEdReCat_Btn_AddCat;
    private javax.swing.JButton Cat_AdEdReCat_Btn_EditCat;
    private javax.swing.JButton Cat_AdEdReCat_Btn_RemoveCat;
    private javax.swing.JButton Cat_AdEdReCat_Btn_RemoveUpdate;
    private javax.swing.JButton Cat_AdEdReCat_Btn_Update;
    private javax.swing.JLabel Cat_AdEdReCat_Label_CatID;
    private javax.swing.JLabel Cat_AdEdReCat_Label_CatName;
    private javax.swing.JTable Cat_AdEdReCat_Table_Cat;
    private javax.swing.JTextField Cat_AdEdReCat_TextF_CatID;
    private javax.swing.JTextField Cat_AdEdReCat_TextF_CatName;
    public javax.swing.JButton Cat_Btn_Back;
    public javax.swing.JButton Cat_Btn_Ok;
    private javax.swing.JLayeredPane Cat_LPane_AdEdReCat;
    private javax.swing.JLayeredPane Cat_LPane_SearchCat;
    private javax.swing.JLabel Cat_Label_Heading;
    private javax.swing.JScrollPane Cat_ScP_1;
    private javax.swing.JScrollPane Cat_ScP_2;
    private javax.swing.JButton Cat_Search_Btn_Search;
    private javax.swing.JButton Cat_Search_Btn_ShowAll;
    private javax.swing.JComboBox<String> Cat_Search_ComBox_CatName;
    private javax.swing.JLabel Cat_Search_Label_CatID;
    private javax.swing.JLabel Cat_Search_Label_CatName;
    private javax.swing.JTable Cat_Search_Table_Cat;
    private javax.swing.JTable Cat_Search_Table_Item;
    // End of variables declaration//GEN-END:variables
}
