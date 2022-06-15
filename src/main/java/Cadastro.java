import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Cadastro {
	
	public static void testarCadastro(String printPath, String email, String senha, WebDriver driver) throws Exception{
		ScreenShot screenShot = new ScreenShot();
		WebElement btnCadastro = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[2]"));
		WebElement iptEmail = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/input"));
		WebElement iptSenha = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[4]/div/input"));
		WebElement nome = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[3]/input"));
		WebElement senhaconf = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[5]/div/input"));
		WebElement btnCadastrar = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/button"));
		//WebElement btnSaldo = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[6]/label"));
		
		screenShot.takeScreenShot(driver, printPath+"/Cadastro/telaCadastro.png");
		btnCadastro.click();
		
		iptEmail.click();
		nome.click();
		
		screenShot.takeScreenShot(driver, printPath+"/Cadastro/emailslc.png");
		iptSenha.click();
		
		screenShot.takeScreenShot(driver, printPath+"/Cadastro/nomeslc.png");
		senhaconf.click();
		
		iptEmail.click();
		screenShot.takeScreenShot(driver, printPath+"/Cadastro/senhalc.png");
		
		btnCadastrar.click();
		screenShot.takeScreenShot(driver, printPath+"/Cadastro/Cadastrott1.png");
		
		iptEmail.sendKeys(email);
		btnCadastrar.click();
		screenShot.takeScreenShot(driver, printPath+"/Cadastro/Cadastrott2.png");
		
		iptSenha.sendKeys(senha);
		btnCadastrar.click();
		screenShot.takeScreenShot(driver, printPath+"/Cadastro/Cadastrott3.png");
		
		senhaconf.sendKeys("Teste2");
		btnCadastrar.click();
		Thread.sleep(1000);
		screenShot.takeScreenShot(driver, printPath+"/Cadastro/Cadastrott4.png");
		
		
		driver.findElement(By.id("btnCloseModal")).click();
		nome.sendKeys("Fellipy");
		btnCadastrar.click();
		Thread.sleep(1000);
		screenShot.takeScreenShot(driver, printPath+"/Cadastro/Cadastrott5.png");
		
		driver.findElement(By.id("btnCloseModal")).click();
		senhaconf.clear();
		senhaconf.sendKeys(senha);
		screenShot.takeScreenShot(driver, printPath+"/Cadastro/camposPreenchidos.png");
		
		
		
		
		btnCadastrar.click();
		Thread.sleep(1000);
		screenShot.takeScreenShot(driver, printPath+"/Cadastro/cadastroRealizado.png");
		driver.findElement(By.id("btnCloseModal")).click();
	}
}
