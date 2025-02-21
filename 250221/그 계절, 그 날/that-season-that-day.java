import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner (System.in);

        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        // 1 윤년인지 확인
        boolean isYoonYear = isYoon(Y);

        // 2 윤년이라면 2월이 29일까지 있는지 확인하고 아니면 28일이므로 
        // 해당 날짜가 존재하는지 확인

        if(isNotExist(isYoonYear, M, D)){
            System.out.print(-1);
            return;
        }

        // 3 무조건 이제 있으므로 계절 출력
        printWheather(M);
    }

    private static boolean isYoon (int year){
        boolean result = false;

        if(year % 4 == 0) result = true;
        if(year % 4 == 0 && year % 100 == 0) result = false;
        if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) result = true;
        
        return result;
    }

    private static boolean isNotExist (boolean isYoonYear , int month, int day){
        if(day > getMontyDay(isYoonYear, month)) return true;
        return false;
    }

    private static int getMontyDay(boolean isYoonYear, int month) {
        if(month == 2 && isYoonYear == true) return 29;
        if(month == 2 && isYoonYear == false) return 28;
        if(month == 4 || month == 6 || month ==9 || month == 11) return 30;
        return 31; 
    }

    private static void printWheather (int month) {
        if(month>= 3 && month <=5) System.out.print("Spring");
        else if (month >= 6 && month <= 8 ) System.out.print("Summer");
        else if (month >=9 && month <= 11) System.out.print("Fall");
        else System.out.print("Winter");
    }
}