import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arr = new int[200];
        int n = input.nextInt();
        input.nextLine();

        int index = 100;

        for (int i = 0; i < n; i++){
            int x = input.nextInt();
            String c = input.nextLine().trim(); 
            //엔터 같이 입력되는 것 방지 위해 뒤에 .trim() 함수를 붙임

            if (c.equals("R")){
                for (int j = index; j < index + x; j++){
                    arr[j] += 1;
                }
                index += x;
            }
            else{
                for (int j = index - 1; j >= index - x; j--){
                    arr[j] += 1;
                }
                index -= x;
            }

            /* for (int m = 0; m < 200; m++){
                System.out.print(arr[m]);
            }
            System.out.println(); */
        }

        int result = 0;

        for (int i = 0; i < 200; i++){
            if (arr[i] >= 2)
                result += 1;
        }

        System.out.println(result);
    }
}