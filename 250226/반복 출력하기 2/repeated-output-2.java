import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please Write your code.

        pringHelloWorkd(n);
    }

    private static void pringHelloWorkd(int n) {
        
        // 종료 조건 설정
        if(n == 0) return;

        pringHelloWorkd(n-1);

        System.out.println("HelloWorld");
    }
}