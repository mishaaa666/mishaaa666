package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutoTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/olesa/IdeaProjects/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("[name='q']")).clear();
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Hello World");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".g h3")).click();
        System.out.println(driver.getTitle());


        Thread.sleep(5000);
        driver.quit();
    }
}