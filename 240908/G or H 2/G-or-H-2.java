import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        char [] arr = new char[100 + 1];
        Arrays.fill(arr, ' ');

        for (int i = 0; i < n; i++){
            int pla = input.nextInt();
            arr[pla] = input.next().charAt(0);
        }

        int max = 0;

        for (int i = 0; i < 101; i++){
            for (int j = i; j < 101; j++){
                if (arr[i] != ' ' && arr[j] != ' '){
                    int gNum = 0;
                    int hNum = 0;

                    for (int k = i; k <= j; k++){
                        if (arr[k] == 'G') gNum++;
                        else if (arr[k] == 'H') hNum++;
                        else continue;
                    }

                    if ((gNum == 0 && hNum != 0) || (hNum == 0 && gNum != 0)|| gNum == hNum){
                        max = Math.max(max, (j - i));
                    }
                }
            }
        }

        System.out.println(max);
    }
}