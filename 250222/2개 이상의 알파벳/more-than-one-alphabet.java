import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);

        String s = sc.next();

        String result = checkIsNotSame(s);

        System.out.print(result);
    }

    private static String checkIsNotSame (String s) {
        char [] arr = s.toCharArray();

        for(int i = 1; i<arr.length; i++) {
            if(arr[0] != arr[i]) return "Yes";
        }

        return "No";
    }
}