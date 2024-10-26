import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 집의 개수 입력
        int n = input.nextInt();
        
        // 각 집의 초기 인원 수 A[i] 입력
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }
        
        // 각 집의 최종 인원 수 B[i] 입력
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = input.nextInt();
        }
        
        // 최소 이동 거리 합을 계산할 변수
        int result = 0;
        
        // 오른쪽으로 넘길 인원을 누적할 변수
        int extraPeople = 0;
        
        // 각 집에 대해 이동 거리 계산
        // : 최소한만 이동하면서 갈 곳을 찾았을 때 바로 들어가고 누적되지 않도록
        for (int i = 0; i < n; i++) {
            int diff = A[i] - B[i]; // a보다 b에서 많으면 양수/적으면 음수
            extraPeople += diff; // 현재 집에서 초과(+) 또는 부족(-) 인원을 기록
            result += Math.abs(extraPeople); // 이동 거리 누적
        }
        
        System.out.println(result);
    }
}