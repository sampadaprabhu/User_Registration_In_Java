package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistration {

    private String email;
    private boolean result;
    private UserValidator validator;
    public UserRegistration(String email, boolean result) {
        this.email = email;
        this.result = result;
    }

    @Test
   public void givenFirstName_WhenProper_ShouldReturnTrue() {
       UserValidator validator=new UserValidator();
       boolean result=validator.validateFirstName("Sampada");
       Assert.assertEquals(true,result);
   }
   @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validateFirstName("sampada");
        Assert.assertEquals(false,result);
   }
   @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validateLastName("Prabhu");
        Assert.assertEquals(true,result);
   }
   @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validateLastName("prabhu");
        Assert.assertEquals(false,result);
   }
   @Test
    public void givenEmailID_WhenProper_ShouldReturnTrue(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validateEmailID("abcxyz@bl.co.in");
        Assert.assertEquals(true,result);
   }
   @Test
    public void givenEmailID_WhenNotProper_ShouldReturnFalse(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validateEmailID("abc.xyz@bl.co.in");
        Assert.assertEquals(false,result);
   }
   @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validateMobileNumber("91 1234567890");
        Assert.assertEquals(true,result);
   }
   @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validateMobileNumber("1234567890");
        Assert.assertEquals(false,result);
   }
   @Test
    public void givenPassword_WhenProper_ShouldReturnTrue(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validatePassword("samPada#123");
        Assert.assertEquals(true,result);
   }
   @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
       UserValidator validator = new UserValidator();
       boolean result = validator.validateMobileNumber("SAm%12");
       Assert.assertEquals(false, result);
   }
   @Test
    public void givenPassword_AtLeastOneUpperCaseLetter_WhenProper_ShouldReturnTrue(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validatePassword1("Sampada12%");
        Assert.assertTrue(result);
   }
   @Test
    public void givenPassword_AtLeastOneUpperCaseLetter_WhenNotProper_ShouldReturnFalse(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validatePassword1("sam%");
        Assert.assertFalse(result);
   }
    @Test
    public void givenPassword_AtLeastOneNumericNumber_whenProper_ShouldReturnTrue(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validatePassword2("Sampada12+");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_AtLeastOneNumericNumber_WhenNotProper_ShouldReturnFalse(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validatePassword2("Sampada%");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_ExactlyOneSpecialCharacter_WhenProper_ShouldReturnTrue(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validatePassword3("Sam12prabhu%");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_ExactlyOneSpecialCharacter_WhenNotProper_ShouldReturnFalse(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validatePassword3("Sam123%#");
        Assert.assertEquals(false,result);
    }
    @Parameterized.Parameters
    public static Collection Email(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc-gmail.com", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        });

    }
    @Test
    public void testAllEmail(){
        System.out.println("Expected Result : " +result);
        validator=new UserValidator();
        Assert.assertEquals(result,validator.testAllEmail(email));
    }
}
