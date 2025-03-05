import java.util.Scanner;
public class Main {

    public static int [] arr = new int [101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        System.out.print(f(0));
    }

    private static int f (int i) {
        if(i == arr.length -1) return arr[arr.length-1];
        return Math.max(f(i+1), arr[i]);
    }
}