import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.print(sumOfPrime(A,B));
    }

    private static int sumOfPrime(int a, int b) {
        
        int sum = 0;

        for(int i = a; i<=b; i++) {
            if(isPrime(i)) sum += i;
        }

        return sum;
    }
    
    private static boolean isPrime(int i) {

        for(int n = 2; n<i; n++) {
            if(i % n ==0) return false;
        }

        return true;
    }
}