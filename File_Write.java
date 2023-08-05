import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class File_Write{
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("TextFile.faizan");
        BufferedWriter bw=new BufferedWriter(writer);
        bw.write("Hello HI");
        bw.newLine();
        bw.write("Abed");
        bw.close();
        writer.close();
    }
}
