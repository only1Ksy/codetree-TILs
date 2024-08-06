import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < n; i += 2){
            int [] answer = Arrays.copyOfRange(arr, 0, i+1);

            Arrays.sort(answer);

            System.out.print(answer[(i+1)/2] + " ");
        }
    }
}