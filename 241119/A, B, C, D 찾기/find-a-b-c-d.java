import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[15];

        for (int i = 0; i < 15; i++){
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);

        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];
        int d = numbers[14] - (a + b + c);

        System.out.println(a + " " + b + " " + c + " " + d);
    }
}