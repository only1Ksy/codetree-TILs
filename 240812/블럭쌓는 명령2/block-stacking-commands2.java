import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [] arr = new int[n];

        int k = input.nextInt();

        for (int i = 0; i < k; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            for (int j = a; j <= b; j++){
                arr[j] += 1;
            }
        }

        int max = 0;

        for (int i = 0; i < n; i++){
            if (max < arr[i])
                max = arr[i];
        }

        System.out.println(max);
    }
}