package tuturo.manager;

import tuturo.database.*;
import java.sql.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import tuturo.gui.StudentGUI;
import tuturo.gui.TutorGUI;
import tuturo.model.Accounts;

public class UsersManager {
    MSSQLConnection msql = new MSSQLConnection();
    public ResultSet rs, rs1;
    
    
    public void registerUser(String fullName, String username, String phone_no, String email, String role, String password){
        
        try {
            LocalDate date = LocalDate.now();
            String sDate = date.toString();
            String insertQuery;
            Statement statement;
            
            switch (role) {
                case "Student" -> {
                    insertQuery = "INSERT INTO Users(username, real_name, account_type, contact_number, email) "
                                + "VALUES('"+username+"','"+fullName+"', 'Student' ,'"+phone_no+"','"+email+"') "
                                + "UPDATE Accounts SET password = '"+password+"', date_created = '"+date+"' WHERE username = '"+username+"'";
                    
                    statement = msql.connect().createStatement();
                    statement.execute(insertQuery);
                    msql.connect().close();
                    JOptionPane.showMessageDialog(null, "Successfully Registered "+role+" User.");
                }
                    
                case "Tutor" -> {
                    insertQuery = "INSERT INTO Users(username, real_name, account_type, contact_number, email) "
                                + "VALUES('"+username+"','"+fullName+"', 'Tutor' ,'"+phone_no+"','"+email+"') "
                                + "UPDATE Accounts SET password = '"+password+"', date_created = '"+date+"' WHERE username = '"+username+"'";
                    
                    statement = msql.connect().createStatement();
                    statement.execute(insertQuery);
                    msql.connect().close();
                    JOptionPane.showMessageDialog(null, "Successfully Registered "+role+" User.");
                }
                    
                default -> {
                    JOptionPane.showMessageDialog(null, "ROLE Not Selected for User");
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsersManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Boolean loginUser(String username, String password) {
        msql.connect();
        StudentGUI st = new StudentGUI();
        TutorGUI tu = new TutorGUI();
        String loginQuery = "SELECT * FROM Accounts WHERE Accounts.username='"+username+"' AND password='"+password+"'";
        String loginQuery1 = "SELECT * FROM Users WHERE username='"+username+"'";
        
        try {
            Statement statement = msql.connect().createStatement();
            Statement statement1 = msql.connect().createStatement();
            rs = statement.executeQuery(loginQuery);
            rs1 = statement1.executeQuery(loginQuery1);
            if (rs.next() && rs1.next()) {
                System.out.println("user ID: "+ rs.getString("account_id"));
                System.out.println("Account Type: " + rs.getString("account_type"));
                
                switch(rs.getString("account_type")) {
                    case "Student":
                        JOptionPane.showMessageDialog(null, "Login Successful");
                        
                        st.setVisible(true);
                        st.welcomeLbl.setText("Welcome, " + rs1.getString("real_name"));
                        st.welcomeProfileLbl.setText("Hello, " + rs1.getString("real_name"));
                        st.profileNameLbl.setText(rs1.getString("real_name"));
                        st.usernameTxt.setText(rs.getString("username"));
                        st.realNameTxt.setText(rs1.getString("real_name"));
                        st.emailTxt.setText(rs1.getString("email"));
                        st.accIDHolder.setText(rs.getString("account_id"));
                        st.dateJoinedLbl.setText(rs.getString("date_created"));
                        return false;
                        
                    case "Tutor":
                        JOptionPane.showMessageDialog(null, "Login Successful");
                        SubjectsManager sm = new SubjectsManager();
                        tu.setVisible(true);
                        sm.addSubjects(tu.subjectComboBox);
                        tu.welcomeLbl.setText("Welcome, " + rs1.getString("real_name"));
                        tu.welcomeProfileLbl.setText("Hello, " + rs1.getString("real_name"));
                        tu.profileNameLbl.setText(rs1.getString("real_name"));
                        tu.usernameTxt.setText(rs.getString("username"));
                        tu.realNameTxt.setText(rs1.getString("real_name"));
                        tu.emailTxt.setText(rs1.getString("email"));
                        tu.accIDHolder.setText(rs.getString("account_id"));
                        tu.dateJoinedLbl.setText(rs.getString("date_created"));
                        return false;
                }
            }
            else {
            JOptionPane.showMessageDialog(null, "Login Unsuccessful. Incorrect Username or Password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public void updateProfile(String username, String realname, String email, String address, String accID){
        msql.connect();
        
        try {
            
            String updateQuery = "UPDATE Users SET"
                    + " username = '"+username+"',"
                    + " real_name = '"+realname+"',"
                    + " email = '"+email+"',"
                    + " address = '"+address+"'"
                    + " WHERE user_id = "+accID;
            Statement st = msql.connect().createStatement();
            rs = st.executeQuery(updateQuery);
        }
        catch (SQLException ex) {
        }
    }
    
    public ArrayList<Accounts> AccList() {
        ArrayList<Accounts> AccList = new ArrayList<>();
        try {
            String query ="SELECT * FROM Accounts";
            Statement st = msql.conn.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next()) {
                Accounts ac = new Accounts (rs.getInt("account_id"),
                        rs.getInt("user_id"),
                        rs.getString("real_name"),
                        rs.getString("username"),
                        rs.getString("account_type"),
                        rs.getString("contact_number"),
                        rs.getString("email"),
                        rs.getString("password"));
                AccList.add(ac);
            }
            msql.connect().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return AccList;
    }
}
    
//    public void loginUser1(String username, String password, String role) {
//        
//        LoginForm logForm = new LoginForm();
//        switch (role) {
//            case "Student" -> {
//                try {
//
//                    msql.connect();
//                    Statement statement = msql.connect().createStatement();
//                    String query = "SELECT * FROM Student WHERE username='"+username+"' AND password='"+password+"'";
//
//                    rset = statement.executeQuery(query);
//
//                    if(rSet.next()) {
//                        logForm.setVisible(false);
//                        new StudentGUI().setVisible(true);
//                    }
//                    else {
//                        JOptionPane.showMessageDialog(null, "Incorrect Username or Password.");
//                    }
//                } catch (SQLException ex) {
//                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//            case "Tutor" -> {
//                try {
//
//                    msql.connect();
//                    Statement statement = msql.connect().createStatement();
//                    String query = "SELECT * FROM Tutor WHERE username='"+username+"' AND password='"+password+"'";
//
//                    ResultSet rSet = statement.executeQuery(query);
//
//                    if(rSet.next()) {
//                        logForm.setVisible(false);
//                        new TutorGUI().setVisible(true);
//                    }
//                    else {
//                        JOptionPane.showMessageDialog(null, "Incorrect Username or Password.");
//                    }
//                } catch (SQLException ex) {
//                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//            default -> System.out.println(":(( ROLE NOT FOUND");
//        }
//    }
//
//

//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        // TODO add your handling code here:
//        
//        ConnectionsMYSQL cm = new ConnectionsMYSQL();
//        System.out.println("Checking connection: ");
//        
//        String emp_name=this.txt_name.getText();
//        String emp_address=this.txt_address.getText();
//        String emp_bdate=this.txt_bdate.getText();
//        Employee emp = new Employee(1,"","","");
//        //emp.emp_id=1;
//        //pt.createSalary(2,25,1500);
//        emp.createEmployee(emp_name, emp_address, emp_bdate);
//        
//        new EmployeeListForm().setVisible(true);
//        setVisible(false);
//    }