import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        devide(arr);
    }

    private static void devide(int [] arr) {
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] % 2 == 0) System.out.print(arr[i] / 2 + " ");
            else System.out.print(arr[i] + " ");
        }
    }
}