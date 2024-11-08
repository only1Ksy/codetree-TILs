import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        int[] cpArr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
            cpArr[i] = arr[i];
        }

        Arrays.sort(cpArr);

        int position = -1;

        for (int i = 0; i < n; i++){
            if (cpArr[1] == arr[i])
                position = i + 1;
        } 

        System.out.println(position);
    }
}