package loginpage2_stepdefinitions;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.utility.Utility;

public class LoginPageSteps2  extends Utility{
	public LandingPage ldp;
	public LoginPage lp;
	public HomePage hp;
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		lp = new LoginPage();
		hp = new HomePage();
	}
	

	@Given("Chrome is opened and Unacademy app is opened")
	public void chrome_is_opened_and_unacademy_app_is_opened() throws IOException, InterruptedException {
		objectMethod();
		String actualTitle = ldp.validateLandingPageTitle();
		System.out.println(actualTitle);
		Thread.sleep(5000);
	    
	}
	@Then("user navigates on landing page")
	public void user_navigates_on_landing_page() throws IOException, InterruptedException {
		objectMethod();
		String actualTitle = ldp.validateLandingPageTitle();
		String expectedTitle = "Unacademy - India's largest learning platform";
		assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle);
		Thread.sleep(3000);
	
	    
	}
	@When("User click on login button")
	public void user_click_on_login_button() throws IOException, InterruptedException {
        objectMethod();
		ldp.loginButton();
		System.out.println("login cliked");
		Thread.sleep(3000);
	  
	}
	@Then("User navigates on to login page")
	public void user_navigates_on_to_login_page() throws IOException {
		 objectMethod();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 String actualTitle = ldp.validateLandingPageTitle();
	     String expectedTitle = "Unacademy - India's largest learning platform";
	     assertEquals(actualTitle, expectedTitle);
	     System.out.println(actualTitle);
	    
	}
	@When("User enter mobilenumber {string}")
	public void user_enter_mobilenumber(String mobilenumber) throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(3000);
	    lp.loginMobileNumber(mobilenumber);
	    Thread.sleep(3000);
	    System.out.println("mobile number is entered");
	   
	}
	@When("User click on log in button")
	public void user_click_on_log_in_button() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(5000);
	    lp.loginBtn();
	    System.out.println("login cliked");
	    
	}
	
	@When("User enter otp")
	public void user_enter_otp() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(22000);
		//I am entering OTP manually
		System.out.println("otp is entered");
	   
	}
	
	@When("User click on verify otp button")
	public void user_click_on_verify_otp_button() throws IOException, InterruptedException {
		objectMethod();
	    lp.verifyOtp();
		Thread.sleep(3000);
		System.out.println("otp is verified");
	    
	}
	
	@Then("It shows home page")
	public void it_shows_home_page() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(9000);
		String actualTitleContains = hp.validateHomePageTitle();
		String expectedTitleContains = "UPSC CSE - GS Exam Preparation 2023 | Crack UPSC CSE - GS | Unacademy";
		assertTrue(actualTitleContains.contains(expectedTitleContains));
		System.out.println(actualTitleContains);
		Thread.sleep(2000);
	    
	}
	@When("User click on the verify otp button")
	public void user_click_on_the_verify_otp_button() throws IOException, InterruptedException {
		objectMethod();
	    lp.verifyOtp1();
		Thread.sleep(3000);
		System.out.println("otp is incorrect");
	    
	}
	
	@Then("It shows error message")
	public void it_shows_error_message() throws IOException, InterruptedException {
		objectMethod();
		String actualTitle=lp.errorMessage();
		String expectedTitle="This OTP is not valid";
		Thread.sleep(4000);
		assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);
		
	    
	}

}
