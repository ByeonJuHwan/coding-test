package dev.be.codingtest.bruteforce;

import java.io.*;
import java.util.Scanner;

public class Eureka {

    static boolean[] isEurekaNumber = new boolean[1001];

    public static void preprocess() {
        // 1. k 보다 작은 삼각수를 모두 구한다
        int[] triangleNumbers = new int[50];
        int triangleNumberCount = 0;
        for (int i = 1; ; i++) {
            int triangleNumber = i * (i + 1) / 2;
            if(triangleNumber >= 1000) break;
            triangleNumbers[triangleNumberCount++] = triangleNumber;
        }
        // 2. 구해진 삼각수 세개의 합으로 K 를 나타낼 수 있는지 확인한다.
        boolean[] isSumOfTriangleNumber = new boolean[1001];
        for(int i = 0; i < triangleNumberCount; i++) {
            for(int j = 0; j < triangleNumberCount; j++) {
                int sum = triangleNumbers[i] + triangleNumbers[j];
                if (sum < 1000) isSumOfTriangleNumber[sum] = true;
            }
        }

        for (int i = 1; i < 1000; i++) {
            if(!isSumOfTriangleNumber[i]) continue;
            for(int j = 0; j < triangleNumberCount; j++) {
                int sum = i + triangleNumbers[j];
                if (sum <= 1000) isEurekaNumber[sum] = true;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        preprocess();

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int k = sc.nextInt();
            System.out.println(isEurekaNumber[k] ? "1" : "0");
        }
    }
}
