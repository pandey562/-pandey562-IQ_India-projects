package seleniumBrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Windows_Handle {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		driver.manage().window().maximize();
		String bc = "";
		String cm = "";
		String xp = "";
		String ad = "";
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		String pwindow=driver.getWindowHandle();       // gives the parent window id only
		System.out.println(pwindow);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at Parent Page");
		options.addArguments("--disable-notifications");
		
		
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		Set<String> cwindow = driver.getWindowHandles();
		for(String wid : cwindow)
		{
			if(!wid.equals(pwindow))
			{
				driver.switchTo().window(wid);
				Thread.sleep(1000);
				String title = driver.getTitle();
				if(title.contains("Basic Controls")) {
					bc = wid;
					System.out.println(bc);
				}
				else if (title.contains("Contact me")) {
					cm = wid;
					System.out.println(cm);
				}
				else if(title.contains("Xpath Practice")) {
					xp = wid;
					System.out.println(xp);
				}
				else if (title.contains("AlertsDemo")) {
					ad = wid;
					System.out.println(ad);
				}
			}
		}
//		
//		// working on Basic Control
//		
		driver.switchTo().window(bc);
		Thread.sleep(2000);
		String str1 = driver.getTitle();
		System.out.println(str1);
		driver.close();
//		
//		//working on Contact Me
//		
		driver.switchTo().window(cm);
		Thread.sleep(2000);
		String str2 = driver.getTitle();
		System.out.println(str2);
		driver.close();
//		
//		// working on Xpath Practice
//		
		driver.switchTo().window(xp);
		Thread.sleep(2000);
		String str3 = driver.getTitle();
		System.out.println(str3);
		driver.close();
//		
//		// working on AlertsDemo
//		
		driver.switchTo().window(ad);
		Thread.sleep(2000);
		String str4 = driver.getTitle();
		System.out.println(str4);
		driver.close();
		
		driver.switchTo().window(pwindow);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent page after child");
		Thread.sleep(1000);
		driver.quit();
		
	}
	}


