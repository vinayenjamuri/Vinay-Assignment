package excercise;

import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcerciseTest extends ExcercisePage{

	WebDriver driver;
	
	public void openBrowser(){
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void openUrl(){
		try {
			driver.get("https://www.exercise1.com/values");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeBrowser(){
		try{
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testExcercise(){
		
		String a1 = actualTotalVal();
		Float val = totalVal();
		NumberFormat f = NumberFormat.getCurrencyInstance();
		String a2 = f.format(val);
		
		if(a1.equals(a2)){
			System.out.println("Test Pass");
		}else{
			System.out.println("Test Fail");
		}
	}
	
	public static void main(String[] args) {

		ExcerciseTest test = new ExcerciseTest();
		//Test starts here
		test.openBrowser();
		test.openUrl();
		test.testExcercise();
		test.closeBrowser();
	}

}
