package seleniumBrowser;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class New_Window_Tab {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    
	    //open new url window
	    driver.get("https://www.hyrtutorials.com/");
	    driver.manage().window().maximize();
	    System.out.println("First page "+ driver.getTitle());
	    
	    //open new tab window
	    driver.switchTo().newWindow(WindowType.TAB);
	    
	    driver.get("https://www.facebook.com/");
	    System.out.println("Second page "+driver.getTitle());
	    
	    //open new tab window
	    driver.switchTo().newWindow(WindowType.TAB);
	    
	    driver.get("https://www.instagram.com/");
	    System.out.println("3rd page: "+ driver.getTitle());
	    
	    
	    // windowHandles for all open Windows/tabs:-
	    Set<String> abc= driver.getWindowHandles();
	    List<String>handles=new ArrayList<String>();  
	    handles.addAll(abc);
	    
	    driver.close();    
	    driver.switchTo().window(handles.get(1));  //switch to facebook window i.e 2nd index
      System.out.println("2nd index: "+ driver.getTitle());  //webpage ka title ka name print hoga 2nd index pe jo hoga
	    
}
}







