import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        int minX = Integer.MAX_VALUE, maxX = 0;
        int minY = Integer.MAX_VALUE, maxY = 0;

        for (int i = 0; i < n; i++){
            x[i] = input.nextInt();
            y[i] = input.nextInt();

            maxX = Math.max(maxX, x[i]);
            minX = Math.min(minX, x[i]);
            maxY = Math.max(maxY, y[i]);
            minY = Math.min(minY, y[i]);
        }

        int min = Integer.MAX_VALUE;

        for (int i = minX + 1; i < maxX; i += 2){
            for (int j = minY + 1; j < maxY; j += 2){
                int[] numForPos = new int[4];
                int maxPoint = 0;

                for (int k = 0; k < n; k++){
                    if (x[k] > i && y[k] > j) {
                        numForPos[0]++;
                    } else if (x[k] > i && y[k] < j) {
                        numForPos[1]++;
                    } else if (x[k] < i && y[k] < j) {
                        numForPos[2]++;
                    } else if (x[k] < i && y[k] > j) {
                        numForPos[3]++;
                    }

                    // 가장 많은 점이 들어간 구역의 개수를 계산
                    maxPoint = Math.max(maxPoint, Math.max(Math.max(numForPos[0], numForPos[1]), Math.max(numForPos[2], numForPos[3])));
                }
                
                min = Math.min(min, maxPoint);
            }
        }

        System.out.println(min);
    }
}