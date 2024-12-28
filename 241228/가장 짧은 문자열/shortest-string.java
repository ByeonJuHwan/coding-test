import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.next().length();
        int b = sc.next().length();
        int c = sc.next().length();

        int[] arr = new int [3];

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        Arrays.sort(arr);

        System.out.print(arr[2]- arr[0]);
        
    }
}