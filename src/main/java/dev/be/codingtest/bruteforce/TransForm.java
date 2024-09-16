package dev.be.codingtest.bruteforce;

import java.io.*;

public class TransForm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int other = n % b;
            if(other<10) sb.append(other);
            else sb.append((char) ('A' + other - 10));
            n /= b;
        }
        bw.write(sb.reverse().toString());
        bw.flush();
    }
}
