package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.AgePage;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Steps {

    public WebDriver driver;
    public AgePage agePage;

    @Given("User launches the chrome Browser")
    public void user_launches_the_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        agePage = new AgePage(driver);
    }

    @When("User is able to open URl {string}")
    public void user_is_able_to_open_u_rl(String url) throws InterruptedException {driver.get(url);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @When("User should be able to input name in the name field {string}")
    public void user_should_be_able_to_input_name_in_the_name_field(String string) throws InterruptedException {
        agePage.clickName();
        Thread.sleep(3000);

    }
    @Then("User should be able to proceed to birthday field")
    public void user_should_be_able_to_proceed_to_birthday_field() throws InterruptedException {
        agePage.clickDateOfBirth();
        Thread.sleep(3000);
    }

    @Then("User should click on the submit button")
    public void user_should_click_on_the_submit_button() {
        agePage.clickSubmit();
    }
    @Then("User gets a Success Message and title")
    public void user_gets_a_success_message() {
         agePage.verifySuccess();
         System.out.println("Hello Ladipo Isreal!");
         agePage.verifyDisplay();
         System.out.println("Your age is 28");

        String expectedTitle = "https://howoldru.m-messiah.cc/";
        String actualTitle = driver.getCurrentUrl();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("https://howoldru.m-messiah.cc/");

    }
    @Then("Browser should close")
    public void browser_should_close() {
//        driver.close();
        driver.quit();
    }




















}
