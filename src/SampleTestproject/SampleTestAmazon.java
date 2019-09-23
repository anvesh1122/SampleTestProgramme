package SampleTestproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SampleTest1\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement signin =driver.findElement(By.xpath("(//span[@class='nav-line-1'])[3]"));
		signin.click();
		signin.clear();
		WebElement username=driver.findElement(By.xpath("//input[@type='email']"));
		username.clear();
		username.sendKeys("anvessshh");
		username.click();
		Thread.sleep(1200);
		driver.close();

	}

}
