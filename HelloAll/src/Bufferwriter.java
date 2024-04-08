import java.io.*;


public class Bufferwriter {
    public static void main(String[] args) {
    String[] students = new String[5];
    students[0] = "Ram";
        students[1] ="Sam";
        students[2] ="Hari";
        students[3] ="Sita";
        students[4] ="Gita";
   try{
            BufferedWriter writer = new BufferedWriter (new FileWriter("C:\\Java\\File.txt"));
            for (String a : students) {
                writer.write(a + "\n");
            }

            writer.close();
       BufferedReader reader = new BufferedReader (new FileReader("C:\\Java\\File.txt"));
       int i;
       while ((i = reader.read()) != -1)
       {
           System.out.print((char) i);
       }
        }
        catch (IOException e){
            System.out.println("gurkha!");
        }
    }
}