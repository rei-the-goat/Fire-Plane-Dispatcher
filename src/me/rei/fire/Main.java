/**
 * 
 */
package me.rei.fire;

/**
 * @author Jefferson Hernandez
 *
 */
import java.io.*;
import java.util.*;
public class Main {

	//Defines the name and extension of the input file
	static String file = "fire.txt"; 
	//The amount of airports there are (defined by line 1 of the input file)
	static int airportAmount = 0;
	//The amount of lines that have been read
	static int linesRead = 0;
	
	//Used to get the string for the current line of the text
	static String currentLine = null;
	//FileReader is used to read the current file. Its function will be utilized to get a certain line.
	static FileReader reader = null;
	
	static int[] latitudeCoords;
	static int[] longitudeCoords;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 try {
			reader = new FileReader(file);
			// Always wrap FileReader in BufferedReader.
	        BufferedReader bufferedReader = new BufferedReader(reader);
	        
	        //Sets the "currentLine" variable with the current line
	        //Makes sure it isn't null. In English, it make sures the file hasn't ended.
	        while((currentLine = bufferedReader.readLine()) != null) {
	        	linesRead++; //We read a line.
	        	if(linesRead == 1) {
	        		//The first line, the amount of airports there are.
	        		airportAmount = Integer.parseInt(currentLine); //Parse the string into an integer
	        		System.out.println("There are " + String.valueOf(airportAmount) + " airports.");
	        	} else {
	        		
	        		int counter = 0;
	        		
	        		//If this isn't line one.
	        		//We're expecting it to be 2 integers, latitude and longitude.
	        		
	        		//This scanner will be used to know we read to integers, then to stop.
	        		Scanner scanner = new Scanner(currentLine);
	        		while(scanner.hasNextInt()) {
	        			//Adds 1 to the integer so we can let the program know we read the latitude.
	        			counter++;
	        			//Checks if the counter isn't 0, so we can be sure to check for a longitude.
	        			if(counter != 0) {
	        				
	        			}
	        		}
	        		scanner.close();
	        	}
	        }
	        
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
