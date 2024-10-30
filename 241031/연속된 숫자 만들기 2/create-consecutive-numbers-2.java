import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 세 사람의 위치를 입력받습니다.
        int[] pos = new int[3];
        for (int i = 0; i < 3; i++) {
            pos[i] = input.nextInt();
        }

        // 위치 배열을 오름차순으로 정렬합니다.
        Arrays.sort(pos);

        // 연속된 숫자가 되기 위한 최소 이동 횟수를 계산합니다.
        int gap1 = pos[1] - pos[0];
        int gap2 = pos[2] - pos[1];

        // gap1이 2 이상일 경우 두 번째 사람을 첫 번째 사람 쪽으로 이동시키거나 그 반대로 이동시켜야 합니다.
        // 마찬가지로 gap2도 2 이상일 경우 세 번째 사람을 두 번째 사람 쪽으로 이동시키거나 그 반대로 이동시켜야 합니다.
        int minMoves;
        if (gap1 == 1 && gap2 == 1) {
            minMoves = 0; // 이미 연속된 숫자이므로 이동이 필요 없습니다.
        } else if((gap1 == 1 && gap2 > 2)||(gap1 > 2 && gap2 == 1)){
            minMoves = 2; // 정렬된 수 사이에는 들어갈 수 없기 때문에 두 번의 이동이 필요합니다.
        } else if (gap1 <= 2 || gap2 <= 2) {
            minMoves = 1; // 한 번의 이동으로 연속된 숫자를 만들 수 있습니다.
        } else {
            minMoves = 2; // 두 번의 이동이 필요합니다.
        }

        // 결과 출력
        System.out.println(minMoves);
    }
}