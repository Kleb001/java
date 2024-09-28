/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

// Main.java
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            greetUser(name);
        }
    }

    private static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to the Greeting App!");
    }
}
