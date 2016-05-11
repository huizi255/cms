package com.briup.cms.service.impl;

import java.util.List;

import com.briup.cms.bean.Category;
import com.briup.cms.dao.CategoryDao;
import com.briup.cms.service.ICategoryService;

public class CategoryServiceImpl implements ICategoryService {
	private CategoryDao categoryDao = new CategoryDao();

	@Override
	public void save(Category category) {
		categoryDao.save(category);
	}

	@Override
	public List<Category> list() {
		List<Category> list = categoryDao.findAll();
		return list;
	}

	@Override
	public void delete(Long id) {
		categoryDao.delete(id);
	}
	
	@Override
	public void update(Category category) {
		categoryDao.update(category);
	}

}
