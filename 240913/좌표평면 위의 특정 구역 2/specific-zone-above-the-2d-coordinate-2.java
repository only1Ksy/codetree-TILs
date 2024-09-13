import java.util.*;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [][] arr = new int[n][2]; // {x, y}

        for (int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
                arr[i][j] = input.nextInt();
            }
        }

        int min = INT_MAX;

        // 뺄 점을 구하는 반복문
        for (int i = 0; i < n; i++){
            int minX = INT_MAX;
            int maxX = INT_MIN;
            int minY = INT_MAX;
            int maxY = INT_MIN;

            //각 경우의 수를 구하는 반복문
            for (int j = 0; j < n; j++){
                if (i == j) continue; //i점은 빼고 계산

                minX = Math.min(minX, arr[j][0]);
                maxX = Math.max(maxX, arr[j][0]);
                minY = Math.min(minY, arr[j][1]);
                maxY = Math.max(maxY, arr[j][1]);
            }

            min = Math.min(min, ((maxX - minX) * (maxY - minY)));
        }

        System.out.println(min);
    }
}