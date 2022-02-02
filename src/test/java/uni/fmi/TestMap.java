package uni.fmi;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

import uni.fmi.models.User;

public class TestMap {

	@Ignore
	@Test
	public void testMap() {
		final Map<String, String> testInstance = new HashMap<>();
		testInstance.put("key1", "value1");
		String value1 = testInstance.put("key1", "value2");
		System.out.println(value1);
		String value2 = testInstance.put("key1", "value3");
		System.out.println(value2);

		System.out.println(testInstance.get("key1"));

		assertEquals("value3", testInstance.get("key1"));
		assertEquals(value1, "value1");
		assertEquals(value2, "value2");
		assertEquals(1, testInstance.size());

	}

	@Test
	public void testConfigureUser() {
		User user = new User("pesho", "pass123", "test@test.com");
		configure(user);
		
		//"pesho"
		//"Gosho"1
		System.out.println(user.getUsername());
	}

	private void configure(final User userLocal) {
		//userLocal = new User("gosho", "pass123", "test@test.com");
		userLocal.setUsername("Gosho");
		System.out.println(userLocal.getUsername());
	}

}
