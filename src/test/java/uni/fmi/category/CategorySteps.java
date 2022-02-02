package uni.fmi.category;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.category.service.CategoryService;
import uni.fmi.models.Role;
import uni.fmi.models.User;

public class CategorySteps {

	private User user;
	private String categoryName;
	private String message;

	@Given("^В системата влизаме с администраторски профил$")
	public void enterWithAdminUser() throws Throwable {
		user = new User("admin", "passAdmin");
		final Set<Role> roles = user.getRoles();
		roles.add(new Role("admin"));
	}

	@Given("^В системата влизаме с потребителски профил$")
	public void enterWithUser() throws Throwable {
		user = new User("admin", "passAdmin");
		final Set<Role> roles = user.getRoles();
		roles.add(new Role("user"));
	}

	@Given("^Отваряме екрана за създаване на категории$")
	public void openCreateCategoryScreen() throws Throwable {
		// TODO implement me
	}

	@When("^натискаме бутона за създаване$")
	public void clickCretaeButoon() throws Throwable {
		message = CategoryService.cretaeCategory(user, categoryName);
	}
	
	@When("^Въведе име на категория: \"([^\"]*)\"$")
	public void addCategoryName(final String category) throws Throwable {
	    this.categoryName=category;
	}

	@Then("^Вижда съобщение: \"([^\"]*)\"$")
	public void checkMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, message);
	}
}
