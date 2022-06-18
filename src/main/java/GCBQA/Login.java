package GCBQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Login {
	
	static int num = 1; 
	public static void testarLogin(String printPath, String email, String senha, WebDriver driver) throws Exception {
		
		WebElement iptEmail = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[1]/input"));
		WebElement iptSenha = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[2]/div/input\r\n"));
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[1]"));
		WebElement btnShowPassord = driver.findElement(By.className("login__eye"));
				
		iptEmail.sendKeys("Email invalido");
		print(driver,  printPath, num);
		
		iptEmail.clear();
		iptEmail.sendKeys("Email.valido@gmail.com");
		print(driver, printPath, num);
			
		iptSenha.sendKeys("Senha");
		print(driver, printPath, num);
		
		btnShowPassord.click();
		print(driver, printPath, num);
		
		btnLogin.click();
		Thread.sleep(1000);
		print(driver, printPath, num);
		
		driver.findElement(By.id("btnCloseModal")).click();
		print(driver, printPath, num);
		
		iptEmail.clear();
		iptEmail.sendKeys(email);
		iptSenha.clear();
		iptSenha.sendKeys(senha);
		print(driver, printPath, num);
		
		btnLogin.click();
		Thread.sleep(1000);
		print(driver, printPath, num);
	}
	
	public static void print(WebDriver driver, String printPath, int n) throws Exception {
		ScreenShot screenShot = new ScreenShot();
		screenShot.takeScreenShot(driver, printPath+"/Login/"+n+".png");
		num++;
	}
}
