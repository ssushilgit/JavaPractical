import java.io.File;
import java.io.IOException;

class CreateFile {
    public static void main(String[] args) {
        File f = new File("C:\\Java\\File.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File Created");
            } else {
                System.out.println("File already exists");
            }
        }
        catch (IOException e) {
            System.out.println("Execution");
        }
    }
}
