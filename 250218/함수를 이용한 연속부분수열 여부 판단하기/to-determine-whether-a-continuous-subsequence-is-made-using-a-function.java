import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int [] A = new int [sc.nextInt()];
        int [] B = new int [sc.nextInt()];

        for(int i = 0; i<A.length; i++) {
            A[i] = sc.nextInt();
        }

        for(int i = 0; i<B.length; i++) {
            B[i] = sc.nextInt();
        }

        String result = isRensokooArr(A,B);

        System.out.print(result);
    }

    private static String isRensokooArr (int [] a, int [] b) {
        int cnt = 0;

        for(int i = 0; i<a.length; i++) {
            if(cnt == b.length) return "Yes";

            if(a[i] == b[cnt]) {
                cnt ++;
            } else {
                cnt = 0;
            }
            
        }

        return "No";
    }
}