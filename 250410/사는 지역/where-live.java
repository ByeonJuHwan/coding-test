import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
        }
        // Please write your code here.
        
        Info [] arr = new Info [n];

        for(int i = 0; i<n; i++) {
            arr[i] = new Info(names[i], addresses[i], regions[i]);
        }

        Arrays.sort(names);

        String answerName = names[n-1];

        Info answerInfo = new Info();

        for(int i = 0; i<n; i++) {
            if(answerName.equals(arr[i].name)) {
                answerInfo = arr[i];
            }
        }

        System.out.println("name " + answerInfo.name);
        System.out.println("addr " + answerInfo.address);
        System.out.println("city " + answerInfo.region);
    }
}

class Info {
    String name;
    String address;
    String region;

    public Info () {}

    public Info (String name, String address, String region) {
        this.name = name;
        this.address = address;
        this.region = region;
    }
}