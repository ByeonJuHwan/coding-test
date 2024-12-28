import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        String [] arr = new String [10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<10; i++) {
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);

        for(int i = 0; i<10; i++) {
            int len = arr[i].length();
            if(arr[i].charAt(len-1)==c) System.out.println(arr[i]);
        }

    }
}