package uni.fmi.login;

import java.util.Collections;
import java.util.List;

import uni.fmi.models.User;

public class LogigService {

	private static List<User> userdb = Collections.singletonList(new User("Иван", "Pass124!"));

	public static String login(final String username, final String password) {
		if (username == null || password == null) {
			return "Въведете име и парола!";
		}
		boolean isUserExists = userdb.stream()
				.anyMatch(u -> u.getUsername().equals(username) && u.getPassowrd().equals(password));

		// null != username && username.equals(u.getUsername()) && null != password &&
		// password.equals(u.getPassowrd())
		// u.getUsername().equals(username) && u.getPassowrd().equals(password)
		// username="NAME";
		// "NAME".equals(u.getUsername());

		// boolean isUserExists2 = false;
		// for(User user:userdb) {
		// if(username.equals(user.getUsername()) &&
		// password.equals(user.getPassowrd())) {
		// isUserExists2 = true;
		// break;
		// }
		// }
		return isUserExists ? "Успешно влязохте в систематa!" : "Грешни данни!";
	}

}
