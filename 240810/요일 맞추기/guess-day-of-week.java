import java.util.*;

public class Main {
    public static int [] arr = new int [] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String [] dd = new String [] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static int getD (int m, int d) {
        int days = 0;

        for (int i = 0; i < m-1; i++){
            days += arr[i];
        }

        return days + d;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m1 = input.nextInt();
        int d1 = input.nextInt();
        int m2 = input.nextInt();
        int d2 = input.nextInt();

        int d = getD(m2, d2) - getD(m1, d1);

        int result = d % 7;

        if (result < 0)
            System.out.println(dd[7 + result]);
        
        else
            System.out.println(dd[result]);        
    }
}