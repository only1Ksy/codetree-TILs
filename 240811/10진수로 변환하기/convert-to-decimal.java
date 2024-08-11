import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        int result = 0;

        int [] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        for (int i = 0; i < arr.length; i++){
            result = 2 * result + arr[i];
        }

        System.out.println(result);
    }
}