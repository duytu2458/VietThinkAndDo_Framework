package vn.com.vtd.framework.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import vn.com.vtd.framework.model.bean.RoleModel;
import vn.com.vtd.framework.model.bean.UserModel;

public class UserMapper implements RowMapper<UserModel> {

	@Override
	public UserModel mapRow(ResultSet resultSet) {
		try {
			UserModel user = new UserModel();
			user.setId(resultSet.getLong("id"));
			user.setUserName(resultSet.getString("username"));
			user.setPassword(resultSet.getString("password"));
			user.setFullName(resultSet.getString("fullname"));
			user.setStatus(resultSet.getInt("status"));
			user.setRoleId(resultSet.getLong("roleid"));
			user.setCreatedDate(resultSet.getTimestamp("createddate"));
			user.setModifiedDate(resultSet.getTimestamp("modifieddate"));
			user.setCreatedBy(resultSet.getString("createdby"));
			user.setModifiedBy(resultSet.getString("modifiedby"));
			try {
				RoleModel role = new RoleModel();
				role.setCode(resultSet.getString("code"));
				role.setName(resultSet.getString("name"));
				user.setRole(role);
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
			return user;
		} catch (SQLException e) {
			return null;
		}	
	}
}
