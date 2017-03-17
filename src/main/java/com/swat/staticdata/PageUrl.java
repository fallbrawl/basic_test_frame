package com.swat.staticdata;

public enum PageUrl  {
	
	ADMIN_LOGIN("http://cells.org.ua/scrum-selenium/admin/pageLogin.php"), //
	ADMIN_HOME("http://cells.org.ua/scrum-selenium/admin/pageHome.php"), 
	ADMIN_ADD_MEMBER("http://cells.org.ua/scrum-selenium/admin/pageEditMember.php"), //
	ADMIN_EDIT_MEMBER("http://cells.org.ua/scrum-selenium/admin/pageEditMember.php?memberID=%s"), // 
	ADMIN_VIEW_MEMBER_PAGE("http://cells.org.ua/scrum-selenium/admin/pageViewMembers.php"), //
	DYNAMIC_PAGE(""),//
	MAIN_PAGE("http://tomato-prod-test.php-cd.attractgroup.com"),//
	BACKEND_LOGIN_PAGE("http://tomato-prod-test.php-cd.attractgroup.com/backend/login"),//
	ADMIN_MAIN_PAGE("http://tomato-prod-test.php-cd.attractgroup.com/backend/users")//
	;

	//TODO Разобраться с перечислениями: добавить константу для установки адреса сервака на котором проводятся тесты

	private String urlValue;

	private PageUrl(String urlValue) {
		this.urlValue = urlValue;
	}

	public String getUrl() {
		return urlValue;
	}

}
