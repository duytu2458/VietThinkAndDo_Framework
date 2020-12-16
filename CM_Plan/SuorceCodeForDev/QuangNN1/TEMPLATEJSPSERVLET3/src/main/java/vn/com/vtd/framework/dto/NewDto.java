package vn.com.vtd.framework.dto;

import java.util.Date;

public class NewDto {

	private Long id;

	private String title;

	private String createdBy;

	private Date createdDate;

	public NewDto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

//	public String getCreatedDate2() {
//		return DateUtil.toDateFormat2(createdDate);
//	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
