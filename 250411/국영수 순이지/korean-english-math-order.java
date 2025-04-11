import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            korean[i] = sc.nextInt();
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();
        }
        // Please write your code here.

        Student [] arr = new Student [n];

        for(int i =0; i<n; i++) {
            arr[i] = new Student(names[i], korean[i], english[i], math[i]);
        }

        Arrays.sort(arr, (a,b) -> {
            if(a.kor == b.kor) {
                if(a.eng == b.eng) {
                    return b.math - a.math;
                }
                return b.eng - a.eng;
            }
            return b.kor - a.kor;
        });

        for(Student s : arr) {
            System.out.println(s.name + " " + s.kor + " " + s.eng + " " + s.math);
        }
    }
}

class Student {
    String name;
    int kor;
    int eng;
    int math;

    public Student (String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}