import java.util.Scanner;

public class Fruits {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Fruit:");
        String fruit=in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("Red Fruit");
            case "Orange" -> System.out.println("Same Colour Fruit");
            default -> System.out.println("Invalid Input");
        }

    }

}
