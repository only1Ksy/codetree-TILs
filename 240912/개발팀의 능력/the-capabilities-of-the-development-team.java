import java.util.*;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arr = new int[5];

        int allSum = 0;

        for (int i = 0; i < 5; i++){
            arr[i] = input.nextInt();

            allSum += arr[i];
        }

        int min = INT_MAX;

        //이렇게 설정해야 ababcc 이런 경우도 탐색이 가능해짐
        //계속 앞의 문자 + 1로 설정하면 aabbcc인 경우만 탐색이 가능
        for (int i = 0; i < 5; i++){
            for (int j = i+1; j < 5; j++){
                for (int k = 0; k < 5; k++){
                    if (k == i || k == j) continue;
                    for (int l = k+1; l < 5; l++){
                        if (l == i || l == j) continue;

                        int aSum = arr[i] + arr[j];
                        int bSum = arr[k] + arr[l];
                        int cSum = allSum - (aSum + bSum);
                        
                        if (aSum == bSum || bSum == cSum || aSum == cSum) continue;

                        int maxTeam = Math.max(aSum, Math.max(bSum, cSum));
                        int minTeam = Math.min(aSum, Math.min(bSum, cSum));

                        min = Math.min(min, (maxTeam - minTeam));
                    }
                }                
            }
        }

        System.out.println(min == INT_MAX ? -1 : min);
    }
}