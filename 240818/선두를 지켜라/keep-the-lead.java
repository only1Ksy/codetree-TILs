import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int [] arrA = new int[1000000];
        int [] arrB = new int[1000000];

        //A의 위치 변화 배열에 저장하기
        int index = 0;
        int value = 0;

        for (int i = 0; i < n; i++){
            int v = input.nextInt();
            int t = input.nextInt();

           for (int j = 0; j < t; j++){
                value += v;
                arrA[index++] = value;
            }
        }

        //B의 위치 변화 배열에 저장하기
        index = 0;
        value = 0;

        for (int i = 0; i < m; i++){
            int v = input.nextInt();
            int t = input.nextInt();

            for (int j = 0; j < t; j++){
                value += v;
                arrB[index++] = value;
            }
        }

        int [] arr = new int [1000000];

        for (int i = 0; i < 1000000; i++){
            if (arrA[i] == arrB[i]) {
                arr[i] = arr[i - 1]; // 이전 상태를 유지하여 선두 변경이 없도록 처리
            } 
            else if (arrA[i] > arrB[i]) {
                arr[i] = 1; // A가 선두
            } 
            else {
                arr[i] = 2; // B가 선두
            }
        }

        int sum = 0;

        for (int i = 1; i < 1000000; i++){
            if (arr[i] != arr[i - 1] && arr[i] != 0)
                sum++;
        }

        System.out.println(sum);
    }
}