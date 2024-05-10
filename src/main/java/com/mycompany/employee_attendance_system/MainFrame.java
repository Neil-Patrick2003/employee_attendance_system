/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.employee_attendance_system;

import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Neil Patrick
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username_textfeild = new javax.swing.JTextField();
        password_textfeild = new javax.swing.JPasswordField();
        SignIN_button = new javax.swing.JButton();
        signup_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(30, 144, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 450));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neil Patrick\\Downloads\\icons8-test-account-60.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 144, 255));
        jLabel2.setText("Login");

        username_textfeild.setBackground(new java.awt.Color(220, 220, 220));
        username_textfeild.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username_textfeild.setForeground(new java.awt.Color(169, 169, 169));
        username_textfeild.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username_textfeild.setText("Type Your Username");
        username_textfeild.setAlignmentX(10.0F);
        username_textfeild.setBorder(null);
        username_textfeild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                username_textfeildMouseClicked(evt);
            }
        });

        password_textfeild.setBackground(new java.awt.Color(220, 220, 220));
        password_textfeild.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password_textfeild.setForeground(new java.awt.Color(169, 169, 169));
        password_textfeild.setText("  Type Your Password");
        password_textfeild.setBorder(null);
        password_textfeild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password_textfeildMouseClicked(evt);
            }
        });

        SignIN_button.setBackground(new java.awt.Color(30, 144, 255));
        SignIN_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SignIN_button.setForeground(new java.awt.Color(255, 255, 255));
        SignIN_button.setText("Signin");
        SignIN_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignIN_buttonActionPerformed(evt);
            }
        });

        signup_button.setBackground(new java.awt.Color(255, 255, 255));
        signup_button.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        signup_button.setForeground(new java.awt.Color(30, 144, 255));
        signup_button.setText("Sign up");
        signup_button.setBorder(null);
        signup_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(signup_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(password_textfeild)
                                .addComponent(username_textfeild, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addComponent(SignIN_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(49, 49, 49))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(username_textfeild, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password_textfeild, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SignIN_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signup_button)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(290, 80, 310, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignIN_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignIN_buttonActionPerformed
        // TODO add your handling code here:

        String username = username_textfeild.getText();
        char[] passwordChars = password_textfeild.getPassword();
        String password = new String(passwordChars);

        Employee employee = EmployeeService.getByUsernameAndPassword(username, password);

        if (employee != null) {
            // If the employee object is not null (i.e., the login was successful)
            System.out.println("Login successful");

            // Create and display the EmployeeDashboard frame
            EmployeeDashboard employeeDash = new EmployeeDashboard();
            employeeDash.setAuthenticatedEmployee(employee);
            employeeDash.setVisible(true);
            employeeDash.setLocationRelativeTo(null);
            this.dispose();
        } else {
            // If the employee object is null (i.e., the login failed)
            System.out.println("Login failed. Invalid username or password.");
            // You can add code here to display an error message or perform other actions
        }

//        JFrame m    ainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
//        this.setVisible(false);
//        mainFrame.remove(this);
//        mainFrame.dispose();
//                CustomerDashboardFrame CustomerDash = new CustomerDashboardFrame();
//                CustomerDash.setAuthCustomer(customer);
//                CustomerDash.setVisible(true);
//                CustomerDash.setLocationRelativeTo(null);

    }//GEN-LAST:event_SignIN_buttonActionPerformed

    private void signup_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_buttonMouseClicked
        // TODO add your handling code here:
        // Create usa new JFrame to contain the EmployeeSignUp panel
        JFrame signupFrame = new JFrame("Film Equipment Rental Service");
        signupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signupFrame.add(new EmployeeSignUp());
        signupFrame.pack(); // Resize the frame to fit the component
        signupFrame.setVisible(true);
        signupFrame.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_signup_buttonMouseClicked

    private void username_textfeildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_textfeildMouseClicked
        // TODO add your handling code here:
        username_textfeild.setText("");
    }//GEN-LAST:event_username_textfeildMouseClicked

    private void password_textfeildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_textfeildMouseClicked
        // TODO add your handling code here:
        password_textfeild.setText("");
    }//GEN-LAST:event_password_textfeildMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignIN_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password_textfeild;
    private javax.swing.JButton signup_button;
    private javax.swing.JTextField username_textfeild;
    // End of variables declaration//GEN-END:variables
}
