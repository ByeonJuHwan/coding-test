import java.util.Scanner;
public class Main {

    public static final int MAX_N = 100;

    public static int[] arr = new int[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please Write your code.


            doAddArrayInt(a1, a2);
        }
    }

    private static void doAddArrayInt(int a, int b) {
        int sum = 0;
        
        for(int i = a; i<=b; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}