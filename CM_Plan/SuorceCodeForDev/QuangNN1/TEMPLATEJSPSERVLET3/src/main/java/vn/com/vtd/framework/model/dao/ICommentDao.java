package vn.com.vtd.framework.model.dao;

import java.util.List;

import vn.com.vtd.framework.model.bean.CommentModel;

public interface ICommentDao extends GenericDAO<CommentModel> {
	List<CommentModel> findByNewId(Long newId);

}
