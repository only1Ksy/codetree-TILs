import java.util.*;

class Num implements Comparable<Num>{
    int num;
    int pos;

    public Num (){}

    public Num (int num, int pos){
        this.num = num;
        this.pos = pos;
    }

    public int compareTo(Num a){
        if (this.num != a.num)
            return this.num - a.num;
        return this.pos - a.pos;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Num [] nn = new Num[n];

        for (int i = 0; i < n; i++){
            int num = input.nextInt();

            nn[i] = new Num(num, i+1);
        }

        Arrays.sort(nn);

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (nn[j].pos == i+1)
                    System.out.print(j+1 + " ");
            }
        }

    }
}