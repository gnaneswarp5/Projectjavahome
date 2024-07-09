package stepdefinationfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import resuable.ReadExcel;
import resuable.democode;

import java.io.IOException;

public class LoginSteps extends democode {

    //WebDriver driver = new ChromeDriver();

    @Given("user navigates to login page")
     public void loginage(){

        driver.get("https://www.amazon.in/");
    }


    @When("user enter the username")
    public void Username() {

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone13");

    }

    @And("user click the login button")
    public void LoginButton() {

        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }

    @Then("verify user is at homepage")
    public void Homepage() {

        driver.findElement(By.xpath("//img[@alt='Apple iPhone 13 (128GB) - Starlight']")).click();

    }

    @Given("user navigates to login page of error")
    public void LoginPageOfError() {

    }

    @When("users enter the username")
    public void TheUsername() {

    }

    @And("user click the login buttons")
    public void TheLoginButtons() {

    }

    @Then("verify the error message")
    public void TheErrorMessage() {
    }

    @Given("user navigates to Amazon login page")
    public void userNavigatesToAmazonLoginPage() {

        driver.get("https://www.amazon.in/");
    }

    @When("user enter the product name {string}")
    public void userEnterTheProductName(String productName) {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("user validate the product")
    public void userValidateTheProduct() {
    }

    @Given("user enter the login page")
    public void LoginPage() {

        driver.get("https://www.amazon.in/");

    }

    @When("search the values in the dropdownlist")
    public void Dropdownlist() {


        WebElement catgeoryElement = driver.findElement(By.id("searchDropdownBox"));

        Select catgeory = new Select(catgeoryElement);
        //catgeory.selectByVisibleText("Books");
        driver.manage().window().maximize();
        //catgeory.selectByIndex(5);
        catgeory.selectByValue("search-alias=automotive");
    }

    @Given("user navigates to Amazon dropdown page")
    public void DropdownPage() {

        driver.get("https://www.amazon.in/");
    }

    @When("user check the dropdown list of all values")
    public void ListOfAllValues() {

        int dropdown = driver.findElements(By.xpath("//*[@id=\"searchDropdownBox\"]/child::option")).size();

        for(int i=0; i<dropdown; i++){

            String dropdownslist = driver.findElements(By.xpath("//*[@id=\"searchDropdownBox\"]/child::option")).get(i).getText();
            System.out.println(dropdownslist);
        }
    }


    @Given("user click on baby wishlist")
    public void BabyWishlist() {

        WebElement accountListElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions A = new Actions(driver);
        A.clickAndHold(accountListElement).build().perform();
        //driver.findElement(By.linkText("Baby Wishlist")).click();
        driver.findElement(By.partialLinkText("Baby Wish")).click();

    }

    @Then("user validate the title of the page")
    public void TitleOfThePage() {
    }

    @Given("user perform drag and drop operation")
    public void DragAndDropOperation() {

        WebElement frameElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);

        WebElement dragElement = driver.findElement(By.id("draggable"));
        WebElement dropElement = driver.findElement(By.id("droppable"));
        Actions a = new Actions(driver);
        a.dragAndDrop(dragElement,dropElement).build().perform();

        //driver.switchTo().defaultContent();
    }

    @Given("user enters the login and password")
    public void Login() throws IOException {

        driver.findElement(By.cssSelector("#username")).sendKeys(ReadExcel.getCellValue("login",0,0));
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(ReadExcel.getCellValue("login",1,0));

          }
}

