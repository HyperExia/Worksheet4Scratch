/**
 * Write a description of class Main here.
 *
 * @author Brennan Chan
 * @version 6/5/2020
 * 
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Main
{
    TextReader tr;
    CSVReader cr;
    XMLReader xr;
    public static void Main(String[] args)
    {
        Main main = new Main();
        //main.run();
    }
    public void run() throws FileNotFoundException
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a file path to process:");
        String input = scan.next();
        
        tr = new TextReader(new File(input));
        cr = new CSVReader(new File(input));
        xr = new XMLReader(new File(input));
        
        int type = tr.findFileType(new File(input));
    }
    
}
