import java.util.*;

class Bomb{
    String code;
    String color;
    int sec;

    public Bomb(String code, String color, int sec){
        this.code = code;
        this.color = color;
        this.sec = sec;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String c = input.next();
        String col = input.next();
        int s = input.nextInt();

        Bomb b = new Bomb(c, col, s);

        System.out.println("code : " + b.code);
        System.out.println("color : " + b.color);
        System.out.println("second : " + b.sec);
    }
}