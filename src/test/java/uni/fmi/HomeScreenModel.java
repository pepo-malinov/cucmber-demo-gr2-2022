package uni.fmi;

import uni.fmi.login.LogigService;
import uni.fmi.register.service.RegisterService;

public class HomeScreenModel {
	private String username;
	private String firstPassord;
	private String secondPassord;
	private String password;
	private String email;
	private String message;

	public void setUsername(final String username) {
		this.username = username;
	}

	public void setFirstPassword(String password) {
		this.firstPassord = password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void setSecondPassord(String password) {
		this.secondPassord = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void clickRegisterButton() {
		message = RegisterService.register(username, firstPassord, secondPassord, email);
	}

	public String getMessage() {
		return message;
	}
	
	public void clickLoginButton() {
		message = LogigService.login(username, password);

	}
}
