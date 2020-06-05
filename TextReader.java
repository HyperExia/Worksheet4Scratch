/**
 * Write a description of class TextReader here.
 *
 * @author Brennan Chan
 * @version (a version number or a date)
 */
//OBJECTIVE: read the data and print it to the console
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class TextReader extends FileReader    
{
    File file;
    
    public TextReader(File file) throws FileNotFoundException
    {
        this.file = file;
        File fileName = new File("Aeneid.txt");
        Scanner scan = new Scanner(fileName);
    }

    public boolean readFile(){
        return false;
    }
}
