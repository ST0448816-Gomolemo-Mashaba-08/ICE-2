package com.mycompany.ice2;

import java.util.Scanner; 

public class Ice2 {

    // This method checks if the entered details match Jack Khoza, age 25
    public static boolean checkIdentity(String name, String surname, int age) {
        return name.equals("Jack") && surname.equals("Khoza") && age == 25;
    }

    public static void main(String[] args) {
        
        // Creates a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the name
        System.out.print("Enter name: ");
        String name = input.nextLine();

        // Ask the user to enter the surname
        System.out.print("Enter surname: ");
        String surname = input.nextLine();

        // Ask the user to enter the age
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Calls the checkIdentity method to see if the details match Jack
        if (checkIdentity(name, surname, age)) {
            System.out.println("it is Jack"); // Displayed if details are correct
        } else {
            System.out.println("This is not Jack"); // Displayed if details are incorrect
        }

        input.close();
    }
}
