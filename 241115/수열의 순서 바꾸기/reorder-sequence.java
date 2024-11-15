import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();  
        }

        int maxLength = Integer.MIN_VALUE;
        int tempLength = 1;

        // 가장 긴 오름차순 수열을 찾기
        for (int i = 0; i < n - 1; i++){
            if (arr[i] + 1 == arr[i + 1]) tempLength++;
            else {
                maxLength = Math.max(maxLength, tempLength);
                tempLength = 1;
            }
        }

        System.out.println(n - tempLength);
    }
}