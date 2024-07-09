package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone13");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//img[@alt='Apple iPhone 13 (128GB) - Starlight']")).click();
        //driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
        //driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
        //*[@id="add-to-cart-button"]
    }
}
