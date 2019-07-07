package abc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.*;


public class  IntE{

	public static void main(String[] args) {
		
				
		System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer.exe");
		WebDriver d=new InternetExplorerDriver();
		d.get("http://newtours.demoaut.com");
		//d.close();
		//System.exit(0);
		// TODO Auto-generated method stub
		d.quit();
		

	}

}