import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (x < 11){
            if (num == x ) {System.out.println("The numbers are equal");}
            if (x % 2 == 0){
                int sum = x + num;
                System.out.println(x + " + " + num + " = " +sum);
            }
            else if (x % 2 != 0){
                int sub = x - num;
                System.out.println(x + " - " + num + " = " +sub);
            }
            x += 1;
        }
    }
}