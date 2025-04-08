import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Please write your code here.

        for(int i = 0; i<arr.length; i++) {
            if(i % 2 == 0) {
                printCenterValue(arr,i);
            }
        }
    }

    private static void printCenterValue(int [] arr, int i) {
        Arrays.sort(arr,0,i +1);

        int center = i / 2;

        System.out.print(arr[center] + " ");
    }
}