package com.bridgelabz.uservalidation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidatorTest {
    private  boolean expectedResult;
    private  String email;
    private UserValidation userValidator;

    public EmailValidatorTest(String email, boolean expectedResult){
        this.email=email;
        this.expectedResult=expectedResult;

    }
    @Before
    public void initialize(){
        userValidator = new UserValidation();
    }
    @Parameterized.Parameters
    public static Collection data (){
        return Arrays.asList(new Object[][]{
                { "abc@yahoo.com",true},
                { "abc-100@yahoo.com",true},
                { "abc.100@yahoo.com",true},
                { "abc111@abc.com",true},
                { "abc-100@abc.net",true},
                { "abc.100@abc.com.au",true},
                { "abc@1.com",true},
                { "abc@gmail.com.com",true},
                { "abc+100@gmail.com",true},
                { "abc",false},
                { "abc@.com.my",false},
                { "abc123@gmail.a",false},
                { "abc123@.com",false},
                { "abc123@.com.com",false},
                { ".abc@abc.com",false},
                { "abc()*@gmail.com",false},
                { "abc@%*.com ",false},
                { "abc..2002@gmail.com",false},
                { "abc.@gmail.com",false},
                { "abc@abc@gmail.com",false},
                { "abc@gmail.com.1a ",false},
                { "abc@gmail.com.aa.au",false},
                {"abc.xyz@bridgelabz.co.in",true}
        });
    }

    @Test
    public void givenEmailAddress_Should_ReturnASPerParameterizedResult(){
        Assert.assertEquals(this.expectedResult,userValidator.validateEmail(this.email));
    }

}