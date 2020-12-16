package vn.com.vtd.framework.model.service.impl;

import java.util.List;

import vn.com.vtd.framework.model.bean.UserModel;
import vn.com.vtd.framework.model.dao.IUserDAO;
import vn.com.vtd.framework.model.dao.impl.UserDAO;
import vn.com.vtd.framework.model.service.IUserService;
import vn.com.vtd.framework.paging.Pageble;

public class UserService implements IUserService {

	private IUserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();
	}
	
	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
	}

	@Override
	public Long save(UserModel userModel) {
		return userDAO.save(userModel);
	}

	@Override
	public void update(UserModel userModel) {
		userDAO.update(userModel);
	}

	@Override
	public void delete(long id) {
		userDAO.delete(id);
	}

	@Override
	public UserModel findOne(Long id) {
		return userDAO.findOne(id);
	}

	@Override
	public List<UserModel> findAll(Pageble pageble) {
		return userDAO.findAll(pageble);
	}

	@Override
	public int getTotalItem() {
		return userDAO.getTotalItem();
	}
	
}
