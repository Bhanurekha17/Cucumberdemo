package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features= {".//Featurefiles/Login.feature"}, glue="stepdefinitions",
plugin= {"pretty", "html:reports/myreport.html", 
		  "rerun:target/rerun.txt",
		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})
		

public class Testrun {

}
