package abc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Travelex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		d.navigate().to("http://www.travelex.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);

		String title=d.getTitle();
		System.out.println(title);
		List <WebElement> links=d.findElements(By.tagName("a"));
		String[] linktext=new String[links.size()];
		int i=0;
		for(WebElement e:links)
		{
			linktext[i]=e.getText();
			i++;
		}
		for(String t:linktext)
		{
			d.findElement(By.linkText(t)).click();
			
		}
		
		
		//WebElement df=d.findElement(By.className("deliver-component-Image-region"));
		//df.click();
		///System.out.println("link clicked");

		//d.switchTo().window("http://www.travelex.co.in/");
		//d.navigate().back();
		//WebElement cf=d.findElement(By.className("deliver-component-CloseButton deliver-component-CloseButton--transparent"));
		//cf.click();
		//d.navigate().back();
		//Alert alt=d.switchTo().alert();
		//String s=alt.getText();
		//System.out.println(s);
		//alt.dismiss();
	}
	
	

}
