import java.util.*;
// 결정하기 애매한 경우에는 모든 경우에 대해 탐색을 진행한다
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = input.nextInt();
            b[i] = input.nextInt();
        }

        int min = Integer.MAX_VALUE;
        // 가능한 양의 정수 x값 중 최솟값을 구하기
        for (int i = 0; i < 10000; i++){
            boolean isTrue = true;
            int num = i;

            for (int j = 0; j < n; j++){
                if (num * Math.pow(2, j+1) < a[j] || num * Math.pow(2, j+1) > b[j]){
                    isTrue = false;
                    break;
                }
            }
            if (isTrue){
                    min = num;
                    break;
            }
        }

        System.out.println(min);
    }
}