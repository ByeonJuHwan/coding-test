import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please Write your code.

        int sum =0;

        while (m >0) {
            sum += arr[m];

            m = doSmaller(m);
        }

        System.out.print(sum);
    }

    public static int doSmaller(int m) {
        if(m %2 == 0) return m / 2;
        else return m-1;
    }
}