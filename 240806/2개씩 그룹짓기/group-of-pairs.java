import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [] arr = new int[2*n];
        int [] arr1 = new int[n];

        for (int i = 0; i < 2*n; i++){
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++){
            arr1[i] = arr[i]+arr[i*2];
        }

        Arrays.sort(arr1);

        System.out.println(arr1[n-1]);
    }
}