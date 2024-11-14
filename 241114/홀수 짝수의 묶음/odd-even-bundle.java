import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int[] numbers = new int[n];
        
        int evenCount = 0;
        int oddCount = 0;
        
        // 숫자 입력 및 짝수, 홀수 개수 계산
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        int groups = 0;

        if (evenCount > oddCount) 
            // 홀수 개수 * 2 + 마지막 짝수 그룹
            groups = oddCount * 2 + 1;
        else if (evenCount == oddCount) 
            // 둘이 번갈아가며 나오면 됨
            groups = oddCount + evenCount;
        else {
            // 번갈아가며 만들 수 있는 그룹의 개수
            groups = evenCount * 2;
            
            // 남게 되는 홀수의 개수
            int size = oddCount - evenCount;

            // 3의 배수 (짝 > 홀 패턴 만들 수 있는 경우)
            if (size % 3 == 0){
                // 짝 홀 패턴의 개수 * 2 (짝수 홀수)
                groups += (size / 3) * 2;
            } else {
                // 짝 > 홀 패턴 못 만드는 경우
                if ((size % 3) % 2 == 0)
                    // 짝 > 홀 패턴 만들고 남은 게 짝수 개
                    // => 그대로 마지막에 갖다 붙여서 +1
                    groups += size / 3 * 2 + 1;
                else 
                    // 짝 > 홀 패턴 만들고 남은 게 홀수 개
                    // 이전 그룹과 합쳐줘야 해서 -1
                    groups += size / 3 * 2 - 1;
            }
        }
        
        System.out.println(groups);
    }
}
