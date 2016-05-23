package com.briup.cms.service.impl;

import java.util.List;

import com.briup.cms.bean.Fruit;
import com.briup.cms.dao.FruitDao;
import com.briup.cms.service.IFruitService;

public class FruitServiceImpl implements IFruitService{
	private FruitDao fruitDao = new FruitDao();

	@Override
	public void save(Fruit fruit) {
		fruitDao.save(fruit);
	}

	@Override
	public List<Fruit> list() {
		return fruitDao.findAll();
	}

	@Override
	public void delete(Long id) {
		fruitDao.delete(id);
	}

	@Override
	public Fruit findById(Long id) {
		return fruitDao.findById(id);
	}

	@Override
	public void update(Fruit fruit) {
		fruitDao.update(fruit);
	}

}
