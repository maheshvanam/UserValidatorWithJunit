package com.bridgelabz.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class ValidateUserTest {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateFirstName("Mahesh");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_whenProperWithMinLength_ShouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateFirstName("Mah");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_whenStartWithLowerCaseLetter_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateFirstName("mahesh");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenFirstName_whenLessThenTheMinLength_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateFirstName("ma");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenFirstName_whenContainsNumber_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateFirstName("mah7esh");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenFirstName_whenContainsSpecialCharacter_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateFirstName("m@hesh");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateLastName("Vanam");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_whenProperWithMinLength_ShouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateLastName("Van");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_whenStartWithLowerCaseLetter_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateLastName("vanam");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenLastName_whenLessThenTheMinLength_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateLastName("Va");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenLastName_whenContainsNumber_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateLastName("Van7am");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenLastName_whenContainsSpecialCharacter_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateLastName("V@nam");
        Assert.assertEquals(false,result);
    }
    //PhoneNumber
    @Test
    public void givenPhoneNumber_whenProper_ShouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validatePhoneNumber("91 1234567890");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhoneNumber_whenGreaterThenSpecifiedLength_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validatePhoneNumber("91 12345678901212");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhoneNumber_whenLessThenSpecifiedLength_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validatePhoneNumber("91 123456");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhoneNumber_whenCountyCodeGreaterThenSpecifiedLength_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validatePhoneNumber("911 12345678901212");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhoneNumber_whenCountyCodeLessThenSpecifiedLength_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validatePhoneNumber("9 12345678901212");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhoneNumber_whenNotHavingSpaceAfterCountryCode_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validatePhoneNumber("911234567899");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhoneNumber_whenContainsAnotherCharacterAfterCountryCode_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validatePhoneNumber("91-1234567899");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhoneNumber_whenContainsCharacters_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validatePhoneNumber("91-123456asasd");
        Assert.assertEquals(false,result);
    }
    //Email
    @Test
    public void givenEmail_whenProperWithMandatoryFields_shouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateEmail("abc@gmail.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_whenProperWithFirstOptinalField_shouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateEmail("abc.xyz@bridgelabz.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_whenProperWithSecondOptinalField_shouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateEmail("abc.xyz@gmail.com.in");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_whenProperWithFirstOptinalFiledWithNumber_shouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateEmail("abc-123@gmail.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_whenProperWithDoaminNameAsNumber_shouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateEmail("abc@1.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_whenNotContainsSepecialCharacter_shouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateEmail("abc.com");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenEmail_whenNotContainsSecondMandatoryPart_shouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateEmail("abc@.com");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenEmail_whenTLDLessThenMinCharacters_shouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateEmail("abc@bridgelabz.c");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenEmail_whenItContainsSpecialCharcterInSecondMandatoryPart_shouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateEmail("abc@gma%$il.com");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenEmail_whenItContainsMultipleTLDs_shouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result= userValidation.validateEmail("abc@bridgelabz.com.in.co");
        Assert.assertEquals(false,result);
    }
}
