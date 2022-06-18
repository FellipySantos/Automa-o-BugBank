package GCBQA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Transferencia {
	
	static int num = 1; 
	
	public static void testarTransferencia(String printPath, WebDriver driver) throws Exception {
		WebElement btnTransacao = driver.findElement(By.id("btn-TRANSFERÊNCIA"));
		
		btnTransacao.click();
		Thread.sleep(1000);
		print(driver,  printPath, num);
		
		WebElement btnFazerTransacao = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/button"));
		WebElement nmrConta = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[1]/input"));
		WebElement nmrAgencia = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[2]/input"));
		WebElement vlrTransacao = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div[2]/input"));
		WebElement descricao = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div[3]/input"));
		WebElement btnVoltar = driver.findElement(By.id("btnBack"));
		nmrConta.sendKeys("507");
		nmrAgencia.sendKeys("6");
		print(driver,  printPath, num);
		
		vlrTransacao.sendKeys("0");
		descricao.sendKeys("Teste");
		print(driver,  printPath, num);
		
		enviarTransação(driver, btnFazerTransacao, printPath);
		
		driver.findElement(By.id("btnCloseModal")).click();
		
		vlrTransacao.sendKeys("10");
		print(driver,  printPath, num);
		
		enviarTransação(driver, btnFazerTransacao, printPath);
		
		driver.findElement(By.id("btnCloseModal")).click();
		
		nmrConta.clear();
		nmrAgencia.clear();
		print(driver,  printPath, num);
		
		enviarTransação(driver, btnFazerTransacao, printPath);
		
		driver.findElement(By.id("btnCloseModal")).click();
		
		btnVoltar.click();
		print(driver,  printPath, num);
		
		WebElement btnExtrato = driver.findElement(By.id("btn-EXTRATO"));
		btnExtrato.click();
		Thread.sleep(500);
		print(driver,  printPath, num);
	}
	
	public static void print(WebDriver driver, String printPath, int n) throws Exception {
		ScreenShot screenShot = new ScreenShot();
		screenShot.takeScreenShot(driver, printPath+"/Transferencia/"+n+".png");
		num++;
	}
	
	public static void enviarTransação(WebDriver driver, WebElement btnTransacao, String printPath) throws Exception {
		btnTransacao.click();
		Thread.sleep(500);
		print(driver,  printPath, num);
	}
}
