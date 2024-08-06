import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String b = input.nextLine();

        char [] cha1 = a.toCharArray();
        Arrays.sort(cha1);
        a = new String(cha1);

        char [] cha2 = b.toCharArray();
        Arrays.sort(cha2);
        b = new String(cha2);

        System.out.println(a.equals(b) ? "Yes" : "No");
    }
}