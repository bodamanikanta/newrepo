import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TxtWrite {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("texts/bill.txt"));
        PrintWriter pw = new PrintWriter(bw);
        pw.print("Hello ");
        pw.println("How are you?");
        pw.println("Apple");
        pw.println("Banana");
        pw.close();
        bw.close();
    }
}
