package dev.be.codingtest.bruteforce;

import java.util.Scanner;

public class EatCandy {
  public static int n;
  public static char[][] board;
  public static int maxCandy = 0;

  public static void main(String[] args) {
    // 입력 받기
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    board = new char[n][n];
    for (int i = 0; i < n; i++) {
        board[i] = sc.next().toCharArray();
    }

    checkMaxCandy();

    for(int i = 0; i < n; i++) {
      for (int j = 0; j < n - 1; j++) {
        swapCandy(i, j, i, j + 1);
        checkMaxCandy();
        swapCandy(i, j, i, j + 1);
      }
    }

    for (int i = 0; i < n - 1; i++) {
      for(int j = 0; j < n; j++) {
        swapCandy(i, j, i + 1, j);
        checkMaxCandy();
        swapCandy(i, j, i + 1, j);
      }
    }
    System.out.println(maxCandy);
  }

  private static void checkMaxCandy() {
    for(int i = 0; i < n; i++) {
      int count = 1;
      for(int j = 1; j < n; j++) {
        if (board[i][j] == board[i][j - 1]) count++;
        else {
          maxCandy = Math.max(maxCandy, count);
          count = 1;
        }
      }
      maxCandy = Math.max(maxCandy, count);
    }

    for(int j = 0; j < n; j++) {
      int count = 1;
      for(int i = 1; i < n; i++) {
        if (board[i][j] == board[i - 1][j]) {
          count++;
        } else {
          maxCandy = Math.max(maxCandy, count);
          count = 1;
        }
      }
      maxCandy = Math.max(maxCandy, count);
    }
  }

  private static void swapCandy(int i, int j, int i1, int j2) {
    char temp = board[i][j];
    board[i][j] = board[i1][j2];
    board[i1][j2] = temp;
  }
}
