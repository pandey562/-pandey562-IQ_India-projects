package TakesScreenshot;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts= (TakesScreenshot)driver;  //convert driver's object into TakesScreenshot interface
		                                              //becoz Webdriver & Interface has not access to each other
		
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println(ldt);
		DateTimeFormatter dt= DateTimeFormatter.ofPattern("ddMMyyyyHHmmss"); 
		String str=ldt.format(dt);
		driver.get("https://www.google.in/");
		byte[] bytearr=ts.getScreenshotAs(OutputType.BYTES);  //page ki screenshot lega bytes me
		String path=("C:\\Users\\Himanshu\\eclipse-workspace\\GTCCAB\\Screenshot\\"+str+".png"); //image store destination
		FileOutputStream fos=new FileOutputStream(path);
		fos.write(bytearr);

	}

}
