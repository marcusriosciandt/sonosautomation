package com.sonos.core;

import org.openqa.selenium.By;

public class ElementsCore extends DriverFactory{

	//STRING
	public static final String CAMINHO_DRIVER = "C:/Users/chromedriver/chromedriver.exe";
	public static final String URL = "https://qa-sonossupport.cs125.force.com/developerportal/s/?language=en_US";
	public static final String TXT_LOGIN = "thuseapi@tempsky.top";
	public static final String TXT_PASSWORD = "sonos@2022";
	
	//BY
	public static final By BTN_LOGIN = By.xpath("//*[@class='comm-user-profile-menu']");
	public static final By FIELD_LOGIN = By.id("okta-signin-username");
	public static final By FIELD_PASSWORD = By.id("okta-signin-password");
	public static final By BTN_SIGNIN = By.id("okta-signin-submit");
	public static final By MENU_DASHBOARD = By.xpath("//*[@id=\"1\"]");
	public static final By BTN_MANAGE = By.xpath("//*[@data-id='a483K000000J4IBQA0']");
	public static final By EXAMPLE_SUBSE_CAPAB = By.xpath("//*[@class='panel-title' and contains(., 'Capabilities')]");
}
