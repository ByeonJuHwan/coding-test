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
            int distA = Math.abs(a.x) + Math.abs(a.y);
            int distB = Math.abs(b.x) + Math.abs(b.y);
            
            if(distA == distB) {
                return a.num - b.num;
            }
            return distA - distB;
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