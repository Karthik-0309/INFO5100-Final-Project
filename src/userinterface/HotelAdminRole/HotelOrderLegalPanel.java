/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HotelAdminRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Hotel.Hotel;

import Business.Legal.Legal;
import Business.Orders.OrderDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSplitPane;

/**
 *
 * @author  akshay
 */
public class HotelOrderLegalPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount userAccount;
    DefaultTableModel model;
    DefaultTableModel model1;
    Hotel cust;
    JSplitPane screen;

    /**
     * Creates new form HotelSelectLegalPanel
     */
    public HotelOrderLegalPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, JSplitPane screen) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        ecosystem = system;
        this.screen = screen;
        cust = findManageHotel();
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        legaltable.setModel(model);
//        pastorderstable.setModel(model1);
        
        model.addColumn("Legal Company Name");
        model.addColumn("Location");
        model.addColumn("Phone");

        model1.addColumn("Id");
        model1.addColumn("Status");
        model1.addColumn("Legal Company Name");

        populateRequestTable();
        populateCustomerOrders();

        ImageIcon icon6 = new ImageIcon("./src/images/Standalone_birdie.png");
        Image image6 = icon6.getImage().getScaledInstance(394, 350, Image.SCALE_SMOOTH);
        //jLabel4.setIcon(new ImageIcon(image6));

    }

    public void populateCustomerOrders() {
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        for (int i = 0; i < cust.getLegaldirectorylist().size(); i++) {
            model1.addRow(new Object[]{
                i + 1,
                cust.getLegaldirectorylist().get(i).getStatus(),
                cust.getLegaldirectorylist().get(i).getLegal().getName()
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

    public void populateRequestTable() {
        for (int i = 0; i < ecosystem.getLegalDirectory().getLegalList().size(); i++) {
            if (ecosystem.getLegalDirectory().getLegalList().get(i).getNetwork().equals(cust.getNetwork())) {
                model.addRow(new Object[]{
                    ecosystem.getLegalDirectory().getLegalList().get(i).getName(),
                    ecosystem.getLegalDirectory().getLegalList().get(i).getAddress(),
                    ecosystem.getLegalDirectory().getLegalList().get(i).getPhone(),});
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        legaltable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 102, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        legaltable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
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
        jScrollPane1.setViewportView(legaltable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select one of your choice");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 102, 0));
        jLabel6.setFont(new java.awt.Font("Jokerman", 3, 24)); // NOI18N
        jLabel6.setText("Quality Assured, Safety Ensured ..!!");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 690, 460, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.out.println(legaltable.getSelectedRow() + " row ");
        if (legaltable.getSelectedRow() >= 0) {
            HotelSelectLegalPanel mm = new HotelSelectLegalPanel(userProcessContainer, this.userAccount, ecosystem, ecosystem.getLegalDirectory().getLegalList().get(legaltable.getSelectedRow()),screen);
            //            userProcessContainer.add("manageNetworkJPanel", mm);
            //            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            //            layout.next(userProcessContainer);
            screen.setRightComponent(mm);
            System.out.println("Legal Service Selected");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a Legal Service");
        }

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable legaltable;
    // End of variables declaration//GEN-END:variables
}
