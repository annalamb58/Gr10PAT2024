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

    public static void CalculatingDose(String meds, String species, String formula, String dose) throws FileNotFoundException, IOException {
        // NOTE ORDER IN DOC = meds + " " + species + " " + formula + " " + dose;
        File fileForCAL = new File("PAT//meds/text");
        Scanner scannerForCAL = new Scanner(fileForCAL);
        
        String currentMeds = "";
        String currentSpecies = "";
        String currentFormula = "";
        String currentDose = "";
        
        boolean isMed = false;
        boolean isSpecies = false;
        boolean isFormula = false;
        boolean isDose = false;
        
        // Getting correct medication's name
        while (scannerForCAL.hasNext()) {
              currentMeds = scannerForCAL.next();
          if (currentMeds == meds) {
              isMed = true ;
          } else {
              currentMeds =scannerForCAL.next();
          } // end of Meds if statement
        } // end of Meds while loop
        
        
        
        
        
    } // End of method CalculatingDose
} // end of class

