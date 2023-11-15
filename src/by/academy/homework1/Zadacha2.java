package by.academy.homework1;

import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите тип данных");
        String tip = sc.next();
        System.out.println("Введите переменную");
        double x = sc.nextDouble();
        switch (tip) {
            case "int":
                System.out.println(x % 2);
                break;
                case "double":
                    System.out.println(x * 70 / 100);
                    break;
            case "float":
                System.out.println(x * x);
                break;
            case "char":
                System.out.println("char".charAt(0));
                break;
            case "String":
                System.out.println("Hello " + x);
                break;
                default:
                    System.out.println("Unsupported type");
        }

            sc.close();
        }
    }
