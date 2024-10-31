import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int p = input.nextInt();

        char[] c = new char[m];
        int[] u = new int[m];
        int[] people = new int[n];

        // 메시지 보낸 순서대로
        for (int i = 0; i < m; i++){
            c[i] = input.next().charAt(0);
            u[i] = input.nextInt();
        }

        // 만약에 메시지 보낸 사람 다 읽음처리해서 다 읽은 걸로 되면?
        // 그러면 럭키고... 아니면?
        // 이전 것들 돌면서 제외시켜야 하겠네

        int unread = u[p-1]; // 안 읽은 사람의 수 == 1
        int read = 0; // 읽은 사람의 수
        for (int i = p-1; i < m; i++) {
            people[c[i] - 'A'] = 1; // 메시지 보낸 사람은 항상 읽음
        } for (int i = 0; i < n; i++){
            if (people[i] == 1) read++; // 4
        }

        if (unread == 0){
            System.out.print(" ");
        } else if (n - read == unread){
            for (int i = 0; i < n; i++){
                if (people[i] == 0){
                    System.out.print((char)(i + 'A') + " ");
                }
            }
        } else {
            for (int i = p - 2; i >= 0 && unread > 0; i--) {
                if (u[i] == unread) {
                    people[c[i] - 'A'] = 1;
                    read++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (people[i] == 0) {
                    System.out.print((char) (i + 'A') + " ");
                }
            }
        }
    }
}