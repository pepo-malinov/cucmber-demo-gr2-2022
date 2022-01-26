package uni.fmi.login;

import static org.junit.Assert.assertEquals;

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

	@When("^Веведе \"([^\"]*)\" потребителско име$")
	public void addUsername(final String username) throws Throwable {
		loginScreen.setUsername(username);
	}

	@When("^въведе \"([^\"]*)\" парола$")
	public void addPassword(final String pass) throws Throwable {
		loginScreen.setPassword(pass);
	}

	@When("^натисне бутона за вход в системата$")
	public void clickLoginButton() throws Throwable {
		loginScreen.clickLoginButton();
	}

	@Then("^Вижда съобщение: \"([^\"]*)\"$")
	public void checkMessage(final String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, loginScreen.getMessage());
	}

}
