package vn.com.vtd.framework.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import vn.com.vtd.framework.model.bean.CommentModel;

public class CommentMapper implements RowMapper<CommentModel> {

	@Override
	public CommentModel mapRow(ResultSet resultSet) {

		try {
			CommentModel commentModel = new CommentModel();
			commentModel.setId(resultSet.getLong("id"));
			commentModel.setContent(resultSet.getString("content"));
			commentModel.setUserId(resultSet.getLong("user_id"));
			commentModel.setNewId(resultSet.getLong("new_id"));
			commentModel.setCreatedDate(resultSet.getTimestamp("createddate"));
			commentModel.setCreatedBy(resultSet.getString("createdby"));
			commentModel.setModifiedDate(resultSet.getTimestamp("modifieddate"));
			commentModel.setModifiedBy(resultSet.getString("modifiedby"));
			return commentModel;
		} catch (SQLException e) {
			return null;
		}

	}

}
