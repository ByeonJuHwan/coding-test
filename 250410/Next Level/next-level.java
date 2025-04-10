import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.

        User user1 = new User();
        User user2 = new User(id, level);
    }
}

class User {
    String id;
    int level;

    public User() {
        System.out.println("user codetree lv 10");
    }

    public User(String id, int level) {
        this.id = id;
        this.level = level;


        System.out.println("user "+ this.id + " lv " + this.level);
    }
}