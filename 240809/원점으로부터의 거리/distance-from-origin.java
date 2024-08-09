import java.util.*;

class Dot implements Comparable<Dot>{
    int x;
    int y;
    int num;

    public Dot (){}

    public Dot (int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
    }

    public int compareTo(Dot dot){
        return (this.x + this.y) - (dot.x + dot.y);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Dot [] d = new Dot[n];

        for (int i = 0; i < n; i++){
            int a = input.nextInt();
            int b = input.nextInt();

            d[i] = new Dot(a, b, i+1);
        }

        Arrays.sort(d);

        for (int i = 0; i < n; i++){
            System.out.println(d[i].num);
        }

    }
}