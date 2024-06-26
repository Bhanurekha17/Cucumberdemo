package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features= {".//Featurefiles/Login.feature"}, glue="stepdefinitions",
plugin= {"pretty", "html:reports/myreport.html", 
		  "rerun:target/rerun.txt",
		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},dryRun=false,    // checks mapping between scenario steps and step definition methods
		monochrome=true,    // to avoid junk characters in output
		publish=true )
		

public class Testrun {

}
