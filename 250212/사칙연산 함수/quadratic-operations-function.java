import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String o = sc.next();
        int c = sc.nextInt();


        boolean contains = false;

        String [] arr = {"+", "-" , "/", "*"};

        for(String s : arr) {
            if(o.equals(s)) {
                contains = true;
                break;
            }
        }

        if(contains == false) {
            System.out.print("False");
            return;
        }


        // 연산식 로직

        if(o.equals(arr[0])) {
            System.out.print(printPlus(a,o,c));
            return;
        }


        if(o.equals(arr[1])) {
            System.out.print(printMinus(a,o,c));
            return;
        }

        if(o.equals(arr[2])) {
            System.out.print(printDevide(a,o,c));
            return;
        }

        if(o.equals(arr[3])) {
            System.out.print(printMultiple(a,o,c));
            return;
        }
    }


    public static String printPlus (int a, String o, int c) {
        int d = a + c;
        return String.format("%d %s %d = %d", a,o,c,d);
    }

    public static String printMinus (int a, String o, int c) {
        int d = a - c;
        return String.format("%d %s %d = %d", a,o,c,d);
    }

        public static String printDevide (int a, String o, int c) {
        int d = (int)a / c;
        return String.format("%d %s %d = %d", a,o,c,d);
    }

        public static String printMultiple (int a, String o, int c) {
        int d = a * c;
        return String.format("%d %s %d = %d", a,o,c,d);
    }
}