import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int num = 1;
        for(int j = n-1; j >= 0; j--) {

            if(n % 2 == 0) {
                if(j%2 == 0) { // 홀수 열
                    for(int i = 0; i < n; i++) {
                        arr[i][j] = num++;
                    }
                } else { // 짝수 열
                    for(int i = n-1; i >= 0; i--) {
                        arr[i][j] = num++;
                    }
                }
            }
            else {
                if(j%2 == 1) { // 홀수 열
                    for(int i = 0; i < n; i++) {
                        arr[i][j] = num++;
                    }
                } else { // 짝수 열
                    for(int i = n-1; i >= 0; i--) {
                        arr[i][j] = num++;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}