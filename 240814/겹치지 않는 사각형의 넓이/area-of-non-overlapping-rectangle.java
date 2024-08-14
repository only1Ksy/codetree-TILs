import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] arr = new int [2000][2000];

        //A, B의 넓이 입력
        for (int i = 0; i < 2; i++){
            int x1 = input.nextInt();
            int y1 = input.nextInt();

            int x2 = input.nextInt();
            int y2 = input.nextInt();
            
            for (int j = x1 + 1000; j < x2 + 1000; j++){
                for (int k = y1 + 1000; k < y2 + 1000; k++){
                    arr[j][k] += 1;
                }
            }
        }

        //M의 넓이 제외
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        int x2 = input.nextInt();
        int y2 = input.nextInt();
            
        for (int j = x1 + 1000; j < x2 + 1000; j++){
            for (int k = y1 + 1000; k < y2 + 1000; k++){
                arr[j][k] -= 1;
            }
        }
        
        //남은 구간 넓이의 합
        int sum = 0;

        for (int j = 0; j < 2000; j++){
            for (int k = 0; k < 2000; k++){
                if (arr[j][k] > 0)
                    sum++;
            }
        }

        System.out.println(sum);
        
    }
}