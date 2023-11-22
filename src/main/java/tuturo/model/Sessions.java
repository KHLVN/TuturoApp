/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuturo.model;

import java.sql.*;
import java.util.ArrayList;
import tuturo.database.MSSQLConnection;

public class Sessions {
    public int sessionID;
    public int hostID;
    public int subjectID;
    public String hostName;
    public String subjectName;
    public ArrayList<Sessions> sessionList = new ArrayList<>();
    
    public Sessions(int sessionID, int hostID, String hostName, int subjectID, String subjectName) {
        this.sessionID = sessionID;
        this.hostID = hostID;
        this.hostName = hostName;
        this.subjectID = subjectID;
        this.subjectName = subjectName;
    }
}
