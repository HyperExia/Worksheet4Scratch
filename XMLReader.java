/**
 * Write a description of class XMLReader here.
 *
 * @author Brennan Chan
 * @version (a version number or a date)
 */
//OBJECTIVE: print the information to the console without the nodes
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class XMLReader extends FileReader
{
    File file;
    public XMLReader(File file) throws FileNotFoundException
    {
        this.file = file;
        File fileName = new File ("Nile.csv");
        Scanner scan = new Scanner(fileName);
    }

    public boolean readFile(){
        return false;
    }
}
