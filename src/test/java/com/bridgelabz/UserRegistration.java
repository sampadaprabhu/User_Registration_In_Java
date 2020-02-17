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
}
