import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        char [] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }

        int sum = 0;

        for (int i = 0; i < s.length(); i++){
            if (arr[i] == '('){
                for (int j = i+1; j < s.length(); j++){
                    if (arr[j] == ')')
                        sum++;
                }
            }
        }

        System.out.println(sum);
    }
}