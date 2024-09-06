package dev.be.codingtest.array;

import java.util.Map;
import java.util.Scanner;

public class BlockCastle {

    /*
    문제

    영식이는 직사각형 모양의 성을 가지고 있다. 성의 1층은 몇 명의 경비원에 의해서 보호되고 있다.
    영식이는 모든 행과 모든 열에 한 명 이상의 경비원이 있으면 좋겠다고 생각했다.
    성의 크기와 경비원이 어디있는지 주어졌을 때, 몇 명의 경비원을 최소로 추가해야 영식이를 만족시키는지 구하는 프로그램을 작성하시오.

    입력

    첫째 줄에 성의 세로 크기 N과 가로 크기 M이 주어진다. N과 M은 50보다 작거나 같은 자연수이다.
    둘째 줄부터 N개의 줄에는 성의 상태가 주어진다. 성의 상태는 .은 빈칸, X는 경비원이 있는 칸이다.

    출력 : 첫째 줄에 추가해야 하는 경비원의 최솟값을 출력한다.


     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rec = sc.nextLine();
        int n = Integer.parseInt(rec.split(" ")[0]);
        int m = Integer.parseInt(rec.split(" ")[1]);

        char[][] map = new char[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = sc.next().toCharArray();
        }


        boolean[] existRow = new boolean[n];
        boolean[] existCol = new boolean[m];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j] == 'X') {
                    existRow[i] = true;
                    existCol[j] = true;
                }
            }
        }

        int needRowCount = n;
        int needColCount = m;

        for(int i = 0; i < n; i++) {
            if(existRow[i]) needRowCount--;
        }
        for (int i = 0; i < m; i++) {
            if(existCol[i]) needColCount--;
        }

        System.out.println(Math.max(needColCount, needRowCount));
    }
}
