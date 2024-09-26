import java.util.*;
// 어떤 점을 기준으로 그 이상/이하의 값이 지속적으로 동일한 경우
// 탐색을 해당 범위 내로만 진행해도 됨
public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int c = input.nextInt();
        int g = input.nextInt();
        int h = input.nextInt();

        int[] ta = new int[n];
        int[] tb = new int[n];

        int min = INT_MAX;
        int max = 0;
        int finalMax = 0;

        for (int i = 0; i < n; i++){
            ta[i] = input.nextInt();
            tb[i] = input.nextInt();

            min = Math.min(min, ta[i]);
            max = Math.max(max, tb[i]);
        }

        for (int i = min; i <= max; i++){
            int score = 0;
            
            for (int j = 0; j < n; j++){
                if (i < ta[j]) score += c;
                else if (i >= ta[j] && i <= tb[j]) score += g;
                else score += h;
            }

            finalMax = Math.max(finalMax, score);
        }

        System.out.println(finalMax);
    }
}