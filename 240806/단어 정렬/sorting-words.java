import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String temp = input.nextLine();

        String [] arr = new String[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextLine();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}