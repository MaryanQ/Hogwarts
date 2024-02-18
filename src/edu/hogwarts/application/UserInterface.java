package edu.hogwarts.application;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to Hogwarts Student and Teacher Viewer!");
        System.out.println("1. View all students and teachers");
        System.out.println("2. Sort by column");
        System.out.println("3. Filter by house");
        System.out.println("4. Filter by role");
        System.out.println("0. Exit");
    }

    public int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public void displayTable(String[][] data) {
        for (String[] row : data) {
            for (String value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
