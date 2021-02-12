package Jdk_p;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\programs\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--lang=en-GB");
	WebDriver	driver = new ChromeDriver(options);
		 
		System.out.println("This before class starts");
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\programs\\chromedriver_win32\\\\chromedriver.exe");

		driver.get("https://weather.com/?Goto=Redirected");
		driver.manage().window().maximize();
		
		WebElement search_bar = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/header/div/div[2]/div[1]/div/div[1]/input"));
		search_bar.sendKeys("Egypt,Cairo");
		search_bar.sendKeys(Keys.RETURN);
		System.out.println("search done ");
		
		WebElement morningTemp = driver.findElement(By.xpath("//*[@id=\"WxuTodayWeatherCard-main-486ce56c-74e0-4152-bd76-7aea8e98520a\"]/section/div/ul/li[1]/a/div[1]/span"));
		System.out.println("Morning Tempreature is : "+morningTemp);
	}

}
