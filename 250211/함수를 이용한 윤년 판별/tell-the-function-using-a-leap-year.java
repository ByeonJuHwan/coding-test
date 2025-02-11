import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        System.out.print(checkYoon(y));
    }


    private static boolean checkYoon(int y) {
        if(y % 4 != 0) return false;

        if((y % 100 == 0) && (y % 400 != 0)) return false;


        return true;
    }
}