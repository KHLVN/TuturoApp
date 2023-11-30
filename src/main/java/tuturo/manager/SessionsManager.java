/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuturo.manager;

/**
 *
 * @author Khelvin
 */
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tuturo.database.MSSQLConnection;
import tuturo.gui.StudentGUI;
import tuturo.gui.TutorGUI;
import tuturo.model.Accounts;
import tuturo.model.HostSessions;
import tuturo.model.Sessions;
import tuturo.model.Subjects;
import tuturo.othergui.SessionCreateGUI;

public class SessionsManager {
    MSSQLConnection msql = new MSSQLConnection();
    public int sessionID;
    public int userID;
    public int subjectID;
    public String subjectName;
    public LocalDate date = LocalDate.now();
    TutorGUI tg = new TutorGUI();
    SubjectsManager subman = new SubjectsManager();
    
    public void showCreatedSession(){
        
    }
    
    public void createSession(int hostID, int duration, String subjectName, String name){
        try {
            ResultSet rs, rs1;
            
            String selectQuery = "SELECT subject_id FROM Subject WHERE subject_name='"+subjectName+"'";
            Statement statement1 = msql.connect().createStatement();
            rs1 = statement1.executeQuery(selectQuery);
            
            if (rs1.next()) {
                int subjectID = rs1.getInt("subject_id");
                
                String insertQuery = "INSERT INTO Session(host_id, subject_id, session_name, account_type, duration, session_time_created) "
                               + "VALUES('"+hostID+"','"+subjectID+"' ,'"+name+"' , 'Tutor', "+duration+", '"+date+"')";
                Statement statement = msql.connect().createStatement();
                rs = statement.executeQuery(insertQuery);
                
                msql.connect().close();
            }
        } catch (SQLException ex) {
            System.out.println("DITO ANG PROBLEMA");
        }
    }
    
    public ArrayList<Sessions> sesList() {
        ArrayList<Sessions> sList = new ArrayList<>();
        
        try {
            msql.connect();
            Statement st = msql.connect().createStatement();

            String query = "SELECT * FROM Session "
                         + "INNER JOIN Accounts ON Session.host_id = Accounts.account_id "
                         + "INNER JOIN Subject ON Session.subject_id = Subject.subject_id";
            
            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {
                Sessions ss = new Sessions(rs.getInt("session_id"), 
                         rs.getInt("host_id"), rs.getString("real_name"), 
                         rs.getInt("subject_id"), rs.getString("subject_name"), 
                         rs.getDate("session_time_created"));
                sList.add(ss);
            }

            msql.connect().close();
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
        return sList;  
    }
    
    public ArrayList<HostSessions> getTutorSession(int hostID) {
        ArrayList<HostSessions> hList = new ArrayList<>();
        try {
            Statement st = msql.connect().createStatement();
            String query = "SELECT * FROM Subject "
                         + "INNER JOIN Session ON Subject.subject_id = Session.subject_id "
                         + "WHERE host_id = "+ hostID;
            
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()) {
                HostSessions hss = new HostSessions(rs.getInt("subject_id"), rs.getString("session_name"), rs.getString("subject_name"), rs.getDate("session_time_created"));
                hList.add(hss);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SessionsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hList;
    }
    
    public ArrayList<Sessions> searchList(String search) {
        ArrayList<Sessions> serichList = new ArrayList<>();
        try {
            String searchQuery = "SELECT * FROM Accounts "
                                + "INNER JOIN Session ON Accounts.account_id = Session.host_id "
                                + "WHERE Session.account_type = 'Tutor' "
                                + "AND Accounts.real_name LIKE '%"+search+"%'";
            
            Statement st = msql.connect().createStatement();
            ResultSet rs = st.executeQuery(searchQuery);
            while(rs.next()) {
                Sessions sc = new Sessions(rs.getInt("session_id"), 
                                           rs.getInt("host_id"),
                                           rs.getString("real_name"), 
                                           rs.getInt("subject_id"), 
                                           rs.getString("subject_name"), 
                                           rs.getDate("session_time_created"));
                serichList.add(sc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SessionsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return serichList;
    }
}
