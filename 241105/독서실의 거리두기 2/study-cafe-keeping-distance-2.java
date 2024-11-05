import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        char[] c = input.next().toCharArray();

        int preIdx = 0; int postIdx = 0;
        int first1 = 0, last1 = 0;
        int tempIdx = -1; int maxDis = Integer.MIN_VALUE;
        int minDis = Integer.MAX_VALUE;

        // 가장 멀리 떨어진 좌석을 찾기
        for (int i = 0; i < n; i++){
            if (c[i] == '1' && tempIdx == -1){
                tempIdx = i;
                first1 = i;
                last1 = i;
            }
            else if (c[i] == '1'){
                int distance = i - tempIdx;
                last1 = i;

                if (distance > maxDis){
                    preIdx = tempIdx; postIdx = i;
                    maxDis = distance;
                }

                minDis = Math.min(minDis, distance);

                tempIdx = i;
            }
        }

        int subPre = 0, subPost = 0;

        if (first1 == 0) first1 = Integer.MIN_VALUE;
        else first1 = first1 - 0;
        if (last1 == n) last1 = Integer.MIN_VALUE;
        else last1 = n-1 - last1;

        // first / last 중 하나에 넣었을 때 값
        int tempVal = Math.max(first1, last1);

        if ((preIdx + postIdx)%2 == 0){
            int i = (preIdx + postIdx) / 2;
            c[i] = 1;
            subPre = i - preIdx; subPost = postIdx - i;
        } else {
            int i = (preIdx + postIdx - 1) / 2;
            c[i] = 1;
            subPre = i - preIdx; subPost = postIdx - i;
        }
        int tempVal2 = Math.min(subPost, subPre);

        minDis = Math.min(minDis, Math.max(tempVal, tempVal2));

        System.out.println(minDis);
    }
}