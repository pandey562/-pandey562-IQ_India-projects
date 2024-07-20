package TakesScreenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TakesScreenshot1 {

	public static void main(String[] args) {
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize(); 
	 
   TakesScreenshot ts=(TakesScreenshot)driver;  
   driver.get("https://www.google.com");
   String  path="C:\\Users\\Himanshu\\eclipse-workspace\\GTCCAB\\Screenshot\\image4.png"; //path-variable=>me save hogi image
          //FIle-> class hai
   // ts.getScreenshotAs(Output Type.FILE/BASE64/BYTES):= 3 ways hai Screenshot store by-FILE,BYTE,BASE64
                   
            
                 //FILE-class hai
   File srcFile=ts.getScreenshotAs(OutputType.FILE);            
   File targetfile=new File(path);
   try {
	   FileUtils.copyFile(srcFile, targetfile);
   }
   catch (IOException e){
	   e.printStackTrace();
   }
   
                      //BASE64=
//    FileOutputStream fos=new FileOutputStream(path); 
//    String base64=  ts.getScreenshotAs(OutputType.BASE64);    //source pe screenshot lega aur ye FILE me jaayega
//    byte[] bytearr= Base64.getDecoder().decode(base64);
//    fos.write(bytearr);
   
   
                     //BYTES=
//   FileOutputStream fos=new FileOutputStream(path); 
//   byte[] bytearr=  ts.getScreenshotAs(OutputType.BYTES);    //source pe screenshot lega aur ye FILE me jaayega
//   fos.write(bytearr);
   
   
	 driver.close();   
	}

}






