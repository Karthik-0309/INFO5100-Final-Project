/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Orders.HotelDirectory;
import Business.Orders.OrderDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gunashreer 
 */
public class DeliveryStatus extends javax.swing.JPanel {
    JPanel userProcessContainer;
    OrderDirectory orderDirectory;
    EcoSystem ecosystem;
    DeliveryMan deliveryMan;
    Customer cust;
    HotelDirectory hotelDirectory;
    UserAccount userAccount;
    /**
     * Creates new form DeliveryStatus
     */
    public DeliveryStatus(JPanel userProcessContainer, EcoSystem ecosystem, OrderDirectory orderDirectory, HotelDirectory hotelDirectory, DeliveryMan deliveryMan, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.orderDirectory = orderDirectory;
        this.ecosystem = ecosystem;
        this.deliveryMan = deliveryMan;
        this.hotelDirectory = hotelDirectory;
        this.userAccount = userAccount;
        title.setText(deliveryMan.getName());
    }
    
    public Customer findCustomer() {
        for (int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i++) {
            if (orderDirectory != null && ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(orderDirectory.getCustomerDetails().getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }else if(hotelDirectory != null && ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(hotelDirectory.getCustomerDetails().getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }
    
    public void setCustomerStatus(String status) {
        Customer cust = findCustomer();
            if(orderDirectory != null){
                for (int i = 0; i < cust.getOrderDirectoryList().size(); i++) {
                    if (cust.getOrderDirectoryList().get(i).getId() == (orderDirectory.getId())) {
                        cust.getOrderDirectoryList().get(i).setStatus(status);
                    }
                }
            }else{
                for (int i = 0; i < cust.getOrderDirectoryList().size(); i++) {
                    if (cust.getHotelorderDirectoryList().get(i).getId() == (hotelDirectory.getId())) {
                        cust.getHotelorderDirectoryList().get(i).setStatus(status);
                    }
                }
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        statusCombo = new javax.swing.JComboBox<>();
        SubmitButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 102, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(72, 72, 72));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Set Delivery Status");

        statusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Picked Up", "In transit", "Delivered" }));

        SubmitButton.setBackground(new java.awt.Color(102, 102, 255));
        SubmitButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("Submit");
        SubmitButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 83, 170));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        title.setBackground(new java.awt.Color(255, 51, 0));
        title.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 83, 170));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/giphy (2).gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(258, 258, 258))
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(442, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {SubmitButton, btnBack});

    }// </editor-fold>//GEN-END:initComponents

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        String item = "";
        if (statusCombo.getSelectedIndex() >= 0) {
            item = String.valueOf(statusCombo.getSelectedItem());
            if(orderDirectory != null) {
                orderDirectory.setStatus(item);
                System.out.println("before grocery" + deliveryMan.getOrderList().size());
            }else{
             hotelDirectory.setStatus(item);   
             System.out.println("before hotel" + deliveryMan.getOrderLists().size());
            }
            setCustomerStatus(item);
            if (item == "Delivered") {
                System.out.println("Inside if");
               
                for(int i = 0; i < ecosystem.getDeliveryManDirectory().getDeliverymanList().size(); i ++) {
                    System.out.println("Inside for");
                    if (deliveryMan.getName() == ecosystem.getDeliveryManDirectory().getDeliverymanList().get(i).getName()) {
                        ecosystem.getDeliveryManDirectory().getDeliverymanList().get(i).setAvailable(true);
                        System.out.println("Print"+ecosystem.getDeliveryManDirectory().getDeliverymanList().get(i).isAvailable()+"_"+ecosystem.getDeliveryManDirectory().getDeliverymanList().get(i).getName());
                        
                        JOptionPane.showMessageDialog(this, "Order changed to delivered");
                        return;
                    }
                }
            }
            JOptionPane.showMessageDialog(null,"Order status changed"); 
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        DeliveryManWorkAreaJPanel dm= new DeliveryManWorkAreaJPanel(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> statusCombo;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
