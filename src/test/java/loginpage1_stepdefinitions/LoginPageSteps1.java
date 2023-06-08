package loginpage1_stepdefinitions;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.utility.Utility;


public class LoginPageSteps1 extends Utility {
	public LandingPage ldp;
	public LoginPage lp;
	public HomePage hp;
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		lp = new LoginPage();
		hp = new HomePage();
	}
	
	@Given("Chrome is opened and Unacademy app is opened")
	public void chrome_is_opened_and_unacademy_app_is_opened() throws InterruptedException, IOException {
		objectMethod();
		logger = report.createTest("test01");
		logger.log(Status.INFO, "Unacadamey app is opened");
		String actualTitle = ldp.validateLandingPageTitle();
		System.out.println(actualTitle);
		//Thread.sleep(5000);
		Utility.implicitWait();
		
	    
	}
	@Then("user navigates on landing page")
	public void user_navigates_on_landing_page() throws IOException, InterruptedException {
		objectMethod();
		String actualTitle = ldp.validateLandingPageTitle();
		String expectedTitle = "Unacademy - India's largest learning platform";
		//Thread.sleep(3000);
		Utility.implicitWait();
		try {
            logger.log(Status.INFO, "Step1 is executed");
            assertEquals(actualTitle, expectedTitle);
            logger.log(Status.PASS, "Test is passed");
            System.out.println(actualTitle);
            assert true;
			} catch (AssertionError e) {
				e.printStackTrace();
				logger.log(Status.FAIL, "Test is failed");
				captureScreenshotOnFailure();
				assert false;
			}
		
	}

	@When("User click on login button")
	public void user_click_on_login_button() throws IOException, InterruptedException {
		objectMethod();
		ldp.loginButton();
		System.out.println("login is cliked");
		//Thread.sleep(3000);
		logger.log(Status.INFO, "step2 is executed");
		Utility.implicitWait();
		
	}
	@Then("User navigates on to login page")
	public void user_navigates_on_to_login_page() throws IOException, InterruptedException {
	   objectMethod();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   String actualTitle = ldp.validateLandingPageTitle();
	   String expectedTitle = "Unacademy - India's largest learning platform";
	   try {
           logger.log(Status.INFO, "Step3 is executed");
           assertEquals(actualTitle, expectedTitle);
           logger.log(Status.PASS, "Test is passed");
           System.out.println(actualTitle);
           assert true;
			} catch (AssertionError e) {
				e.printStackTrace();
				logger.log(Status.FAIL, "Test is failed");
				captureScreenshotOnFailure();
				assert false;
			}
	   
	}
	
	@Then("It shows elements of Unacademy login page")
	public void it_shows_elements_of_unacademy_login_page() throws IOException, InterruptedException {
		objectMethod();
		String actualText = lp.element();
		String expectedText = "Log in";
		Thread.sleep(4000);
		try {
            logger.log(Status.INFO, "Step4 is executed");
            assertEquals(actualText, expectedText);
            logger.log(Status.PASS, "Test is passed");
            System.out.println(actualText);
            assert true;
			} catch (AssertionError e) {
				e.printStackTrace();
				logger.log(Status.FAIL, "Test is failed");
				captureScreenshotOnFailure();
				assert false;
			}
	    
	}

	@Then("elements are enabled on login page")
	public void elements_are_enabled_on_login_page() throws InterruptedException, IOException {
		objectMethod();
		String actualText=lp.fieldEnabled();
		String expectedText="Continue with email";
		try {
            logger.log(Status.INFO, "Step5 is executed");
            assertEquals(actualText, expectedText);
            logger.log(Status.PASS, "Test is passed");
            System.out.println(actualText);
            assert true;
			} catch (AssertionError e) {
				e.printStackTrace();
				logger.log(Status.FAIL, "Test is failed");
				captureScreenshotOnFailure();
				assert false;
			}
		

		
	}

	

	@When("User enter mobilenumber {string}")
	public void user_enter_mobilenumber(String mobilenumber) throws IOException, InterruptedException {
	  objectMethod();
	  Thread.sleep(2000);
      lp.loginMobileNumber(mobilenumber);
      //Thread.sleep(3000);
      System.out.println("mobile number is entered");
  	  logger.log(Status.INFO, "step6 is executed");
	  
	}
	
	@When("User click on log in button")
	public void user_click_on_log_in_button() throws IOException, InterruptedException {
	objectMethod();
	Thread.sleep(2000);
    lp.loginBtn();
    System.out.println("click login");
	logger.log(Status.INFO, "step7 is executed");
		
    }

	@When("User enter otp")
	public void user_enter_otp()throws IOException, InterruptedException {
    objectMethod();
	Thread.sleep(19000);
	//I am entering OTP manually
	System.out.println("otp is entered");
	logger.log(Status.INFO, "step8 is executed");
	}
	
	@When("User click on verify otp button")
	public void user_click_on_verify_otp_button() throws IOException, InterruptedException {
		objectMethod();
	    lp.verifyOtp();
		Thread.sleep(5000);
		System.out.println("otp is verified");
		logger.log(Status.INFO, "step9 is executed");
		
     }
	@Then("It shows home page")
	public void it_shows_home_page() throws IOException, InterruptedException {
	objectMethod();
	Utility.implicitWait();
	 String actualTitleContains = hp.validateHomePageTitle();
	 String expectedTitleContains = "UPSC CSE - GS Exam Preparation 2023 | Crack UPSC CSE - GS | Unacademy";
	 Thread.sleep(2000);
	//Utility.signout()
	 try {
         logger.log(Status.INFO, "Step10 is executed");
         assertTrue(actualTitleContains.contains(expectedTitleContains));
         logger.log(Status.PASS, "Test is passed");
         System.out.println(actualTitleContains);
         assert true;
			} catch (AssertionError e) {
				e.printStackTrace();
				logger.log(Status.FAIL, "Test is failed");
				captureScreenshotOnFailure();
				assert false;
			}
	  }
}

		

		


		