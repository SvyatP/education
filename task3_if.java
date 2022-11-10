import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, Dude!" );
        String word = sc.nextLine();
        if(Objects.equals(word, new String("Hi"))){System.out.println("Hello");}
        else if (Objects.equals(word, new String("Bye"))){System.out.println("Good bye");}
        else if (Objects.equals(word, new String("How are you"))) {System.out.println("How are your doing");}
        else System.out.println("Unknown message");

    }
}