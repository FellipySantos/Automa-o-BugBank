package GCBQA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Cadastro {
	
	static int num = 1; 
	
	public static void testarCadastro(String printPath, String email, String senha, WebDriver driver) throws Exception{
		WebElement btnCadastro = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[2]"));
		WebElement iptEmail = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/input"));
		WebElement iptSenha = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[4]/div/input"));
		WebElement nome = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[3]/input"));
		WebElement senhaconf = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[5]/div/input"));
		WebElement btnCadastrar = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/button"));
		WebElement btnSaldo = driver.findElement(By.id("toggleAddBalance"));
		
		print(driver,  printPath, num);
		btnCadastro.click();
		
		iptEmail.click();
		nome.click();
		
		print(driver,  printPath, num);
		iptSenha.click();
		
		print(driver,  printPath, num);
		senhaconf.click();
		
		iptEmail.click();
		print(driver,  printPath, num);
		
		btnCadastrar.click();
		print(driver,  printPath, num);
		
		iptEmail.sendKeys(email);
		enviarCadastro(driver, btnCadastrar, printPath);
		
		iptSenha.sendKeys(senha);
		enviarCadastro(driver, btnCadastrar, printPath);
		
		senhaconf.sendKeys("Teste2");
		enviarCadastro(driver, btnCadastrar, printPath);
		
		
		driver.findElement(By.id("btnCloseModal")).click();
		nome.sendKeys("Fellipy");
		enviarCadastro(driver, btnCadastrar, printPath);
		
		driver.findElement(By.id("btnCloseModal")).click();
		senhaconf.clear();
		senhaconf.sendKeys(senha);
		btnSaldo.click();
		print(driver,  printPath, num);
		
		enviarCadastro(driver, btnCadastrar, printPath);
		driver.findElement(By.id("btnCloseModal")).click();
	}
	
	public static void print(WebDriver driver, String printPath, int n) throws Exception {
		ScreenShot screenShot = new ScreenShot();
		screenShot.takeScreenShot(driver, printPath+"/Cadastro/"+n+".png");
		num++;
	}
	public static void enviarCadastro(WebDriver driver, WebElement btnCadastro, String printPath) throws Exception {
		btnCadastro.click();
		Thread.sleep(1000);
		print(driver,  printPath, num);
	}
}
