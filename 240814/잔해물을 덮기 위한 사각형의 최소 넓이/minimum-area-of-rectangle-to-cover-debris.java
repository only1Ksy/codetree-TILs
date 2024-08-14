import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] arr = new int [2000][2000];

        //A의 넓이 입력
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        int x2 = input.nextInt();
        int y2 = input.nextInt();
            
        for (int j = x1 + 1000; j < x2 + 1000; j++){
            for (int k = y1 + 1000; k < y2 + 1000; k++){
                arr[j][k] += 1;
            }
        }
        

        //B의 넓이 제외
        int x11 = input.nextInt();
        int y11 = input.nextInt();

        int x22 = input.nextInt();
        int y22 = input.nextInt();
            
        for (int j = x11 + 1000; j < x22 + 1000; j++){
            for (int k = y11 + 1000; k < y22 + 1000; k++){
                arr[j][k] -= 1;
            }
        }
        
        //남은 구간 넓이의 합
        int firstIndexX = 0;
        int firstIndexY = 0;
        int lastIndexX = 0;
        int lastIndexY = 0;

        for (int j = 0; j < 2000; j++){
            for (int k = 0; k < 2000; k++){
                if (arr[j][k] > 0){
                    firstIndexX = j;
                    firstIndexY = k;
                    break;
                }            
            }
            if (firstIndexX != 0) break;
        }

        for (int j = 1999; j >= 0; j--){
            for (int k = 1999; k >= 0; k--){
                if (arr[j][k] > 0){
                    lastIndexX = j;
                    lastIndexY = k;
                    break;
                }            
            }
            if (lastIndexX != 0) break;
        }

        if (firstIndexX == 0 && firstIndexY == 0 && lastIndexX == 0 && lastIndexY == 0)
            System.our.println(0);
        else
            System.out.println((lastIndexX - firstIndexX + 1) * (lastIndexY - firstIndexY + 1));
        
    }
}