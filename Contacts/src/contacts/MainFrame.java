package contacts;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class MainFrame extends javax.swing.JFrame {
    DefaultTableModel model;
    File f;
    public MainFrame() throws Exception {
        initComponents();
        ImageIcon img = new ImageIcon("src/Recs/det.png");
        setIconImage(img.getImage());
        setTitle("Debug Entity Team");
        model = (DefaultTableModel) table.getModel();
        setSize(1010 , 680);
        table.setAutoCreateRowSorter(true);
        f = new File("src\\dataSet.bin");
        if (!f.exists()) {
            f.createNewFile();
        }
        start();
    }
    public void start() throws Exception {
        FileInputStream fi = new FileInputStream(f);
        if (f.length() <= 0) {
            return;
        }
        ObjectInputStream oi = new ObjectInputStream(fi);
        Vector<Vector> tableData = (Vector<Vector>) oi.readObject();
        oi.close();
        fi.close();
        numberOfClients = tableData.size();
        for (int i = 0; i < numberOfClients; i++) {
            model.addRow(new Object[]{tableData.get(i).get(0) , tableData.get(i).get(1) , tableData.get(i).get(2) , tableData.get(i).get(3) , tableData.get(i).get(4)});
        }
        updateCounter(numberOfClients);
    }
    public void updateFile() throws Exception{
        Vector<Vector> tableData = model.getDataVector();
        FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        oo.writeObject(tableData);
        fo.close();
        oo.close();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        newClientPanel = new javax.swing.JPanel();
        fullNameLabel = new javax.swing.JLabel();
        fullNameText = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberText = new javax.swing.JTextField();
        gmailText = new javax.swing.JTextField();
        gmailLabel = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        listOfContactsLabel = new javax.swing.JLabel();
        numberOfClientsLabel = new javax.swing.JLabel();
        counterLabel = new javax.swing.JLabel();
        madeByDetLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchBox = new javax.swing.JTextField();
        comboBox = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 620));
        setPreferredSize(new java.awt.Dimension(1000, 620));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(204, 153, 255));
        mainPanel.setMinimumSize(new java.awt.Dimension(1000, 700));
        mainPanel.setPreferredSize(new java.awt.Dimension(1000, 700));

        newClientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "New Client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 18))); // NOI18N
        newClientPanel.setOpaque(false);
        newClientPanel.setPreferredSize(new java.awt.Dimension(350, 400));

        fullNameLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        fullNameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/id-card.png"))); // NOI18N
        fullNameLabel.setText("* Full  name");

        fullNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        phoneNumberLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        phoneNumberLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/telephone.png"))); // NOI18N
        phoneNumberLabel.setText("* Phone number");

        phoneNumberText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextActionPerformed(evt);
            }
        });

        gmailText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        gmailLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        gmailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/gmail.png"))); // NOI18N
        gmailLabel.setText("* Gmail");

        cityText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cityLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cityLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/buildings.png"))); // NOI18N
        cityLabel.setText(" City");

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/add.png"))); // NOI18N
        addButton.setText("add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/changes.png"))); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/broom.png"))); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/delete.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newClientPanelLayout = new javax.swing.GroupLayout(newClientPanel);
        newClientPanel.setLayout(newClientPanelLayout);
        newClientPanelLayout.setHorizontalGroup(
            newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newClientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(newClientPanelLayout.createSequentialGroup()
                        .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(newClientPanelLayout.createSequentialGroup()
                                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityText)
                            .addComponent(gmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        newClientPanelLayout.setVerticalGroup(
            newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newClientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        listOfContactsLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        listOfContactsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listOfContactsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/contact.png"))); // NOI18N
        listOfContactsLabel.setText("List of Contacts");

        numberOfClientsLabel.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        numberOfClientsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberOfClientsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/number-blocks.png"))); // NOI18N
        numberOfClientsLabel.setText("Number of clients is :");

        counterLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        counterLabel.setText("0");

        madeByDetLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        madeByDetLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        madeByDetLabel.setText("Mady by DET");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Full name", "Phone number", "Gmail", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(20);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(120);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(90);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        comboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Full name", "Phone number", "Gmail", "City" }));
        comboBox.setSelectedIndex(1);

        searchButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/search-interface-symbol.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/delete.png"))); // NOI18N
        jButton1.setText("Clear all");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(madeByDetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(numberOfClientsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(counterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listOfContactsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(newClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(searchBox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfClientsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(counterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listOfContactsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchBox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBox)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(newClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(madeByDetLabel)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (checkMainInfo()) {
            Client newClient;
            if (cityText.getText().trim().isEmpty()){
                newClient = new Client(fullNameText.getText().trim() , phoneNumberText.getText().trim(), gmailText.getText().trim());
            } else {
                newClient = new Client(fullNameText.getText().trim() , phoneNumberText.getText().trim(), gmailText.getText().trim() , cityText.getText().trim());
            }
            if (!newClient.flag()) {
                JOptionPane.showMessageDialog(this, newClient.getMessege(), "Error Message" , JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
                    addToTable(newClient);
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else {
            JOptionPane.showMessageDialog(this, "Please enter the Main Information !" , "Error Message" , JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int index = table.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this , "Please select at least one row !!" , "Not selected row !!" , JOptionPane.ERROR_MESSAGE);
        } else {
            model.removeRow(index);
            numberOfClients--;
            updateCounter(numberOfClients);
        }
        try {
            updateFile();
        } catch (Exception ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        checkIdNumbers();
    }//GEN-LAST:event_deleteButtonActionPerformed
    public void checkIdNumbers(){
        for (int i = 0; i < numberOfClients; i++) {
            model.setValueAt(i+1, i, 0);
        }
        updateCounter(numberOfClients);
    }
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (searchBox.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a value to search for !" , "Error Messege" , JOptionPane.ERROR_MESSAGE);
        }else {
            if (comboBox.getSelectedItem().equals("All")) {
                for (int i = 0; i < numberOfClients; i++) {
                    for (int j = 1; j < 5; j++) {
                        if (model.getValueAt(i , j).equals(searchBox.getText().trim())) {
                            validSearch(i);
                            return;
                        }
                    }
                }
            } else if(comboBox.getSelectedItem().equals("Full name")){
                for (int i = 0; i < numberOfClients; i++) {
                    if (model.getValueAt(i , 1).equals(searchBox.getText().trim())) {
                        validSearch(i);
                        return;
                    }
                }
            } else if(comboBox.getSelectedItem().equals("Phone number")){
                for (int i = 0; i < numberOfClients; i++) {
                    if (model.getValueAt(i , 2).equals(searchBox.getText().trim())) {
                        validSearch(i);
                        return;
                    }
                }
            } else if(comboBox.getSelectedItem().equals("Gmail")){
                for (int i = 0; i < numberOfClients; i++) {
                    if (model.getValueAt(i , 3).equals(searchBox.getText().trim())) {
                        validSearch(i);
                        return;
                    }
                }
            } else {
                for (int i = 0; i < numberOfClients; i++) {
                    if (model.getValueAt(i , 4).equals(searchBox.getText().trim())) {
                        validSearch(i);
                        return;
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Not founded data in the Option : " + comboBox.getSelectedItem() , "Not founded !!" , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchButtonActionPerformed
     public void updateToTable(Client c) throws Exception{
        int i = table.getSelectedRow();
        model.setValueAt(c.getFullName(), i , 1);
        model.setValueAt(c.getPhoneNumber(),i , 2);
        model.setValueAt(c.getGmail(),i, 3);
        model.setValueAt(c.getCity(),i, 4);
        updateFile();
    }
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (checkMainInfo()) {
            Client newClient;
            if (cityText.getText().trim().isEmpty()){
                newClient = new Client(fullNameText.getText().trim() , phoneNumberText.getText().trim(), gmailText.getText().trim());
            } else {
                newClient = new Client(fullNameText.getText().trim() , phoneNumberText.getText().trim(), gmailText.getText().trim() , cityText.getText().trim());
            }
            if (!newClient.flag()) {
                JOptionPane.showMessageDialog(this, newClient.getMessege(), "Error Message" , JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
                    updateToTable(newClient);
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else {
            JOptionPane.showMessageDialog(this, "Please enter the Main Information !" , "Error Message" , JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_updateButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        while (numberOfClients-->0) {            
            model.removeRow(0);
        }
        updateCounter(numberOfClients = 0);
        try {
            updateFile();
        } catch (Exception ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void phoneNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextActionPerformed
    public void validSearch(int i){
        table.setRowSelectionInterval(i , i);
        fullNameText.setText(model.getValueAt(i , 1)+"");
        phoneNumberText.setText(model.getValueAt(i , 2)+"");
        gmailText.setText(model.getValueAt(i , 3)+"");
        cityText.setText(model.getValueAt(i , 4)+"");
        JOptionPane.showMessageDialog(this,"Founded in the " + comboBox.getSelectedItem()+ " data !!" , "Result of your search" , JOptionPane.INFORMATION_MESSAGE);
    }
    public void updateCounter(int numOfClients){
        counterLabel.setText(numberOfClients + "");
    }
    public void addToTable(Client c)throws Exception {
        model.addRow(new Object[]{table.getRowCount()+1 , c.getFullName() , c.getPhoneNumber() , c.getGmail() , c.getCity().isEmpty() ? "null" : c.getCity() });
        numberOfClients++;
        updateCounter(numberOfClients);
        clear();
        updateFile();
    }
    public boolean checkMainInfo(){
        return !fullNameText.getText().trim().isEmpty() && 
               !phoneNumberText.getText().trim().isEmpty() &&
               !gmailText.getText().trim().isEmpty();
    }
    public void clear(){
        fullNameText.setText("");
        phoneNumberText.setText("");
        gmailText.setText("");
        cityText.setText("");
    }
    public static void main(String args[]) throws Exception {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    public static int numberOfClients;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityText;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel counterLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JTextField fullNameText;
    private javax.swing.JLabel gmailLabel;
    private javax.swing.JTextField gmailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listOfContactsLabel;
    private javax.swing.JLabel madeByDetLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel newClientPanel;
    private javax.swing.JLabel numberOfClientsLabel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable table;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
