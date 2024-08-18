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
            int t = input.nextInt();
            String d = input.next();

            if (d.equals("L")){
                for (int j = 0; j < t; j++){
                    value -= 1;
                    arrA[index++] = value;
                }
            }
            else{
                for (int j = 0; j < t; j++){
                    value += 1;
                    arrA[index++] = value;
                }
            }
        }

        //B의 위치 변화 배열에 저장하기
        index = 0;
        value = 0;

        for (int i = 0; i < m; i++){
            int t = input.nextInt();
            String d = input.next();

            if (d.equals("L")){
                for (int j = 0; j < t; j++){
                    value -= 1;
                    arrB[index++] = value;
                }
            }
            else{
                for (int j = 0; j < t; j++){
                    value += 1;
                    arrB[index++] = value;
                }
            }
        }

        int sum = 0;

        for (int i = 1; i < 1000000; i++){
            if (arrA[i] == arrB[i] && (arrA[i - 1] != arrA[i] || arrB[i - 1] != arrB[i]) && (arrA[i-1] != 0 && arrA[i] != 0)){
                sum++;
            }
        }

        System.out.println(sum);
    }
}