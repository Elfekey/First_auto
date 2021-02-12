package Jdk_p;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class C_4_from20 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\progs\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--lang-en-GB");
	
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
				//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//	driver.get("https://www.phptravels.com/"); //this the same next line job
		//driver.navigate().to("https://www.google.com/");
		
     	//E020 Switch to default content - active element - input text value
	/*	
		WebElement app_cli = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div[1]/div/a"));
		app_cli.click();
		//switch iframe 
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[3]/iframe"));
      	driver.switchTo().frame(iframe);
      	System.out.println("IFRAME Switched");
      	//get attribute value of translation
		WebElement translation_bt = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[11]/a"));
        String Trans_val = translation_bt.getAttribute("target").toString();
        System.out.println("The Value of translation_bt is: "+Trans_val);
        
        //switch again to default
        driver.switchTo().defaultContent();
        //search and clear
		WebElement search_plac = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		search_plac.sendKeys("news");
		//to delay the process for a sec for see
		Thread.sleep(1000);
		search_plac.clear();
		search_plac.sendKeys("wikies of the month");
		
        //get the active element of the screen 
		 String active_element_value= driver.switchTo().activeElement().getAttribute("value");
		//get the written word in the acrive element
	        System.out.println("The Value of translation_bt is: "+active_element_value);
			Thread.sleep(5000);
	        System.out.println("the driver will be closed automatic");

      driver.quit();
      */
		//E021 Switch between tabs 
      /*    ((JavascriptExecutor)driver).executeScript("window.open('https://www.google.com/','_blank')");
          
         ArrayList<String> tab_list = new ArrayList<String> (driver.getWindowHandles()) ;
         driver.switchTo().window(tab_list.get(0));
         Thread.sleep(1000);

         driver.switchTo().window(tab_list.get(1));
         Thread.sleep(1000);

         driver.switchTo().window(tab_list.get(0));
         driver.close();
         Thread.sleep(2000);
         driver.quit();
         */
		//E022 Get Parent Element by child
		
	/*	WebElement child_nod = driver.findElement(By.xpath("//*[@id=\"gb_70\"]"));
  		 String child_nod_txt  = child_nod.getAttribute("class").toString();
	        System.out.println("child_nod_txt :"+child_nod_txt);
	        //Parent
	        WebElement parent_el = (WebElement) ((JavascriptExecutor) driver).executeScript(
                    "return arguments[0].parentNode;", child_nod);
	        String parent_nod_txt  = parent_el.getAttribute("class").toString();
	        System.out.println("parent_nod_txt :"+parent_nod_txt);
	        */
		// 023 Get Child Element by parent
	/*	
		WebElement parent_no = driver.findElement(By.id("fsr"));
		List<WebElement> Childs_l =parent_no.findElements(By.tagName("a"));
		String  child_txt = Childs_l.get(0).getText();
        System.out.println("parent_nod_txt :"+child_txt);
*/

		
/*		//E024 Download File using
		 HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	        chromePrefs.put("profile.default_content_settings.popups", 0);
	        chromePrefs.put("download.default_directory", "D:\\Testing\\2");
	        chromePrefs.put("download.prompt_for_download", true);


             DesiredCapabilities caps = new DesiredCapabilities();
             caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
             
             ChromeOptions opt = new ChromeOptions();
             opt.setExperimentalOption("prefs", chromePrefs);
	      //opening Chrome driver download page and maximizing it
			driver.get("https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/");
			driver.manage().window().maximize();
			
			// locating and clicking on download Chrome Driver for windows operating system. 
		 	WebElement chrome_for_windows = driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td[2]/a"));
		 	chrome_for_windows.click();

	        */
/*	        // E027 Hover Over Element - Chrome Webdriver 
        Thread.sleep(5000);

	         WebElement Com_menue = driver.findElement(By.xpath("/html/body/header/div/nav/div[3]/span"));
	         Actions act = new Actions(driver);
	         System.out.println("found");
	         Thread.sleep(2000);
	         act.moveToElement(Com_menue).moveToElement(driver.findElement(By.xpath("//*[contains(text(),'"+"About Us"+"')]"))).click().build().perform();
	         System.out.println("Done");
	*/
		
		
		
		// E029  Upload File in Selenium Webdriver
		//open google home page and maximize it.

	
		
		driver.get("https://www.google.com.eg/imghp?hl=ar&tab=wi&ogbl");
		driver.manage().window().maximize();
		
		// locate the images button and click it. 
	 	WebElement images_Button = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div[1]/div[1]/div/div[3]/div[2]/span"));
	 	images_Button.click();
	 	Thread.sleep(2000);
	 	
	 	//locate the search by image icon and click it.
	 	WebElement search_By_Image = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form/div[1]/div/a"));
	 	search_By_Image.click();
	 	Thread.sleep(2000);
	 	System.out.println("done Click");
	 	//locate upload image tab and click it.
	 	//WebElement upload_An_Image = driver.findElement(By.xpath("//*[@id=\"awyMjb\"]"));
	 	//upload_An_Image.click();
	 	//Thread.sleep(2000);
	 	System.out.println("done uploaded Click");
	 	//locate choose file input field and send it the path of the image.
	 	WebElement choose_File = driver.findElement(By.id("awyMjb"));
	 	choose_File.sendKeys("C:\\Users\\Elfek\\Desktop\\Screenshot.png");
	 	Thread.sleep(2000);
	 	System.out.println("done uploaded all");
		
		
		
	}

}
