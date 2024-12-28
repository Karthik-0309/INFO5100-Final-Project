/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HotelAdminRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Hotel.Hotel;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSplitPane;

/**
 *
 * @author  akshay
 */
public class HotelOrderEventPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount userAccount;
    DefaultTableModel model;
    DefaultTableModel model1;
    Hotel cust;
    JSplitPane screen;

    /**
     * Creates new form CustomerSelectHospitalManagerPanel
     */
    public HotelOrderEventPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, JSplitPane screen) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.screen = screen;
        ecosystem = system;
        cust = findManageHotel();
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        
//        pastorderstable.setModel(model1);
        legaltable.setModel(model);
        model.addColumn("Househelp Name");
        model.addColumn("Location");
        model.addColumn("Phone");
        
        model1.addColumn("Id");
        model1.addColumn("Status");
        model1.addColumn("Househelp Name");
 
        populateRequestTable();
        populateCustomerOrders();
        Titlelabel.setText("Welcome "+cust.getName());
        
    }
    
    public void populateCustomerOrders() {
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        for (int i = 0; i < cust.getEventdirectorylist().size();i++) {
            model1.addRow(new Object[]{
                i+1,
                cust.getEventdirectorylist().get(i).getStatus(),
                cust.getEventdirectorylist().get(i).getHospitalManager().getName()
            });
        }

    }
    public Hotel findManageHotel() {
        for (int i = 0; i < ecosystem.getHotel_Directory().getHotelList().size(); i++) {
            if (ecosystem.getHotel_Directory().getHotelList().get(i).getUserAccount().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getHotel_Directory().getHotelList().get(i);
            }
        }
        return null;
    }
    public Customer findCustomer() {
        for (int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i++) {
            if (ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }
    
   public void populateRequestTable() {
        for (int i = 0; i < ecosystem.getEventManagerDirectory().getEventManagerList().size(); i++) {
            if(ecosystem.getEventManagerDirectory().getEventManagerList().get(i).getNetwork().equals(cust.getNetwork())){
             model.addRow(new Object[]{
                ecosystem.getEventManagerDirectory().getEventManagerList().get(i).getName(),
                ecosystem.getEventManagerDirectory().getEventManagerList().get(i).getAddress(),
                ecosystem.getEventManagerDirectory().getEventManagerList().get(i).getPhone(),
                ecosystem.getEventManagerDirectory().getEventManagerList().get(i).getAvailable()});
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titlelabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        legaltable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 153));

        Titlelabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Titlelabel.setForeground(new java.awt.Color(255, 255, 255));
        Titlelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titlelabel.setText("Welcome");

        legaltable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        legaltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        legaltable.setRowHeight(25);
        legaltable.setShowGrid(true);
        jScrollPane1.setViewportView(legaltable);

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("CRAFTING MOMENTS AND CREATING MEMORIES !!");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select a Event");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(Titlelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(454, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(156, 156, 156))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Titlelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 396, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         System.out.println(legaltable.getSelectedRow() + " row ");
        if (legaltable.getSelectedRow() >= 0) {
            HotelSelectEventServicePanel mm = new HotelSelectEventServicePanel(userProcessContainer, this.userAccount, ecosystem,  ecosystem.getEventManagerDirectory().getEventManagerList().get(legaltable.getSelectedRow()), screen);
//            userProcessContainer.add("manageNetworkJPanel", mm);
//            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//            layout.next(userProcessContainer);
               screen.setRightComponent(mm);
               System.out.println("Cleaning Service Selected");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a service from our list");
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titlelabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable legaltable;
    // End of variables declaration//GEN-END:variables
}
