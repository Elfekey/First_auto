package Jdk_p;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C_1 {

	public static void main(String[] args) throws InterruptedException {
	
       //call chrome
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\progs\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--lang=eng-GB");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		driver.manage().window().maximize();
		//implicit wait Instead of Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
		//Explicit wait!!!! 
	//	WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//Fluent Wait
	/*	Wait<WebDriver> s = new FluentWait<WebDriver>(driver)
				.withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
				/**/
        
    // WebElement first_name = wait.until(ExpectedConditions.elementToBeClickable(By.id("u_0_n")));
    
		WebElement first_name = driver.findElement(By.id("u_0_n"));
		first_name.sendKeys("Hussam");
		System.out.println(" first name Sent");
		//sleeping for a while
		//Thread.sleep(5000);

		WebElement surname =driver.findElement(By.id("u_0_p"));
		surname.sendKeys("elfekey");
		System.out.println("surname Sent");
		//sleeping for a while
		//Thread.sleep(5000);


		//Email
		WebElement e_mail = driver.findElement(By.xpath("//*[@id=\"u_0_s\"]"));
		e_mail.sendKeys("Test@gmail.com");

		System.out.println(" email Sent");
		//sleeping for a while
	//	Thread.sleep(3000);

//		    CONFIRMATION OF THE  Email
		WebElement second_e_mail = driver.findElement(By.xpath("//*[@id=\"u_0_v\"]"));
		second_e_mail.sendKeys("Test@gmail.com");

		System.out.println(" second_e_mail Sent");
		//sleeping for a while
		//Thread.sleep(5000);


		//password


		WebElement Password = driver.findElement(By.cssSelector("#password_step_input"));

		Password.sendKeys("12345678@");
		System.out.println(" Password Sent");
		//sleeping for a while
		//Thread.sleep(5000);
		
		
		/**
		Trying Date of Birth
*/
		
		Select day = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		day.selectByIndex(15);
		System.out.print(" day sent");
		//month
		Select mon = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		mon.selectByIndex(11);
		System.out.print(" month= sent");
		//year
		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		year.selectByIndex(27);
		System.out.print(" year sent");


		//sleeping for a while
		//Thread.sleep(5000);

	/*
		Trying Date of Birth

		/**/	
		
		
       //Gender
		WebElement Gender = driver.findElement(By.xpath("//*[@id=\"u_0_10\"]/span[1]/label"));
		Gender.click();
		System.out.println(" Gender Clicked");
		//sleeping for a while
		//Thread.sleep(5000);




		WebElement sign_upbtn = driver.findElement(By.id("u_0_14"));
		sign_upbtn.click();
		System.out.println(" sign_upbtn Clicked");
		//sleeping for a while

		System.out.print(" All are done");
	}

}
