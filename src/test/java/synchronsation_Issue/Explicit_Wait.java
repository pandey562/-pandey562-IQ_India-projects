package synchronsation_Issue;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_Wait {

	public static void main(String[] args) {
	
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
  driver.findElement(By.xpath("//button[@id='btn1']")).click();
 
  //using Explicit Wait() method:= ye Web Element Specific Hai aur isme Expected Condiotions mention karte hai
  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
  
  //driver.findElement(By.xpath("//button[@id='btn1']")).sendKeys("AFTER 5 SECONDS");
 WebElement we= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn1']")));
 we.sendKeys("AFTER 5 SECONDS");
	

	}

}
