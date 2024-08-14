import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] arr = new int [200][200];

        int n = input.nextInt();

        //n 개의 사각형 넓이 입력
        for (int i = 0; i < n; i++){
            int x1 = input.nextInt();
            int y1 = input.nextInt();

            int x2 = input.nextInt();
            int y2 = input.nextInt();
            
            //파란색 = 1
            if (i % 2 != 0){
                for (int j = x1 + 100; j < x2 + 100; j++){
                    for (int k = y1 + 100; k < y2 + 100; k++){
                        arr[j][k] = 1;
                    }
                }
            }
            //빨간색 = 2
            else {
                for (int j = x1 + 100; j < x2 + 100; j++){
                    for (int k = y1 + 100; k < y2 + 100; k++){
                        arr[j][k] = 2;
                    }
                }
            }
            
        }

        //파란색 영역의 전체 구간 넓이의 합
        int sum = 0;

        for (int j = 0; j < 200; j++){
            for (int k = 0; k < 200; k++){
                if (arr[j][k] == 1)
                    sum++;
            }
        }

        System.out.println(sum);
        
    }
}