import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tryCatch {
	static WebDriver myD;

	public static void main(String[] args) {
		System.out.println(">>>>>>>>> This is BEFORE my Test");
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
    	
    	myD = new ChromeDriver();
    	myD.manage().window().maximize();
    	myD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	try {
	    	myD.navigate().to("https://southwest.com/");
	    	
	    	String xP = "//*[@id=\"TabbedArea_4-tab-3\"]/span/span/span[2]";
	    	Thread.sleep(3000);
	    	myD.findElement(By.xpath(xP)).click();
	    
	    	myD.close();
	    	System.out.println("End of test");
    	} catch (Exception e) {
    		System.out.println(" >>>>>> Error Occurred " + e);
    	}
    	
    	System.out.println("After Try Catch");
    	

	}

}
