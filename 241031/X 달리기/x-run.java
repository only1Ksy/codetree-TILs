import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();  // 목표 거리

        int position = 0;  // 현재 위치
        int speed = 1;     // 현재 속도
        int time = 0;      // 경과 시간
        
        while (position < x) {
            // 남은 거리 계산
            int remainingDistance = x - position;
            
            // 감속만 했을 경우의 거리 계산
            // 등차수열의 합 = (첫 항 + 마지막 항) * 항의 개수 / 2
            int minStoppingDistance = (speed + 1) * speed / 2;

            // 남은 거리와 감속 거리 비교하여 판단
            // 남은 거리가 감속만 했을 때의 거리보다 크면
            if (remainingDistance >= minStoppingDistance + speed + 1) {
                // 가속 가능하면 가속
                position += speed;
                speed++;
            } else if (remainingDistance >= minStoppingDistance) {
                // 속도를 유지할 수 있으면 유지
                position += speed;
            } else {
                // 그 외의 경우 감속
                speed--;
                position += speed;
            }
            time++;  // 한 번 이동할 때마다 시간 증가
        }
        
        System.out.println(time);
    }
}