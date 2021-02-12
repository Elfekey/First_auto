package Jdk_p;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Return;

public class C_2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\progs\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--lang=en-GB");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://play.google.com/store?hl=en&tab=w8");
		driver.manage().window().maximize();
		
		WebElement search_bar =  driver.findElement(By.xpath("/html/body/div[1]/c-wiz[1]/div/div[1]/div[1]/div[3]/div/div/div/form/fieldset[2]/div/div[1]/div[2]/input"));
		search_bar.sendKeys("google play console");
		search_bar.sendKeys(Keys.RETURN);
	 
		System.out.println("Done  enter Clicked");
	   WebElement res_search =driver.findElement(By.xpath("//div[contains(@title,'Google Play Console')]"));
        res_search.click();
        System.out.println("result Clicked");
   
        
        //the first_play_click
        WebElement first_play_click =driver.findElement(By.xpath("//button[contains(@aria-label,'Play Google Play Console')]"));
        first_play_click.click();
        System.out.println("result Clicked");
    
        //iframe_switch
        WebElement iframe =driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/span/div/div/iframe"));
        driver.switchTo().frame(iframe);
        System.out.println("iframe  Switched");
        
        //the LAST_play_click
        WebElement LAST_play_click =driver.findElement(By.xpath("//button[contains(@class,'ytp-large-play-button ytp-button')]"));
        LAST_play_click.click();
        System.out.println("Here's Your Video Clicked");
        
    
       
	}

}
