package abc;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
System.out.println(System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com/");
		driver.navigate().refresh();
		//WebElement ln=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/a"));
		//ln.click();
		// TODO Auto-generated method stub
		
       WebElement mb=driver.findElement(By.className("_2zrpKA"));
       mb.sendKeys("8097008581");
       WebElement pwd=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
      pwd.sendKeys("aarya@2013");
       WebElement btn=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
    		   btn.click();
    		   Thread.sleep(200);
       WebElement womn=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[4]/span"));
    		   womn.click();	 
    		   WebElement ew=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[4]/ul/li/ul/li[2]/ul/li[1]/a"));
    		   ew.click();	
    		   Thread.sleep(100);
    		   WebElement swsuit=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/div/div/section/div[4]/div[2]/a[3]"));
    		   swsuit.click();	
    		   Thread.sleep(100);
    		   WebElement size=driver.findElement(By.className("IIdQZO _1R0K0g _1SSAGr"));
    		   size.click();
    		   Thread.sleep(300);
    		   
    		   WebElement kurti=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div/div"));
    		   kurti.click();
    		   Thread.sleep(100);
    		   WebElement addcart=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
    		  addcart.click(); 
	}

	
	
}
