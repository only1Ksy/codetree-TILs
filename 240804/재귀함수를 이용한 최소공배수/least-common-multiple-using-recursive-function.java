import java.util.*;

public class Main {
    public static int [] arr;
    public static int min = 1;

    public static int getMin(int n){
        if (n-1 < 0)
            return 1;
        
        int a = arr[n-1];
        int max = 0;

        if (min > arr[n-1]){
            for (int i = 1; i < min; i++){
                if (arr[n-1]%i == 0 && min%i == 0)
                    max = i;
            }
            a /= max;

        }
        else {
            for (int i = 1; i < arr[n-1]; i++){
                if (arr[n-1]%i == 0 && min%i == 0)
                     max = i;
            }
            a /= max;
        }

        min *= a;

        return getMin(n - 1) * a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(getMin(n));
        
    }
}