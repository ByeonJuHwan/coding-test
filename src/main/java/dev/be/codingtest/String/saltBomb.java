package dev.be.codingtest.String;

import java.util.Scanner;

public class saltBomb {

    /*
    문제

    철수는 화학 시험을 망치고, 애꿎은 화학 선생님에게 복수를하기로 한다.
    철수는 집에서 만든 자동 로봇팔을 선생님의 책상에 숨겨, 선생님이 수업을 시작하려 들어온 순간 숨겨놓은 로봇팔을 이용해 선생님을 혼내주려고한다.
    철수는 선생님이 늘 애용하는 물컵에 시간이 되면 로봇팔이 소금을 잔뜩 집어넣도록 프로그램을 짜려고한다.
    철수는 현재시각과 선생님이 언제 컵을 사용할지 시간을 알고있지만, 수 계산에 정말 약해서 로봇팔에 입력해야할 시간 계산을 못한다. 철수가 로봇팔에 알맞은 시간을 입력할수 있도록 도와주자.

    입력
    첫째 줄에는 현재 시각이 hh:mm:ss로 주어진다. 시간의 경우 0≤h≤23 이며, 분과 초는 각각 0≤m≤59, 0≤s≤59 이다.
    두 번째 줄에는 소금 투하의 시간이 hh:mm:ss로 주어진다.

    출력

    로봇팔이 소금을 투하할때까지 필요한 시간을 hh:mm:ss로 출력한다. 이 시간은 1초보다 크거나 같고, 24시간보다 작거나 같다.

    예제입력
    20:00:00
    04:00:00

    출력
    08:00:00
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String current = sc.next();
        String drop = sc.next();

        String[] currentUnit = current.split(":");
        int currentHour = Integer.parseInt(currentUnit[0]);
        int currentMin = Integer.parseInt(currentUnit[1]);
        int currentSec = Integer.parseInt(currentUnit[2]);

        int currentSecondAmount = currentHour * 3600 + currentMin * 60 + currentSec;

        String[] dropUnit = drop.split(":");
        int dropHour = Integer.parseInt(dropUnit[0]);
        int dropMin = Integer.parseInt(dropUnit[1]);
        int dropSec = Integer.parseInt(dropUnit[2]);

        int dropSecondAmount = dropHour * 3600 + dropMin * 60 + dropSec;


        int needSecondAmount = dropSecondAmount - currentSecondAmount;
        if(needSecondAmount <= 0) needSecondAmount += 24 * 3600;

        int needHour = needSecondAmount / 3600;
        int needMin = (needSecondAmount % 3600) / 60;
        int needSec = needSecondAmount % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMin, needSec);
    }
}
