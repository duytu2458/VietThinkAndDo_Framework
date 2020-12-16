package vn.com.vtd.framework.paging;

public class PageRequest implements Pageble {

	private Integer page;
	private Integer limit;
	private String sortName;
	private String sortBy;

	public PageRequest() {
		super();
		this.page = 1;
		this.limit = 20;
		this.sortName = "id";
		this.sortBy = "desc";
	}

	// nhan duoc tu client
	public PageRequest(Integer page, Integer limit, String sortName, String sortBy) {
		this.page = page;
		this.limit = limit;
		this.sortName = sortName;
		this.sortBy = sortBy;
	}

	@Override
	public Integer getOffset() {
		if (this.page != null && this.limit != null) {
			return (this.page - 1) * this.limit;
		}
		return null;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

}
