import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {

    private WebElement loginInput;
    private WebElement enter;
    private WebElement passInput;
    private WebElement enter2;
    private final WebDriver driver;
    public LoginPage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver();
        driver.get("https://google.com/mail");
    }

    public void login(String login, String pass) throws InterruptedException {
        enterLoginAndClickNext(login);
        enterPasswordAndClickNext(pass);
    }

    private void findElementsForLogin() throws InterruptedException {
        Thread.sleep(5000);
        loginInput = driver.findElement(By.id("identifierId"));
        enter = driver.findElement(By.id("identifierNext"));
    }

    public void enterLoginAndClickNext(String login) throws InterruptedException {
        findElementsForLogin();
        loginInput.sendKeys(login);
        enter.click();
    }

    public void enterPasswordAndClickNext(String pass) throws InterruptedException {
        findElementsForPassword();
        passInput.sendKeys(pass);
        enter2.click();
    }

    private void findElementsForPassword() throws InterruptedException {
        Thread.sleep(5000);
        passInput = driver.findElement(By.name("password"));
        enter2 = driver.findElement(By.id("passwordNext"));
    }

}
