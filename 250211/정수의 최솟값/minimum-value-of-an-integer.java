import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(getSmallInt(a,b,c));
    }

    private static int getSmallInt(int a, int b, int c) {
        int small = Math.min(a,b);
        small = Math.min(small,c);
        return small;
    }
}