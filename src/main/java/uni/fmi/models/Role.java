package uni.fmi.models;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Role {

	private String code;
	private Set<User> users;

	/**
	 * Default constructor
	 * 
	 * @param code
	 */
	public Role(final String code) {
		this.code = code;
	}

	/**
	 * @return
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 * @return
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @param users
	 * @return
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}

	/**
	 * @return
	 */
	public Set<User> getUsers() {
		if (null == users) {
			users = new HashSet<>();
		}
		return users;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		Role other = (Role) obj;
		if (code == null) {
			if (other.code != null) {
				return false;
			}
		} else if (!code.equals(other.code)) {
			return false;
		}
		if (users == null) {
			if (other.users != null) {
				return false;
			}
		} else if (!users.equals(other.users)) {
			return false;
		}
		return true;
	}

}