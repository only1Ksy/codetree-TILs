import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arr = new int[200];

        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            for (int j = a+100; j <= b+100; j++){
                arr[j] += 1;
            }
        }

        int max = 0;

        for (int i = 0; i < 200; i++){
            if (max < arr[i])
                max = arr[i];
        }

        System.out.println(max);
    }
}