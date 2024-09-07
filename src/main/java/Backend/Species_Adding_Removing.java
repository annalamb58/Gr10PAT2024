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
 * @author HYSTOU
 */
public class Species_Adding_Removing {
    
    public static String[] getSpeciesList() throws FileNotFoundException {
        
        File speciesFile = new File ("data//species.text") ;
        Scanner speciesSc = new Scanner(speciesFile) ;
        
        // count
        int count = 0 ;
        while (speciesSc.hasNext()) {
            count ++ ;
            speciesSc.next();
            System.out.println("");
        }
          
        speciesSc = new Scanner(speciesFile) ;
        
        // list
        
        String[] species = new String[count] ;
        for (int i = 0; i < count; i++) {
            species[i] = speciesSc.next();
            System.out.println("");
            
        }
        return species ;
    }
        
        

}