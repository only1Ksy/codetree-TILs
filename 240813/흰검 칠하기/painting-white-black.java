import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [] arr = new char[20000];
        int [] wArr = new int [20000];
        int [] bArr = new int [20000];

        int n = input.nextInt();
        int index = 10000;

        for (int i = 0; i < n; i++){
            int x = input.nextInt();
            String s = input.next();

            if (s.equals("R")){
                for (int j = index; j < index + x; j++){
                    if (arr[j] != 'G'){
                        bArr[j]++;
                        if (bArr[j] > 1 && wArr[j] > 1)
                            arr[j] = 'G';
                        else
                            arr[j] = 'B';
                    }
                }
                index += x - 1;
            }
            else{
                for (int j = index; j > index - x; j--){
                    if (arr[j] != 'G'){
                        wArr[j]++;
                        if (bArr[j] > 1 && wArr[j] > 1)
                            arr[j] = 'G';
                        else
                            arr[j] = 'W';
                    }
                }
                index -= x - 1; //전체를 빼는 계산이라는 것에 유의하여 부호 결정
            }
        }

        int wNum = 0;
        int bNum = 0;
        int gNum = 0;

        for (int i = 0; i < 20000; i++){
            if (arr[i] == 'W')
                wNum++;
            else if (arr[i] == 'B')
                bNum++;
            else if (arr[i] == 'G')
                gNum++;
        }

        System.out.println(wNum + " " + bNum + " " + gNum);
    }
}