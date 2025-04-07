import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String answer = "Yes";
        if(arr1.length != arr2.length) {
            answer = "No";
            System.out.print(answer);
            return;
        }

        
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]) {
                answer = "No";
                break;
            }
        }

        System.out.print(answer);
    }
}