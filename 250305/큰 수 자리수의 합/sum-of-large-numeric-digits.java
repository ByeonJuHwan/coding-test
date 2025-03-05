import java.util.Scanner;
public class Main {

    public static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        System.out.print(f(a*b*c));
    }

    private static int f(int n) {
        if(n < 10) {
            return sum + n;
        }

        sum += n % 10;
        n/=10;

        return f(n);
    }
}