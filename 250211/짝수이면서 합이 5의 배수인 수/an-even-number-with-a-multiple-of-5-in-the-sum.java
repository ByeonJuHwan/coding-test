import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(checkMagicNum(n));
    }

    private static String checkMagicNum(int n) {
        if(n % 2 == 0 && isFive(n)) {
            return "Yes";
        } 

        return "No";
    }

    private static boolean isFive(int n) {
        int sum = 0;
        
        while(n>0) {
            sum += n%10;
            n /= 10;
        }

        if(sum % 5 == 0) return true;

        return false;
    }
}