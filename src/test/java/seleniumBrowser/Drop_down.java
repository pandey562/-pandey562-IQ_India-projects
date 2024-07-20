package seleniumBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Drop_down {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	    driver.manage().window().maximize();
	    WebElement element =driver.findElement(By.xpath("//select[@id='course']		/child::option"));
        
	    Select dropdown=new Select(element);
	    Thread.sleep(1000);
	    dropdown.selectByVisibleText("Python");  //ye jo dropdown list pe likha hai
	    dropdown.selectByIndex(4);
	    dropdown.selectByValue("js");            //ye jo inspect krke optionvalue me hai 
	   
	    
	    //dropdown list ko multiple select krne k liye
	    if(dropdown.isMultiple())
	    {
	    	System.out.println("Yes dropdown is multiple");
	    }
	    else 
	    {
	    	System.out.println("no multiple");
	    }
	    
	    //dropdown k sare listname ko agar print krna ho:
	    List <WebElement> alldropdownname= dropdown.getOptions();
	    System.out.println("Total size= "+alldropdownname.size());
	    for(WebElement we: alldropdownname)
	    {
	    	   String str=we.getText();
	    	   System.out.println(str);
	    	   System.out.println(we.getText());
	    	   dropdown.deselectByVisibleText(str);
	    }
	    driver.close();
	 
	}

}
