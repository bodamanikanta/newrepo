import java.util.Scanner;

public class SLE {
    public static void main(String[] args) {
        int i, j, A[][];
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        j = in.nextInt();
        A = new int[i][j];
        accept(A);
        print(A);
        ident(A);
        print(A);
    }

    private static void print(int[][] A) {
        int i, j, a, b;
        a = A.length;
        b = A[0].length;
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void accept(int[][] A) {
        int i, j, a, b;
        Scanner in = new Scanner(System.in);
        a = A.length;
        b = A[0].length;
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                A[i][j] = in.nextInt();
            }
        }
    }

    public static void ident(int[][] A) {
        int i, j, a;
        i = A.length;
        j = A[0].length;
        for (a = 1; A[0][0] == 0; a++) {
            if (A[a][0] != 0) {
                swap(A, 0, a);
                break;
            }
            if (a == i - 1) {
                System.out.println("No Solution");
                System.exit(0);
            }
        }
    }

    private static void swap(int[][] a, int i, int a1) {
        int temp;
        for (int j = 0; j < a[0].length; j++) {
            temp = a[i][j];
            a[i][j] = a[a1][j];
            a[a1][j] = temp;
        }
    }
}
