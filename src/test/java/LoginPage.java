import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.cssSelector;

public class LoginPage {

    WebDriver driver = new ChromeDriver();



    WebElement loginInput = driver.findElement(By.id("login"));
    WebElement enter = driver.findElement(By.id("enter"));
    WebElement passInput = driver.findElement(By.id("pass"));
    WebElement enter2 = driver.findElement(By.id("enter"));


public void login ( String login ,String pass ){
    loginInput.sendKeys(login);
    enter.sendKeys();
    passInput.sendKeys(pass);
    enter2.sendKeys();

}

}
