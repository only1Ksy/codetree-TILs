import java.util.*;

public class Main {
    public static int changer(int n){
        if (n == 1)
            return 0;
        return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.next();

        int [] arr = new int[a.length()];

        for (int i = 0; i < a.length(); i++){
            arr[i] = (int)(a.charAt(i)) - '0';
            //Character.getNumericValue();
        }

        int max = 0;

        for (int i = 0; i < a.length(); i++){
            //값 하나 바꾸기
            arr[i] = changer(arr[i]);
            int sum = 0;

            for (int j = 0; j < a.length(); j++){
                sum += Math.pow(2, 3 - j) * arr[j];
            }
            
            max = Math.max(max, sum);

            //바꿨던 값 되돌리기
            arr[i] = changer(arr[i]);
        }

        System.out.println(max);
    }
}