import java.util.Scanner;
public class Main {
    public static int num = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.print(f(n));
    }

    private static int f(int n) {
        if(n == 1) return num;

        if(n % 2 == 0) n /= 2;
        else n = 3 * n + 1;

        num ++;

        return f(n);
    }
}