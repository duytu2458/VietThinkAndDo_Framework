package vn.com.vtd.framework.model.service.impl;

import java.util.List;

import javax.inject.Inject;

import vn.com.vtd.framework.model.bean.CommentModel;
import vn.com.vtd.framework.model.dao.ICommentDao;
import vn.com.vtd.framework.model.service.ICommentService;

public class CommentService implements ICommentService{

	@Inject
	private ICommentDao commentDao;
	
	@Override
	public List<CommentModel> findByNewId(Long newId) {
		return commentDao.findByNewId(newId);
	}

}
