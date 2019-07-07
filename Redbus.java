package abc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Redbus{

			// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException 
		{
		Redbus bus=new Redbus();
			bus.SearchBus();
		bus.SelectBus();
		}
}

public class Redbus{
	public static WebDriver d;
	public static WebDriverWait wait;
	public void SearchBus() throws InterruptedException
	{
			
			System.out.println(System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
					
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
					// TODO Auto-generated method stub
					ChromeOptions opt=new ChromeOptions();
					opt.addArguments("--disable-notifications");
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();

					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.get("http://www.redbus.in/");
					//WebElement frmct=driver.findElement(By.xpath("//a[text()='Request A Quote'"));
		    		//frmct.click();
					SelectCity("src","Pune");
					SelectCity("des","Mumbai");
					SelectDate("//label[@for='onward_cal']","15");
					SelectDate("//label[@for='return_cal']","20");
					driver.findElement(By.id("search_btn")).click();
					Thread.sleep(19000);
		}
		public void SelectBus() throws InterruptedException
		{
			List<WebElement> buses=d.findElement(By.className("service-name"));
			System.out.println("List of buses are");
			for(WebElement busname:buses)
			{
				String busName=busname.getText();
				System.out.println("Bus" +busName);
			}
			System.out.println("please wait..now select MSRTC:");
			Thread.sleep(6000);
			for(WebElement bn:buses)
			{
				String bname=bn.getText();
				{
					if(bname.equals("MSRTC"))
					{
						bn.click();
					}
				}
				
			}
			break;
			private void SelectDate(String targetTextBox,String dateDay)
				//1.click on textbox	
			driver.findElement(By.xpath(targetTextBox)).click();
			//2.loop days
			List<WebElement> dates=driver.findElement(By.tagName("td"));
			System.out.println("Size:" +dates.size());
			for(WebElement day:dates)
			{
				System.out.println(day.getText());
				if(day.getText().equals(dateDay))
				{
					//3.click();
					System.out.println("Select MSRTC");
					break;
				}
			}
}
		private void SelectCity(String target,String CityName)
		{
			d.findElement(By.id(target)).clear();
			d.findElement(By.id(target)).sendKeys(cityName);
			wait=new WebDriver(d,120);
			wait.untill(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.autoFill")));
		}
		//3.1 loop city and find pune text in li"
		List<WebElement> cityList=d.findElement(By.cssSelector("ul.autoFill.li"));
		for(WebElement city:cityList)
		{
			System.out.println(city.getText());
		if(city.getText().equals(cityName))
		{
			city.click();
		break;
		
		}
		}
			
		}

}
