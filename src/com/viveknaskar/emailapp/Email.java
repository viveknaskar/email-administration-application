package com.viveknaskar.emailapp;

import java.util.Scanner;

/**
 * The domain class containing the object
 */
public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    /**
     * A constructor class that receives the firstName and lastName
     * @param firstName
     * @param lastName
     */
    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email has been created successfully for "+ firstName + " " + lastName + "!");

        this.department = setDepartment();
        System.out.println("Department is " + this.department);
    }

    /**
     * A method which asks about the department in which the employee is working
     * @return department
     */
    private String setDepartment() {

        System.out.print("Department Code:\n1 for Development\n2 for R&D\n3 for HR\n4 for None of these\nEnter department code:");

        /**
         * Scanner class takes in the department choice from the user
         */
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1) { return "development"; }
        else if (departmentChoice == 2) { return "R&D"; }
        else if (departmentChoice == 3) { return "HR"; }
        else { return "None of these"; }

    }

}
