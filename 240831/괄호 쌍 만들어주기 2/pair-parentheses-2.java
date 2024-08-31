import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        char [] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }

        int sum = 0;

        for (int i = 0; i < s.length()-1; i++){
            if (arr[i] == '(' && arr[i + 1] == '('){
                for (int j = i+1; j < s.length()-1; j++){
                    if (arr[j] == ')' && arr[j + 1] == ')')
                        sum++;
                }
            }
        }

        System.out.println(sum);
    }
}