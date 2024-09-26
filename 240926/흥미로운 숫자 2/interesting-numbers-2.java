import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        int result = 0;

        for (int i = x; i <= y; i++){
            int n = i;
            int b = 0;
            int cnt = 0;

            int [] arr = new int[10];
            int [] index = new int[10];
             
            while (n > 0){
                int a = n % 10;
    
                arr[a]++;

                n /= 10;
            }

            for (int j = 0; j < 10; j++){
                if (arr[j] != 0) {
                    cnt++;
                    index[b++] = j;
                }
            }

            b = 0;

            if (cnt == 2 && (arr[index[b++]] == 1 || arr[index[b++]] == 1)) result++;
        }

        System.out.println(result);
    }
}