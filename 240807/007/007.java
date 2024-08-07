import java.util.*;

class Secret{
    String secretC;
    char meetP;
    int time;

    public Secret(String secretC, char meetP, int time){
        this.secretC = secretC;
        this.meetP = meetP;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();
        String cc = input.next();
        char c = cc.charAt(0);
        int t = input.nextInt();

        Secret sc = new Secret(s, c, t);

        System.out.println("secret code : " + sc.secretC);
        System.out.println("meeting point : " + sc.meetP);
        System.out.println("time : " + sc.time);
    }
}