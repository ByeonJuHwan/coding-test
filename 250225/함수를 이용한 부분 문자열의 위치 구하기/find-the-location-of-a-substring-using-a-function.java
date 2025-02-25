import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);

        String s = sc.next();
        String unit = sc.next();

        isBubun(s,unit);
    }

    private static void isBubun (String s, String unit){
        char [] arr = s.toCharArray();

        int result = -1;

        for(int i = 0; i<= arr.length - unit.length(); i++) {
            
            if (arr[i] == unit.charAt(0)) {
                result = i;

                for(int j = 0; j<unit.length(); j++) {
                    if(arr[i + j] != unit.charAt(j)) {
                        result = -1;
                        break;
                    }
                }

            }
        }

        System.out.print(result);
    }
}