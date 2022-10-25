package Com.PracticeFramework.Com.PracticeFrame1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Ilisteners extends Usability implements ITestListener {
	public org.apache.log4j.Logger lg=org.apache.log4j.Logger.getLogger(Ilisteners.class.getName());

		public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\target\\Log 4J.properties");
		lg.info("starting the test");
	}
		

	public void onTestSuccess(ITestResult result) {
		String path = System.getProperty("user.dir");
		Date dt =new Date();
		String sw=dt.toString().replace("", "_").replace(":", "_");
		this.driver = ((Usability)result.getInstance()).driver;
		File ds=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ds, new File(path+"\\Pictures\\Passed"+sw+"pictures.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
			
	public void onTestFailure(ITestResult result) {
		String path = System.getProperty("user.dir");
		Date dt =new Date();
		String sw=dt.toString().replace("", "_").replace(":", "_");
		this.driver = ((Usability)result.getInstance()).driver;
		File ds=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ds, new File(path+"\\Pictures\\Failed"+sw+"Shots.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}

