
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
        Arrays.sort(arr);
        Integer [] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        for(int i = 0; i < n; i++) // 81, 60, 41, 37, 25, 20, 19, 12
            System.out.print(arr[i] + " ");

        System.out.println();

        Arrays.sort(arr2, Collections.reverseOrder());

        for(int i = 0; i < n; i++) // 81, 60, 41, 37, 25, 20, 19, 12
            System.out.print(arr2[i] + " ");
            
        
    }
}