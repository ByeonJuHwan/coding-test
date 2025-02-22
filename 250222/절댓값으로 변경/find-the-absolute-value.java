import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        doAbs(arr);


        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void doAbs(int [] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }
    }
}