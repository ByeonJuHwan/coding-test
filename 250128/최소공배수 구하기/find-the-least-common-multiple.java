import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int maxValue = n*m;
        int answer = 0;
        for(int i = 1; i<=maxValue; i++) {
            if((i%n ==0) && (i%m == 0)) {
                answer = i;
                break;
            }
        }

        System.out.print(answer);
    }
}