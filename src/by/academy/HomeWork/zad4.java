package by.academy.HomeWork;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        if (x >= 0)
           System.out.println("poloj");
       else
           System.out.println("otric");
       if (x == 0)
           System.out.println(" ravno null");
       sc.close();
    }
}
