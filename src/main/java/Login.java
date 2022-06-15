
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Login {
	public static void testarLogin(String printPath, String email, String senha, WebDriver driver) throws Exception {
		
		ScreenShot screenShot = new ScreenShot();
		WebElement iptEmail = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[1]/input"));
		WebElement iptSenha = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[2]/div/input\r\n"));
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[1]"));
		WebElement btnShowPassord = driver.findElement(By.className("login__eye"));
				
		iptEmail.sendKeys("Email invalido");
		screenShot.takeScreenShot(driver, printPath+"/Login/emailInvalido.png");
		
		iptEmail.clear();
		iptEmail.sendKeys("Email.valido@gmail.com");
		screenShot.takeScreenShot(driver, printPath+"/Login/emailValido.png");
			
		iptSenha.sendKeys("Senha");
		screenShot.takeScreenShot(driver, printPath+"/Login/Senhavalida.png");
		
		btnShowPassord.click();
		screenShot.takeScreenShot(driver, printPath+"/Login/Senhavalida2.png");
		
		btnLogin.click();
		Thread.sleep(1000);
		screenShot.takeScreenShot(driver, printPath+"/Login/LoginInvalido.png");
		
		driver.findElement(By.id("btnCloseModal")).click();
		screenShot.takeScreenShot(driver, printPath+"/Login/LoginPage.png");
		
		iptEmail.clear();
		iptEmail.sendKeys(email);
		iptSenha.clear();
		iptSenha.sendKeys(senha);
		screenShot.takeScreenShot(driver, printPath+"/Login/dadosCorretos.png");
		
		btnLogin.click();
		screenShot.takeScreenShot(driver, printPath+"/Login/clienteLogado.png");
	}
}
