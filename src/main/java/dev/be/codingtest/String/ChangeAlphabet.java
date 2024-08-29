package dev.be.codingtest.String;

import java.util.Scanner;

public class ChangeAlphabet {

    /*

    문제 : 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
    입력 : 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
    출력 : 첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.

    예제 : WrongAnswer -> wRONGaNSWER

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 입력 받기
        String alphabet = sc.next();

        // 알파벳 : 26개
        // A : 65
        // a : 97
        char [] arr = alphabet.toCharArray();
        for (char c : arr) {
            if('A' <= c && c <='Z') System.out.print((char)('a' + c - 'A'));
            else System.out.print((char)('A' + c - 'a'));
        }
    }
}
