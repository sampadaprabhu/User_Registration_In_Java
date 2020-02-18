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

    String MOBILE_NUMBER_REGEX="^[0-9]{2}[ ][1-9]{1}[0-9]{9}$";
    public boolean validateMobileNumber(String mobileNumber) {

        return mobileNumber.matches(MOBILE_NUMBER_REGEX);
    }

    String PASSWORD_REGEX="^[A-Za-z0-9@#%+-_]{8,}$";
    public boolean validatePassword(String password) {
        return password.matches(PASSWORD_REGEX);
    }
    private static final String PASSWORD1_REGEX ="^((?=.*[A-Z])[A-Za-z0-9+-_%#].{8,})$";
    public boolean validatePassword1(String password1) {
        return password1.matches(PASSWORD1_REGEX);
    }
    private static final String PASSWORD2_REGEX ="^((?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9+-_%#].{8,})$";
    public boolean validatePassword2(String password2) {
        return password2.matches(PASSWORD2_REGEX);
    }
}
