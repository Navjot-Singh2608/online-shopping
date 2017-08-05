package com.grace.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.grace.shoppingbackend.dao.CategoryDAO;
import com.grace.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories = new ArrayList<>();
	
	
	static {
		Category category = new Category();

		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for the television!");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		// second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for the mobile!");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// Third category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for the laptop!");
		category.setImageURL("CAT_3.png");

		categories.add(category);

	}
	
	
	@Override
	public List<Category> list(){
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
		
		//enchanced for loop
		for(Category category : categories){
			if(category.getId() == id){
				return category;
			}
			
		}
		
		return null;
		
	}

}
