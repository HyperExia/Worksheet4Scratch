/**
 * Write a description of class CSVReader here.
 *
 * @author Brennan Chan
 * @version (a version number or a date)
 */
//OBJECTIVE: take the average of both columns and print it to the console
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class CSVReader extends FileReader
{
    File file;
    public CSVReader(File file) throws FileNotFoundException
    {
        this.file = file;
        File fileName = new File ("Nile.csv");
        Scanner scan = new Scanner(fileName);
    }
    
    public boolean readFile(){
        return false;
    }
}
