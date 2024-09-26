import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        int max = 0;

        for (int i = x; i <= y; i++){
            int sum = 0;
            int val = i;

            while (val > 0){
                sum += val%10;
                val /= 10;
            }

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}