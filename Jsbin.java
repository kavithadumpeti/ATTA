package abc;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jsbin {

	public static void main(String[] args) throws Exception {
System.out.println(System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		d.get("http://jsbin.com/usidix/1");
		d.manage().window().maximize();
		WebElement go=d.findElement(By.xpath("/html/body/input"));
		go.click();
		Thread.sleep(5000);
		Alert alt=d.switchTo().alert();
		String s=alt.getText();
		System.out.println(s);
		//alt.accept();
		alt.dismiss();

	}

}
