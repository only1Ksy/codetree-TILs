import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        
        int sum = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    if (i < j && j < k && arr[i] <= arr[j] && arr[j] <= arr[k])
                        sum++;
                }
            }
        }

        System.out.println(sum);

    }
}