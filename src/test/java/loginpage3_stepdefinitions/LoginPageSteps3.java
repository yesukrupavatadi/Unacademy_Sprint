package loginpage3_stepdefinitions;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.utility.Config;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.utility.Utility;
import com.utility.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps3 extends Utility{
	public LandingPage ldp;
	public LoginPage lp;
	public HomePage hp;
	ExcelReader reader;
	public void objectMethod() throws IOException {
		ldp = new LandingPage();
		lp = new LoginPage();
		hp = new HomePage();
	}
	
	@Given("Chrome is launched and Unacadamey application is launched")
	public void chrome_is_launched_and_unacadamey_application_is_launched() throws IOException, InterruptedException {
		objectMethod();
		String actualTitle = ldp.validateLandingPageTitle();
		System.out.println(actualTitle);
		Thread.sleep(5000);
	  
	}
	@When("User click on login button")
	public void user_click_on_login_button() throws IOException, InterruptedException {
        objectMethod();
		
		ldp.loginButton();
		Thread.sleep(3000);
		System.out.println("login cliked");
	   
	}
	@When("User fills the form from given sheetname {string} and rownumber {int}")
	public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InterruptedException, IOException, InvalidFormatException {
		 Thread.sleep(10000);
	     objectMethod();
	     reader = new ExcelReader();
	     List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);
	     String mno = testData.get(rowNumber).get("mobilenumber");
	     lp.loginMobileNumber(mno);
	     Thread.sleep(3000);
	     System.out.println("elements are enabled on excel");

	   
	}
	@When("User clicks on log in button")
	public void user_clicks_on_log_in_button() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(3000);
	    lp.loginBtn();
	    System.out.println("login is cliked");
			
	   }
	   
	@When("User enter otp")
	public void user_enter_otp() throws IOException, InterruptedException {
		 objectMethod();
			Thread.sleep(20000);
			//I am entering OTP manually
			System.out.println("otp is entered");
		}
			
	@When("User click on verify otp button")
	public void user_click_on_verify_otp_button() throws IOException, InterruptedException {
		objectMethod();
	    lp.verifyOtp();
		Thread.sleep(5000);
		System.out.println("otp is verified");
		
	    
	}
	@Then("It shows home page")
	public void it_shows_home_page() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(5000);
		String actualTitle = hp.validateHomePageTitle();
		System.out.println(actualTitle);
	    
	}

}
