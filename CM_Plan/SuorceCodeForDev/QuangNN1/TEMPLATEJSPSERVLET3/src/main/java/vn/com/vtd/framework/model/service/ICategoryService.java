package vn.com.vtd.framework.model.service;

import java.util.List;

import vn.com.vtd.framework.model.bean.CategoryModel;

public interface ICategoryService {
	List<CategoryModel> findAll();

	CategoryModel findOne(long id);
}
