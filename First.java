package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class First {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://newtours.demoaut.com");
		d.manage().window().maximize();
		//WebElement un=d.findElement(By.name("userName"));
		//un.sendKeys("Tutorial1");
		//WebElement pd=d.findElement(By.name("password"));
		//pd.sendKeys("Tutorial1");
		//WebElement bt=d.findElement(By.linkText("Register here"));
		//bt.click();
		//WebElement fn=d.findElement(By.name("firstName"));
		//fn.sendKeys("kavitha");
		//WebElement ln=d.findElement(By.name("lastName"));
		//ln.sendKeys("dumpeti");
		//WebElement ph=d.findElement(By.name("phone"));
		//ph.sendKeys("5898586985");
		//WebElement un=d.findElement(By.name("userName"));
		//un.sendKeys("kavitha");
		//WebElement ad=d.findElement(By.name("address1"));
		//ad.sendKeys("vashi");
		//WebElement ad1=d.findElement(By.name("address2"));
		//ad1.sendKeys("koparkhairane sector 19c");
		//WebElement ct=d.findElement(By.name("city"));
		//ct.sendKeys("koparkhairane");
		//WebElement st=d.findElement(By.name("state"));
		//st.sendKeys("Maha Rashtra");
		//WebElement pc=d.findElement(By.name("postalCode"));
		//pc.sendKeys("400018");
		//WebElement ddn=d.findElement(By.name("country"));
		//ddn.click();
		//Select ddnEle=new Select(ddn);
		//ddnEle.selectByVisibleText("INDIA");
		//WebElement em=d.findElement(By.name("email"));
		//em.sendKeys("kavi.kitsmca@mail.com");
		//WebElement pw=d.findElement(By.name("password"));
		//pw.sendKeys("kavitha@123");
		//WebElement cpw=d.findElement(By.name("confirmPassword"));
		//cpw.sendKeys("kavitha@123");
		//WebElement rg=d.findElement(By.name("register"));
		//rg.click();		
				
				
				//d.quit();
			
		// TODO Auto-generated method stub

	}

}
