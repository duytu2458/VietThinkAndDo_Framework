package vn.com.vtd.framework.model.service;

import java.util.List;

import vn.com.vtd.framework.model.bean.CommentModel;

public interface ICommentService {
	List<CommentModel> findByNewId(Long newId);
}
