import java.util.Scanner;

public class StringRev {


    public static String rev(String str) {
        return rev(str, str.length());
    }

    public static String rev(String str, int len) {
        if (len == 1)
            return str;
        else
            return str.charAt(len - 1) + rev(str.substring(0, len - 1), len - 1);
    }

    public static boolean isPalindrome(String st) {
        int l = st.length();
        if (l == 0 || l == 1)
            return true;
        else {
            return (st.charAt(0) + "").equalsIgnoreCase(st.charAt(l - 1) + "") && isPalindrome(st.substring(1, l - 1));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = in.nextLine();
        System.out.println(isPalindrome(s));
    }
}
