package com.briup.cms.service;

import java.util.List;

import com.briup.cms.bean.Fruit;

public interface IFruitService {
	void save(Fruit fruit);
	
	List<Fruit> list();
	
	void delete(Long id);
	
	Fruit findById(Long id);
	
	void update(Fruit fruit);

}
