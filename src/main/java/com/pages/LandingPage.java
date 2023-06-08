package com.pages;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.Utility;

public class LandingPage  extends Utility {
		
		
	@FindBy(xpath="//*[normalize-space(text())='Log in']")
	private WebElement login_button;
	
	
		
	public LandingPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	}
	public String validateLandingPageTitle()
	{
		return validatePageTitle(); 
	} 
	public LoginPage loginButton() throws IOException {
		login_button.click();
		return new LoginPage();
	}
	
	

}
