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
		this(null, null, null);
	}

	public User(final String username, final String password) {
		this(username, password, null);
	}

	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
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
			roles = new HashSet<>();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		User other = (User) obj;
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		if (username == null) {
			if (other.username != null) {
				return false;
			}
		} else if (!username.equals(other.username)) {
			return false;
		}
		return true;
	}

}