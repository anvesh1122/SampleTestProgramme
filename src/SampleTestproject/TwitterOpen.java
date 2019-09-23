package SampleTestproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\SampleTest1\\driver\\chromedriver.exe");
	       ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://twitter.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   WebElement username=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	   username.clear();
	   username.sendKeys("7799725272");
	   WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	   password.clear();
	   password.sendKeys("77997252");
	   driver.findElement(By.xpath("(//input[@type='submit'])[1])")).click();
	 //  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  // driver.close();
	   
	   //driver.close();v
  }
}
