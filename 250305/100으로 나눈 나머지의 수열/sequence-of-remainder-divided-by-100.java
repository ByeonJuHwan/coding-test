import java.util.Scanner;
public class Main {

    public static int stop = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        stop = n;

        System.out.print(f(n));
    }

    private static int f(int n) {
        if(n == 1) return 2;
        if(n == 2) return 4;

        return (f(n-1) * f(n-2)) % 100;
    }
}