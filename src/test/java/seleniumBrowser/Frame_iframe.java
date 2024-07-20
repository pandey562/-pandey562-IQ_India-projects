package seleniumBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Frame_iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	    Thread.sleep(2000);
	    driver.findElement(By.id("name")).sendKeys("Main page");
	   
	    //driver k focus ko switch kiye new frame1 p:-
        driver.switchTo().frame("frm1");
        Thread.sleep(1000);
       WebElement we= driver.findElement(By.id("ide"));
       Select sl=new Select(we);
        sl.selectByIndex(2);
        driver.switchTo().parentFrame();  //ek window back jayega and defaultContent se main page jump hoga
        Thread.sleep(1000);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Himanshu sir");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frm3");
        //bade frm3 k andar frame 2 me gaye
        driver.switchTo().frame("frm2");
        Thread.sleep(1000);
        driver.findElement(By.id("firstName")).sendKeys("Himanshu");
        driver.findElement(By.id("lastName")).sendKeys("pandey");
        driver.findElement(By.id("malerb")).click();
        driver.findElement(By.id("englishchbx")).click();
        
        driver.switchTo().defaultContent();  //main page aa gya
        driver.switchTo().frame("frm3");      //3rd frame pe gya from main page
        WebElement wel= driver.findElement(By.id("BlogArchive1_ArchiveMenu"));
        Select sls=new Select(wel);
        sls.selectByIndex(2);
        driver.switchTo().parentFrame();     //main page pe aa gya
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Mission Complete!!");
        //Total no. of frames in web pages:=
        int sizes=driver.findElements(By.tagName("iframe")).size();	
                  System.out.println("Total iframes:= "+sizes);
	}

}
