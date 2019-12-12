import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SW1 {
	WebDriver myD;

	@Before // Gets executed before every test
	public void myBeforeTest() throws InterruptedException {
		System.out.println(">>>>>>>>> This is BEFORE my Test");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Training\\SDET-Nov2019\\KDF\\Drivers\\chromedriver.exe");
		myD = new ChromeDriver();
		myD.manage().window().maximize(); 
		myD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		myD.navigate().to("https://southwest.com/");
		
		Thread.sleep(2000);

	}
	
	@Test // This is one of my tests 
	public void myTest1() {
		System.out.println("This is My Test1 ");
	}
	
	@Test // This is one of my tests 
	public void myTest2() {
		System.out.println("This is My Test2 ");
	}
	
	@Test // This is one of my tests 
	public void myTest3() {
		System.out.println("This is My Test3 ");
	}
	
	@Test // This is one of my tests 
	public void myTest4() {
		System.out.println("This is My Test4 ");
	}
	
	@After // This gets executed after each test
	public void myAfterTest() {
		myD.quit();
		System.out.println("This is After my Test");
	}

}
