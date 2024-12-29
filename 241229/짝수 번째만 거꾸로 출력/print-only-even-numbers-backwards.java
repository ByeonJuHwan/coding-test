import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        List<Character> list = new ArrayList<>();

        for(int i = s.length()-1; i>=0; i--) {
            if(i % 2 == 1) {
                list.add(s.charAt(i));
            }
        }

        for(char c : list) {
            System.out.print(c);
        }
    }
}