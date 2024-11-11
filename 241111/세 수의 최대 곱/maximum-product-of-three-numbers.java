import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        int result = Math.max(arr[0] * arr[1] * arr[n-1], arr[n-1] * arr[n-2] * arr[n-3]);

        System.out.println(result);
    }
}