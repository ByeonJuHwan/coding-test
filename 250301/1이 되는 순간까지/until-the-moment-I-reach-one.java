import java.util.Scanner;
public class Main {

    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        f(n);
        System.out.print(cnt);
    }

    private static void f (int n) {
        // 종료조건 설정
        if(n == 1) {
           return;
        } 

        if(n % 2 == 0) {
            n /= 2;
            f(n);
            cnt ++;
        }else {
            n /= 3;
            f(n);
            cnt ++;
        }
    }
}