package abc;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

public class Facebook {

	public static void main(String[] args) {
System.out.println(System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
		//WebDriver d=new ChromeDriver();
		//d.get("https://www.facebook.com/");
		//d.manage().window().maximize();
		// TODO Auto-generated method stub
		//WebElement fn=d.findElement(By.name("email"));
		//fn.sendKeys("kavi.kitsmca@gmail.com");
		//WebElement ln=d.findElement(By.name("pass"));
		//ln.sendKeys("aarya2013");
		//WebElement rg=d.findElement(By.id("loginbutton"));
		//rg.click();
	   // WebElement bt=d.findElement(By.id("pageLoginAnchor"));
		//bt.click();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		//driver.findElement(By.linkText("www.facebook.com")).sendKeys(selectLinkOpeninNewTab);
		
	}

}
