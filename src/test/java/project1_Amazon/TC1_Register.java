package project1_Amazon;

import org.testng.annotations.Test;

import project1_Amazon_Src.Amazon_RegisterPage;

public class TC1_Register extends AmazonPr_BaseClass
{
       @Test
       public void Register_ToAmazonTC1() throws InterruptedException
       {
    	   
    	   // 1- Test if a new user can successfully register.
    	   
    	   System.out.println("Title is-> " + driver.getTitle());
    	   
    	   Amazon_RegisterPage regpage= new Amazon_RegisterPage(driver);
    	          regpage.HoverOver(driver);
    	          regpage.Signin();
    	          
    	          regpage.Un();
    	          regpage.PressContinueButton();
    	          
    	               Thread.sleep(4000);
    	          regpage.ProceedTo();
    	          
    	          regpage.NamePwdMobile();
    	          
    	         // regpage.CreateYourAccount();
    	   
    	   
    	   
    	   
       }
	
	
	
	
	
}
