/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Anna
 */
public class UserManager {
    public static String filename = "data\\users.txt";
    
    public static boolean checkLogin(String usernameToCheck, String passwordToCheck) throws FileNotFoundException{
        File f = new File(filename);
        Scanner sc = new Scanner(f);
        
        while(sc.hasNext()){
            String username = sc.next();
            String password = sc.next();
            
            if(username.equals(usernameToCheck) && password.equals(passwordToCheck)){
                return true;
            }
        }
        
        return false;
    }
}
