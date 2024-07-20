package TakesScreenshot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TakesScreenshot02 {

	public static void main(String[] args) throws IOException {

  WebDriverManager.chromedriver().setup();
  ChromeDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.google.in/");
	        //Step1= FOR TAKING FULL PAGE Screenshot:- 
  TakesScreenshot ts= (TakesScreenshot)driver; //convert driver's object into TakesScreenshot interface
	                                                     //becoz Webdriver & Interface has not access to each other
	        //step2=
File src=ts.getScreenshotAs(OutputType.FILE); // img capture hoga by File method se
File img_path=new File("C:\\Users\\Himanshu\\eclipse-workspace\\GTCCAB\\Screenshot\\img.png"); //img_path me captured img save hoga     
  
  //  step3=   captured img copy hoga src to img_path me by using FileUtils library  =
FileUtils.copyFile(src, img_path);  //ye library hai mvn repositry site pe->(Apache commons IO) se pom.xml me dependency me save hoga 
          
 

  

	}

}
