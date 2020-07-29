package com.Nalini.dao;

import java.util.List;

import com.Nalini.Model.Category;

public interface CategoryDAO {
	Category get(int id);
	List<Category> list();
boolean add(Category category);
boolean update(Category category);
boolean delete(Category category);

}
