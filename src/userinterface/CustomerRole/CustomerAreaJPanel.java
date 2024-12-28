/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import userinterface.HotelAdminRole.HotelOrderEventPanel;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Orders.OrderDirectory;

import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.GroceryAdminRole.ManageGroceryInventoryPanel;
import userinterface.GroceryAdminRole.ManageOrdersPanel;

/**
 *
 * @author karthik 
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    DefaultTableModel model1;
    private UserAccount userAccount;
    private OrderDirectory orderDirectory;
    DefaultTableModel model;
    Customer cust;

    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        ecosystem = system;
        cust = findCustomer();

        //valueLabel.setText(enterprise.getName());
//        title2.setText("Welcome "+ cust.getName());
        ImageIcon icon2 = new ImageIcon("./src/images/forbidden.png");
        Image image2 = icon2.getImage().getScaledInstance(75, 60, Image.SCALE_SMOOTH);
        //legalbutton.setIcon(new ImageIcon(image2));

        ImageIcon icon3 = new ImageIcon("./src/images/grocery_customer_panel.png");
        Image image3 = icon3.getImage().getScaledInstance(75, 30, Image.SCALE_SMOOTH);
        //grocerybutton.setIcon(new ImageIcon(image3));

        ImageIcon icon5 = new ImageIcon("./src/images/customer_panel_therepist.png");
        Image image5 = icon5.getImage().getScaledInstance(75, 50, Image.SCALE_SMOOTH);
        //therpistbutton.setIcon(new ImageIcon(image5));

        ImageIcon icon6 = new ImageIcon("./src/images/customer_panel_hotel.png");
        Image image6 = icon6.getImage().getScaledInstance(75, 40, Image.SCALE_SMOOTH);
        hotelbutton.setIcon(new ImageIcon(image6));

        ImageIcon icon7 = new ImageIcon("./src/images/customer_panel_cart.png");
        Image image7 = icon7.getImage().getScaledInstance(75, 60, Image.SCALE_SMOOTH);
        cartbutton.setIcon(new ImageIcon(image7));

        ImageIcon icon8 = new ImageIcon("./src/images/customer_panel_payment.png");
        Image image8 = icon8.getImage().getScaledInstance(75, 60, Image.SCALE_SMOOTH);
        cardbutton.setIcon(new ImageIcon(image8));

//        ImageIcon icon9 =  new ImageIcon("./src/images/PicsArt_12-11-06.26.57.jpg");
//        Image image9 = icon9.getImage().getScaledInstance(250, 260, Image.SCALE_SMOOTH);
//        birdiemessage.setIcon(new ImageIcon(image9));
    }

    public Customer findCustomer() {
        for (int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i++) {
            if (ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        hotelbutton = new javax.swing.JButton();
        cartbutton = new javax.swing.JButton();
        cardbutton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setDividerSize(10);

        jPanel1.setBackground(new java.awt.Color(137, 207, 240));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1034, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(245, 245, 220));

        hotelbutton.setBackground(new java.awt.Color(0, 102, 102));
        hotelbutton.setForeground(new java.awt.Color(255, 255, 255));
        hotelbutton.setText("Food");
        hotelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelbuttonActionPerformed(evt);
            }
        });

        cartbutton.setBackground(new java.awt.Color(0, 102, 102));
        cartbutton.setForeground(new java.awt.Color(255, 255, 255));
        cartbutton.setText("Cart");
        cartbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartbuttonActionPerformed(evt);
            }
        });

        cardbutton.setBackground(new java.awt.Color(0, 102, 102));
        cardbutton.setForeground(new java.awt.Color(255, 255, 255));
        cardbutton.setText("Add Card");
        cardbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(cardbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(hotelbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(hotelbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cartbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cardbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(771, 771, 771))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cardbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardbuttonActionPerformed
        // TODO add your handling code here:
        CustomerAddCardDetailsPanel mm = new CustomerAddCardDetailsPanel(userProcessContainer, userAccount, ecosystem, jSplitPane1);
        jSplitPane1.setRightComponent(mm);
    }//GEN-LAST:event_cardbuttonActionPerformed

    private void cartbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartbuttonActionPerformed
        // TODO add your handling code here:
        CustomerCart mm = new CustomerCart(userProcessContainer, userAccount, ecosystem, jSplitPane1, cust);
        jSplitPane1.setRightComponent(mm);
    }//GEN-LAST:event_cartbuttonActionPerformed

    private void hotelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotelbuttonActionPerformed
        // TODO add your handling code here:
        CustomerHotelJPanel mm = new CustomerHotelJPanel(userProcessContainer, userAccount, ecosystem, jSplitPane1);
        //        userProcessContainer.add("manageNetworkJPanel",mm);
        //        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        //        layout.next(userProcessContainer);
        jSplitPane1.setRightComponent(mm);
    }//GEN-LAST:event_hotelbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cardbutton;
    private javax.swing.JButton cartbutton;
    private javax.swing.JButton hotelbutton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
