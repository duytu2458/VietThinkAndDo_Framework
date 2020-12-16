package vn.com.vtd.framework.paging;

public interface Pageble {
	Integer getOffset();

	Integer getLimit();

	void setLimit(Integer limit);

	Integer getPage();

	void setPage(Integer page);

	String getSortName();

	void setSortName(String sortName);

	String getSortBy();

	void setSortBy(String sortBy);
}
