package vn.com.vtd.framework.model.dao.impl;

import java.util.List;

import vn.com.vtd.framework.mapper.UserMapper;
import vn.com.vtd.framework.model.bean.UserModel;
import vn.com.vtd.framework.model.dao.IUserDAO;
import vn.com.vtd.framework.paging.Pageble;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO {

	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		StringBuilder sql = new StringBuilder("SELECT * FROM users AS u");
		sql.append(" INNER JOIN roles AS r ON r.id = u.roleid");
		sql.append(" WHERE username = ? AND password = ? AND status = ?");
		List<UserModel> users = query(sql.toString(), new UserMapper(), userName, password, status);
		return users.isEmpty() ? null : users.get(0);
	}

	@Override
	public Long save(UserModel userModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO users (username, password,");
		sql.append(" fullname, status, roleid, createddate, modifieddate, createdby, modifiedby)");
		sql.append(" VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
		return insert(sql.toString(), userModel.getUserName(), userModel.getPassword(), userModel.getFullName(),
				userModel.getStatus(), userModel.getRoleId(), userModel.getCreatedDate(), userModel.getModifiedBy(),
				userModel.getCreatedBy(), userModel.getModifiedBy());
	}

	@Override
	public void update(UserModel userModel) {
		StringBuilder sql = new StringBuilder("UPDATE users SET username = ?, password = ?,");
		sql.append(" fullname = ?, status = ?, roleid = ?,");
		sql.append(" createddate = ?, modifieddate = ?, createdby = ?, modifiedby = ? WHERE id = ?");
		update(sql.toString(), userModel.getUserName(), userModel.getPassword(), userModel.getFullName(),
				userModel.getStatus(), userModel.getRoleId(), userModel.getCreatedDate(), userModel.getModifiedBy(),
				userModel.getCreatedBy(), userModel.getModifiedBy(), userModel.getId());
	}

	@Override
	public void delete(long id) {
		String sql = "DELETE FROM users WHERE id = ?";
		update(sql, id);
	}

	@Override
	public UserModel findOne(Long id) {
		String sql = "SELECT * FROM users WHERE id = ?";
		List<UserModel> userModel = query(sql, new UserMapper(), id);
		return userModel.isEmpty() ? null : userModel.get(0);
	}

	@Override
	public List<UserModel> findAll(Pageble pageble) {
		StringBuilder sql = new StringBuilder("SELECT * FROM users");
		sql.append(getQueryPagination(pageble));
		return query(sql.toString(), new UserMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM users";
		return count(sql);
	}

}
