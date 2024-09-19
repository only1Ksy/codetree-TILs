import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt(); // 경기 수
        int n = input.nextInt(); // 개발자 수

        int[][] gameResult = new int[k][n];

        // 경기 결과 입력
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                gameResult[i][j] = input.nextInt();
            }
        }

        // 순위 쌍 (a, b)를 저장할 HashSet
        Set<String> resultSet = new HashSet<>();

        // 모든 (a, b) 쌍을 검사
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                if (a == b) continue; // 자기 자신과의 비교는 무시

                boolean alwaysHigher = true;

                // 모든 경기에서 a가 b보다 높은지 확인
                for (int l = 0; l < k; l++) {
                    int rankA = -1;
                    int rankB = -1;

                    // 순위 위치 찾기
                    for (int pos = 0; pos < n; pos++) {
                        if (gameResult[l][pos] == a) {
                            rankA = pos;
                        } else if (gameResult[l][pos] == b) {
                            rankB = pos;
                        }
                    }

                    // a가 b보다 항상 높은 경우 확인
                    if (rankA > rankB) {
                        continue; // a가 이 경기에서 b보다 높은 경우
                    } else {
                        alwaysHigher = false;
                        break;
                    }
                }

                if (alwaysHigher) {
                    // (a, b) 쌍을 문자열로 변환하여 HashSet에 추가
                    resultSet.add(a + "," + b);
                }
            }
        }

        // HashSet의 크기 출력
        System.out.println(resultSet.size());
    }
}