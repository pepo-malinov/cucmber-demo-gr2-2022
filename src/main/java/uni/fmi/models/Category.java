package uni.fmi.models;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Category {

	private String name;
	private Set<Category> children;
	private Category parent;
	private Set<Item> items;

	/**
	 * Default constructor
	 */
	public Category() {
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
	public Category getParent() {
		return parent;
	}

	/**
	 * @param parent
	 * @return
	 */
	public void setParent(Category parent) {
		this.parent = parent;
	}

	/**
	 * @return
	 */
	public Set<Category> getChildren() {
		if (null == children) {
			children = new HashSet<Category>();
		}
		return children;
	}

	/**
	 * @return
	 */
	public Set<Item> getItems() {
		if (items == null) {
			items = new HashSet<Item>();
		}
		return items;
	}

	/**
	 * @param items
	 * @return
	 */
	public void setItems(Set<Item> items) {
		this.items = items;
	}

}