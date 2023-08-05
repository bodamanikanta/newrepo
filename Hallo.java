import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Hallo {
    public static void main(String[] args) throws InterruptedException, IOException {
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        System.out.print("Enter the ip address : ");
        in.readLine();
        System.out.println();
        System.out.println("Hacking the system......");
        System.out.println();
        System.out.println();
        System.out.println("Progress : ");
        System.out.println();
        String bar = "|";
        int per;
        for (per = 0; per <= 100; per += 13) {
            System.out.println(bar);
            System.out.println(per + "%");
            System.out.println();
            TimeUnit.SECONDS.sleep(3);
            bar += "|||";
        }
        System.out.println(bar);
        System.out.println("100%");
        System.out.println();
        System.out.println("Hacking Successful ");
        System.out.print("Type Command to Execute : ");
        in.readLine();
        System.out.println();
        System.out.println("Executing Command");
        System.out.println();
        System.out.println();
        System.out.println("Progress : ");
        System.out.println();
        bar = "|";
        for (per = 0; per <= 100; per += 13) {
            System.out.println(bar);
            System.out.println(per + "%");
            System.out.println();
            TimeUnit.SECONDS.sleep(3);
            bar += "|||";
        }
        System.out.println(bar);
        System.out.println("100%");
        System.out.println();
        System.out.println("Command Successfully Executed!");
        System.out.println("Terminating the operation window");
        System.exit(420);

    }
}
