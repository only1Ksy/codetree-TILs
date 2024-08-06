import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [] arr1 = new int[n];
        int [] arr2 = new int[n];

        for (int i = 0; i < n; i++){
            arr1[i] = input.nextInt();
        }

        Arrays.sort(arr1);

        for (int i = 0; i < n; i++){
            arr2[i] = input.nextInt();
        }

        Arrays.sort(arr2);

        boolean a = true;

        for (int i = 0; i < n; i++){
            if (arr1[i] == arr2[i]){
                continue;
            }
            else{
                a = false;
            }
        }

        if (a){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}