package SampleTestproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClasswithChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SampleTest1\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gmail.com");
       // driver.manage().window().maximize();
       
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        
        WebElement user =driver.findElement(By.xpath("//input[@type='email']"));
        Actions action = new Actions(driver);
        action.moveToElement(user).click(user).sendKeys("chilakaraju.anvesh7799@gmail.com").build().perform();
        
       
        //user.sendKeys("chilakaraju.anvesh7799@gamil.com");
        
        WebElement nxt =driver.findElement(By.xpath("//span[@class='CwaK9']"));
        action.moveToElement(nxt).click(nxt).build().perform();
        Thread.sleep(1000);
          
        WebElement pass=driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
        action.moveToElement(pass).click(pass).sendKeys("9618989578").build().perform();
        
        WebElement nxt1 =driver.findElement(By.xpath("//span[@class='CwaK9']"));
        action.moveToElement(nxt1).click(nxt1).build().perform();
        Thread.sleep(1000);
        
        WebElement compose=driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
        action.moveToElement(compose).click(compose).build().perform();
        Thread.sleep(1000);
        
        WebElement recipient=driver.findElement(By.xpath("//div[@id=':n5']"));
       action.moveToElement(recipient).click(recipient).sendKeys("anvesh475@gmail.com,chilakaraju.anvesh7799@gmail.com,nemoju.chanti@gmail.com").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1000);
        
     WebElement subject=driver.findElement(By.xpath("//input[@name='subjectbox']"));
     action.moveToElement(subject).click(subject).sendKeys("message").build().perform();
     Thread.sleep(1000);
        
     WebElement matter=driver.findElement(By.xpath("//div[@id=':my']")); 
     action.moveToElement(matter).click(matter).sendKeys("hello....").build().perform();
     Thread.sleep(1000);
     
     WebElement send=driver.findElement(By.xpath("//div[@id=':oq']"));
     action.moveToElement(send).click(send).build().perform();
     Thread.sleep(3000);
     
     WebElement sign =driver.findElement(By.xpath("//span[@class='gb_Ba gbii']"));
        action.moveToElement(sign).click(sign).build().perform();
        Thread.sleep(2000);
        
        WebElement signout=driver.findElement(By.xpath("//a[@id='gb_71']"));
        action.moveToElement(signout).click(signout).build().perform();
        Thread.sleep(1000);
        driver.close();
        
	}

}
