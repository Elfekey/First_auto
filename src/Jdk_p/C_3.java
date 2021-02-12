package Jdk_p;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\progs\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--lang=en-GB");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		//for scrolling down
		/*
        WebElement sr = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        sr.sendKeys("news");
        sr.sendKeys(Keys.RETURN);
        //scroll to the end of page
       // ((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //scroll to a specific pixels
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)");
        
        */
		
		//E010 findelement by 2 attributes 
		/* WebElement sr_by2_attributes = driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi') and contains"
		 		+ "(@name,'q')]"));
		 sr_by2_attributes.sendKeys("news");*/
		
		/*//E011 click using JS
		
		WebElement sr_clck = driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi') and contains(@name,'q')]"));
		sr_clck.sendKeys("news");
        	//here click with java script
		
		WebElement sr_clck_JS = driver.findElement(By.xpath("//input[contains(@class,'gNO89b') and contains(@name,'btnK')]"));
		sr_clck_JS.sendKeys("news");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",sr_clck_JS);
		System.out.println("Clicked");*/
		
		/*//E012Scroll to Element in Selenium -  Verify if Radio Button Checked
		WebElement Chk_RD = driver.findElement(By.xpath("//*[@id=\"post-909\"]/div/div[1]/div/div[3]/div/div[1]/div[7]/div/div/div/form/input[1]"));
		//scroll to our radio btn
		//scroll first
		WebElement Linkto_scrol = driver.findElement(By.xpath("//*[@id=\"post-909\"]/div/div[1]/div/div[3]/div/div[1]/div[3]/div/div/h4/span"));

	
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Linkto_scrol);
		
		if (Chk_RD.isSelected()) {
			System.out.println("Selected");
		}
		else {
		Chk_RD.click();
		System.out.println("Selected just now ");
		}*/	
		
	/*	//E013 Find All Elements with the same id
		int Counter_Of_the_same =driver.findElements(By.id("idExample")).size();
		System.out.println("The No of the same element is ="+Counter_Of_the_same);
		*/
		
		/*	// E014  Navigation Commands in Selenium forward | backward  
		WebElement El_to_try =driver.findElement(By.id("idExample"));
		El_to_try.click();
	    driver.navigate().refresh();
		System.out.println("Refreshed");
        driver.navigate().back();
		System.out.println("back");
        driver.navigate().forward();
		System.out.println("forward");  */ 
		
	/*	// E015 Take Screenshot in Selenium Webdriver  Still Trying ################
        
		File scrfile_tr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.print("Sc Took");
	*/
	/* // E016 Double Click in Selenium Webdriver EVENT
		
		WebElement DC_Try = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');"+ 
			    "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"+ 
			    "arguments[0].dispatchEvent(evt);",DC_Try);
		System.out.println("Double Clicked");*/
		
		
 /*  // E017 Get Element Text 
		WebElement sing_Btn= driver.findElement(By.xpath("//*[@id=\"gb_70\"]"));
		String Str = sing_Btn.getText().toString();
		System.out.println("the button Name is "+Str);
		
		*/
	/*	// E018 Get Attribute Value of class
		WebElement class_attribute_value= driver.findElement(By.xpath("//*[@id=\"gb_70\"]"));
		String Str2 = class_attribute_value.getAttribute("class");//maybe class replaced with id or name or any attribute
		System.out.println("the attribute  is : "+Str2);
	
		if (Str2.contains("gb_")) {
			System.out.println("the attribute  is :ConTains the Value gb_ ");
		}
		else {
			System.out.println("the attribute  is : Doesn't ConTains the Value gb_ ");
		}*/
		  
		// E019  Check if Image is displayed
		/*
		 WebElement logo_try = driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));
		 
		 boolean Checking_logo = (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", logo_try);
		if (Checking_logo) {
			System.out.println("Cheked image logo exist");
			
		}
		else {
			System.out.println("Cheked image logo DOESN't exist");
		}
		String logo_id = logo_try.getAttribute("id"); 
		System.out.println("and It's id is :"+logo_id);
		*/
		
		
		
		
				}

}
