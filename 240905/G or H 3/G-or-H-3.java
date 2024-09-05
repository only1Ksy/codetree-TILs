import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int [] place = new int[n];
        char [] alpha = new char[n];

        int k = input.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++){
            place[i] = input.nextInt();
            alpha[i] = input.next().charAt(0);

            max = Math.max(max, place[i]);
        }

        int [] arr = new int[max + 1];

        for (int j = 0; j < n; j++){
            arr[place[j]] = (alpha[j] == 'G') ? 1 : 2;
        }

        int maxSc = 0;

        for (int i = 0; i <= max-k; i++){
            int sum = 0;

            for (int j = i; j < i+k+1; j++){
                sum += arr[j];
            }

            maxSc = Math.max(maxSc, sum);
        }

        System.out.println(maxSc);
    }
}

//좌표 기준으로 주어지는 문제는 좌표의 최대 크기에 해당하는 배열을
//만들어 각 위치에 적절한 숫자를 적은 후 구간 단위 탐색을 진행함