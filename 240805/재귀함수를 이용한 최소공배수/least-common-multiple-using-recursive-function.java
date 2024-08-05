import java.util.*;

public class Main {
    public static int [] arr;
    public static int min;

    public static int getMax(int n){
        int a = n-1;
        int max = 0;

        if (arr[a] > min){
            for (int i = 1; i <= arr[a]; i++){
                if (arr[a]%i == 0 && min%i == 0) //최대공약수 구하는 식: 두 수를 다 나누어 떨어지게 하는 수 중 제일 큰 수
                    max = i;
            }
            return max;
        }
        else{
            for (int i = 1; i <= min; i++){
                if (arr[a]%i == 0 && min%i == 0)
                    max = i;
            }
            return max;
        }
    }

    public static int getMin(int n){
        if (n == 1){
            return min;
        }

        int a = n-2;
        
        min = min * arr[a] / getMax(n-1);

        return getMin(n-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        min = arr[n-1];

        System.out.println(getMin(n));
    }
}