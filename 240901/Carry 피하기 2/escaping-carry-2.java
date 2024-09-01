import java.util.*;

public class Main {
    public static boolean carryCk(int a, int b, int c){
        while (a > 0 || b > 0 || c > 0) {
            if (a % 10 + b % 10 + c % 10 >= 10)
                return false;
            a /= 10;
            b /= 10;
            c /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int max = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (carryCk(arr[i], arr[j], arr[k])) {
                        int sum = arr[i] + arr[j] + arr[k];
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);
    }
}