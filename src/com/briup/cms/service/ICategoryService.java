package com.briup.cms.service;

import java.util.List;

import com.briup.cms.bean.Category;

public interface ICategoryService {
	//添加栏目
    void save(Category category);
    //查询栏目信息
    List<Category> list();
    //通过id删除栏目
    void delete(Long id);
    //通过修改栏目
    void update(Category category);
}
