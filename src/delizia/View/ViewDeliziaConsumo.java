package delizia.View;

import delizia.Controler.DeliziaControler;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ViewDeliziaConsumo extends javax.swing.JFrame {

    public static int consumo = 100;
    public static int numTable;
    public static int selectTable;
    public static String name;

    //For Date
    java.util.Date date = new java.util.Date();
    DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
    Date filter_date = Date.valueOf(dateFormat.format(date));

    public ViewDeliziaConsumo() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.setLocationRelativeTo(null);
        this.setMaximumSize(new Dimension(364, 372));
        this.setMinimumSize(new Dimension(364, 372));
        label_Succes.setVisible(false);
        label_Danger.setVisible(false);
        backgroundLabel_Succes.setVisible(false);
        backgroundLabel_Danger.setVisible(false);
        
    }
    public static void addItems(){
        listTablesAvailable.removeAllItems();
        ArrayList<String> listTables = new ArrayList<String>();
        listTables = DeliziaControler.llenarComboTables();
        for (int i = 0; i < listTables.size(); i++) {
            listTablesAvailable.addItem(listTables.get(i));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_addConsumo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputConsumoC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        label_Name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        backgroundLabel_Succes = new javax.swing.JPanel();
        label_Succes = new javax.swing.JLabel();
        backgroundLabel_Danger = new javax.swing.JPanel();
        label_Danger = new javax.swing.JLabel();
        listTablesAvailable = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 58, 64));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Consumo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(42, 42, 42))
        );

        btn_addConsumo.setBackground(new java.awt.Color(6, 115, 227));
        btn_addConsumo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_addConsumo.setForeground(new java.awt.Color(255, 255, 255));
        btn_addConsumo.setText("Agregar");
        btn_addConsumo.setBorder(null);
        btn_addConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addConsumoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Consumo:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Mesa:");

        inputConsumoC.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        inputConsumoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputConsumoCActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Q");

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setText(".00");

        label_Name.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_Name.setText("- - - - - - - - - - -");

        backgroundLabel_Succes.setBackground(new java.awt.Color(186, 254, 184));

        label_Succes.setBackground(new java.awt.Color(186, 254, 184));
        label_Succes.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_Succes.setForeground(new java.awt.Color(15, 60, 0));
        label_Succes.setText("Esta mesa esta reservada!");

        javax.swing.GroupLayout backgroundLabel_SuccesLayout = new javax.swing.GroupLayout(backgroundLabel_Succes);
        backgroundLabel_Succes.setLayout(backgroundLabel_SuccesLayout);
        backgroundLabel_SuccesLayout.setHorizontalGroup(
            backgroundLabel_SuccesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLabel_SuccesLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(label_Succes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLabel_SuccesLayout.setVerticalGroup(
            backgroundLabel_SuccesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLabel_SuccesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_Succes)
                .addContainerGap())
        );

        backgroundLabel_Danger.setBackground(new java.awt.Color(255, 193, 193));

        label_Danger.setBackground(new java.awt.Color(255, 193, 193));
        label_Danger.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label_Danger.setForeground(new java.awt.Color(60, 0, 0));
        label_Danger.setText("Esta mesa no posee reservacion!");

        javax.swing.GroupLayout backgroundLabel_DangerLayout = new javax.swing.GroupLayout(backgroundLabel_Danger);
        backgroundLabel_Danger.setLayout(backgroundLabel_DangerLayout);
        backgroundLabel_DangerLayout.setHorizontalGroup(
            backgroundLabel_DangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLabel_DangerLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(label_Danger)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLabel_DangerLayout.setVerticalGroup(
            backgroundLabel_DangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLabel_DangerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_Danger)
                .addContainerGap())
        );

        listTablesAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listTablesAvailableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(label_Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_addConsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(backgroundLabel_Succes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backgroundLabel_Danger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(listTablesAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputConsumoC, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(listTablesAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputConsumoC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btn_addConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backgroundLabel_Danger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backgroundLabel_Succes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addConsumoActionPerformed
        numTable = Integer.parseInt((String)listTablesAvailable.getSelectedItem());
        name = label_Name.getText();
        DeliziaControler.updateConsumo(numTable, name);
    }//GEN-LAST:event_btn_addConsumoActionPerformed

    private void inputConsumoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputConsumoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputConsumoCActionPerformed

    private void listTablesAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listTablesAvailableActionPerformed
        selectTable = Integer.parseInt((String) listTablesAvailable.getSelectedItem());
        DeliziaControler.consutTable(filter_date, selectTable);
    }//GEN-LAST:event_listTablesAvailableActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDeliziaConsumo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDeliziaConsumo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDeliziaConsumo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDeliziaConsumo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDeliziaConsumo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel backgroundLabel_Danger;
    public static javax.swing.JPanel backgroundLabel_Succes;
    public static javax.swing.JButton btn_addConsumo;
    public static javax.swing.JTextField inputConsumoC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel label_Danger;
    public static javax.swing.JLabel label_Name;
    public static javax.swing.JLabel label_Succes;
    public static javax.swing.JComboBox<String> listTablesAvailable;
    // End of variables declaration//GEN-END:variables
}
