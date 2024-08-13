import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [] arr = new char[200000];

        int n = input.nextInt();
        int index = 100000;

        for (int i = 0; i < n; i++){
            int x = input.nextInt();
            String s = input.next();

            if (s.equals("R")){
                for (int j = index; j < index + x; j++)
                    arr[j] = 'B';
                index += x - 1;
            }
            else {
                for (int j = index; j > index - x; j--)
                    arr[j] = 'W';
                index -= x - 1; //전체를 빼는 계산이라는 것에 유의하여 부호 결정
            }
        }

        int wNum = 0;
        int bNum = 0;

        for (int i = 0; i < 200000; i++){
            if (arr[i] == 'W')
                wNum++;
            else if (arr[i] == 'B')
                bNum++;
        }

        System.out.println(wNum + " " + bNum);
    }
}