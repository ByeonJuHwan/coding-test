package dev.be.codingtest.array;

import java.io.*;

public class AddTwoNum {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        int [] numArr = new int[2000001];

        String[] arr = bf.readLine().split(" ");
        int x = Integer.parseInt(bf.readLine());

        for (String s : arr) numArr[Integer.parseInt(s)]++;

        int answer = 0;
        for(int i = 0; i < n; i++) { // cha가 음수인경우 안됨 // cha가 100000이고 x가 2000000 일때 1900000
            int cha = x - Integer.parseInt(arr[i]);
            if (cha >= 0 && numArr[cha] > 0) {
                answer++;
            }
        }
        bw.write(answer/2 + "\n");
        bw.flush();
    }
}
