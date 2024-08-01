import java.util.Scanner;

public class Main {
    public static String in;
    public static String pur;

    public static boolean inIsinPur(){

        if (in.contains(pur))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        in = input.nextLine();
        pur = input.nextLine();

        if (inIsinPur()){
            System.out.println(in.indexOf(pur));
        }
        else{
            System.out.println(-1);
        }
        

    }
}