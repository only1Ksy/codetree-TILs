import java.util.*;

public class Main {
    public static int getSum(int n){
        if (n < 10)
            return n;

        return getSum(n/10) + n%10;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println(getSum(a*b*c));
    }
}