import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Weather [] arr = new Weather [n];

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.

            Weather info = new Weather(date,day, weather);
            arr[i] = info;
        }

        int fastIndex = -1;
        for(int i = 0; i<arr.length; i++) {
            if(fastIndex < 0 && arr[i].weather.equals("Rain")) {
                fastIndex = i;
                continue;
            }

            if(arr[i].weather.equals("Rain") && arr[i].date.compareTo(arr[fastIndex].date)<0) {
                fastIndex = i;
            }
        }

        System.out.print(arr[fastIndex].date + " " + arr[fastIndex].day + " " + arr[fastIndex].weather);
    }
}

class Weather {
    String date;
    String day;
    String weather;

    public Weather () {}

    public Weather (String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}