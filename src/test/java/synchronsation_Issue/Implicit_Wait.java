package synchronsation_Issue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit_Wait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.gtccabs.com/");
        //using implicit wait() mathod=
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicit wait saare web element pe apply hoga
       
        Stopwatch sw= null;
        try {
        	sw=Stopwatch.createStarted();
        driver.findElement(By.linkText("RoundsTrip")).click(); // sahi ye hoga=>RoundTrip
        }
        catch(Exception E) {
        	sw.stop();
        	System.out.println(E);
        	System.out.println(sw.elapsed(TimeUnit.SECONDS) + " seconds");
        }
	}

}
