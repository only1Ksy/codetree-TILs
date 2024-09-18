import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] p = new int[n];
        int b = input.nextInt();

        for (int i = 0; i < n; i++){
            p[i] = input.nextInt();
        }

        int max = 0;

        // 할인을 받을 학생을 선택
        for (int i = 0; i < n; i++){
            int sum = 0;
            int pp = 0;

            for (int j = 0; j < n; j++){
                if (i == j) {
                    if (p[j] % 2 == 0){
                        sum += p[j]/2;
                        if (sum <= b) pp++;
                        else sum -= p[j]/2;
                    }
                } else {
                    sum += p[j];
                    if (sum <= b) pp++;
                    else sum -= p[j];
                }
            }
            
            max = Math.max(max, pp);
        }

        System.out.println(max);
    }
}