package abc;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Newtours {

	public static void main(String[] args) throws InterruptedException {
		
     System.out.println(System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(100);
		List <WebElement> xyz=driver.findElements(By.tagName("a"));
		String[] abc=new String[xyz.size()];
		int i=0;
		for(WebElement e:xyz)
		{
		abc[i]=e.getText();
			i++;
		}
		for(String t:abc)
		{
			driver.findElement(By.linkText(t)).click();
			//String s1=driver.getTitle();
			if((driver.getTitle()).contains("Under Construction")||(driver.getTitle()).contains("Not Found"))
			{
				System.out.println(t+"is Broken");
			}
			else
			{
				System.out.println(t+"is Working");
			}
			driver.navigate().back();
		}
		driver.quit();
	}

}
