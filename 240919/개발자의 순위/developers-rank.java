import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        int n = input.nextInt();

        int[][] gameResult = new int[k][n];

        for (int i = 0; i < k; i++){
            for (int j = 0; j < n; j++){
                gameResult[i][j] = input.nextInt();
            }
        }

        Set<Integer> result = new HashSet<>();

        // 모든 경기에서 서로 다른 (i, j) 쌍을 만들어 결과를 저장
        for (int l = 0; l < k; l++){
            for (int i = 0; i < n; i++){
                for (int j = i + 1; j < n; j++){
                    result.add(gameResult[l][i]*10 + gameResult[l][j]);
                }
            }
        }

        // 반복문을 사용하여 서로 다른 쌍의 원소를 제거
        Set<Integer> toRemove = new HashSet<>();
        Iterator<Integer> iterator = result.iterator();
        
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            Integer reverse = item / 10 + (item % 10) * 10;
            if (result.contains(reverse)) {
                toRemove.add(item);
                toRemove.add(reverse);
            }
        }

        result.removeAll(toRemove);

        System.out.println(result.size());
    }
}