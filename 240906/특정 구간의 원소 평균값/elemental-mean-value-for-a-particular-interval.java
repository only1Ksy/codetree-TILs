import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int num = 0;

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int sum = 0;
                int mid = 0;

                for (int k = i; k <= j; k++){
                    sum += arr[k];
                }

                mid = sum/(j - i + 1);

                for (int k = 0; k < n; k++){
                    if (mid == arr[k]){
                        num++;
                        break;
                    }
                }
            }
        }

        System.out.println(num);
    }
}