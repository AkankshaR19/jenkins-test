package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

    @Test
    public void login() throws Exception {

    	WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
        

        driver.get("https://opensource-demo.orangehrmlive.com/");

        Thread.sleep(3000);

        driver.findElement(By.name("username"))
              .sendKeys("Admin");

        driver.findElement(By.name("password"))
              .sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']"))
              .click();

        Thread.sleep(3000);

        System.out.println("Login Successful");

        driver.quit();
    }
}
