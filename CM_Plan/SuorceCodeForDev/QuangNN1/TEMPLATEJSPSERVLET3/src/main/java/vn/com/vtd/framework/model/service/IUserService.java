package vn.com.vtd.framework.model.service;

import java.util.List;

import vn.com.vtd.framework.model.bean.UserModel;
import vn.com.vtd.framework.paging.Pageble;

public interface IUserService {
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);

	Long save(UserModel userModel);

	void update(UserModel userModel);

	void delete(long id);

	UserModel findOne(Long id);

	List<UserModel> findAll(Pageble pageble);

	int getTotalItem();
}
