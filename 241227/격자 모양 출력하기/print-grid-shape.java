import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner (System.in);

        // 격자의 크기
        int n = sc.nextInt();

        // 점들을 좀더 수월하게 찾기 위해서 1을 더한다
        int [][] arr = new int [n+1][n+1];

        // 점의 개수
        int m = sc.nextInt();


        for(int i = 1; i<=m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[x][y] = x*y;
        }

        for(int i = 1; i<n + 1; i++) {
            for(int j = 1; j<n + 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}