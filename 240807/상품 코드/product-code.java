import java.util.*;

class Product{
    String name;
    int code;

    public Product(){};

    public Product(String name, int code){
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Product p1 = new Product("codetree", 50);
        Product p2 = new Product();

        String n = input.next();
        int c = input.nextInt();

        p2.name = n;
        p2.code = c;

        System.out.println("product " + p1.code + " is " + p1.name);
        System.out.println("product " + p2.code + " is " + p2.name);
    }
}