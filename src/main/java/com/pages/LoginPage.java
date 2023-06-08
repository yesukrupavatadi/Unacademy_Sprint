package com.pages;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.Utility;
public class LoginPage extends Utility {
	
	@FindBy(xpath="(//*[text()='Log in'])[1]")
	public WebElement login1;
	
	@FindBy(xpath="//*[text()='Continue with email']")
	public WebElement field_enabled;
	
	@FindBy(xpath="//input[@aria-invalid='false']")
	public WebElement mobile_number;  
	
	@FindBy(xpath="(//*[text()='Log in'])[2]")
	public WebElement login2;
	
    @FindBy(xpath="//*[text()='Verify OTP']")
	public WebElement verify_otp;
    
    @FindBy(xpath="//*[text()='This OTP is not valid']")
    public WebElement error_msg;
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
		return validatePageTitle(); 
	} 
	public String element()
	{
		return login1.getText();
	}
	public String fieldEnabled() {
		return field_enabled.getText();
	}
	public void loginMobileNumber(String mn) {
		mobile_number.sendKeys(mn);
	}
	public void loginBtn()
	{
		login2.click();
		//return new LoginPage(); 
	}
		
	public HomePage verifyOtp() throws IOException {
		verify_otp.click();
		return new HomePage();
	}
	
	public void verifyOtp1() {
		verify_otp.click();
		
	}
	public String errorMessage()
	{
		return error_msg.getText();
	}
	

}
