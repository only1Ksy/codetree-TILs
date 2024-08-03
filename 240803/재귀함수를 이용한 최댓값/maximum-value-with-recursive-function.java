import java.util.*;

public class Main {
    public static int max;

    public static int maxVal(int[] arr, int n){
        if (n == 0)
            return max;

        if (arr[n] > max){
            max = arr[n];
            return maxVal(arr, n - 1);
        }
        else
            return maxVal(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(maxVal(arr, n-1));
    }
}