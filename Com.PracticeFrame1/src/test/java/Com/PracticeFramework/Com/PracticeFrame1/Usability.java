package Com.PracticeFramework.Com.PracticeFrame1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Usability {
	public WebDriver driver;
   @Parameters({"browser","website"})
	@BeforeClass
	public void beforeClass(String browser, String website) {
		String path = System.getProperty("user.dir");
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(website);
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", path + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(website);
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", path + "\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get(website);
			driver.manage().window().maximize();
		}
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
