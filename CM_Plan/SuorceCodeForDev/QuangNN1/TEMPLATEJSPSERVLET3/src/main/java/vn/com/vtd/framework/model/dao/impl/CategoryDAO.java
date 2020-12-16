package vn.com.vtd.framework.model.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vn.com.vtd.framework.mapper.CategoryMapper;
import vn.com.vtd.framework.mapper.NewMapper;
import vn.com.vtd.framework.model.bean.CategoryModel;
import vn.com.vtd.framework.model.bean.NewModel;
import vn.com.vtd.framework.model.dao.ICategoryDAO;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}

	@Override
	public CategoryModel findOne(long id) {
		String sql = "SELECT * FROM category WHERE id = ?";
		List<CategoryModel> categoryModel = query(sql, new CategoryMapper(), id);
		return categoryModel.isEmpty() ? null : categoryModel.get(0);
	}

	@Override
	public CategoryModel findOneByCole(String code) {
		String sql = "SELECT * FROM category WHERE code = ?";
		List<CategoryModel> categoryModel = query(sql, new CategoryMapper(), code);
		return categoryModel.isEmpty() ? null : categoryModel.get(0);
	}
}
