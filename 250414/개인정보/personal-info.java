import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];
        Human [] arr = new Human[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();

            arr[i] = new Human(names[i], heights[i], weights[i]);
        }
        // Please write your code here.

        // 이름 순 정렬
        Arrays.sort(arr, (a,b) -> a.name.compareTo(b.name));
        System.out.println("name");
        for(Human h : arr) {
            System.out.println(h.name + " " + h.height + " " + h.weight);
        }

       System.out.println();

        // 키 순서
        System.out.println("height");
        Arrays.sort(arr, (a,b) -> b.height - a.height);
        for(Human h : arr) {
            System.out.println(h.name + " " + h.height + " " + h.weight);
        }

    }
}


class Human {
    String name;
    int height;
    double weight;


    public Human (String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}