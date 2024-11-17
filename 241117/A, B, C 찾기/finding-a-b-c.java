import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 제일 작은 값이 A
        // 제일 큰 값이 A + B + C

        int[] arr = new int[7];

        for (int i = 0; i < 7; i++){
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[1];

        int c = arr[6] - a - b;

        System.out.println(a + " " + b + " " + c);
    }
}