package com.swat.staticdata;

public enum PageTitle {

	ADMIN_LOGIN("Sign In First!"), //
	ADMIN_HOME("Membership Management"), //
	ADMIN_ADD_MEMBER("Membership Management"), //
	ADMIN_EDIT_MEMBER("Membership Management"), // 
	ADMIN_VIEW_MEMBER_PAGE("Membership Management"), //
	MAIN_PAGE_RU("Tomato"), //
	BACKEND_LOGIN_PAGE("Tomato Backend Login"), //
	ADMIN_MAIN_PAGE("Tomato Backend"),//
	DYNAMIC_PAGE("");

	private String titleValue;

	private PageTitle(String titleValue) {
		this.titleValue = titleValue;
	}

	public String getTitleValue() {
		return titleValue;
	}
}
