package seleniumBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CssSelector {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
	
		driver.get("https://www.gtccabs.com");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Log In")).click();
	    driver.findElement(By.cssSelector("input#Email")).sendKeys("himanshupd01@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("123");
	    driver.findElement(By.cssSelector("button.signin-btn")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Airport']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Rental']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Sharing Taxi']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='RoundTrip']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='OneWay']")).click();
	    driver.findElement(By.cssSelector("input#PickupLocation")).sendKeys("Noida, Uttar Pradesh, India");
	    driver.findElement(By.id("DropLocation")).sendKeys("Prayagraj, Uttar Pradesh, India");
	    driver.findElement(By.cssSelector("input#PickupDate")).sendKeys("18-06-2024");
	    Thread.sleep(1000);
	    driver.findElement(By.id("PickupTime")).sendKeys("12:00 AM");
	    driver.findElement(By.xpath("//button[@onclick='SearchOneWayCab()']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@class='signup-btn mysbtn' and @onclick='BookNow(4)']")).click();
	    driver.findElement(By.xpath("//input[@id='book_terms']")).click(); //checkbox click hoga
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[@id='BtnPayTotalAmount']")).click();
	  
	    

	
	
	
	
	
	
	
	}

}
