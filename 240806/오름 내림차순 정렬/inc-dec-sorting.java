import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Integer [] arr = new Integer[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}