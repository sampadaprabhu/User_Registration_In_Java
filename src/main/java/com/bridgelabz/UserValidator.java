package com.bridgelabz;

public class UserValidator {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
    }
String NAME_REGEX="^[A-Z]{1}[A-Za-z]{2,}$";
    public boolean validateFirstName(String firstName) {
        return firstName.matches(NAME_REGEX);
    }
}
