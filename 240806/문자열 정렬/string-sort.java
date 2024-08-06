import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        s = new String(arr);

        System.out.println(s);
    }
}