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
        int minX = 2000, minY = 2000, maxX = 0, maxY = 0;

        for (int j = 0; j < 2000; j++) {
            for (int k = 0; k < 2000; k++) {
                if (arr[j][k] > 0) {
                    if (j < minX) minX = j;
                    if (j > maxX) maxX = j;
                    if (k < minY) minY = k;
                    if (k > maxY) maxY = k;
                }
            }
        }


        if (maxX == 0 && minX == 2000 && maxY == 0 && minY == 2000)
            System.out.println(0);
        else
            System.out.println((maxX - minX + 1) * (maxY - minY + 1));
        
    }
}