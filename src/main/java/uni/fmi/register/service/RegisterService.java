package uni.fmi.register.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import uni.fmi.models.User;

public class RegisterService {

	private static final List<User> userDB = new ArrayList<>();
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	

	public static String register(final String username, final String firstPassord, final String secondPassord,
			final String email) {
		initDb();
		if (null == username || username.trim().equals("")) {
			return "Въведете потребителско име!";
		}

		if (!validate(email)) {
			return "Невалидна електронн апоща!";
		}

		if (firstPassord == null || 5 > firstPassord.length()) {
			return "Паролата трябва да е по-дълга от четери синвола!";
		}

		if (!firstPassord.equals(secondPassord)) {
			return "Въведете еднакви пароли!";
		}

		final User newUser = new User(username, firstPassord, email);
		boolean isUserExists = userDB.stream().anyMatch(u -> u.equals(newUser));
		if (isUserExists) {
			return "Потребителското име е заето!";
		}

		userDB.add(newUser);
		return "Регистрирахте се успешно!";
	}
	
	private static void initDb(){
		userDB.clear();
		userDB.add(new User("ivan123", "Pass124345!", "ivan123@abv.bg"));
	}

	private static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}

}
