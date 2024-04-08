import java.io.File;
import java.io.IOException;
import java.io.*;
class fileWriter
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter f= new FileWriter("C:\\Java\\Filee.txt");
            try
            {
                f.write("Java Programming is the best language.");
            }
            finally
            {
                f.close();
            }
            System.out.println("Successfully Data is written in the file.");
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
}