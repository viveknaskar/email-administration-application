package com.viveknaskar.emailapp;

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
    }

}
