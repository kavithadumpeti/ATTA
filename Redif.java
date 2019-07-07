package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redif {

	public static void main(String[] args) {
System.out.println(System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/Inputfiles/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.rediff.com");
		d.manage().window().maximize();
		// TODO Auto-generated method stub
		//WebElement fn=d.findElement(By.name("email"));
		//fn.sendKeys("kavi.kitsmca@gmail.com");
		//WebElement ln=d.findElement(By.name("pass"));
		//ln.sendKeys("aarya2013");
		WebElement rg=d.findElement(By.xpath("//a[@title='Create Rediffmail Account']"));
		rg.click();
		//WebElement rg=d.findElement(By.name("Create Accout"));
		//rg.click();
		WebElement fn=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		fn.sendKeys("kavitha chandupatla");
		WebElement cri=d.findElement(By.xpath("//*[@id=\\\"tblcrtac\\\"]/tbody/tr[7]/td[3]/input[1]"));
		cri.sendKeys("kavi.kitsmca@rediffmail.com");
		WebElement ca=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		ca.click();
		WebElement pwd=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input"));
		pwd.sendKeys("kavitha@123");

		
	}

}