package Jdk_p;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C_practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

		//System.setProperty("webdriver.chrome.driver","D:\\Testing\\progs\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--lang-en-GB");
		WebDriver driver = new ChromeDriver (option);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
			
				WebElement testtt = driver.findElement(By.id("input"));
				testtt.sendKeys("news");
				/*	WebElement email_el = driver.findElement(By.xpath("//*[contains(@jsname,'YPqjbf') and contains[(@id,'identifierId')]"));
				email_el.clear();
				email_el.sendKeys("Elfekey3@gmail.com");
				email_el.sendKeys(Keys.RETURN);
				System.out.println("Entered E mail");
				*/
				//select the result and click on it
			/*	WebElement pass_el = driver.findElement(By.xpath("//input[contains(@aria-label,'Enter your password')]"));
				pass_el.clear();
				pass_el.sendKeys("HelloLinux");
				pass_el.sendKeys(Keys.RETURN);
				System.out.println("Clicked the Password!");
*/
				/*WebElement play_list_el = driver.findElement(By.xpath("//*[contains(text(),'"+"Playlists"+"']"));
				result_el.click();
				System.out.println("Clicked play_list_el");
				
				((JavascriptExecutor)driver).executeScript("window.scrollTo,250");*/

	}

}
