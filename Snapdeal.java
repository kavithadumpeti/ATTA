package abc;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal {

	public static void main(String[] args) {
System.out.println(System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		d.get("https://www.snapdeal.com/");
		d.manage().window().maximize();
		WebElement si=d.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]"));
		si.click();
		WebElement li=d.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a"));
		li.click();
		WebDriverWait w=new WebDriverWait(d,120);
		try
		{
			w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframeLogin"));
		}
		catch(Exception e) 
		{
			System.out.println(e);
		
		}
		//d.switchTo().frame("iframeLogin");
		//System.out.println("a");
		WebElement ln=d.findElement(By.id("userName"));
		ln.sendKeys("8985969858");
		WebElement con=d.findElement(By.id("checkUser"));
		con.click();
		

	}

}
