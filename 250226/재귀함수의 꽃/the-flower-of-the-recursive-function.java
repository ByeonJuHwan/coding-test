import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        printReverseNum(n);
    }

    private static void printReverseNum (int n){
        if(n == 0) return;
        
        System.out.print(n + " ");
        printReverseNum (n -1);
        System.out.print(n + " ");
    }
}