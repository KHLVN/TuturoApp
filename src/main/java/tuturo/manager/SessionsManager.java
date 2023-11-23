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
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import tuturo.database.MSSQLConnection;
import tuturo.gui.TutorGUI;
import tuturo.model.Sessions;
import tuturo.othergui.SessionCreateGUI;

public class SessionsManager {
    MSSQLConnection msql = new MSSQLConnection();
    public int sessionID;
    public int userID;
    public int subjectID;
    public Date sessionDate;
    public Time sessionTime;
    TutorGUI tg = new TutorGUI();
//    Sessions ss = new Sessions(sessionID, userID, subjectID);
    
    public void createSession(Date sessionDate, Object subjectName) {
        msql.connect();
//        INSERT INTO Session_schedule(session_date, session_time_created) VALUES ('(STR_TO_DATE('"+sessionDate+"', '%d %M %Y')', CURRENT_TIMESTAMP);
        String insertQuery = ""
                + "INSERT INTO Session(host_id, subject_id, account_type) VALUES ( (SELECT account_id FROM Accounts WHERE account_id="+tg.accIDHolder.getText()+"),'"+getSubjectID(subjectName)+"', 'Tutor')";
        
        try {
            ResultSet rs;
            Statement statement = msql.connect().createStatement();
            rs = statement.executeQuery(insertQuery);
        } catch (SQLException ex) {
            System.out.println("DITO ANG PROBLEMA");
            Logger.getLogger(SubjectsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Sessions> sList() {
        MSSQLConnection msql = new MSSQLConnection();
        ArrayList<Sessions> sList = new ArrayList<>();
        String query, query1, query2;
            try {
                msql.connect();
                Statement st = msql.connect().createStatement();
                Statement st1 = msql.connect().createStatement();
                Statement st2 = msql.connect().createStatement();
                
                query = "SELECT * FROM Session \n" +
                        "INNER JOIN Accounts ON Session.host_id = Accounts.account_id \n" +
                        "INNER JOIN Subject ON Session.subject_id = Subject.subject_id";
                ResultSet rs = st.executeQuery(query);
                
                while(rs.next()) {
                    Sessions ss = new Sessions(Integer.parseInt(rs.getString("session_id")), Integer.parseInt(rs.getString("host_id")), rs.getString("real_name"), Integer.parseInt(rs.getString("subject_id")), rs.getString("subject_name"));
                    sList.add(ss);
                }
                
                msql.connect().close();
            }
            catch(SQLException ex) {
                System.out.println(ex);
            }
        return sList;  
    }
    
    public int getSubjectID(Object subjectName) {
        try {
            msql.connect();
            String query = "SELECT subject_id FROM Subject WHERE subject_name='"+subjectName+"'";
            Statement st = msql.connect().createStatement();
            ResultSet rs = st.executeQuery(query);
            if(rs.next()) {
                return Integer.parseInt(rs.getString("subject_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SessionsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
