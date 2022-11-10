import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Не угадал!");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num == 1){break;}
        }
    }
}