package vn.com.vtd.framework.mapper;

import java.sql.ResultSet;

public interface RowMapper<T> {
	T mapRow(ResultSet rs);
}
