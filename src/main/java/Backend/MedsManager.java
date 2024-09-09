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
public class MedsManager {
   
    //default list
     public static String[] getMedsList() throws FileNotFoundException {
         File medsFile = new File("data//meds.txt");
        Scanner medsSc = new Scanner(medsFile);

        // count
        int count = 0;
        while (medsSc.hasNext()) {
            count++;
            medsSc.next();
            System.out.println("");
        }

        // list
        medsSc = new Scanner(medsFile);
        String[] meds = new String[count];
        for (int i = 0; i < count; i++) {
            meds[i] = medsSc.next();
        }
        return meds;
    
    
     }
     
       public static void deleteMeds(String meds) throws FileNotFoundException, IOException {
        File medsFile = new File("data//meds.txt");
        Scanner medsSc = new Scanner(medsFile);

        String line = "";
        while (medsSc.hasNext()) {
            String currentMeds = medsSc.next();
            if (!currentMeds.equals(meds)) {
                line = line + currentMeds + " ";
            }
        }

        FileWriter speciesFileWriter = new FileWriter("data//meds.txt");
        PrintWriter pw = new PrintWriter(speciesFileWriter);
        pw.write(line);
        pw.close();
}
}

  

