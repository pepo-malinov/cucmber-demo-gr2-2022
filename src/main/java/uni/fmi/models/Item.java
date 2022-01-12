package uni.fmi.models;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Item {

	private String name;
	private Category category;
	public Set<Cart> carts;

	/**
	 * Default constructor
	 */
	public Item() {
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * @return
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category
	 * @return
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * @return
	 */
	public Set<Cart> getCarts() {
		if (null == carts) {
			carts = new HashSet<Cart>();
		}
		return carts;
	}

	/**
	 * @param carts
	 * @return
	 */
	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Item other = (Item) obj;
		if (category == null) {
			if (other.category != null) {
				return false;
			}
		} else if (!category.equals(other.category)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

}