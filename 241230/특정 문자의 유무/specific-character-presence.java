import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if(s.contains("ee")) System.out.print("Yes");
        else System.out.print("no");

        System.out.print(" ");

        if(s.contains("ab")) System.out.print("Yes");
        else System.out.print("No");
    }
}