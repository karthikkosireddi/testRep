import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExecutor {
	static WebDriver myD;

	public static void runTestStep(String fKW, String fEID, String fTD) {
		// myD = fDriver;
		
		if (fKW.equals("openBrowser")) {
			openBrowser(fTD);
		}
			else if (fKW.equals("closeBrowser")) {
				closeBrowser();
			} 
				else if (fKW.equals("navigateBrowser")) {
					navigateBrowser(fTD);
				} 
		} 
	
	public static void openBrowser(String browserType) {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Training\\SDET-Nov2019\\KDF\\Drivers\\chromedriver.exe");
		 myD = new ChromeDriver();
			 
	}
	
	public static void navigateBrowser(String fURL) {
		myD.navigate().to(fURL);
	}
	
	public static void closeBrowser() {
		myD.close();
	}
}
