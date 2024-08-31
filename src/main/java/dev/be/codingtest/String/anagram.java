package dev.be.codingtest.String;

import java.util.Scanner;

public class anagram {

    /*
    문제

    두 영어 단어가 철자의 순서를 뒤바꾸어 같아질 수 있을 때, 그러한 두 단어를 서로 애너그램 관계에 있다고 한다.
    예를 들면 occurs 라는 영어 단어와 succor 는 서로 애너그램 관계에 있는데, occurs의 각 문자들의 순서를 잘 바꾸면 succor이 되기 때문이다.

    한 편, dared와 bread는 서로 애너그램 관계에 있지 않다. 하지만 dared에서 맨 앞의 d를 제거하고, bread에서 제일 앞의 b를 제거하면,
    ared와 read라는 서로 애너그램 관계에 있는 단어가 남게 된다.

    두 개의 영어 단어가 주어졌을 때, 두 단어가 서로 애너그램 관계에 있도록 만들기 위해서 제거해야 하는 최소 개수의 문자 수를 구하는 프로그램을 작성하시오.
    문자를 제거할 때에는 아무 위치에 있는 문자든지 제거할 수 있다.

    입력 : 첫째 줄과 둘째 줄에 영어 단어가 소문자로 주어진다. 각각의 길이는 1,000자를 넘지 않으며, 적어도 한 글자로 이루어진 단어가 주어진다.

    예제 입력
    aabbcc
    xxyybb

    예제 출력 : 8
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int[] countA = getAlphabetCount(a);
        int[] countB = getAlphabetCount(b);

        int answer = 0;

        for(int i = 0; i < 26; i++)
            answer += Math.abs(countA[i] - countB[i]); // 절댓값 함수

        System.out.println(answer);
    }

    public static int[] getAlphabetCount(String str) {
        int [] count = new int [26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }
}