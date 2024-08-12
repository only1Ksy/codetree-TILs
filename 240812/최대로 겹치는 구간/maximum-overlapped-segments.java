//겹치는 >>지점<<과 겹치는 >>구간<< 구분
//구간의 경우에는 그것을 배열로 나타낼 때 x1부터 x2-1까지만 표시
//+) 주어지는 좌표가 음수일 수 있기 때문에, 최소한 음수 범위를 모두 양수로 만들 수 있는 수를 더해 시작
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arr = new int[200];

        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            for (int j = a+100; j < b+100; j++){
                arr[j] += 1;
            }
        }

        int max = 0;

        for (int i = 0; i < 200; i++){
            if (max < arr[i])
                max = arr[i];
        }

        System.out.println(max);
    }
}