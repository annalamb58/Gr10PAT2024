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
public class SpeciesManager {

    public static String[] getSpeciesList() throws FileNotFoundException {
        File speciesFile = new File("PATdata//species.txt");
        Scanner speciesSc = new Scanner(speciesFile);

        // count
        int count = 0;
        while (speciesSc.hasNext()) {
            count++;
            speciesSc.next();
            System.out.println("");
        }

        // list
        speciesSc = new Scanner(speciesFile);
        String[] species = new String[count];
        for (int i = 0; i < count; i++) {
            species[i] = speciesSc.next();
        }
        return species;

    }

    public static void deleteSpecies(String species) throws FileNotFoundException, IOException {
        File speciesFile = new File("PATdata//species.txt");
        Scanner speciesSc = new Scanner(speciesFile);

        String line = "";
        while (speciesSc.hasNext()) {
            String currentSpecies = speciesSc.next();
            if (!currentSpecies.equals(species)) {
                line = line + currentSpecies + " ";
            }
        }

        FileWriter speciesFileWriter = new FileWriter("PATdata//species.txt");
        PrintWriter pw = new PrintWriter(speciesFileWriter);
        pw.write(line);
        pw.close();

    }
    
    public static void addSpecies (String species) throws FileNotFoundException, IOException {
        File speciesFile = new File("PATdata//species.txt");
        Scanner speciesSc = new Scanner(speciesFile);
        
        String line = speciesSc.nextLine() + " " + species ;
        
        FileWriter speciesFileWriter = new FileWriter("PATdata//species.txt");
        PrintWriter pw = new PrintWriter(speciesFileWriter);
        pw.write(line);
        pw.close();
    }

}
