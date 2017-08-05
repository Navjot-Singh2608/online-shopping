package com.grace.shoppingbackend.dao;

import java.util.List;

import com.grace.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
}
