package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature//feature.feature",glue="Testpage//Homepage",plugin="pretty",dryRun=false)
public class TestingRunner {

}
