package uni.fmi.models;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class User {

	private String username;
	private String password;
	private String email;
	private Set<Role> roles;
	private Cart cart;

	/**
	 * Constructor
	 */
	public User() {
	}

	/**
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param usename
	 * @return
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return
	 */
	public String getPassowrd() {
		return password;
	}

	/**
	 * @param passwoord
	 * @return
	 */
	public void setPassword(String passwoord) {
		this.password = passwoord;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 * @return
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param roles
	 * @return
	 */
	public void serRoles(Set<Role> roles) {
		if (roles != null) {
			this.roles = roles;
		} else {
			this.roles.clear();
		}
	}

	/**
	 * @return
	 */
	public Set<Role> getRoles() {
		if (roles == null) {
			roles = new HashSet<Role>();
		}
		return null;
	}

	/**
	 * @return
	 */
	public Cart getCart() {
		return cart;
	}

	/**
	 * @param cart
	 * @return
	 */
	public void setCart(Cart cart) {
		this.cart = cart;
	}

}