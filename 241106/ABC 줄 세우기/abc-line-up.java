import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        char[] people = new char[n];

        for (int i = 0; i < n; i++){
            people[i] = input.next().charAt(0);
        }

        int cnt = 0;

        for (int i = 1; i < n; i++){
            for (int j = 1; j < n; j++){
                if ((int)people[j] < (int)people[j-1]){
                    char temp = people[j-1];
                    people[j-1] = people[j];
                    people[j] = temp;
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}