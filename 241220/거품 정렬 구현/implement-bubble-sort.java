import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}