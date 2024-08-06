import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        //nextInt()와 nextLine()을 겹쳐 사용하면 문제 발생. 따라서 빈칸 사이에 두고 
        //int와 String 입력 받아야 할 때는 string을 next로 읽고 그 뒤에 nextLine을 추가해 해결
        String t = input.next();
        input.nextLine();

        String [] arr = new String[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextLine();
        }

        Arrays.sort(arr);
        int num = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i].startsWith(t)) {
                num += 1;
                if (num == k) {
                    System.out.println(arr[i]); // 정확한 위치의 문자열 출력
                    break;
                }
            }
        }
    }
}