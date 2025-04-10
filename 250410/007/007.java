import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode;
        char mPoint;
        int time;
        // Please write your code here.



        sCode = sc.next();
        String fullPoint = sc.next();
        mPoint = fullPoint.charAt(0);
        time = sc.nextInt();

        Secret secret = new Secret(sCode, mPoint, time);
    }
}

class Secret {
    String scode;
    char mPoint;
    int time;

    public Secret(String sCode, char mPoint, int time) {
        this.scode = sCode;
        this.mPoint = mPoint;
        this.time = time;

        System.out.println("secret code : " + scode);
        System.out.println("meeting point : " + mPoint);
        System.out.println("time : " + time);
    }
}