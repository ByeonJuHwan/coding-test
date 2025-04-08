import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        List<String> filtered = new ArrayList<>();
        // Please write your code here.

        String answer = "";        

        for(int i=0; i<words.length; i++) {

            boolean isSame = true;

            for(int j = 0; j<t.length(); j++) {
                if(words[i].charAt(j) != t.charAt(j)) {
                    isSame = false;
                    break;
                }
            }

            if(isSame == true) {
                filtered.add(words[i]);
            }
        }

        String[] answerArray = new String[filtered.size()];

        for(int i = 0; i<filtered.size(); i++){
            answerArray[i] = filtered.get(i);
        }

        Arrays.sort(answerArray);

        System.out.print(answerArray[k-1]);

    }
}