import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        for(int i = a; i<=b; i++) {
            if(isPrime(i) && isSumDevideTwo(i)) {
                cnt ++;
            }
        }

        System.out.print(cnt);
    }


    private static boolean isPrime (int i) {
        if(i == 1) return false;

        for(int x =2; x<=i-1; x++) {
            if(i % x == 0) {
                return false;
            }
        }

        return true;
    }
    private static boolean isSumDevideTwo (int i) {
        int sum = 0;

        while(i >0) {
            sum += i % 10;
            i /= 10;
        }

        if(sum % 2 == 0) return true;
        else return false;
    }
}