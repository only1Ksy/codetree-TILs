import java.util.*;
import java.time.LocalDate;

class Rain{
    String date;
    String day;
    String weather;

    public Rain(){}

    public Rain(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        Rain [] r = new Rain[n];

        for (int i = 0; i < n; i++){
            String d = input.next();
            String da = input.next();
            String w = input.next();

            r[i] = new Rain(d, da, w);
        }

        int index = 0;
        LocalDate nearest = null;
        Rain ra = null;

        for (int i = 0; i < n; i++){
            if (r[i].weather.equals("Rain")){
                LocalDate d2 = LocalDate.parse(r[i].date);
                if (nearest == null || d2.isBefore(nearest)){ //처음 rain인 날을 찾았거나, 방금 찾은 rain인 날이
                    nearest = d2;                             //이전에 찾았던 것보다 앞서면, 가장 근접 날짜를 변경
                    ra = r[i];
                }
            }
        }

        System.out.println(ra.date + " " + ra.day + " " + ra.weather);
    }
}