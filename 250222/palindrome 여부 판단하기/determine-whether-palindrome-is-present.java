import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if(isPalindrome(s)) System.out.print("Yes");
        else System.out.print("No");
    }

    private static boolean isPalindrome(String s) {
        char [] arr = s.toCharArray();

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] != arr[arr.length - i -1]) return false;
        }
        
        return true;
    }
}