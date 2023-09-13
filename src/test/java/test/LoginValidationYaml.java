package test;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Login;
import utils.ReadFile;

public class LoginValidationYaml extends BaseTest{
	HashMap<String, Object> map;
	
	
	@BeforeClass
	public void beforeClass() {
		ReadFile obj = new ReadFile();
		map = obj.readYamlFile("user.yaml");

	}

	@Test
	public void johnUserValidation() {
		HashMap<String, String> john = (HashMap<String, String>) map.get("john");
		String username = john.get("username");
		String password = john.get("password");
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}
	
	@Test
	public void danUserValidation() {
		HashMap<String, String> dan = (HashMap<String, String>) map.get("dan");
		String username = dan.get("username");
		String password = dan.get("password");
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}
	
}
