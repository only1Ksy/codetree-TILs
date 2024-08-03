import java.util.*;

public class Main {
    public static int getSum(int n){
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        if (n%2 == 0){
            return getSum(n-2) + n;
        } //조건문을 기준으로 두 개의 반환식이 같은 형태이므로 조건문을 넣을 필요가 없음
        else{
            return getSum(n-2) + n;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(getSum(n));
    }
}