import java.io.*;

public class BinWrite {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int i, pc, c, n;
        FileOutputStream fos = new FileOutputStream("data.dat");
        try (fos; DataOutputStream dos = new DataOutputStream(fos)) {
            for (i = 1; i <= 5; i++) {
                System.out.print("Enter the product code : ");
                pc = Integer.parseInt(br.readLine());
                System.out.print("Enter the cost : ");
                c = Integer.parseInt(br.readLine());
                System.out.print("Enter No. of items : ");
                n = Integer.parseInt(br.readLine());
                dos.writeInt(pc);
                dos.writeInt(c);
                dos.writeInt(n);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
