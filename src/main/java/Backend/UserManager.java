/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Anna
 */
// Need to do:
// Makes sure code works
// Get files off other computer 

public class UserManager {
    public static String filename = "PATdata\\users.txt";
    
    public static boolean checkLogin(String usernameToCheck, String passwordToCheck) throws FileNotFoundException{
        File f = new File(filename);
        Scanner sc = new Scanner(f);
        
        while(sc.hasNext()){
            String username = sc.next();
            String password = sc.next();
            
            if(username.equals(usernameToCheck) && password.equals(passwordToCheck)){
                return true; // if both the username and password is correct then login (send to frontend)
            }
        }
        
        return false;
        
    }
    
    public static void SignUp (String user, String password) throws FileNotFoundException, IOException{
        File userFile = new File(filename);
        Scanner userSc = new Scanner(userFile);
        
        String output = "";
        while(userSc.hasNextLine()){
            output += userSc.nextLine() + "\n";
        }
        output += user + " " + password;

        FileWriter medsFileWriter = new FileWriter(filename);
        PrintWriter pw = new PrintWriter(medsFileWriter);
        pw.write(output);
        pw.close();
    }
    
}
