package com.sonos.core;

public class LoginPage extends BasePage{
	
	public void fillLogin() {
		preencherCampo(ElementsCore.FIELD_LOGIN, ElementsCore.TXT_LOGIN);
	}

	public void fillPassword() {
		preencherCampo(ElementsCore.FIELD_PASSWORD, ElementsCore.TXT_PASSWORD);
	}
	
	public void clickBtnSignin() {
		procurarElemento(ElementsCore.BTN_SIGNIN).click();
		esperarCarregarBarraInferior();
	}
}
