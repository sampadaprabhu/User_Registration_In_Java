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
    String EMAILID_REGEX="^[a-zA-Z]+[0-9._%+-]*@[a-zA-Z0-9.]+[.][a-zA-Z]{2,4}$";
    public boolean validateEmailID(String emailID) {
        return emailID.matches(EMAILID_REGEX);
    }
    String MOBILE_NUMBER_REGEX="^[0-9]{2}[ ][0-9]{10}$";
    public boolean validateMobileNUmber(String mobileNumber) {
        return mobileNumber.matches(MOBILE_NUMBER_REGEX);
    }
}
