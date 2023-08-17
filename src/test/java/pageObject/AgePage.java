package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgePage {
  public WebDriver driver;

  public AgePage(WebDriver driver) {
    this.driver= driver;


  }

    //    Locate the webElement

    private By name = By.cssSelector("#inputName");
    private By dateOfBirth =By.cssSelector("#inputBirthday");
    private By submit = By.cssSelector("#submitButton");
    private By successMessage =By.cssSelector("div[class='content show'] h1:nth-child(1)");
    private By successAgeDisplay =By.cssSelector("#resultAge");


    // Action the Object/element
    public void clickName() {driver.findElement(name).sendKeys("Ladipo Isreal");};
    public void clickDateOfBirth() {driver.findElement(dateOfBirth).sendKeys("02/25/1995");};
    public void clickSubmit() {driver.findElement(submit).click();};
    public String verifySuccess(){
      String successMessage1 =driver.findElement(successMessage).getText();
      return successMessage1;
    }
  public String verifyDisplay(){
    String successDisplay1 =driver.findElement(successAgeDisplay).getText();
    return successDisplay1;
  }

}
