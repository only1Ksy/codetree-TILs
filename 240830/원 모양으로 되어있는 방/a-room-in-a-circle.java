import java.util.*;

public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;
    public static final int INT_MAX = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int min = INT_MAX;

        //i방에서 시작
        for (int i = 0; i < n; i++){
            int sum = 0;

            for (int j = 0; j < n; j++){
                //i와의 거리 * 가야 하는 인원수
                sum += (j - i + n) % n * arr[j];
            }

            min = Math.min(min, sum);
        }

        System.out.println(min);
    }
}