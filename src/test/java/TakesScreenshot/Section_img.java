package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Section_img {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.gtccabs.com/");
        //Particular Section ka Screenshot lene k liye
        WebElement sctn_img =driver.findElement(By.xpath("//*[@class='collapse navbar-collapse']"));
        File src=sctn_img.getScreenshotAs(OutputType.FILE);
        File path=new File("C:\\Users\\Himanshu\\eclipse-workspace\\GTCCAB\\Screenshot\\img12.png");
        FileUtils.copyFile(src, path);
	}

}
