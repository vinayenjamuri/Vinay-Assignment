package excercise;

import org.openqa.selenium.WebDriver;

public class ExcercisePage extends ExcercisePageObjects {
	
	private static WebDriver driver = null;
	
	public float getVal1(){
		String v1;
		float val1;
		v1 = value1(driver).getText();
		val1 = Float.parseFloat(v1.substring(1));	
		return val1;
		
	}
	
	public float getVal2(){
		String v2;
		float val2;
		v2 = value2(driver).getText();
		val2 = Float.parseFloat(v2.substring(1));	
		return val2;
	}
	
	public float getVal3(){
		String v3;
		float val3;
		v3 = value3(driver).getText();
		val3 = Float.parseFloat(v3.substring(1));	
		return val3;
	}
	
	public float getVal4(){
		String v4;
		float val4;
		v4 = value4(driver).getText();
		val4 = Float.parseFloat(v4.substring(1));	
		return val4;
	}
	
	public float getVal5(){
		String v5;
		float val5;
		v5 = value5(driver).getText();
		val5 = Float.parseFloat(v5.substring(1));	
		return val5;
	}
	
	public float totalVal(){
		float sum;
		sum = getVal1() + getVal2() + getVal3() + getVal4() + getVal5();
		return sum;
	}
	
	public String actualTotalVal(){
		String txtttl;
		txtttl = totalBal(driver).getText();
		return txtttl.substring(1);
	}
}
