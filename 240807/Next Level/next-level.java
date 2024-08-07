import java.util.*;

class Login{
    String id;
    int level;

    public Login(){
        this.id = "";
        this.level = 0;
    }

    public Login(String id, int level){
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Login p1 = new Login();
        Login p2 = new Login("codetree", 10);

        p1.id = input.next();
        p1.level = input.nextInt();

        System.out.println("user " + p2.id + " lv " + p2.level);
        System.out.println("user " + p1.id + " lv " + p1.level);
    }
}