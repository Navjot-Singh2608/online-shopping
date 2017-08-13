package com.grace.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.grace.shoppingbackend.dao.CategoryDAO;
import com.grace.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.grace.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	
	 /* @Test public void testAddCategory(){
	  
	  category = new Category();
	  
	  category.setName("Charger");
	  category.setDescription("This is some description for the charger!");
	  category.setImageURL("CAT_6.png");
	  
	  assertEquals("Successfully added a category inside the table!",true,
	  categoryDAO.add(category)); }*/
	 

	/*
	 * @Test public void testGetCategory(){
	 * 
	 * category = categoryDAO.get(1);
	 * assertEquals("Successfully fetch the single category from the table!"
	 * ,"Television",category.getName());
	 * 
	 * 
	 * }
	 */

	/*@Test
	public void testUpdateCategory() {

		category = categoryDAO.get(1);
		
		category.setName("TV");
		
		assertEquals("Successfully update the single category in the table!", true , categoryDAO.update(category));

	}*/

	
	/* @Test
	public void testDeleteCategory() {

		category = categoryDAO.get(1);
		
		category.setName("TV");
		
		assertEquals("Successfully deleted the single category in the table!", true , categoryDAO.delete(category));

	}*/

/*	 @Test
	public void testListCategory() {

		category = categoryDAO.get(1);
		
		category.setName("TV");
		
		assertEquals("Successfully fetchde  the list of categories from the table!",3, categoryDAO.list().size());

	}*/
	
	
	@Test
	public void testCRUDCategory(){
		
		//add operation
		  category = new Category();
		  
		  category.setName("Laptop");
		  category.setDescription("This is some description for the Laptop!");
		  category.setImageURL("CAT_1.png");
		  
		  assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		  
		  
	
          category = new Category();
		  
		  category.setName("Television");
		  category.setDescription("This is some description for the Television!");
		  category.setImageURL("CAT_2.png");
		  
		  assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
	
		  
		  //fetching and updating the category
			category = categoryDAO.get(2);
			
			category.setName("TV");
			
			assertEquals("Successfully update the single category in the table!", true , categoryDAO.update(category));
	
		  
		  //delete the category
		  assertEquals("Successfully deleted the single category in the table!", true , categoryDAO.delete(category));
		  
		  //fetching the list
		  assertEquals("Successfully fetchde  the list of categories from the table!",1, categoryDAO.list().size());
		  
	
	    }
	
	}
	

