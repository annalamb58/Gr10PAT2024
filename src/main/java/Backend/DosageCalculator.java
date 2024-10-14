/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import Frontend.UI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HYSTOU
 */
public class DosageCalculator {

    public static double CalculatingDose(String meds, String species, String weight, String dose) throws FileNotFoundException, IOException {
        // NOTE ORDER IN DOC = meds + " " + species + " " + formula + " " + dose;
        File fileForCAL = new File("PATdata//meds.txt");
        Scanner scannerForCAL = new Scanner(fileForCAL);

        double calculation = 0;
        // To save tokens   
        String currentMeds = "";
        String currentSpecies = "";
        String currentFormula = "";
        String currentDose = "";

        // To find line
        boolean isMatch = false;

        // to get formula
        String formulaInput = "";
        String formulaWeight = "";
        String formulaMultiply = "*";
        String formulaMg_kg = "";
        String formulaDivide = "/";
        String formulaMg = "";

        while (scannerForCAL.hasNextLine()) {
            String line = scannerForCAL.nextLine();

            //Breaking line into tokens
            String[] tokens = line.split(" ");

            if (tokens.length >= 4) {
                // Saving the tokens to variables
                currentMeds = tokens[0];
                currentSpecies = tokens[1];
                currentFormula = tokens[2];
                currentDose = tokens[3];

                // Check for a match
                if (currentDose.equalsIgnoreCase(dose)
                        && currentMeds.equalsIgnoreCase(meds)
                        && currentSpecies.equalsIgnoreCase(species)) {
                    isMatch = true; // Set matchFound to true
                    break; // Exit the loop if a match is found
                } // End of if current == entered statemeny
            } // end of Token if statement

            while (isMatch) {
                formulaInput = currentFormula;
                Scanner formulaSc = new Scanner(formulaInput);
                

                if (formulaSc.hasNext()) {
                    String placement = formulaSc.nextLine().trim();

                    // Breaking line into tokens
                    //String[] tokens = placement.split("\\s+");

                    if (tokens.length >= 5) {
                        // Saving the tokens to variables
                        formulaWeight = weight;
                        formulaMultiply = tokens[1];
                        formulaMg_kg = tokens[2];
                        formulaDivide = tokens[3];
                        formulaMg = tokens[4];
                    } // end of while scannerForCAL.hasNextLine() loop

                    double currentWeight = Double.parseDouble(formulaWeight);
                    double currentMg_kg = Double.parseDouble(formulaMg_kg);
                    double currentMg = Double.parseDouble(formulaMg);

                    calculation = currentWeight * currentMg_kg / currentMg;

                }
                formulaSc.close(); // Close the formula scanner
            }

            scannerForCAL.close(); // Close the main scanner
            //return String.valueOf(calculation); // end of getFormula method

        } // end of class
        return calculation;
    }
}
// OLD CODE # OLD CODE # OLD CODE # OLD CODE # OLD CODE # OLD CODE # OLD CODE # OLD CODE # OLD CODE # OLD CODE # OLD CODE # OLD CODE # OLD CODE # OLD CODE #
//        String currentMeds = "";
//        String currentSpecies = "";
//        String currentFormula = "";
////        String currentDose = "";
//
//        boolean isMed = false;
//        boolean isSpecies = false;
//        boolean isFormula = false;
//        boolean isDose = false;
//        boolean isLine = false;
//
//        while (scannerForCAL.hasNextLine()) {
//            String line = scannerForCAL.nextLine();
//
//            //Breaking line into tokens
//            String[] tokens = line.split(" ");
//
//            if (tokens.length >= 4) {
//                // Saving the tokens to variables
//                currentMeds = tokens[0];
//                currentSpecies = tokens[1];
//                currentFormula = tokens[2];
//                currentDose = tokens[3];
//            } // end of Token if statement
//
//            //checking if med name and what was entered match
//            if (currentMeds.equalsIgnoreCase(meds)) {
//                isMed = true;
//            } else {
//                line = scannerForCAL.nextLine();
//            } // end of check Meds if statement
//
//            // if med name is correct:
//            //checking if species and what was entered match
//            if (isMed = true) {
//                if (currentSpecies.equalsIgnoreCase(species)) {
//                    isSpecies = true;
//                } else {
//                    line = scannerForCAL.nextLine();
//                } // end of check species = true if statement
//            }// end of isMed = true if statement
//
//            // if med name and species is correct:
//            //checking if formula and what was entered match
//            if (isMed == true && isSpecies == true) {
//                if (currentFormula.equalsIgnoreCase(formula)) {
//                    isFormula = true;
//                } else {
//                    line = scannerForCAL.nextLine();
//                }// end of check formula = true if statement
//            }// end of isMed && isSpecies = true if statement
//
//            // if med name and species and formula is correct:
//            //checking if dose and what was entered match
//            if (isMed == true && isSpecies == true && isFormula == true) {
//                if (currentDose.equalsIgnoreCase(dose)) {
//                    isDose = true;
//                } else {
//                    line = scannerForCAL.nextLine();
//                }// end of check dose = true if statement
//            }// end of isMed && isSpecies && isFormula = true if statement 
//
//        } // end of while hasNextLine loop
//   public static void CalculatingDose(String meds, String species, String weight, String dose) throws FileNotFoundException, IOException {
//        // NOTE ORDER IN DOC = meds + " " + species + " " + formula + " " + dose;
//        File fileForCAL = new File("PAT//meds/text");
//        Scanner scannerForCAL = new Scanner(fileForCAL);
//
//        // To save tokens
//        String currentMeds = "";
//        String currentSpecies = "";
//        String currentFormula = "";
//        String currentDose = "";
//
//        // To find line
//        boolean isMatch = false;
//
//        // to get formula
//        String formulaWeight = "";
//        String formulaMultiply = "*";
//        String formulaMg_kg = "";
//        String formulaDivide = "/";
//        String formulaMg = "";
//
//        while (scannerForCAL.hasNextLine()) {
//            String line = scannerForCAL.nextLine();
//
//            //Breaking line into tokens
//            String[] tokens = line.split(" ");
//
//            if (tokens.length >= 4) {
//                // Saving the tokens to variables
//                currentMeds = tokens[0];
//                currentSpecies = tokens[1];
//                currentFormula = tokens[2];
//                currentDose = tokens[3];
//
//                // Check for a match
//                if (currentMeds.equalsIgnoreCase(meds)
//                        && currentSpecies.equalsIgnoreCase(species)
//                        && currentDose.equalsIgnoreCase(dose)) {
//                    isMatch = true; // Set matchFound to true
//                    break; // Exit the loop if a match is found
//                } // End of if current == entered statemeny
//            } // end of Token if statement
//
//            //if (isMatch) 
//            // formulaWeight = weight;
//            //currentFormula = 
//        } // end of while scannerForCAL.hasNextLine() loop
//
//    } // End of method CalculatingDose
