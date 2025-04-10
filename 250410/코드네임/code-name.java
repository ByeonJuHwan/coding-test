import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.

        User [] arr = new User[5];


        for(int i = 0; i<5; i++) {
            String name = sc.next();
            int score = sc.nextInt();

            User user = new User(name, score);
            arr[i] = user;
        }
        
        int min = 200;
        User answer = new User();

        for(User user: arr){
            if(user.score < min) {
                min = user.score;
                answer = user;
            }
        }

        System.out.print(answer.name + " " + answer.score);
    }
}

class User {
    String name;
    int score;

    public User () {}

    public User(String name, int score) {
        this.name = name;
        this.score = score;
    }
}