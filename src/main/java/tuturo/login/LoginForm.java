/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tuturo.login;


import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.themes.*;
import java.awt.EventQueue;
import java.sql.*;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import tuturo.database.MSSQLConnection;
import tuturo.gui.*;
import tuturo.manager.UsersManager;

public class LoginForm extends javax.swing.JFrame {
    String username;
    public LoginForm() {
        initComponents();
        FlatMacDarkLaf.setup();
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLoginPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        welcomeLbl = new javax.swing.JLabel();
        descLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        buttonGroup = new javax.swing.JPanel();
        signUpBtn = new javax.swing.JButton();
        signSLbl = new javax.swing.JLabel();
        passwordTxt = new JPasswordField();
        loginBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Login");
        setResizable(false);

        mainLoginPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainLoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(65, 65, 65));
        loginPanel.setForeground(new java.awt.Color(204, 204, 204));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeLbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 27)); // NOI18N
        welcomeLbl.setForeground(new java.awt.Color(204, 204, 204));
        welcomeLbl.setText("Welcome to Tuturo!");
        loginPanel.add(welcomeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 29));

        descLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        descLbl.setForeground(new java.awt.Color(153, 153, 153));
        descLbl.setText("Please sign in to access your account!");
        loginPanel.add(descLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 220, -1));

        usernameLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        usernameLbl.setForeground(new java.awt.Color(204, 204, 204));
        usernameLbl.setText("Username");
        loginPanel.add(usernameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        usernameTxt.setBackground(new java.awt.Color(65, 65, 65));
        usernameTxt.setForeground(new java.awt.Color(204, 204, 204));
        usernameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        loginPanel.add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 20));

        passwordLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(204, 204, 204));
        passwordLbl.setText("Password");
        loginPanel.add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        buttonGroup.setBackground(new java.awt.Color(65, 65, 65));

        signUpBtn.setBackground(new java.awt.Color(65, 65, 65));
        signUpBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        signUpBtn.setText("Sign Up");
        signUpBtn.setBorder(null);
        signUpBtn.setBorderPainted(false);
        signUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpBtnMouseClicked(evt);
            }
        });

        signSLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        signSLbl.setForeground(new java.awt.Color(204, 204, 204));
        signSLbl.setText("Don't have an account?");

        javax.swing.GroupLayout buttonGroupLayout = new javax.swing.GroupLayout(buttonGroup);
        buttonGroup.setLayout(buttonGroupLayout);
        buttonGroupLayout.setHorizontalGroup(
            buttonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonGroupLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(signSLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUpBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonGroupLayout.setVerticalGroup(
            buttonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpBtn)
                    .addComponent(signSLbl))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        loginPanel.add(buttonGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 250, 30));

        passwordTxt.setBackground(new java.awt.Color(65, 65, 65));
        passwordTxt.setForeground(new java.awt.Color(204, 204, 204));
        passwordTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        loginPanel.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 250, 20));
        passwordTxt.putClientProperty(FlatClientProperties.STYLE, "" +
            "showRevealButton:true");

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        loginPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 250, 20));
        loginPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 250, 10));

        mainLoginPanel.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 300, 310));
        loginPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "arc:40;");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public String getSelectedButtonText(ButtonGroup groupRole) {
        for (Enumeration<AbstractButton> buttons = groupRole.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    
    private void signUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtnMouseClicked
        setVisible(false);
        new RegisterForm().setVisible(true);
//        new RegisterDB().show();
    }//GEN-LAST:event_signUpBtnMouseClicked

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String username = usernameTxt.getText();
        String password = passwordTxt.getText();
        
        UsersManager user = new UsersManager();

        setVisible(user.loginUser(username, password));
    }//GEN-LAST:event_loginBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonGroup;
    private javax.swing.JLabel descLbl;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainLoginPanel;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel signSLbl;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JLabel usernameLbl;
    public javax.swing.JTextField usernameTxt;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables

}
