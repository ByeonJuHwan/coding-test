import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        Human [] arr = new Human [n];

        for(int i = 0; i<n; i ++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr[i] = new Human(name,height,weight);
        }

        Arrays.sort(arr, (a,b) -> a.height - b.height);

        for(Human h : arr) {
            System.out.println(h.name + " " + h.height + " " + h.weight);

        }
    }
}

class Human {
    String name;
    int height;
    int weight;


    public Human (String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}