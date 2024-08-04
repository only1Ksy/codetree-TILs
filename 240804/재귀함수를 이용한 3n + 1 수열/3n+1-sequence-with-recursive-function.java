import java.util.*;

public class Main {
    public static int calNum(int n){
        if (n == 1)
            return 0;

        if (n%2 == 0)
            return 1 + calNum(n/2);
        else
            return 1 + calNum(n*3 + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(calNum(n));
    }
}