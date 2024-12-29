import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        StringBuilder sb = new StringBuilder();

        // 처음 문자열 저장
        char startChar = s.charAt(0);
        int count = 1;

        for(int i = 1; i<s.length(); i++) {
            // 지금거랑 전거랑 같다면
            if(startChar == s.charAt(i)) {
                count++;
            }
            // 다르면 지금꺼 더해야함
            else {
                sb.append(startChar).append(count);
                startChar = s.charAt(i);
                count = 1;
            }
        }

        sb.append(startChar).append(count);

        System.out.println(sb.toString().length());
        System.out.print(sb);
    }
}