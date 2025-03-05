import java.util.Scanner;

public class Main {

    public static int [] arr = new int [11];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.print(f(n));
    }

    private static int f(int n) {
        if(n == 1) return arr[1];

        return getSmall(arr[n], f(n-1));
    }

    private static int getSmall(int a, int b) {
        int big = a*b;

        // big 의 약수를 구해야하
        int [] yak = new int [big + 1];
        for(int i = 2; i<=big; i++) {
            if(big % i == 0) yak[i] = i; 
        }

        int min = 0;

        for(int i = 2; i<yak.length; i++) {
            if(yak[i] == 0) continue;

            if(yak[i] % a == 0 && yak[i] % b == 0) {
                min = yak[i];
                break;
            }
        }

        return min;
    }
}