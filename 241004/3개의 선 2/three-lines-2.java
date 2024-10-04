import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++){
            x[i] = input.nextInt();
            y[i] = input.nextInt();
        }

        boolean isPos = false;

        // X만, X 두 개 Y 하나, X 하나 Y 두 개, Y만 뽑기
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    boolean isInit = true;
                    // 다 들어가는지 확인
                    for (int l = 0; l < n; l++){
                        if (x[i] == x[l] || x[j] == x[l] || x[k] == x[l]) 
                            continue;
                        else if (x[i] == x[l] || x[j] == x[l] || y[k] == y[l])
                            continue;
                        else if (x[i] == x[l] || y[j] == y[l] || y[k] == y[l])
                            continue;
                        else if (y[i] == y[l] || y[j] == y[l] || y[k] == y[l])
                            continue;
                        else {
                            isInit = false;
                            break;
                        }
                    }

                    if (isInit){
                        isPos = true;
                        break;
                    }
                }
                if(isPos) break;
            }
            if(isPos) break;
        }

        System.out.println(isPos ? 1 : 0);
    }
}