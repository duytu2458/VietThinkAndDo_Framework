package vn.com.vtd.framework.model.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import vn.com.vtd.framework.dto.NewDto;
import vn.com.vtd.framework.model.bean.CategoryModel;
import vn.com.vtd.framework.model.bean.NewModel;
import vn.com.vtd.framework.model.dao.ICategoryDAO;
import vn.com.vtd.framework.model.dao.INewDAO;
import vn.com.vtd.framework.model.dao.impl.NewDao;
import vn.com.vtd.framework.model.service.INewService;
import vn.com.vtd.framework.paging.Pageble;

public class NewService implements INewService {

	@Inject
	private INewDAO newDao;

	@Inject
	private ICategoryDAO categoryDAO;

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		return newDao.findByCategoryId(categoryId);
	}

	@Override
	public NewModel save(NewModel newModel) {
		newModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		// phân quyền
//		newModel.setCreatedBy("QuangNN");
		CategoryModel categoryModel = categoryDAO.findOneByCole(newModel.getCategoryCode());
		newModel.setCategoryId(categoryModel.getId());
		Long newId = newDao.save(newModel);
		return newDao.findOne(newId);
	}

	@Override
	public NewModel update(NewModel newModel) {
		NewModel oldNew = newDao.findOne(newModel.getId());
		newModel.setCreatedDate(oldNew.getCreatedDate());
		newModel.setCreatedBy(oldNew.getCreatedBy());
		// phân quyền
		newModel.setModifiedDate(new Timestamp(System.currentTimeMillis()));
//		newModel.setModifiedBy("QuangNN16");
		CategoryModel categoryModel = categoryDAO.findOneByCole(newModel.getCategoryCode());
		newModel.setCategoryId(categoryModel.getId());

		newDao.update(newModel);
		return newDao.findOne(newModel.getId());
	}

	@Override
	public void delete(long[] ids) {
		for (long id : ids) {
			// 1. delete comment
			// 2. delete new
			newDao.delete(id);
		}
	}

	@Override
	public List<NewModel> findAll(Pageble pageble) {
		return newDao.findAll(pageble);
	}

	@Override
	public int getTotalItem() {
		return newDao.getTotalItem();
	}

	@Override
	public NewModel findOne(Long id) {
		NewModel newModel = newDao.findOne(id);
		CategoryModel categoryModel = categoryDAO.findOne(newModel.getCategoryId());
		newModel.setCategoryCode(categoryModel.getCode());
		return newModel;
	}

	@Override
	public List<NewDto> findAllTitleAndCreateBy(Pageble pageble) {
		return newDao.findAllTitleAndCreateBy(pageble);
	}

}
