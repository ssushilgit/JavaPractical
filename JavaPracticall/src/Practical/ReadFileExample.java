package Practical;

import java.io.FileReader;
import java.io.IOException;

class ReadFileExample
{
    public static void main(String[] args)
    {
        try (FileReader r = new FileReader("C:\\Java\\Filee.txt"))
        {
            int i;
            System.out.println("File Read Succesfully");
            while ((i = r.read()) != -1)
            {

                System.out.print((char) i);
            }
        }
        catch (IOException e)
        {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}
