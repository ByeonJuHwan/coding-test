import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int [n][m];

        // 0,0 부터 시작
        // 가로로 증가 1번 다음 대각선으로 내려가는데 if 문으로 걸릴시 다시 가로로
        // 근데 가로가 없으면 i 만 하나 내려서 다시 시작

        int num = 1;

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(arr[i][j] == 0) {

                    int currCol = j;
                    int currRow = i;

                    while(currRow<n && 0<=currCol) {
                        arr[currRow][currCol] = num;

                        num ++;
                        currRow++;
                        currCol--;
                    }   
                }
            }
        }
    
        for(int i = 0; i< n; i++) {
            for(int j = 0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

}