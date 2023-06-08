package testrunner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;
@CucumberOptions(
        features = {"src/test/resources/Features/loginpage1.feature"},
        glue={"loginpage1_stepdefinitions" , "apphooks"},
        		plugin= {"pretty",
                         "json:cucumber-reports/cucumber.json",
                         "junit:cucumber-reports/cucumber.xml",
                         "html:cucumber-reports/cucumber"}
        )

public class LoginPage1_TestRunner extends AbstractTestNGCucumberTests{
}

