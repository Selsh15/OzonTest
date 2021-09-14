import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ozonPr {
    public WebDriver driver;

    @Before
    public void pay() {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ozon.ru");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void ozonTest() {
        driver.findElement(By.xpath("//input[@placeholder]")).sendKeys("Dakine");
        driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/form/button")).click();
        driver.findElement(By.xpath(".//span[contains(text(),'Рюкзак Dakine Campus M 25L')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Добавить в корзину')]")).click();
        driver.findElement(By.xpath(".//span[contains(text(),'Корзина')]")).click();
        driver.findElement(By.xpath("//div[@class='g5c8 _2avF']")).click();
        driver.findElement(By.xpath(".//span[contains(text(),'Удалить') and @class='a7w']")).click();
        driver.findElement(By.xpath(".//div[contains(text(),'Удалить') and @class='kxa6']")).click();
    }

    @After
    public void close(){
        driver.quit();
    }

    }




