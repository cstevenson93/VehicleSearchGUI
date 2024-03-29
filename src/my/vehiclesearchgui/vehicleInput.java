/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.vehiclesearchgui;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JSlider;

/**
 *
 * @author csteve
 */
public class vehicleInput extends javax.swing.JFrame {

    
    vehicleGUI vehicle;
    String filePath;
    
    public vehicleInput() {
        
        initComponents();
    }
    
    public void passVehicleAndFile(vehicleGUI vehicleObj, String file)
    {
    vehicle = vehicleObj;
    filePath = file;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        employeeLabel = new javax.swing.JLabel();
        employeeTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        makeLabel = new javax.swing.JLabel();
        makeTextField = new javax.swing.JTextField();
        modelLabel = new javax.swing.JLabel();
        modelTextField = new javax.swing.JTextField();
        tagLabel = new javax.swing.JLabel();
        tagTextField = new javax.swing.JTextField();
        colorLabel = new javax.swing.JLabel();
        colorTextField = new javax.swing.JTextField();
        addVehicleButton = new javax.swing.JButton();
        extLabel = new javax.swing.JLabel();
        extTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        returnButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vehicle Search");
        setResizable(false);

        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        mainPanel.setPreferredSize(new java.awt.Dimension(827, 422));

        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Please enter the vehicle information");

        employeeLabel.setText("Employee Full Name");

        employeeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeTextFieldActionPerformed(evt);
            }
        });

        phoneLabel.setText("Employee Phone Number");

        makeLabel.setText("Vehicle Make");

        modelLabel.setText("Vehicle Model");

        tagLabel.setText("Vehicle Tag");

        tagTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagTextFieldActionPerformed(evt);
            }
        });

        colorLabel.setText("Vehicle Color");

        addVehicleButton.setText("Add Vehicle");
        addVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehicleButtonActionPerformed(evt);
            }
        });

        extLabel.setText("Employee Extension");

        extTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(modelLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(makeLabel))
                            .addComponent(phoneLabel)
                            .addComponent(colorLabel)
                            .addComponent(tagLabel)
                            .addComponent(employeeLabel)
                            .addComponent(extLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(employeeTextField)
                            .addComponent(phoneTextField)
                            .addComponent(makeTextField)
                            .addComponent(modelTextField)
                            .addComponent(tagTextField)
                            .addComponent(colorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(extTextField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(addVehicleButton)))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header)
                .addGap(88, 88, 88)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeLabel)
                    .addComponent(employeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extLabel)
                    .addComponent(extTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makeLabel)
                    .addComponent(makeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelLabel)
                    .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tagLabel)
                    .addComponent(tagTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorLabel)
                    .addComponent(colorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(addVehicleButton)
                .addContainerGap())
        );

        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(returnButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(exitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void employeeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeTextFieldActionPerformed

    private void tagTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tagTextFieldActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
            new VehicleSearchGUI(filePath).setVisible(true);
            this.dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void addVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehicleButtonActionPerformed
     
        if(employeeTextField.getText().isEmpty()
                || phoneTextField.getText().isEmpty()
                || extTextField.getText().isEmpty()
                || makeTextField.getText().isEmpty()
                || modelTextField.getText().isEmpty()
                || colorTextField.getText().isEmpty())
            {
            JOptionPane.showMessageDialog(null,
            "All fields must be filled\n"
                    + "Type N/A if information is not provided.",
            "Input Error",
        JOptionPane.ERROR_MESSAGE);
            }
        else{
        if(employeeTextField.getText().contains(" ") && !employeeTextField.getText().endsWith(" ") && !phoneTextField.getText().contains(" ") 
                && !extTextField.getText().contains(" ")
                && !makeTextField.getText().endsWith(" ") && !modelTextField.getText().endsWith(" ") 
                && !colorTextField.getText().endsWith(" ")
                && !colorTextField.getText().contains(" "))
                

        {
            
            
        int input = JOptionPane.showConfirmDialog(null, "Are these values correct?"
            + "\nClick yes to save changes\n\n"
            + "Employee: " + employeeTextField.getText()+"\n"
            + "Phone: " + phoneTextField.getText()+"\n"
            + "Extension: " + extTextField.getText()+"\n"
            + "Make: " + makeTextField.getText()+"\n"
            + "Model: " + modelTextField.getText()+"\n"
            + "Tag: " + tagTextField.getText()+"\n"
            + "Color: " + colorTextField.getText()+"\n\n ");
            // 0=yes, 1=no, 2=cancel    
            
            if (input == 0)
            {
            System.out.println("Values being recieved: " + employeeTextField.getText() + " " + phoneTextField.getText() + " " + extTextField.getText() + " " + makeTextField.getText() + " " + modelTextField.getText() + " " + tagTextField.getText()+"\n" + " " + colorTextField.getText()+"\n");
            vehicle.addVehicle(employeeTextField.getText(),phoneTextField.getText(), extTextField.getText(),makeTextField.getText()
             ,modelTextField.getText(),tagTextField.getText(),colorTextField.getText());
            vehicle.saveVehicles();
     
            new VehicleSearchGUI(filePath).setVisible(true);
            this.dispose();
            }
            
        
        }
        else
        {
        JOptionPane.showMessageDialog(null,
        "Incorrect Input Format, please ensure you include first and last name\n"
                + "and that there are no unnecessary spaces.",
        "Input Error",
        JOptionPane.ERROR_MESSAGE);
        }
        }
     
     
     
    }//GEN-LAST:event_addVehicleButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void extTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(vehicleInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vehicleInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vehicleInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vehicleInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vehicleInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVehicleButton;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JTextField colorTextField;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JTextField employeeTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel extLabel;
    private javax.swing.JTextField extTextField;
    private javax.swing.JLabel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel makeLabel;
    private javax.swing.JTextField makeTextField;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel tagLabel;
    private javax.swing.JTextField tagTextField;
    // End of variables declaration//GEN-END:variables
}
