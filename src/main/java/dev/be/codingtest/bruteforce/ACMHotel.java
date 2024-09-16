package dev.be.codingtest.bruteforce;

import java.util.Scanner;

public class ACMHotel {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int H = sc.nextInt();
      int W = sc.nextInt();
      int N = sc.nextInt();

      int flow = ((N - 1) % H) + 1;
      int room = (N - 1) / H + 1;

      StringBuilder sb = new StringBuilder();
      sb.append(flow);

      if (room < 10) {
        sb.append("0");
        sb.append(room);
      }else sb.append(room);

      System.out.println(sb);
    }
  }
}
