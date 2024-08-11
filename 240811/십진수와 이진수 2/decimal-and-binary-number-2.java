import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        int result = 0;

        int [] arr = new int[s.length()];

        for (int i = 0; i < arr.length; i++){
            result = 2 * result + (s.charAt(i) - '0'); //charAt을 바로 갖다 쓰는 경우 '0'을 빼 줘야 0부터 센 값이 제대로 나옴
        }

        result *= 17;

        int [] digits = new int[20];
        int cnt = 0;

        while (result >= 2){
            digits[cnt++] = result % 2;
            result /= 2;
        }

        digits[cnt++] = result;

        for(int i = cnt - 1; i >= 0; i--)
            System.out.print(digits[i]);
    }
}