package uni.fmi.models;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Cart {

	private Set<Item> items;
	private User owner;

	/**
	 * Default constructor
	 */
	public Cart() {
	}

	/**
	 * @return
	 */
	public User getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 * @return
	 */
	public void setOwner(User owner) {
		this.owner = owner;
	}

	/**
	 * @param items
	 * @return
	 */
	public void setItems(Set<Item> items) {
		this.items = items;
	}

	/**
	 * @return
	 */
	public Set<Item> getItems() {
		if (null == items) {
			items = new HashSet<>();
		}
		return null;
	}

}