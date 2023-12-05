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
public class Accounts {
    public int account_id;
    public int user_id;
    public String real_name;
    public String username;
    public String account_type;
    public String contact_number;
    public String email;
    public String address;
    public String password;
    ArrayList<Accounts> accountList = new ArrayList<>();
    
    public Accounts(int account_id, int user_id, String real_name, String username, String account_type, String contact_number, String email, String address, String password) {
        this.account_id = account_id;
        this.user_id = user_id;
        this.real_name = real_name;
        this.username = username;
        this.account_type = account_type;
        this.contact_number = contact_number;
        this.email = email;
        this.address = address;
        this.password = password;
    }
}
