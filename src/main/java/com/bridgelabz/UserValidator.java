package com.bridgelabz;

public class UserValidator {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
    }
    String FIRST_NAME_REGEX="^[A-Z]{1}[A-Za-z]{2,}$";
    public boolean validateFirstName(String firstName) {
        return firstName.matches(FIRST_NAME_REGEX);
    }

    String LAST_NAME_REGEX="^[A-Z]{1}[A-Za-z]{2,}$";
    public boolean validateLastName(String lastName) {
        return lastName.matches(LAST_NAME_REGEX);
    }
}
