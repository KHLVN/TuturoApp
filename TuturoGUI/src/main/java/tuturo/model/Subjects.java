/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuturo.model;

import java.util.ArrayList;

/**
 *
 * @author Khelvin
 */
public class Subjects {
    public int subjectID;
    public String subjectName;
    public String subjectCategory;
    ArrayList<Subjects> subjectList = new ArrayList<>();
    
    public Subjects(int subjectID, String subjectName, String subjectCategory) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.subjectCategory = subjectCategory;
    }
}
