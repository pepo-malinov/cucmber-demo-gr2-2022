package uni.fmi.category.service;

import uni.fmi.models.User;

public class CategoryService {

	public static String cretaeCategory(final User user, final String categoryName) {
		final String result;
		boolean isAdmin = user.getRoles().stream().anyMatch(r -> "admin".equals(r.getCode()));
		if (isAdmin) {
			if (null == categoryName || categoryName.isBlank()) {
				result = "Въведете име на категорията";
			} else {
				result = "Успешно създадохте категория";
			}
		} else {
			result = "Нямате права да създавате категория";
		}
		return result;
	}

}
