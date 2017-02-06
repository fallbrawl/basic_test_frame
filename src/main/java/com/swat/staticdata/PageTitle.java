package com.swat.staticdata;

public enum PageTitle {
	
	EMPTY(""),//
	ADMIN_LOGIN("Sign In First!"), //
	ADMIN_HOME("Membership Management"), //
	ADMIN_ADD_MEMBER("Membership Management"), //
	ADMIN_EDIT_MEMBER("Membership Management"), // 
	ADMIN_VIEW_MEMBER_PAGE("Membership Management"), //
	MAIN_PAGE_RU("Русский 1 @"), // main page in russian
	;

	private String titleValue;

	private PageTitle(String titleValue) {
		this.titleValue = titleValue;
	}

	public String getTitleValue() {
		return titleValue;
	}

}
