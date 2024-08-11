import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        input.nextLine();

        String s = input.nextLine();

        //10진수로 주어지지 않은 경우 모두 10진수로 바꾸기
        int result = 0;

        if (a != 10){
            int [] arr = new int[s.length()];

            for (int i = 0; i < arr.length; i++){
             result = a * result + (s.charAt(i) - '0'); //charAt을 바로 갖다 쓰는 경우 '0'을 빼 줘야 0부터 센 값이 제대로 나옴
            }
        }

        //b진수로 바꾸어 출력하기
        int [] digits = new int[20];
        int cnt = 0;

        while (result >= b){
            digits[cnt++] = result % b;
            result /= b;
        }

        digits[cnt++] = result;

        for(int i = cnt - 1; i >= 0; i--)
            System.out.print(digits[i]);
    }
}