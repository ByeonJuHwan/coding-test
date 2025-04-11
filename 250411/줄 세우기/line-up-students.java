import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];
        Human [] arr = new Human [n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            arr[i] = new Human(height[i], weight[i], i + 1);
        }
        // Please write your code here.

        Arrays.sort(arr, (a,b) -> {
            if(a.height != b.height) return b.height - a.height;
            if(a.weight != b.weight) return b.weight - a.weight;
            return a.number - b.number;
        });

        for(Human h : arr) {
            System.out.println(h.height + " " + h.weight + " " + h.number);
        }
    }
}

class Human {
    int height;
    int weight;
    int number;


    public Human (int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }
}