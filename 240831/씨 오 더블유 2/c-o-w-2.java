import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        String s = input.nextLine();

        int cnt = 0;

        for (int i = 0; i < n; i++){
            if (s.charAt(i) == 'C'){
                for (int j = i; j < n; j++){
                    if (s.charAt(j) == 'O'){
                        for (int l = j; l < n; l++){
                            if (s.charAt(l) == 'W')
                                cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}