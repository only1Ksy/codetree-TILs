import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int [] a = new int[n];
        int [] b = new int[m];

        for (int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        for (int i = 0; i < m; i++){
            b[i] = input.nextInt();
        }

        Arrays.sort(b);

        int num = 0;

        for (int i = 0; i <= n-m; i++){
            boolean ck = true;
            int [] arr = new int[m];
            int k = 0;

            for (int j = i; j < i + m; j++){                
                arr[k++] = a[j];
            }

            Arrays.sort(arr);

            for (int j = 0; j < m; j++){
                if (arr[j] != b[j]){
                    ck = false;
                    break;
                }
            }

            if (ck) num++;
        }

        System.out.println(num);
    }
}