import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[3][3];
        int[] arrTemp = new int[3];

        arrTemp[0] = input.nextInt();
        arrTemp[1] = input.nextInt();
        arrTemp[2] = input.nextInt();

        int cnt = 0;

        // 틱택토 배열 생성
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                arr[i][j] = arrTemp[i] % 10;

                arrTemp[i] /= 10;
            }
        }

        // 팀 짜기 반복문
        for (int i = 1; i < 10; i++){
            for (int j = i + 1; j < 10; j++){
                boolean willWin = false;

                // 가로
                for (int k = 0; k < 3; k++){
                    int iNum = 0;
                    int jNum = 0;

                    for (int l = 0; l < 3; l++){
                        if (arr[k][l] == i) iNum++;
                        else if (arr[k][l] == j) jNum++;
                    }

                    if ((iNum == 1 && jNum == 2) || (iNum == 2 && jNum == 1))
                        willWin = true;
                }

                // 세로
                if (!willWin){
                    for (int k = 0; k < 3; k++){
                        int iNum = 0;
                        int jNum = 0;

                        for (int l = 0; l < 3; l++){
                            if (arr[l][k] == i) iNum++;
                            else if (arr[l][k] == j) jNum++;
                        }

                        if ((iNum == 1 && jNum == 2) || (iNum == 2 && jNum == 1))
                            willWin = true;
                    }
                }

                // 사선
                if (!willWin){
                    int iNum1 = 0;
                    int jNum1 = 0;
                    int iNum2 = 0;
                    int jNum2 = 0;

                    if (arr[1][1] == i){
                        iNum1++; iNum2++;
                    }
                    else if (arr[1][1] == j) {
                        jNum1++; jNum2++;
                    } 
                    if (arr[0][0] == i){
                        iNum1++;
                    }
                    else if (arr[0][0] == j) {
                        jNum1++;
                    }
                    if (arr[2][2] == i){
                        iNum1++;
                    }
                    else if (arr[2][2] == j) {
                        jNum1++;
                    }
                    if (arr[0][2] == i){
                        iNum2++;
                    }
                    else if (arr[0][2] == j) {
                        jNum2++;
                    }
                    if (arr[2][0] == i){
                        iNum2++;
                    }
                    else if (arr[2][0] == j) {
                        jNum2++;
                    }                   

                    if ((iNum1 == 1 && jNum1 == 2) || (iNum1 == 2 && jNum1 == 1)
                        || (iNum2 == 1 && jNum2 == 2) || (iNum2 == 2 && jNum2 == 1))
                        willWin = true;
                }

                if (willWin) cnt++;
            }
        }

        System.out.println(cnt);
    }
}