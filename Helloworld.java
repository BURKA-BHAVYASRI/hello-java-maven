package com.example;
import java.util.Scanner;
public class Helloworld  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to Jenkins and Maven!");
        scanner.close();
    }
}
