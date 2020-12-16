package vn.com.vtd.framework.model.service.impl;

import java.util.List;

import javax.inject.Inject;

import vn.com.vtd.framework.model.bean.CategoryModel;
import vn.com.vtd.framework.model.dao.ICategoryDAO;
import vn.com.vtd.framework.model.service.ICategoryService;

public class CategoryService implements ICategoryService {

	@Inject
	private ICategoryDAO categoryDAO;

	@Override
	public List<CategoryModel> findAll() {
		return categoryDAO.findAll();
	}

	@Override
	public CategoryModel findOne(long id) {
		return categoryDAO.findOne(id);
	}

}
