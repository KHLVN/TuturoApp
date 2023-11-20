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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import tuturo.database.MSSQLConnection;
import tuturo.gui.SessionCreateGUI;

public class SessionsManager {
    MSSQLConnection msql;
    int sessionID;
    int userID;
    int subjectID;
    Date sessionDate;
    Time sessionTime;
    
    public void createSession(Date sessionDate, Time sessionTime) {
        SessionCreateGUI scg = new SessionCreateGUI();
        String insertQuery = "INSERT INTO Session_schedule(session_date, session_time) VALUES ('"+sessionDate+"','"+sessionTime+"')";
        
        try {
            ResultSet rs;
            Statement statement = msql.connect().createStatement();
            rs = statement.executeQuery(insertQuery);
        } catch (SQLException ex) {
            Logger.getLogger(SubjectsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
