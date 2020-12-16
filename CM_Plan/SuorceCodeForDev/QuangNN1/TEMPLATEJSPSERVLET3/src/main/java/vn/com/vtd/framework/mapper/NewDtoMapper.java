package vn.com.vtd.framework.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import vn.com.vtd.framework.dto.NewDto;

public class NewDtoMapper implements RowMapper<NewDto>{
	@Override
	public NewDto mapRow(ResultSet resultSet) {
		try {
			NewDto newDto = new NewDto();
			newDto.setId(resultSet.getLong("id"));
			newDto.setTitle(resultSet.getString("title"));
			newDto.setCreatedBy(resultSet.getString("createdby"));
			newDto.setCreatedDate(resultSet.getDate("createddate"));
			return newDto;
		} catch (SQLException e) {
			return null;
		}
	}
}
