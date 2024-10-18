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
        File medsFile = new File("PATdata//meds.txt");
        Scanner fileSc = new Scanner(medsFile);

        // count
        int count = 0;
        while (fileSc.hasNextLine()) {
            count++;
            fileSc.nextLine();
            System.out.println("");
        }

        // list
        fileSc = new Scanner(medsFile);
        String[] meds = new String[count];

        for (int i = 0; i < count; i++) {
            String line = fileSc.nextLine();

            Scanner medsSc = new Scanner(line);
            meds[i] = medsSc.nextLine();
        }
        return meds;

    }

    public static void deleteMeds(String meds) throws FileNotFoundException, IOException {
        File medsFile = new File("PATdata//meds.txt");
        Scanner medsSc = new Scanner(medsFile);

        String line = "";
        while (medsSc.hasNext()) {
            String currentMeds = medsSc.nextLine();
            if (!currentMeds.equals(meds)) {
                line += currentMeds + "\n ";
            }
        }

        FileWriter speciesFileWriter = new FileWriter("PATdata//meds.txt");
        PrintWriter pw = new PrintWriter(speciesFileWriter);
        pw.write(line);
        pw.close();
    }

    public static void addNewMed(String meds, String species, String formula, String dose) throws FileNotFoundException, IOException {
        File medsFile = new File("PATdata//meds.txt");
        Scanner medsSc = new Scanner(medsFile);

        String output = "";
        while (medsSc.hasNextLine()) {
            output += medsSc.nextLine() + "\n";
        }
        output += meds + " " + species + " " + formula + " " + dose;

        FileWriter medsFileWriter = new FileWriter("PATdata//meds.txt");
        PrintWriter pw = new PrintWriter(medsFileWriter);
        pw.write(output);
        pw.close();

    }

    public static String[] getFirstMeds(String[] meds) {
        String[] names = new String[meds.length];

        for (int i = 0; i < meds.length; i++) {
            String line = meds[i];
            Scanner lineSc = new Scanner(line);

            if (lineSc.hasNext()) {
                names[i] = lineSc.next();
            }
            lineSc.close();
        }

        return names;
    }
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

