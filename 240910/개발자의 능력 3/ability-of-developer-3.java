import java.util.*;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arr = new int[6];

        int allSum = 0;

        for (int i = 0; i < 6; i++){
            arr[i] = input.nextInt();

            allSum += arr[i];
        }

        int min = INT_MAX;

        for (int i = 0; i < 6; i++){
            for (int j = i+1; j < 6; j++){
                for (int k = j+1; k < 6; k++){
                    int aSum = arr[i] + arr[j] + arr[k];
                    int bSum = allSum - aSum;

                    min = Math.min(min, Math.abs(aSum - bSum));
                }
            }
        }

        System.out.println(min);
    }
}