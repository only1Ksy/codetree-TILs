import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
            minValue = Math.min(minValue, arr[i]);
            maxValue = Math.max(maxValue, arr[i]);
        }

        int min = Integer.MAX_VALUE;
        int sub = (maxValue - minValue - 17)/2;
        sub *= sub;

        min = 2*sub;

        // 조정할 요소 두 개 선택해 주기
        /*for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                int sum = 0;


                min = Math.min(min, sum);
            }
        }*/
        
        System.out.println(min);
    }
}