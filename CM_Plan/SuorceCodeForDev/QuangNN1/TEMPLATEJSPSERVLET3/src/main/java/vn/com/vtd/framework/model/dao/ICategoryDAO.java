package vn.com.vtd.framework.model.dao;

import java.util.List;

import vn.com.vtd.framework.model.bean.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel>{
	List<CategoryModel> findAll();
	CategoryModel findOne(long id);
	CategoryModel findOneByCole(String code);
}
