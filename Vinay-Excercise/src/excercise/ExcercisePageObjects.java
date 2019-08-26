package excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExcercisePageObjects {

	private static WebElement element = null;

	public static WebElement labelvalue1(WebDriver driver){
		
		element = driver.findElement(By.id("lbl_val_1"));
		
		return element;
	}
	
	public static WebElement labelvalue2(WebDriver driver){
		
		element = driver.findElement(By.id("lbl_val_2"));
		
		return element;
	}
	
	public static WebElement labelvalue3(WebDriver driver){
		
		element = driver.findElement(By.id("lbl_val_3"));
		
		return element;
	}
	
	public static WebElement labelvalue4(WebDriver driver){
		
		element = driver.findElement(By.id("lbl_val_4"));
		
		return element;
	}
	
	public static WebElement labelvalue5(WebDriver driver){
		
		element = driver.findElement(By.id("lbl_val_5"));
		
		return element;
	}
	
	public static WebElement labelTotalBal(WebDriver driver){
		
		element = driver.findElement(By.id("lbl_ttl_val"));
		
		return element;
	}
	
	public static WebElement value1(WebDriver driver){
		
		element = driver.findElement(By.id("txt_val_1"));
		
		return element;
	}
	
	public static WebElement value2(WebDriver driver){
		
		element = driver.findElement(By.id("txt_val_2"));
		
		return element;
	}
	
	public static WebElement value3(WebDriver driver){
		
		element = driver.findElement(By.id("txt_val_3"));
		
		return element;
	}
	
	public static WebElement value4(WebDriver driver){
		
		element = driver.findElement(By.id("txt_val_4"));
		
		return element;
	}
	
	public static WebElement value5(WebDriver driver){
		
		element = driver.findElement(By.id("txt_val_5"));
		
		return element;
	}
	
	public static WebElement totalBal(WebDriver driver){
		
		element = driver.findElement(By.id("txt_ttl_val"));
		
		return element;
	}
}
