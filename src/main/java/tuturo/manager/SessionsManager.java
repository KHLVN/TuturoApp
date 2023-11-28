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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import tuturo.database.MSSQLConnection;
import tuturo.gui.StudentGUI;
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
    SubjectsManager subman = new SubjectsManager();
    
    public void showCreatedSession(){
        ArrayList<Sessions> hostSessionList = sList();
        DefaultTableModel model = (DefaultTableModel) tg.tutorSessionsTable.getModel();
        Object[] row = new Object[5];
        model.setRowCount(0);
        for(int i = 0; i < hostSessionList.size(); i++) {
            
        }
    }
    
    public void createSession(int hostID, int duration, String subjectName) {
        msql.connect();
//        INSERT INTO Session_schedule(session_date, session_time_created) VALUES ('(STR_TO_DATE('"+sessionDate+"', '%d %M %Y')', CURRENT_TIMESTAMP);
        
        String insertQuery = "INSERT INTO Session(host_id, subject_id, account_type, duration, session_time_created) "
                           + "VALUES('"+hostID+"', '"+subman.getSubjectID(subjectName)+"', 'Tutor', "+duration+", DEFAULT)";
                             
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
                
                query = """
                        SELECT * FROM Session 
                        INNER JOIN Accounts ON Session.host_id = Accounts.account_id 
                        INNER JOIN Subject ON Session.subject_id = Subject.subject_id""";
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
    
    public void getTutorSession(int hostID) {
        msql.connect();
        String query = "SELECT ";
    }
}
