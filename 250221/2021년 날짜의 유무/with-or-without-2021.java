import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        if(is31days(m)) {
            is31Avaliable(d);
        } else {
            if(m == 2) {
                if(d<=28) System.out.print("Yes");
                else System.out.print("No");

                return;
            }

            is30Avaliable(d);
        }
    }

    private static boolean is31days (int m) {
        if(m == 1 || m ==3 || m ==5 || m==7 || m==8 || m == 10 ||m ==12) return true;
        return false;
    }

    private static void is31Avaliable (int d) {
        if(d<=31) System.out.print("Yes");
        else System.out.print("No");
    }

    private static void is30Avaliable (int d) {
        if(d<=30) System.out.print("Yes");
        else System.out.print("No");
    }
}