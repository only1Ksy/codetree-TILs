import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int [] num = new int[n];
        int [] pla = new int[n];
        int [] arr = new int[100 + 1];

        for (int i = 0; i < n; i++){
            num[i] = input.nextInt();
            pla[i] = input.nextInt();

            arr[pla[i]] += num[i];
        }

        int max = 0;
    
        for (int i = 0 + k; i <= 100 - k; i++){
            int sum = 0;

            for (int j = i-k; j <= i+k; j++){
                sum += arr[j];
            }

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}