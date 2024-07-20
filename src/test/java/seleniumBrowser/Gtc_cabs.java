package seleniumBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gtc_cabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		//webpage ko launch krne k liye
	    driver.get("https://www.gtccabs.com");
	    //opened window ko maximize krega
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Log In")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Email")).sendKeys("himanshupd01@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("123");
        Thread.sleep(1000);
        driver.findElement(By.className("signin-btn")).click();
        driver.findElement(By.xpath("//input[@id='PickupLocation']")).sendKeys("Noida, Uttar Pradesh, India");
        driver.findElement(By.xpath("//input[@id='DropLocation']")).sendKeys("Prayagraj, Uttar Pradesh, India");
        driver.findElement(By.xpath("//input[@id='PickupDate']")).sendKeys("18-06-2024");
        driver.findElement(By.xpath("//input[@class='pac-target-input abox timeOnly']")).sendKeys("12:00 AM");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"one-way\"]/div/div[6]/button")).click();
        driver.findElement(By.linkText("RoundTrip")).click();
       // driver.findElement(By.className("search-btn fmbtn")).click();
      //  driver.findElement(By.xpath("//button[@class='search-btn fmbtn']")).click();
      //  driver.close();
	}

}
