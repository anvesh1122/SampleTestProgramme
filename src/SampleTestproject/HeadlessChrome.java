package SampleTestproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SampleTest1\\driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Headless");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		System.out.println("1");
		driver.findElement(By.id("email")).sendKeys("7799725272");
		System.out.println("2");
		driver.findElement(By.id("pass")).sendKeys("anIROOK");
		System.out.println("3");
		/*WebElement username=driver.findElement(By.id("identifierId"));
		username.clear();
		username.sendKeys("chilakaraju.anvesh7799@gmail.com");
		System.out.println("2");
		
		WebElement next=driver.findElement(By.xpath("//span[@class='CwaK9']"));
		next.click();
		System.out.println("3");
		
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.clear();
		pass.sendKeys("9618989578");
		System.out.println("4");
*/
	}

}
