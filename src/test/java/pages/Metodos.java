package pages;

import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String site) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	public void escrever(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void validarTexto(String textoEsperado, By elemento) { 
		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado,texto);
	}

	public void screnShot(String nome) throws IOException {
		
		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/"+nome+".png");
		FileUtils.copyDirectory(srcFile, destFile);
	}
    }

