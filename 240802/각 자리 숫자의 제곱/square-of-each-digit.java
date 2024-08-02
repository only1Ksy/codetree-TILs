import java.util.*;

public class Main {
    public static int squareSum(int n){
        if (n < 10)
            return n*n;
        
        return squareSum(n/10) + (n%10)*(n%10);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.print(squareSum(n));
    }
}