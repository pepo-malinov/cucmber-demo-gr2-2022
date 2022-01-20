package uni.fmi.login;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.login.model.LoginScreenModel;

public class LoginSteps {

	private LoginScreenModel loginScreen;

	@Given("^Потребителя отваря екрана за вход в системата$")
	public void openLoginScreen() throws Throwable {
		loginScreen = new LoginScreenModel();
	}

	@When("^Веведе валидно потребителско име$")
	public void addUsername() throws Throwable {
		loginScreen.setUsername("Иван");
	}

	@When("^въведе валидна парола$")
	public void addPassword() throws Throwable {
		loginScreen.setPassword("Pass124!");
	}

	@When("^натисне бутона за вход в системата$")
	public void clickLoginButton() throws Throwable {
		loginScreen.clickLoginButton();
	}

	@Then("^Вижда съобщение за успех$")
	public void checkMessage() throws Throwable {
		assertEquals("Успешно влязохте в систематa!", loginScreen.getMessage());
	}

	@Then("^Вижда съобщение за липса на данни$")
	public void checkMissingDataMessage() throws Throwable {
		assertEquals("Въведете име и парола!", loginScreen.getMessage());
	}
	
	@When("^Веведе невалидно потребителско име$")
	public void addMissingUsername() throws Throwable {
	    loginScreen.setUsername("MissingUsername");
	}
	
	@Then("^Вижда съобщение за решни данни$")
	public void checkWorndDataMessage() throws Throwable {
		assertEquals("Грешни данни!", loginScreen.getMessage());
	}

}
