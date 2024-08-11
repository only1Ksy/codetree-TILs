import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] digits = new int[20];
        int n = input.nextInt();
        int cnt = 0;

        while (n >= 2){
            digits[cnt++] = n % 2;
            n /= 2;
        }

        digits[cnt++] = n;

        for(int i = cnt - 1; i >= 0; i--)
            System.out.print(digits[i]);
    }
}