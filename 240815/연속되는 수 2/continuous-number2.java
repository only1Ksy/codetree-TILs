import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int cnt = 0;
        int max = 0;
        
        for(int i = 0; i < n; i++)
            if(i == 0 || arr[i] == arr[i - 1]){
                cnt++;
            }
            else{
                cnt++;
                
                if (cnt > max){
                    max = cnt;
                }
                cnt = 0;
            }

        System.out.print(max);

    }
}