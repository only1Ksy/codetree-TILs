import java.util.*;

public class Main {
    public static int fact(int n){
        if (n == 1)
            return 1;

        return fact(n - 1) * n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(fact(n));
    }
}