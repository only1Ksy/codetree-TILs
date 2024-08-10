import java.util.*;

public class Main {
    public static int [] arr = new int [] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m1 = input.nextInt();
        int d1 = input.nextInt();
        int m2 = input.nextInt();
        int d2 = input.nextInt();

        int days = 1;

        for (int i = m2-1; i >= m1-1; i--){
            if (m1 != m2){
                if (i == m2-1)
                   days += d2;
                else if (i == m1-1)
                    days += arr[i] - d1;
                else
                    days += arr[i];
            }
            else {
                days += (d2 - d1);
            }
        }

        System.out.println(days);
    }
}