package vn.com.vtd.framework.model.service;

import java.util.List;

import vn.com.vtd.framework.dto.NewDto;
import vn.com.vtd.framework.model.bean.NewModel;
import vn.com.vtd.framework.paging.Pageble;

public interface INewService {
	List<NewModel> findByCategoryId(Long categoryId);

	NewModel save(NewModel newModel);

	NewModel update(NewModel newModel);

	void delete(long[] ids);

	public List<NewModel> findAll(Pageble pageble);

	int getTotalItem();

	NewModel findOne(Long id);
	
	public List<NewDto> findAllTitleAndCreateBy(Pageble pageble);
}
