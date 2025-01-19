import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printRectangle(n);
    }

    public static void printRectangle(int n) {
        int value = 1;

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                System.out.print(value + " ");
                value++;

                if(value == 10) value = 1;
            }
            System.out.println();
        }
    }
}