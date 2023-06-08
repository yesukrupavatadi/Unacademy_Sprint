package testrunner;
import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
		features = {"src/test/resources/Features/loginpage3.feature"},
        glue={"loginpage3_stepdefinitions" , "apphooks"},
        plugin= {"pretty",
           "json:cucumber-reports/cucumber.json",
           "junit:cucumber-reports/cucumber.xml",
           "html:cucumber-reports/cucumber"})
public class LoginPage3_TestRunner extends AbstractTestNGCucumberTests{
  
}
