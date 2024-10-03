import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = 0;

        for (int i = 0; i < 1000; i++){
            for (int j = 0; j < 1000; j++){
                int temp = a * i + b * j;

                if (temp > c) continue;
                else max = Math.max(max, temp);
            }
        }

        System.out.println(max);
    }
}