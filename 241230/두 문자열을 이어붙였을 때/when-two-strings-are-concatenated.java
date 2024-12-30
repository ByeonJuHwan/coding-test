import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        // a + b
        String concat1 = s1 + s2;

        // b + a
        String concat2 = s2 + s1;

        if (concat1.equals(concat2)) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}