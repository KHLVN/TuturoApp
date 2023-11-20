/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tuturo.gui;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import tuturo.database.MSSQLConnection;
import tuturo.manager.SessionsManager;
import tuturo.manager.SubjectsManager;
/**
 *
 * @author Khelvin
 */
public class SessionCreateGUI extends javax.swing.JFrame {
    ArrayList<String> subjects;
    MSSQLConnection msql = new MSSQLConnection();
    SubjectsManager sm = new SubjectsManager();
    String[] subjectsArray;
    
    
    public SessionCreateGUI() {
        
        initComponents();
        msql.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        sessionCreatePanel = new javax.swing.JPanel();
        titlePaneLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        sessionNameTxt = new javax.swing.JTextField();
        subjectLbl = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        subjectComboBox = new JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        dateSpinner = new javax.swing.JSpinner();
        dateLbl = new javax.swing.JLabel();
        schedLbl = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlePaneLbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        titlePaneLbl.setText("Create Session");

        nameLbl.setText("Session Name");

        sessionNameTxt.setToolTipText("");

        subjectLbl.setText("Subject");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        subjectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        dateSpinner.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1700407844084L), null, java.util.Calendar.DAY_OF_YEAR));
        dateSpinner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        dateLbl.setText("Date and Time");

        schedLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        schedLbl.setText("Schedule");

        javax.swing.GroupLayout sessionCreatePanelLayout = new javax.swing.GroupLayout(sessionCreatePanel);
        sessionCreatePanel.setLayout(sessionCreatePanelLayout);
        sessionCreatePanelLayout.setHorizontalGroup(
            sessionCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sessionCreatePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(sessionCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sessionCreatePanelLayout.createSequentialGroup()
                        .addComponent(dateLbl)
                        .addGap(18, 18, 18)
                        .addComponent(dateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sessionCreatePanelLayout.createSequentialGroup()
                        .addComponent(subjectLbl)
                        .addGroup(sessionCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sessionCreatePanelLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sessionCreatePanelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(titlePaneLbl)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schedLbl)
                    .addGroup(sessionCreatePanelLayout.createSequentialGroup()
                        .addComponent(nameLbl)
                        .addGap(18, 18, 18)
                        .addComponent(sessionNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );
        sessionCreatePanelLayout.setVerticalGroup(
            sessionCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sessionCreatePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titlePaneLbl)
                .addGap(18, 18, 18)
                .addGroup(sessionCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(sessionNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sessionCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectLbl)
                    .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(schedLbl)
                .addGap(18, 18, 18)
                .addGroup(sessionCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(sessionCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(createBtn))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sessionCreatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sessionCreatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        if (sessionNameTxt.getText().equals("") || subjectComboBox.getSelectedItem().equals("-")) {
            JOptionPane.showMessageDialog(this, "ERROR: Incomplete Details.");
        }
        else {
            String name = sessionNameTxt.getText();
            String subject = subjectComboBox.getSelectedItem().toString();
            java.util.Date date;
            date = (java.util.Date) dateSpinner.getValue();
            
            System.out.println(date);
            
            JOptionPane.showMessageDialog(null, name + subject + new SimpleDateFormat("yyyy/MM/dd HH:MM:SS").format(dateSpinner.getValue()));
            // Create Session Insert Query to SQL Server
            System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(dateSpinner.getValue()));
        }
    }//GEN-LAST:event_createBtnActionPerformed

    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SessionCreateGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel dateLbl;
    public javax.swing.JSpinner dateSpinner;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel schedLbl;
    private javax.swing.JPanel sessionCreatePanel;
    private javax.swing.JTextField sessionNameTxt;
    public javax.swing.JComboBox<String> subjectComboBox;
    private javax.swing.JLabel subjectLbl;
    private javax.swing.JLabel titlePaneLbl;
    // End of variables declaration//GEN-END:variables
}
