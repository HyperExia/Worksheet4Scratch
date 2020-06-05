
/**
 * Abstract class FileReader - write a description of the class here
 *
 * @author Brennan Chan
 * @version 6/5/2020
 */
import java.io.File;
public abstract class FileReader
{
    
    public int findFileType(File file)
    {
        return 0;
    }
    
    public abstract boolean readFile();
}
