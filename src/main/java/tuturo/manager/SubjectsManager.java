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
import tuturo.model.Subjects;

/**
 *
 * @author Khelvin
 */
public class SubjectsManager {
    ResultSet rs;
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
    
    public int getSubjectID(String subjectName){
        String query = "SELECT subject_id FROM Subject WHERE subject_name='"+subjectName+"'";
        try {
            Statement st = msql.connect().createStatement();
            rs = st.executeQuery(query);
            if (rs.next()) {
                subjectID = rs.getInt("subject_id");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SubjectsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return subjectID;
    }
    
    public void addSubjects(JComboBox subjects) throws SQLException {
        String inputQuery = "SELECT subject_name FROM Subject";
        Statement st = msql.connect().createStatement();
        ResultSet rs = st.executeQuery(inputQuery);
        while(rs.next()){
            subjects.addItem(rs.getString("subject_name"));
        }
    }
    
    public ArrayList<Subjects> subList() {
        ArrayList<Subjects> subList = new ArrayList<>();
        String query;
        try {
            msql.connect();
            Statement st = msql.connect().createStatement();
            
            query = "SELECT * FROM Subject";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()) {
                Subjects sb = new Subjects(rs.getInt("subject_id"), rs.getString("subject_name"), rs.getString("subject_category"));
                subList.add(sb);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SessionsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return subList;
    }
}
