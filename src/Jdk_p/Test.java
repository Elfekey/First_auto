package Jdk_p;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler.AtFixedRate;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","D:\\\\Testing\\\\progs\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--lang=en-GB");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		  driver.navigate().to("https://www.phptravels.com/");
		  driver.manage().window().maximize();
		//send data 

/*
 * 	System.out.print("max");
 *
		    WebElement Com_menue = driver.findElement(By.xpath("/html/body/header/div/nav/div[1]/span"));
	        
		    Actions acton = new Actions(driver);
		    acton.moveToElement(Com_menue).moveToElement(driver.findElement(By.xpath("//*[conatins(text(),'"+"Cars Module"+"')]"))).click().build().perform();
		*/
		    
		    WebElement Com_menue = driver.findElement(By.xpath("/html/body/header/div/nav/div[3]/span"));
	         Actions act = new Actions(driver);
	         System.out.println("found");
	         Thread.sleep(2000);
	         act.moveToElement(Com_menue).moveToElement(driver.findElement(By.xpath("//*[contains(text(),'"+"About Us"+"')]"))).click().build().perform();
	         System.out.println("Done");
	         
	        
	         WebElement men2 = driver.findElement(By.xpath("/html/body/header/div/nav/div[1]"));
	         System.out.println("found222");
	         Thread.sleep(2000);
	         act.moveToElement(men2).moveToElement(driver.findElement(By.xpath("//*[contains(text(),'"+"Cars Module"+"')]"))).click().build().perform();
	         System.out.println("Done222");
		

	}

}
