import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TesteGCB {
	static WebDriver driver = new ChromeDriver();
	static String prints = "C:/Users/Fellipy/Documents/prints";
	static String emailCadastro = "TesteGCB@gmail.com";
	static String senhaCadastro = "Teste";
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		driver.get("https://vermillion-pavlova-8ff398.netlify.app/#");
		Cadastro.testarCadastro(prints, emailCadastro, senhaCadastro, driver);
		Login.testarLogin(prints, emailCadastro, senhaCadastro, driver);
	}
	
	
	
	
	
}
