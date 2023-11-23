package tuturo.manager;

import tuturo.database.*;
import java.sql.*;
import java.sql.SQLException;
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
            String insertQuery;
            Statement statement;
            msql.connect();
            
            switch (role) {
                case "Student" -> {
                    insertQuery = "INSERT INTO Accounts(real_name, username, account_type, contact_number, email, password, date_created) "
                                + "VALUES('"+fullName+"','"+username+"', 'Student' ,'"+phone_no+"','"+email+"','"+password+"',GETDATE())";
                    statement = msql.connect().createStatement();
                    statement.execute(insertQuery);
                    msql.connect().close();
                    JOptionPane.showMessageDialog(null, "Successfully Registered "+role+" User.");
                }
                    
                case "Tutor" -> {
                    insertQuery = "INSERT INTO Accounts(real_name, username, account_type, contact_number, email, password, date_created) "
                                + "VALUES('"+fullName+"','"+username+"', 'Tutor' ,'"+phone_no+"','"+email+"','"+password+"', GETDATE())";
                    statement = msql.connect().createStatement();
                    statement.execute(insertQuery);
                    msql.connect().close();
                    JOptionPane.showMessageDialog(null, "Successfully Registered "+role+" User.");
                }
                    
                default -> {
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsersManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Boolean loginUser(String username, String password) {
        msql.connect();
        String loginQuery = "SELECT * FROM Accounts WHERE username='"+username+"' AND password='"+password+"'";
        
        try {
            Statement statement = msql.connect().createStatement();
            rs = statement.executeQuery(loginQuery);
            if (rs.next()) {
                System.out.println("user ID: "+ rs.getString("account_id"));
                System.out.println("Account Type: " + rs.getString("account_type"));
                
                switch(rs.getString("account_type")) {
                    case "Student":
                        JOptionPane.showMessageDialog(null, "Login Successful");
                        StudentGUI st = new StudentGUI();
                        st.setVisible(true);
                        st.welcomeProfileLbl.setText("Hello, " + rs.getString("real_name"));
                        st.profileNameLbl.setText(rs.getString("real_name"));
                        st.usernameTxt.setText(rs.getString("username"));
                        st.realNameTxt.setText(rs.getString("real_name"));
                        st.emailTxt.setText(rs.getString("email"));
                        st.accIDHolder.setText(rs.getString("account_id"));
                        st.dateJoinedLbl.setText(rs.getString("date_created"));
                        return false;
                    case "Tutor":
                        JOptionPane.showMessageDialog(null, "Login Successful");
                        TutorGUI tu = new TutorGUI();
                        tu.setVisible(true);
                        tu.welcomeProfileLbl.setText("Hello, " + rs.getString("real_name"));
                        tu.profileNameLbl.setText(rs.getString("real_name"));
                        tu.usernameTxt.setText(rs.getString("username"));
                        tu.realNameTxt.setText(rs.getString("real_name"));
                        tu.emailTxt.setText(rs.getString("email"));
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
    
    public void updateProfile(String username, String realname, String email, String accID){
        msql.connect();
        
        System.out.println(username + realname + email + accID);
        
        try {
            
            String updateQuery = "UPDATE Accounts SET"
                    + " username='"+username+"',"
                    + " real_name='"+realname+"',"
                    + " email='"+email+"'"
                    + " WHERE account_id="+accID;
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