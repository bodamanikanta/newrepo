import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Read {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("TextFile.faizan");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
