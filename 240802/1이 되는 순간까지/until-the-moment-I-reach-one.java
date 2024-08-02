import java.util.*;

public class Main {
    public static int calSum(int n){
        if (n == 1)
            return 0;

        if (n%2 == 0){
            return 1 + calSum(n/2);
        }
        else {
            return 1 + calSum(n/3);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(calSum(n));
    }
}