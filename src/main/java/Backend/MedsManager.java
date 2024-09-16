/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import Frontend.UI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public static void addNewMed(String meds, String species, String formula) throws FileNotFoundException, IOException {
        File medsFile = new File("data//meds.txt");
        Scanner medsSc = new Scanner(medsFile);

        String line = medsSc.nextLine() + " " + meds + " " + species + " " + formula ;

        FileWriter medsFileWriter = new FileWriter("data//meds.txt");
        PrintWriter pw = new PrintWriter(medsFileWriter);
        pw.write(line);
        pw.close();
        
        
    }
//    public static void addNameofMed(String meds) throws FileNotFoundException, IOException {
//        File medsFile = new File("data//meds.txt");
//        Scanner medsSc = new Scanner(medsFile);
//
//        String line = medsSc.nextLine() + " " + meds  ;
//
//        FileWriter speciesFileWriter = new FileWriter("data//meds.txt");
//        PrintWriter pw = new PrintWriter(speciesFileWriter);
//        pw.write(line);
//        pw.close();
//        
        
    }
    

//    public static void findFormula(String givenFormula) throws FileNotFoundException, IOException {
//        File formulaFile = new File("data//combined.txt");
//        Scanner formulaSc = new Scanner(formulaFile).useDelimiter("#");
//        
//        while (formulaSc.hasNext()){
//            String line = formulaSc.nextLine();
//            Scanner lineSc = new Scanner(line);
//            
//            lineSc.next();
//            formulaSc.next();
//            String formula = formulaSc.next();
//        }
//        
    
    