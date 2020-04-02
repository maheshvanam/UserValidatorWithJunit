package com.bridgelabz.uservalidation;

import java.util.regex.Pattern;

public class UserValidation {
    private static final String FIRST_NAME_PATTERN="[A-Z]{1}[a-zA-Z]{2,}$";
    private static final String LAST_NAME_PATTERN="[A-Z]{1}[a-zA-Z]{2,}$";
    private static final String PHONE_NUMBER_PATTERN="\\d{2}[\\s]\\d{10}";
    private static final String EMAIL_PATTERN="^[a-zA-Z]{1}[a-zA-Z0-9]*([-.+_]{1}[a-zA-Z0-9]+)?[@]{1}[a-zA-Z0-9]+[.]{1}[a-z]{2,4}([.][a-z]{2,})?$";

    public boolean validateFirstName(String firstName) {
        Pattern pattern=Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    public boolean validateLastName(String lastName) {
        Pattern pattern=Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern=Pattern.compile(PHONE_NUMBER_PATTERN);
        return pattern.matcher(phoneNumber).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern=Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}
