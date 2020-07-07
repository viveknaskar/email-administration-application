package com.viveknaskar.emailapp;

import java.sql.SQLOutput;

/**
 * The main class which bootstraps the application
 */
public class EmailApp {

    public static void main(String[] args) {

        Email emailObj = new Email("John", "Reese");

        System.out.println(emailObj.showInfo());

    }

}
