package seleniumBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='alertBox']")).click();  
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();  //cancel krne l liye ->'dismiss'
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='promptBox']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Himanshu Pandey");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();  //ok k liye 'accept' likhenge
	}

}
