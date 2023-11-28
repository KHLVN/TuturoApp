/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuturo.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import tuturo.database.MSSQLConnection;

/**
 *
 * @author Khelvin
 */
public class SubjectsManager {
    public int subjectID;
    public String subjectName;
    public String subjectCategory;
    public ArrayList<String> subjects;
    MSSQLConnection msql = new MSSQLConnection();

    public ArrayList<String> getArrayList(ArrayList<String> subjects) {
        String inputQuery = "SELECT subject_name FROM Subject";
        
        try {
            ResultSet rs;
            Statement statement = msql.connect().createStatement();
            rs = statement.executeQuery(inputQuery);
            while (rs.next()) {
                subjects.add(rs.getString("subject_name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SubjectsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return subjects;
    }
    
    public int getSubjectID(String subjectName) {
        try {
            msql.connect();
            String query = "SELECT subject_id FROM Subject WHERE subject_name='"+subjectName+"'";
            Statement st = msql.connect().createStatement();
            ResultSet rs = st.executeQuery(query);
            int subjectID = Integer.parseInt(rs.getString("subject_id"));
            if(rs.next()) {
                return subjectID;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SessionsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public void addSubjects(JComboBox subjects) throws SQLException {
        String inputQuery = "SELECT subject_name FROM Subject";
        ResultSet rs;
        Statement statement = msql.connect().createStatement();
        rs = statement.executeQuery(inputQuery);
        while(rs.next()){
            subjects.addItem(rs.getString("subject_name"));
        }
    }
}
