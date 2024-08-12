import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [] arr = new char[2000];
        int [] wArr = new int [2000];
        int [] bArr = new int [2000];

        int n = input.nextInt();
        int index = 1000;

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
                index += x;
            }
            else{
                for (int j = index - 1; j >= index - x; j--){
                    if (arr[j] != 'G'){
                        wArr[j]++;
                        if (bArr[j] > 1 && wArr[j] > 1)
                            arr[j] = 'G';
                        else
                            arr[j] = 'W';
                    }
                }
                index -= x;
            }
        }

        int wNum = 0;
        int bNum = 0;
        int gNum = 0;

        for (int i = 0; i < 2000; i++){
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