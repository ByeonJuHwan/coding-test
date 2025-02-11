import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        // 3,6,9 중 하나가 들어가 있거나

        // 그 수 자체가 3의 배수이거나

        // or 사용

        System.out.print(checkMagicNumber(A,B));
    }

    private static int checkMagicNumber(int a, int b) {
        int cnt=0;

        for(int i = a; i<=b; i++) {
            if(isMagicNumber(i)) cnt ++;
        }

        return cnt;
    }


    private static boolean isMagicNumber (int n) {
        if(n % 3 == 0 || isContainMagicNumbers(n)) return true;
        return false;
    }

    private static boolean isContainMagicNumbers (int n) {
        // 3, 6, 9 가 들어가 있는가
        int [] arr = {3,6,9};

        while(n > 0) {
            
            int last = n % 10;

            for(int i = 0; i<arr.length; i++) {
                if(last == arr[i]) return true;
            }

            n /= 10;
        }

        return false;
    }
}