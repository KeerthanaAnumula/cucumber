package Steps;

import cucumber.api.java.en.*;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomeStep {
    WebDriver driver;

    @Given("I open browser chrome")
    public void i_open_browser_chrome() {
        System.setProperty("webdriver.chrome.driver","libraries/chromedriver.exe");
        driver=new ChromeDriver();
    }

    @When("I launch chrome website {string}")
    public void i_launch_google_website(String url) {

        driver.get(url);
    }

    @Then("I verify page title is {string}")
    public void i_verify_page_title_is(String title) {
        Assert.assertEquals(title,driver.getTitle());
        System.out.println(driver.getTitle());


    }

}
