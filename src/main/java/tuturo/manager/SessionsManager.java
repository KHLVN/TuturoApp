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
import java.time.Month;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import tuturo.database.MSSQLConnection;
import tuturo.gui.TutorGUI;
import tuturo.model.HostSessions;
import tuturo.model.Sessions;

public class SessionsManager {
    MSSQLConnection msql = new MSSQLConnection();
    public int sessionID;
    public int userID;
    public int subjectID;
    public String subjectName;
    public LocalDate date = LocalDate.now();
    
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
            Statement st1 = msql.connect().createStatement();
            TutorGUI tu = new TutorGUI();
            String query = "SELECT * FROM Session INNER JOIN Users ON Session.host_id = Users.user_id";
            
            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {
                Sessions ss = new Sessions(rs.getInt("session_id"), 
                         rs.getInt("host_id"), rs.getString("real_name"), 
                         rs.getInt("subject_id"), rs.getString("session_name"), 
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
            String searchQuery = "SELECT * FROM Accounts, Users, Session WHERE (Accounts.account_id = Session.host_id OR Accounts.account_type = 'Tutor') AND Users.real_name LIKE '%"+search+"%'";
            
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
    public DefaultPieDataset createDataset() {
        var dataset = new DefaultPieDataset();
        String query = "SELECT * FROM Session";
            try{
                PreparedStatement statement = msql.connect().prepareStatement(query);
                ResultSet rs = statement.executeQuery();
                int duration;
                String sessionMonth;
                while(rs.next()) { 
                    sessionMonth = Month.of(rs.getInt("session_time_created")).name();
                    duration = rs.getInt("duration");
                    dataset.setValue(sessionMonth, duration);
                }
            }
            catch(SQLException e) {
            }       

       return dataset;
    }
    
    public JFreeChart createChart(DefaultPieDataset dataset) {

        JFreeChart pieChart = ChartFactory.createPieChart(
                "\n\n Session Report 2023",
                dataset,
                true, true, false);

        return pieChart;
    }
}
