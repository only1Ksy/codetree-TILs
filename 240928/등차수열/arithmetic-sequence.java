import java.util.*;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        int min = INT_MAX;
        int max = 0;

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        for (int j = 0; j < n; j++) {
			for (int i = 0; i < n-1; i++) {
				int a = arr[i];
				if (a > arr[i + 1]) {
					arr[i] = arr[i + 1];
					arr[i + 1] = a;
				}
			}
        }
        
        int maxResult = 0;

        for (int i = min + 1; i < max; i++){
            int cnt = 0;

            for (int j = 0; j < n; j++){
                for (int k = j + 1; k < n; k++){
                    if (i < arr[j] || i > arr[k]) continue;

                    else if (i - arr[j] == arr[k] - i) cnt++;
                }
            }

            maxResult = Math.max(maxResult, cnt);
        }

        System.out.println(maxResult);

    }
}