import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(checkOnInt(a,b));
    }

    public static int checkOnInt(int a , int b) {

        int cnt = 0;

        for(int i = a; i<=b; i++) {
            if(isDiviedTwo(i) || isOneFive(i) || isSamGoo(i)) {
                continue;
            }

            cnt ++;
        }

        return cnt;
    }

    private static boolean isDiviedTwo (int n) {
        if(n % 2 == 0) return true;
        return false;
    }

    private static boolean isOneFive (int n) {
        if(n%10 == 5) return true;
        return false;
    }

    private static boolean isSamGoo (int n) {
        if((n % 3 ==0) && (n % 9 != 0)) return true;
        return false;
    }
}