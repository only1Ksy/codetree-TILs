import java.util.*;

class Spy {
    String name;
    int score;

    public Spy(){
        this.name = "";
        this.score = 0;
    }

    public Spy(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Spy [] sp = new Spy[5];

        for (int i = 0; i < 5; i++){
            String name = input.next();
            int score = input.nextInt();
            sp[i] = new Spy(name, score);
        }

        int sc = sp[0].score;
        int j = 0;

        for (int i = 1; i < 5; i++){
            if (sc > sp[i].score){
                sc = sp[i].score;
                j = i;
            }
        }

        System.out.println(sp[j].name + " " + sc);
    }
}