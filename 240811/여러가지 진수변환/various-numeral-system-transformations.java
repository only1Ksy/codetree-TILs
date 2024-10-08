import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] digits = new int[20];
        int n = input.nextInt();
        int b = input.nextInt();
        int cnt = 0;

        while (n >= b){
            digits[cnt++] = n % b;
            n /= b;
        }

        digits[cnt++] = n;

        for(int i = cnt - 1; i >= 0; i--)
            System.out.print(digits[i]);
    }
}