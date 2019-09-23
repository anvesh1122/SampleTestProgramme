package SampleTestproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestPro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "D:\\workspace\\SampleTest1\\driver\\chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.get("https://www.gmail.com");
       Thread.sleep(1200);
       WebElement username=driver.findElement(By.xpath("//input[@type='email']"));
       username.clear();
       username.sendKeys("anvesh475@gmail.com");
       driver.findElement(By.xpath("//span[@class='CwaK9']")).click();
       Thread.sleep(1000);
       WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
       password.clear();
       password.sendKeys("77997252");
       driver.findElement(By.className("CwaK9")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//span[@class='gb_Aa gbii']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//a[@id='gb_71']")).click();
       Thread.sleep(1000);
       driver.close();
       
      // driver.close();
       
      // WebElement password=driver.findElement(By.
      // driver.close();
       
	}

}
