/**
 * Write a description of class CSVReader here.
 *
 * @author Brennan Chan
 * @version (a version number or a date)
 */
//OBJECTIVE: take the average of both columns and print it to the console
import java.io.File;
import java.util.Scanner;
public class CSVReader extends FileReader
{

    public CSVReader()
    {
        File filename = new File ("Nile.csv");
        Scanner scan = new Scanner(System.in);
    }
    
    public boolean readFile(){
        return false;
    }
}
