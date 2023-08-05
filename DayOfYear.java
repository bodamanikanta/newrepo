import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
        int day = 256;
        int year = (new Scanner(System.in)).nextInt();
        System.out.println(dayOfProgrammer(day, year));
    }

    public static String dayOfProgrammer(int day, int year) {
        int[] dom = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year < 1918) {
            if (year % 4 == 0)
                dom[2] = 29;
            return actualDay(dom, day, year, 0);
        } else if (year > 1918) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                dom[2] = 29;
            return actualDay(dom, day, year, 0);
        } else {
            return actualDay(dom, day, year, 1);
        }
    }

    public static String actualDay(int[] dom, int day, int year, int f) {
        int i, d = 0, m = 1;
        for (i = 1; i <= day; i++) {
            d++;
            if (f == 1 && d > dom[m] && m == 1) {
                m++;
                d = 14;
            } else if (d > dom[m]) {
                m++;
                d = 1;
            }
        }
        String dd, mm;
        dd = (d / 10 == 0) ? "0" + d : "" + d;
        mm = (m / 10 == 0) ? "0" + m : "" + m;
        return dd + "." + mm + "." + year;
    }
}
