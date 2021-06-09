import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


 class Main {
     private WebDriver driver;


    @BeforeAll
    static void setUpAll() {
        System.setProperty("webdriver.chrome.driver", "artifacts/chromedriver.exe");
    }

    @BeforeEach
    void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }

    @Test
    void Test1() throws InterruptedException {
        driver.get("https://google.com/mail");
       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("YakovlevaVeronika16", Keys.ENTER);
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Veronaya1", Keys.ENTER);








        //   driver.findElement(By.xpath("//input[@class='aCsJod oJeWuf']")).sendKeys("veronika.yaka", Keys.ENTER);
        //   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //  driver.findElement(By.xpath("//div[@class=Textinput Textinput_iconRight Textinput_view_floating-label Textinput_size_l")).sendKeys("veronika.yaka", Keys.ENTER);

//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//
//        driver.findElement(By.cssSelector("input[type=aria-label='Введите пароль']")).sendKeys("Veronaya1");


        //driver.findElement(By.cssSelector("input[@type='password']")).sendKeys("Veronaya1");
        //driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Veronaya1");
        // driver.findElement(cssSelector("[data-initial-dir]")).sendKeys("Veronaya1", Keys.ENTER);
        //driver.findElement(cssSelector(".hDp5Db")).sendKeys("Veronaya1", Keys.ENTER);
// Thread.sleep(10000);
        //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

}

