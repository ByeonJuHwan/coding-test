import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String [] arr = new String [n];
        
        // 순회하며 문자열 넣기
        for(int i = 0; i<n; i++) {
            arr[i] = sc.next();
        }
        //  비교 문자열
        char c = sc.next().charAt(0);

        // 본격 로직 시작
        int count = 0;
        int sum = 0;

        for(String s : arr) {
            int len = s.length();

            for(int i = 0; i<len; i++) {
                if(c == s.charAt(i)) {
                    count++;
                    sum += len;
                }
            }
            
        }

        System.out.print(count + " ");
        System.out.printf("%.2f",(float)sum/count);

    }
}