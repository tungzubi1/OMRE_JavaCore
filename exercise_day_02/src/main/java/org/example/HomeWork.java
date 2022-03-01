package org.example;

import java.util.Scanner;

public class HomeWork {
    public static void Calculator(){
        System.out.println("Exercise 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.print("Nhập c: ");
        int c = sc.nextInt();
        System.out.println("Tổng 3 số vừa nhập là: " +(a+b+c));
        System.out.println("=========================================");
    }

    public static void ConvertTemperator(){
        System.out.println("Exercise 2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ F: ");
        int f = sc.nextInt();
        float c=5*(f-32)/9;
        System.out.println("Nếu độ f là "+f+" thì độ C là "+c);
        System.out.println("=========================================");
    }
}
