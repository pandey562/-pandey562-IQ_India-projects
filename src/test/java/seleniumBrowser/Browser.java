package seleniumBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// YE CHROME BROWSER KO LAUNCH KRTA HAI
		WebDriver driver =new ChromeDriver();		
		//ye webpage ko launch krta hai
		driver.get("http://altoro.testfire.net/login.jsp");
		//window ko full screen krne k liye
		driver.manage().window().maximize();
		//1 sec wait krke chalega
		Thread.sleep(1000);
		//ye locate krega particular element ko
		driver.findElement(By.id("uid")).sendKeys("jsmith");
	//	Absolute xpath locate krna
		//driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/input")).sendKeys("demo1234");
		
		//Relative xpath locate krna using single attribute
		driver.findElement(By.xpath("//input[@id='passw']")).sendKeys("demo1234");
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(1000); 
		driver.findElement(By.linkText("Transfer Funds")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("View Recent")).click();
		Thread.sleep(1000);
		driver.findElement(By.tagName("img")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("subheader")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(1000);
		//back page pe jaane k liye
		//driver.navigate().back();
		//driver.close();
	}

}
