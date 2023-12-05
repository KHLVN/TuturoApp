/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tuturo.gui;


import javax.swing.JOptionPane;
import tuturo.login.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import tuturo.manager.SessionsManager;
import tuturo.manager.SubjectsManager;
import tuturo.manager.UsersManager;
import tuturo.model.HostSessions;

import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import tuturo.othergui.SessionChart;

/**
 *
 * @author Khelvin
 */
public class TutorGUI extends javax.swing.JFrame {
    UsersManager um = new UsersManager();
    SessionsManager sm = new SessionsManager();
    SessionChart sc = new SessionChart();
    Statement statement;
    Connection conn;
    /**
     * Creates new form StudentGUI
     */
    public TutorGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tutorSidePanel = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        communityBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        logoutPanel = new javax.swing.JPanel();
        logoutIcon1 = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        MainTabbedPane = new javax.swing.JTabbedPane();
        homeTab = new javax.swing.JPanel();
        buttonsPanel = new javax.swing.JPanel();
        csSideBarBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        dateNowLbl = new javax.swing.JLabel();
        welcomePanel = new javax.swing.JPanel();
        welcomeLbl = new javax.swing.JLabel();
        homeTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        createSessionPanel = new javax.swing.JPanel();
        titlePaneLbl = new javax.swing.JLabel();
        createSessionSettingsPanel = new javax.swing.JTabbedPane();
        settingPanel = new javax.swing.JPanel();
        schedLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        durationSpinner = new javax.swing.JSpinner(new SpinnerDateModel());
        subjectLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        sessionNameTxt = new javax.swing.JTextField();
        name2Lbl = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        subjectComboBox = new JComboBox();
        subject2Lbl = new javax.swing.JLabel();
        separator2 = new javax.swing.JSeparator();
        attendeesPanel = new javax.swing.JPanel();
        bottomBar = new javax.swing.JPanel();
        createSessionBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        sessionSearchPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tutorSessionsTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        sessionsTab = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        commTab = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        profileTab = new javax.swing.JPanel();
        welcomeProfileLbl = new javax.swing.JLabel();
        profilePanel = new javax.swing.JPanel();
        profilePicture = new javax.swing.JPanel();
        editProfileBtn = new javax.swing.JButton();
        profileNameLbl = new javax.swing.JLabel();
        profileDetails = new javax.swing.JPanel();
        usernameLbl = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        realNameTxt = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        changePassLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        profileDetails2 = new javax.swing.JPanel();
        bioLbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bioTxt = new javax.swing.JTextArea();
        addressLbl = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        accIDLbl = new javax.swing.JLabel();
        accIDHolder = new javax.swing.JLabel();
        saveProfileBtn = new javax.swing.JButton();
        discardProfileBtn = new javax.swing.JButton();
        dateJoinedLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        changePicBtn = new javax.swing.JButton();
        settingsTab = new javax.swing.JPanel();
        closePanel = new javax.swing.JPanel();
        closeIcon1 = new javax.swing.JLabel();
        settingsPanel = new javax.swing.JPanel();
        settingsIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        setName("mainFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dark/light-track.png"))); // NOI18N
        homeBtn.setText("Sessions");
        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        communityBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dark/light-community.png"))); // NOI18N
        communityBtn.setText("Community");
        communityBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        communityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityBtnActionPerformed(evt);
            }
        });

        profileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dark/light-profile.png"))); // NOI18N
        profileBtn.setText("Profile");
        profileBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        logoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanelMouseClicked(evt);
            }
        });

        logoutIcon1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        logoutIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dark/light-logout.png"))); // NOI18N
        logoutIcon1.setText("Logout");

        javax.swing.GroupLayout logoutPanelLayout = new javax.swing.GroupLayout(logoutPanel);
        logoutPanel.setLayout(logoutPanelLayout);
        logoutPanelLayout.setHorizontalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoutIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        logoutPanelLayout.setVerticalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout tutorSidePanelLayout = new javax.swing.GroupLayout(tutorSidePanel);
        tutorSidePanel.setLayout(tutorSidePanelLayout);
        tutorSidePanelLayout.setHorizontalGroup(
            tutorSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tutorSidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tutorSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(communityBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(logoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tutorSidePanelLayout.setVerticalGroup(
            tutorSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tutorSidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(communityBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 523, Short.MAX_VALUE)
                .addComponent(logoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(tutorSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 670));

        titlePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        titlePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titlePanelMouseClicked(evt);
            }
        });

        titleLbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        titleLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png"))); // NOI18N
        titleLbl.setText("Tutors");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        MainTabbedPane.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        homeTab.setBorder(javax.swing.BorderFactory.createTitledBorder("Home"));

        csSideBarBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        csSideBarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dark/light-plus.png"))); // NOI18N
        csSideBarBtn.setText("Create Sessions");
        csSideBarBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        csSideBarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csSideBarBtnActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dark/light-home.png"))); // NOI18N
        jButton4.setText("Home");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        dateNowLbl.setText("dateToday");
        dateNowLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(csSideBarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateNowLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(csSideBarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateNowLbl))
        );

        welcomePanel.setBackground(new java.awt.Color(132, 159, 255));

        welcomeLbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        welcomeLbl.setForeground(new java.awt.Color(51, 51, 51));
        welcomeLbl.setText("Welcome,");

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomePanelLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(welcomeLbl)
                .addContainerGap())
        );

        homeTabbedPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        homeTabbedPane.addTab("Home", jPanel1);

        titlePaneLbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        titlePaneLbl.setText("Create Session");

        schedLbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        schedLbl.setText("Time");

        dateLbl.setText("Duration (in min.)");

        durationSpinner.setModel(new javax.swing.SpinnerNumberModel(60, 60, 360, 60));
        durationSpinner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        subjectLbl.setText("Select your Subject");

        nameLbl.setText("Session Name");

        sessionNameTxt.setToolTipText("");

        name2Lbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        name2Lbl.setText("Name");

        subjectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        subject2Lbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        subject2Lbl.setText("Subject");

        javax.swing.GroupLayout settingPanelLayout = new javax.swing.GroupLayout(settingPanel);
        settingPanel.setLayout(settingPanelLayout);
        settingPanelLayout.setHorizontalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingPanelLayout.createSequentialGroup()
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(subjectComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(subjectLbl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, settingPanelLayout.createSequentialGroup()
                                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameLbl)
                                            .addComponent(name2Lbl)
                                            .addComponent(sessionNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(durationSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addGroup(settingPanelLayout.createSequentialGroup()
                                                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(dateLbl)
                                                    .addComponent(schedLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addComponent(subject2Lbl)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(separator2))
                .addContainerGap())
        );
        settingPanelLayout.setVerticalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingPanelLayout.createSequentialGroup()
                        .addComponent(schedLbl)
                        .addGap(18, 18, 18)
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLbl)
                            .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sessionNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(durationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(name2Lbl))
                .addGap(18, 18, 18)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subject2Lbl)
                .addGap(18, 18, 18)
                .addComponent(subjectLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        createSessionSettingsPanel.addTab("Settings", settingPanel);

        javax.swing.GroupLayout attendeesPanelLayout = new javax.swing.GroupLayout(attendeesPanel);
        attendeesPanel.setLayout(attendeesPanelLayout);
        attendeesPanelLayout.setHorizontalGroup(
            attendeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        attendeesPanelLayout.setVerticalGroup(
            attendeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        createSessionSettingsPanel.addTab("Attendees", attendeesPanel);

        createSessionBtn.setText("Create Session");
        createSessionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSessionBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomBarLayout = new javax.swing.GroupLayout(bottomBar);
        bottomBar.setLayout(bottomBarLayout);
        bottomBarLayout.setHorizontalGroup(
            bottomBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomBarLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createSessionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bottomBarLayout.setVerticalGroup(
            bottomBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createSessionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tutorSessionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SubID", "Lesson", "Subject", "Date"
            }
        ));
        jScrollPane4.setViewportView(tutorSessionsTable);
        if (tutorSessionsTable.getColumnModel().getColumnCount() > 0) {
            tutorSessionsTable.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jLabel4.setText("Your Sessions");

        javax.swing.GroupLayout sessionSearchPanelLayout = new javax.swing.GroupLayout(sessionSearchPanel);
        sessionSearchPanel.setLayout(sessionSearchPanelLayout);
        sessionSearchPanelLayout.setHorizontalGroup(
            sessionSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sessionSearchPanelLayout.createSequentialGroup()
                .addGroup(sessionSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        sessionSearchPanelLayout.setVerticalGroup(
            sessionSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sessionSearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout createSessionPanelLayout = new javax.swing.GroupLayout(createSessionPanel);
        createSessionPanel.setLayout(createSessionPanelLayout);
        createSessionPanelLayout.setHorizontalGroup(
            createSessionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createSessionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createSessionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlePaneLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bottomBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createSessionSettingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sessionSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        createSessionPanelLayout.setVerticalGroup(
            createSessionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createSessionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePaneLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createSessionSettingsPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(sessionSearchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        homeTabbedPane.addTab("Create Sessions", createSessionPanel);

        javax.swing.GroupLayout homeTabLayout = new javax.swing.GroupLayout(homeTab);
        homeTab.setLayout(homeTabLayout);
        homeTabLayout.setHorizontalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTabLayout.createSequentialGroup()
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeTabbedPane))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeTabLayout.createSequentialGroup()
                .addComponent(welcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        homeTabLayout.setVerticalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeTabLayout.createSequentialGroup()
                .addComponent(welcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeTabLayout.createSequentialGroup()
                        .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(homeTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        MainTabbedPane.addTab("", homeTab);

        sessionsTab.setBorder(javax.swing.BorderFactory.createTitledBorder("Summary"));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel5.setText("Progress Tracker");

        jLabel1.setText("Under Construction");

        javax.swing.GroupLayout sessionsTabLayout = new javax.swing.GroupLayout(sessionsTab);
        sessionsTab.setLayout(sessionsTabLayout);
        sessionsTabLayout.setHorizontalGroup(
            sessionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sessionsTabLayout.createSequentialGroup()
                .addGroup(sessionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sessionsTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(sessionsTabLayout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(jLabel1)))
                .addContainerGap(501, Short.MAX_VALUE))
        );
        sessionsTabLayout.setVerticalGroup(
            sessionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sessionsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(260, 260, 260))
        );

        MainTabbedPane.addTab("", sessionsTab);

        commTab.setBorder(javax.swing.BorderFactory.createTitledBorder("Community"));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel3.setText("Community");

        jLabel6.setText("Under Construction");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel6)
                .addContainerGap(709, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel6)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        jButton8.setText("Post New Thread");

        jButton15.setText("Explore Communities");

        jButton16.setText("Notifications");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout commTabLayout = new javax.swing.GroupLayout(commTab);
        commTab.setLayout(commTabLayout);
        commTabLayout.setHorizontalGroup(
            commTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(commTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(commTabLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(commTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        commTabLayout.setVerticalGroup(
            commTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(commTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        MainTabbedPane.addTab("", commTab);

        profileTab.setBorder(javax.swing.BorderFactory.createTitledBorder("Profile"));

        welcomeProfileLbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        welcomeProfileLbl.setText("Hello, ");

        profilePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        profilePicture.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout profilePictureLayout = new javax.swing.GroupLayout(profilePicture);
        profilePicture.setLayout(profilePictureLayout);
        profilePictureLayout.setHorizontalGroup(
            profilePictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        profilePictureLayout.setVerticalGroup(
            profilePictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        editProfileBtn.setText("Edit Profile");
        editProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileBtnActionPerformed(evt);
            }
        });

        profileNameLbl.setText("Name here");

        profileDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("User Information"));

        usernameLbl.setText("Username");

        usernameTxt.setEnabled(false);

        jLabel9.setText("Complete Name");

        realNameTxt.setEnabled(false);

        emailLbl.setText("Email");

        emailTxt.setEnabled(false);

        changePassLbl.setText("Password");

        jButton1.setText("Change Password");
        jButton1.setEnabled(false);

        javax.swing.GroupLayout profileDetailsLayout = new javax.swing.GroupLayout(profileDetails);
        profileDetails.setLayout(profileDetailsLayout);
        profileDetailsLayout.setHorizontalGroup(
            profileDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(usernameLbl)
                    .addComponent(emailLbl)
                    .addComponent(changePassLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profileDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(usernameTxt)
                    .addComponent(realNameTxt)
                    .addComponent(emailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
                .addGap(380, 380, 380))
        );
        profileDetailsLayout.setVerticalGroup(
            profileDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(realNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePassLbl)
                    .addComponent(jButton1))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        profileDetails2.setBorder(javax.swing.BorderFactory.createTitledBorder("Other Settings"));

        bioLbl.setText("Bio");

        bioTxt.setColumns(20);
        bioTxt.setLineWrap(true);
        bioTxt.setRows(5);
        bioTxt.setEnabled(false);
        jScrollPane3.setViewportView(bioTxt);

        addressLbl.setText("Address");

        addressTxt.setEnabled(false);

        accIDLbl.setText("Account ID");

        javax.swing.GroupLayout profileDetails2Layout = new javax.swing.GroupLayout(profileDetails2);
        profileDetails2.setLayout(profileDetails2Layout);
        profileDetails2Layout.setHorizontalGroup(
            profileDetails2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileDetails2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileDetails2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLbl)
                    .addComponent(accIDLbl)
                    .addComponent(bioLbl))
                .addGap(40, 40, 40)
                .addGroup(profileDetails2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accIDHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profileDetails2Layout.setVerticalGroup(
            profileDetails2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileDetails2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileDetails2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileDetails2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bioLbl)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(profileDetails2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accIDLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accIDHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        saveProfileBtn.setText("Save Changes");
        saveProfileBtn.setEnabled(false);
        saveProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProfileBtnActionPerformed(evt);
            }
        });

        discardProfileBtn.setText("Discard");
        discardProfileBtn.setEnabled(false);
        discardProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardProfileBtnActionPerformed(evt);
            }
        });

        dateJoinedLbl.setText("date_joined");

        jLabel2.setText("Date Created");

        changePicBtn.setText("Change Profile Photo");
        changePicBtn.setEnabled(false);

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editProfileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(profilePicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(profilePanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(dateJoinedLbl))))
                            .addComponent(changePicBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(profileDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(profileDetails2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(profileNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(discardProfileBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveProfileBtn)
                .addGap(8, 8, 8))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profileDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileDetails2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(changePicBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editProfileBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateJoinedLbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discardProfileBtn)
                    .addComponent(saveProfileBtn)))
        );

        javax.swing.GroupLayout profileTabLayout = new javax.swing.GroupLayout(profileTab);
        profileTab.setLayout(profileTabLayout);
        profileTabLayout.setHorizontalGroup(
            profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(welcomeProfileLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        profileTabLayout.setVerticalGroup(
            profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeProfileLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MainTabbedPane.addTab("", profileTab);

        settingsTab.setBorder(javax.swing.BorderFactory.createTitledBorder("Settings"));

        javax.swing.GroupLayout settingsTabLayout = new javax.swing.GroupLayout(settingsTab);
        settingsTab.setLayout(settingsTabLayout);
        settingsTabLayout.setHorizontalGroup(
            settingsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        settingsTabLayout.setVerticalGroup(
            settingsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        MainTabbedPane.addTab("", settingsTab);

        getContentPane().add(MainTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 1100, 670));

        closePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closePanelMouseClicked(evt);
            }
        });

        closeIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dark/light-close.png"))); // NOI18N

        javax.swing.GroupLayout closePanelLayout = new javax.swing.GroupLayout(closePanel);
        closePanel.setLayout(closePanelLayout);
        closePanelLayout.setHorizontalGroup(
            closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closePanelLayout.createSequentialGroup()
                .addComponent(closeIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        closePanelLayout.setVerticalGroup(
            closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closePanelLayout.createSequentialGroup()
                .addComponent(closeIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(closePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 30));

        settingsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsPanelMouseClicked(evt);
            }
        });

        settingsIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dark/light-settings.png"))); // NOI18N

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(settingsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(settingsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(settingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileBtnActionPerformed
        usernameTxt.setEnabled(true);
        addressTxt.setEnabled(true);
        realNameTxt.setEnabled(true);
        emailTxt.setEnabled(true);
        saveProfileBtn.setEnabled(true);
        discardProfileBtn.setEnabled(true);
        
    }//GEN-LAST:event_editProfileBtnActionPerformed

    private void titlePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlePanelMouseClicked
        MainTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_titlePanelMouseClicked

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        MainTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void communityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityBtnActionPerformed
        MainTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_communityBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        MainTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void closePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closePanelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closePanelMouseClicked

    private void settingsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsPanelMouseClicked
        MainTabbedPane.setSelectedIndex(4);
    }//GEN-LAST:event_settingsPanelMouseClicked

    private void discardProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardProfileBtnActionPerformed
        usernameTxt.setEnabled(false);
        realNameTxt.setEnabled(false);
        emailTxt.setEnabled(false);
        saveProfileBtn.setEnabled(false);
        discardProfileBtn.setEnabled(false);
    }//GEN-LAST:event_discardProfileBtnActionPerformed

    private void saveProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProfileBtnActionPerformed
        String username = usernameTxt.getText();
        String realname = realNameTxt.getText();
        String email = emailTxt.getText();
        String address = addressTxt.getText();
        String accID = accIDHolder.getText();
        
        
        um.updateProfile(username, realname, email, address, accID);
        JOptionPane.showMessageDialog(null, "Profile Updated Successfully");
        
        usernameTxt.setEnabled(false);
        realNameTxt.setEnabled(false);
        emailTxt.setEnabled(false);
        saveProfileBtn.setEnabled(false);
        discardProfileBtn.setEnabled(false);
        addressTxt.setEnabled(false);
    }//GEN-LAST:event_saveProfileBtnActionPerformed

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseClicked
        int s = JOptionPane.showConfirmDialog(this, "Do you want to sign out?", "Sign Out?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (s == JOptionPane.OK_OPTION) {
            setVisible(false);
            new LoginForm().setVisible(true);
        }
    }//GEN-LAST:event_logoutPanelMouseClicked

    private void csSideBarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csSideBarBtnActionPerformed
        homeTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_csSideBarBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        //        setVisible(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void createSessionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSessionBtnActionPerformed
        SessionsManager sm = new SessionsManager();
        SubjectsManager sb = new SubjectsManager();

        int hostID = Integer.parseInt(accIDHolder.getText());
        if (sessionNameTxt.getText().equals("") || subjectComboBox.getSelectedItem().equals("-")) {
            JOptionPane.showMessageDialog(this, "ERROR: Incomplete Details.");
        }
        else {
            String name = sessionNameTxt.getText();
            String subjectName = subjectComboBox.getSelectedItem().toString();
            int duration = (Integer) durationSpinner.getValue();

            sm.createSession(hostID, duration, subjectName, name);
            JOptionPane.showMessageDialog(null, "Session "+name+" for course \""+subjectName+"\" successfully created.");

            ArrayList<HostSessions> hostSessionsList = sm.getTutorSession(hostID);

            DefaultTableModel model = (DefaultTableModel) tutorSessionsTable.getModel();
            Object[] row = new Object[4];
            model.setRowCount(0);
            for(int i = 0; i < hostSessionsList.size(); i++) {
                row[0] = hostSessionsList.get(i).subjectID;
                row[1] = hostSessionsList.get(i).sessionName;
                row[2] = hostSessionsList.get(i).subjectName;
                row[3] = hostSessionsList.get(i).date;
                model.addRow(row);
            }
        }
    }//GEN-LAST:event_createSessionBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        homeTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane MainTabbedPane;
    public javax.swing.JLabel accIDHolder;
    private javax.swing.JLabel accIDLbl;
    private javax.swing.JLabel addressLbl;
    public javax.swing.JTextField addressTxt;
    private javax.swing.JPanel attendeesPanel;
    private javax.swing.JLabel bioLbl;
    public javax.swing.JTextArea bioTxt;
    private javax.swing.JPanel bottomBar;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel changePassLbl;
    private javax.swing.JButton changePicBtn;
    private javax.swing.JLabel closeIcon1;
    private javax.swing.JPanel closePanel;
    private javax.swing.JPanel commTab;
    private javax.swing.JButton communityBtn;
    private javax.swing.JButton createSessionBtn;
    private javax.swing.JPanel createSessionPanel;
    private javax.swing.JTabbedPane createSessionSettingsPanel;
    private javax.swing.JButton csSideBarBtn;
    public javax.swing.JLabel dateJoinedLbl;
    private javax.swing.JLabel dateLbl;
    public javax.swing.JLabel dateNowLbl;
    private javax.swing.JButton discardProfileBtn;
    private javax.swing.JSpinner durationSpinner;
    private javax.swing.JButton editProfileBtn;
    private javax.swing.JLabel emailLbl;
    public javax.swing.JTextField emailTxt;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel homeTab;
    private javax.swing.JTabbedPane homeTabbedPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel logoutIcon1;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JLabel name2Lbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JButton profileBtn;
    private javax.swing.JPanel profileDetails;
    private javax.swing.JPanel profileDetails2;
    public javax.swing.JLabel profileNameLbl;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JPanel profilePicture;
    private javax.swing.JPanel profileTab;
    public javax.swing.JTextField realNameTxt;
    private javax.swing.JButton saveProfileBtn;
    private javax.swing.JLabel schedLbl;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JTextField sessionNameTxt;
    private javax.swing.JPanel sessionSearchPanel;
    private javax.swing.JPanel sessionsTab;
    private javax.swing.JPanel settingPanel;
    private javax.swing.JLabel settingsIcon;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JPanel settingsTab;
    private javax.swing.JLabel subject2Lbl;
    public javax.swing.JComboBox<String> subjectComboBox;
    private javax.swing.JLabel subjectLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel titlePaneLbl;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTable tutorSessionsTable;
    private javax.swing.JPanel tutorSidePanel;
    private javax.swing.JLabel usernameLbl;
    public javax.swing.JTextField usernameTxt;
    public javax.swing.JLabel welcomeLbl;
    private javax.swing.JPanel welcomePanel;
    public javax.swing.JLabel welcomeProfileLbl;
    // End of variables declaration//GEN-END:variables
}
