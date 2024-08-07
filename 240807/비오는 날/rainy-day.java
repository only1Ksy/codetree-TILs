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
        LocalDate d1 = LocalDate.parse(r[0].date);

        for (int i = 0; i < n; i++){
            if (r[i].weather.equals("Rain")){
                d1 = LocalDate.parse(r[i].date);
                index = i;
                break;
            }
        }

        for (int i = 0; i < n; i++){
            if (r[i].weather.equals("Rain") && d1.isAfter(LocalDate.parse(r[i].date))){
                index = i;
            }
        }

        System.out.println(r[index].date + " " + r[index].day + " " + r[index].weather);
    }
}