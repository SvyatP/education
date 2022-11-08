package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        int m = sc.nextInt();
        System.out.println("Enter height ");
        int n = sc.nextInt();

        if (m < 0 || n < 0){System.out.println("Values cannot be negative");}

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i==0 || i == n - 1) {System.out.print("-");}
                else if (j == 0) {System.out.print("|");}
                else if (j != 0 && j < m- 1) {System.out.print(" ");}
                else if (j == m - 1) {System.out.print("|");}

            }
            System.out.println();
        }
    }
}


