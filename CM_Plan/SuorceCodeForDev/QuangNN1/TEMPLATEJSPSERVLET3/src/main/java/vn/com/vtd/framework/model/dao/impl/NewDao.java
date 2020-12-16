package vn.com.vtd.framework.model.dao.impl;

import java.util.List;

import vn.com.vtd.framework.dto.NewDto;
import vn.com.vtd.framework.mapper.NewDtoMapper;
import vn.com.vtd.framework.mapper.NewMapper;
import vn.com.vtd.framework.model.bean.NewModel;
import vn.com.vtd.framework.model.dao.INewDAO;
import vn.com.vtd.framework.paging.Pageble;

public class NewDao extends AbstractDAO<NewModel> implements INewDAO {

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryId = ?";
		return query(sql, new NewMapper(), categoryId);
	}

	@Override
	public Long save(NewModel newModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO news (title, content,");
		sql.append(" thumbnail, shortdescription, categoryid, createddate, createdby)");
		sql.append(" VALUES(?, ?, ?, ?, ?, ?, ?)");
		return insert(sql.toString(), newModel.getTitle(), newModel.getContent(), newModel.getThumbnail(),
				newModel.getShortDescription(), newModel.getCategoryId(), newModel.getCreatedDate(),
				newModel.getCreatedBy());
	}

	@Override
	public NewModel findOne(Long id) {
		String sql = "SELECT * FROM news WHERE id = ?";
		List<NewModel> news = query(sql, new NewMapper(), id);
		return news.isEmpty() ? null : news.get(0);
	}

	@Override
	public void update(NewModel updateNew) {
		StringBuilder sql = new StringBuilder("UPDATE news SET title = ?, thumbnail = ?,");
		sql.append(" shortdescription = ?, content = ?, categoryid = ?,");
		sql.append(" createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ? WHERE id = ?");
		update(sql.toString(), updateNew.getTitle(), updateNew.getThumbnail(), updateNew.getShortDescription(),
				updateNew.getContent(), updateNew.getCategoryId(), updateNew.getCreatedDate(), updateNew.getCreatedBy(),
				updateNew.getModifiedDate(), updateNew.getModifiedBy(), updateNew.getId());
	}

	@Override
	public void delete(long id) {
		String sql = "DELETE FROM news WHERE id = ?";
		update(sql, id);
	}

	@Override
	public List<NewModel> findAll(Pageble pageble) {
//		String sql = "SELECT * FROM news ORDER BY id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";

		StringBuilder sql = new StringBuilder("SELECT * FROM news");

//		if(offset != null && limit != null) {
//			sql.append(b)
//		}else

		if (pageble != null) {
			sql.append(" ORDER BY ");
			sql.append(pageble.getSortName());
			sql.append(" ");
			sql.append(pageble.getSortBy());
			sql.append(" OFFSET ");
			sql.append(pageble.getOffset());
			sql.append(" ROWS FETCH NEXT ");
			sql.append(pageble.getLimit());
			sql.append(" ROWS ONLY");
		}

		return query(sql.toString(), new NewMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM news";
		return count(sql);
	}

	@Override
	public List<NewDto> findAllTitleAndCreateBy(Pageble pageble) {
		StringBuilder sql = new StringBuilder("SELECT id, title, createdby, createddate FROM news");
		sql.append(getQueryPagination(pageble));
		return query(sql.toString(), new NewDtoMapper());
	}
	
//	@Override
//	public Long save(NewModel newModel) {
//		ResultSet resultSet = null;
//		PreparedStatement statement = null;
//		Long id = null;
//		Connection connection = null;
//		try {
//			String sql = "INSERT INTO news (title, content, categoryId) VALUES(?, ?, ?)";
//			connection = getConnection();
//			connection.setAutoCommit(false);
//			statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//			statement.setString(1, newModel.getTitle());
//			statement.setString(2, newModel.getContent());
//			statement.setLong(3, newModel.getCategoryId());
//			statement.executeUpdate();
//			resultSet = statement.getGeneratedKeys();
//			if (resultSet.next()) {
//				id = resultSet.getLong(1);
//			}
//			connection.commit();
//			return id;
//		} catch (SQLException e) {
//			e.printStackTrace();
//			if (connection != null) {
//				try {
//					connection.rollback();
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//			}
//			return null;
//		} finally {
//			try {
//				if (connection != null) {
//					connection.close();
//				}
//				if (statement != null) {
//					statement.close();
//				}
//				if (resultSet != null) {
//					resultSet.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//				return null;
//			}
//		}
//	}

}
