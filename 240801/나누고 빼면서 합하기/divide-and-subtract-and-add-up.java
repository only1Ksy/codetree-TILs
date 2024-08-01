import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;
    public static int sum;

    public static void calcul(int [] arr){
        while (m != 1){
            sum += arr[m-1];  //arr의 m>>번째<< 원소이므로 인덱스보다 -1번째

            if (m%2 == 0)
                m /= 2;
            else 
                m -= 1;
        }

        sum += arr[m-1];
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();
        String temp = input.nextLine();
        
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        calcul(arr);

        System.out.println(sum);
    }
}