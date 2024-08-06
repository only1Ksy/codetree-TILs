import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [] arr = new int[2*n];
        int [] arr1 = new int[n];

        for (int i = 0; i < 2*n; i++){
            arr[i] = input.nextInt();
        }

        if (n == 1){
            System.out.println(arr[0] + arr[1]);
        }

        else{
        Arrays.sort(arr);

        for (int i = 0; i < n; i++){
            arr1[i] = arr[i]+arr[n*2-1-i];
        }

        Arrays.sort(arr1);

        System.out.println(arr1[n-1]);
        }
    }
}