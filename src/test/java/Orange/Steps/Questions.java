package Orange.Steps;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.ibm.icu.text.SimpleDateFormat;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.OutputType;

public class Questions {

	private WebDriver driver;

	public Questions (WebDriver driver){
		this.driver = driver;
	}

	@Step
	public void tituloAssert() {

		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, "Booking.com");
	}

	@Step
	public void screenShot() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String filename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File dest = new File("C:\\Users\\Asus\\Desktop\\Curso Automatización\\Screenshot\\Curso" + filename + ".png");
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Step
	public void textoAssert() {

		Assert.assertEquals("Introduce tu contraseña", "Introduce tu contraseña");
	}

	@Step
	public void textoCrearCuentaAssert() {

		Assert.assertEquals("Crea una contraseña", "Crea una contraseña");
	}
	 public void timeSeconds(int seconds){
	try{
		Thread.sleep(seconds*1000);
	} catch (InterruptedException e){
	e.printStackTrace();
	}
	 }

	 public void validateEmployed(String firstName, String lastName){
		String employed = driver.findElement(By.xpath("//div[@class = 'orangehrm-edit-employee-name']//h6")).getText();
		Assert.assertEquals(employed,firstName + "8"+lastName);
	 }

}