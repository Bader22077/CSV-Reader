/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csvfilereader;
// imported files
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 *
 * @author 2022
 */
public class CSVFileReader {

      // The main class
    public static void main(String[] args) {
//  try and catch for the scanner and file reader after declaration
    try {
//      added the csv file to Src folder within the same file of this package
        Scanner myReader = new Scanner(new FileReader("C:\\Users\\2022\\Documents\\NetBeansProjects\\CSVFileReader\\src\\csvfilereader\\newData.csv"));
        if (!myReader.hasNextLine()) {
            System.out.println("Empty file");
        } else {
//          then got it into while loop to read all the data from the csv file
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                System.out.println(line);
            }
        }
//      closed my scanner
        myReader.close();
    } catch (FileNotFoundException ex) {
    }
    }
}
    
