package vn.com.vtd.framework.model.dao.impl;

import java.util.List;

import vn.com.vtd.framework.mapper.CommentMapper;
import vn.com.vtd.framework.model.bean.CommentModel;
import vn.com.vtd.framework.model.dao.ICommentDao;

public class CommentDao extends AbstractDAO<CommentModel> implements ICommentDao {

	@Override
	public List<CommentModel> findByNewId(Long newId) {
		String sql = "SELECT * FROM comment WHERE new_id = ?";
		return query(sql, new CommentMapper(), newId);
	}

}
