package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
                 features = "features/Home.feature",
                 glue = "Steps"
)
public class testRunner extends AbstractTestNGCucumberTests  {
}
