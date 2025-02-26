import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please Write your code.

        printTwoLine(n);
    }

    private static void printTwoLine (int n) {
        printDownToUp(n);
        System.out.println();
        printUpToDown(n);

    }

    private static void printDownToUp(int n) {
        if(n ==0) return;

        printDownToUp(n-1);
        System.out.print(n + " ");
    }

    private static void printUpToDown(int n) {
        if(n == 0) return;
        System.out.print(n + " ");
        printUpToDown(n-1);
    }
}