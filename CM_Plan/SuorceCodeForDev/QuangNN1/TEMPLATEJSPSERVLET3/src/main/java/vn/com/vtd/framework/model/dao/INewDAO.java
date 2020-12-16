package vn.com.vtd.framework.model.dao;

import java.util.List;

import vn.com.vtd.framework.dto.NewDto;
import vn.com.vtd.framework.model.bean.NewModel;
import vn.com.vtd.framework.paging.Pageble;

public interface INewDAO extends GenericDAO<NewModel> {
	List<NewModel> findByCategoryId(Long categoryId);
	Long save(NewModel newModel);
	void update(NewModel newModel);
	void delete(long id);
	NewModel findOne(Long id);
	List<NewModel> findAll(Pageble pageble);
	int getTotalItem();
	List<NewDto> findAllTitleAndCreateBy(Pageble pageble);
}
