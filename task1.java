import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number ");
        int num2 = sc.nextInt();

        if (num1 == num2) {System.out.println("The numbers are equal");}

        if(num1 % 2 == 0){
            int sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        } else if (num1 % 2 != 0){
            int sub = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + sub);
        }
    }
}