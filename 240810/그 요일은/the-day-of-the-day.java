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
        input.nextLine();
        String a = input.nextLine();

        int d = getD(m2, d2) - getD(m1, d1) + 1;

        int index = 0;

        for (int i = 0; i < 7; i++){
            if (a.equals(dd[i])){
                index = i;
                break;
            }
        }

        int result = d/7;

        int rest = d%7;

        if (rest >= index)
            result += 1;

        System.out.println(result);

    }
}