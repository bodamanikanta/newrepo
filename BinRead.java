import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class BinRead {
    public static void main(String[] args) throws IOException {
        int pc, c, n;
        FileInputStream fis = new FileInputStream("data.dat");
        System.out.println("Product Code\tCost\tNo. of Items");
        try (fis; DataInputStream dis = new DataInputStream(fis)) {
            while (true) {
                pc = dis.readInt();
                c = dis.readInt();
                n = dis.readInt();
                System.out.println(pc + "\t\t\t\t" + c + "\t\t" + n);
            }
        } catch (EOFException e) {
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
