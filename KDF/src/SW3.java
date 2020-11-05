import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SW3 {
 WebDriver myD;
	@Before // Gets executed before every test
	public void myBeforeTest() throws InterruptedException {
    	System.out.println(">>>>>>>>> This is BEFORE my Test");
    	
    	//System.setProperty("webdriver.chrome.driver", "C:\\Training\\SDET-Nov2019\\KDF\\Drivers\\chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nasser\\eclipse-workspace\\Drivers\\chromedriver.exe");
    	myD = new ChromeDriver();
    	myD.manage().window().maximize();
    	myD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	myD.navigate().to("https://southwest.com/");
    	
    	Thread.sleep(2000);
    	System.out.println("End of Before");
	}
	
	@Test // This is one of my tests, with Dallas and SFO as inputs
	public void myTest1() throws InterruptedException {
    	System.out.println(" This is one of my tests, with Dallas and SFO as inputs");

    	myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.CONTROL + "a");
  myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.DELETE);
  myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("tex");
  Thread.sleep(2000);
  myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode--item-3")).click();
  
  
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.CONTROL + "a");
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.DELETE);
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("sfo");
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode--item-1")).click();
  
  myD.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();
  myD.findElement(By.xpath("//*[@id='NumberSelector_259--flyout-trigger']/div/div/div[1]/div/div[2]/button[2]")).click();
  myD.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();

	}
	
	@Test // This is one of my tests, trying to select departure and return dates
	public void myTest2() throws InterruptedException {
    	System.out.println("This is one of my tests, trying to select departure and return dates ");
Thread.sleep(1000);  	myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.CONTROL + "a");
  myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.DELETE);
  myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("tex");
  Thread.sleep(2000);
  myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode--item-3")).click();
  
  
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.CONTROL + "a");
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.DELETE);
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("sfo");
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode--item-1")).click();
  
  myD.findElement(By.id("LandingAirBookingSearchForm_departureDate")).click();
  myD.findElement(By.id("calendar-256-2019-10-23")).click();
  
  Thread.sleep(1000);
  
  myD.findElement(By.id("LandingAirBookingSearchForm_returnDate")).click();
  myD.findElement(By.id("calendar-256-2019-12-28")).click();
  
  myD.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();
  myD.findElement(By.xpath("//*[@id='NumberSelector_259--flyout-trigger']/div/div/div[1]/div/div[2]/button[2]")).click();
  myD.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();
	}
	
	@Test // This is one of my tests with CHicago and Panama City as inputs and increasing adults count by 2
	public void myTest3() throws InterruptedException {
    	System.out.println("This is one of my tests with CHicago and Panama City as inputs and increasing adults count by 2 ");
    	myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.CONTROL + "a");
  myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.DELETE);
  myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("ind");
  Thread.sleep(2000);
  myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode--item-1")).click();
  
  
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.CONTROL + "a");
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.DELETE);
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("pen");
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode--item-2")).click();
  
  myD.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();
  myD.findElement(By.xpath("//*[@id='NumberSelector_259--flyout-trigger']/div/div/div[1]/div/div[2]/button[2]")).click();
  myD.findElement(By.xpath("//*[@id='NumberSelector_259--flyout-trigger']/div/div/div[1]/div/div[2]/button[2]")).click();
  
  myD.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();

	}
	
	@Test // This is one of my tests with Nashville and Philadelphia as inputs
	public void myTest4() throws InterruptedException {
    	System.out.println("This is one of my tests with Nashville and Philadelphia as inputs ");
    	myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.CONTROL + "a");
  myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.DELETE);
  myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("ill");
  Thread.sleep(2000);
  myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode--item-4")).click();
   myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.CONTROL + "a");
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.DELETE);
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("ind");
  myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode--item-2")).click();
  
  myD.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();
  myD.findElement(By.xpath("//*[@id='NumberSelector_259--flyout-trigger']/div/div/div[1]/div/div[2]/button[2]")).click();
  myD.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();

	}
	
	@After // This gets executed after each test
	public void myAfterTest() {
    	myD.quit();
    	System.out.println("This is After my Test");
	}

}
