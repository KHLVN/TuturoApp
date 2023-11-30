/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuturo.model;

import java.sql.Date;
import java.util.ArrayList;

public class HostSessions {
    public int subjectID;
    public String sessionName;
    public String subjectName;
    public Date date;
    public ArrayList<HostSessions> hostSessionList = new ArrayList<>();
    
    public HostSessions(int subjectID, String sessionName, String subjectName, Date date) {
        this.subjectID = subjectID;
        this.sessionName = sessionName;
        this.subjectName = subjectName;
        this.date = date;
    }
}
