/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appproject;

/**
 *
 * @author dfuen01
 */
public class Inventory extends javax.swing.JFrame {
private Player mainPlay;
private String choiceEntered = "-1";
    /**
     * Creates new form Inventory
     */
    public Inventory() {
        initComponents();
    }
    
    /**
     * Creates new form of Inventory of a specific player
     * @param player The current player of the game
     */
    
    public Inventory(Player player) {
        initComponents();
        mainPlay = player;
    }
    
    /**
     * Gets the itemList array from JList
     * @return itemList array
     */
    public javax.swing.JList getItemList() { 
        return this.itemList;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemList = new javax.swing.JList<>();
        viewDescriptionButton = new javax.swing.JButton();
        itemsLabel = new javax.swing.JLabel();
        descriptionBoxPane = new javax.swing.JScrollPane();
        descriptionBoxTextArea = new javax.swing.JTextArea();
        exitButton = new javax.swing.JButton();
        descriptionBoxLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        itemList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        itemList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                itemListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(itemList);

        viewDescriptionButton.setText("View Description");
        viewDescriptionButton.setEnabled(false);
        viewDescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDescriptionButtonActionPerformed(evt);
            }
        });

        itemsLabel.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        itemsLabel.setForeground(new java.awt.Color(255, 255, 255));
        itemsLabel.setText("ITEMS");

        descriptionBoxTextArea.setEditable(false);
        descriptionBoxTextArea.setColumns(20);
        descriptionBoxTextArea.setRows(5);
        descriptionBoxPane.setViewportView(descriptionBoxTextArea);

        exitButton.setText("<- Return");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        descriptionBoxLabel.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        descriptionBoxLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionBoxLabel.setText("Description");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewDescriptionButton)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(94, 94, 94)
                                    .addComponent(itemsLabel))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionBoxPane, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(descriptionBoxLabel)
                                .addGap(70, 70, 70))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(exitButton)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemsLabel)
                    .addComponent(descriptionBoxLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(descriptionBoxPane)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewDescriptionButton)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Assures that the player's choice has been made and assigns choice to variable
 * @param evt 
 */
    private void itemListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_itemListValueChanged
        // TODO add your handling code here:
         if(!evt.getValueIsAdjusting()) {        //once the debouncing is done, enter if statement

            
            choiceEntered = this.itemList.getSelectedValue();
            viewDescriptionButton.setEnabled(true);
        }
    }//GEN-LAST:event_itemListValueChanged
/**
 * Shows the description of the selected item
 * @param evt 
 */
    private void viewDescriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDescriptionButtonActionPerformed
        // TODO add your handling code here:
        //Find a way to display item description based on choice made by player
        
        
        Item[] currentInventory = mainPlay.getPlayerInventory(); 
        String itemDescription;
        //String[] itemDescriptions = new String[currentInventory.length];
        for(int i = 0; i<currentInventory.length; i++) { 
            
            if(currentInventory[i].getItemName().equals(choiceEntered)) { 
                itemDescription = currentInventory[i].getItemDescription();
                descriptionBoxTextArea.setText(itemDescription);
                break;
            }
        }
        
        descriptionBoxTextArea.setLineWrap(true);
    }//GEN-LAST:event_viewDescriptionButtonActionPerformed
/**
 * Closes the Inventory form
 * @param evt 
 */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionBoxLabel;
    private javax.swing.JScrollPane descriptionBoxPane;
    private javax.swing.JTextArea descriptionBoxTextArea;
    private javax.swing.JButton exitButton;
    private javax.swing.JList<String> itemList;
    private javax.swing.JLabel itemsLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewDescriptionButton;
    // End of variables declaration//GEN-END:variables
}
