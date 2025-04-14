import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];

        Dot [] arr = new Dot[n];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
            arr[i] = new Dot(points[i][0], points[i][1],i+1);
        }
        // Please write your code here.

        Arrays.sort(arr, (a,b) -> {
            if(((a.x * a.x) + (a.y * a.y)) == ((b.x * b.x) + (b.y * b.y))) {
                return a.num - b.num;
            }
            return ((a.x * a.x) + (a.y * a.y)) - ((b.x * b.x) + (b.y * b.y));
        });

        for(Dot d : arr) {
            System.out.println(d.num);
        }
        
    }
}

class Dot {
    int x;
    int y;
    int num;

    public Dot (int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
    }
}