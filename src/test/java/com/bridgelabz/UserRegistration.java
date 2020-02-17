package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
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
        boolean result=validator.validateMobileNUmber("91 1234567890");
        Assert.assertEquals(true,result);
   }
   @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse(){
        UserValidator validator=new UserValidator();
        boolean result=validator.validateMobileNUmber("1234567890");
        Assert.assertEquals(false,result);
   }
}
