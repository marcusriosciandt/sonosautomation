package com.sonos.core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends DriverFactory{
	
	LoginPage loginSonos = new LoginPage();
	GetStartedPage GetStSonos = new GetStartedPage();
	
	public void logarPartner() {
		loginSonos.fillLogin();
		loginSonos.fillPassword();
		loginSonos.clickBtnSignin();
	    esperarPeloElemento(ElementsCore.MENU_DASHBOARD);
	    GetStSonos.clickMenuDashboard();
	}
	
	String mensagemDeErro = "";
	private static final long CINCO = 5;
	
	public WebElement procurarElemento(By t) {
		esperarPeloElemento(t);
		return getDriver().findElement(t);
	}
	
	public void preencherCampo(By id, String texto) {
		procurarElemento(id).clear();
		procurarElemento(id).sendKeys(texto);
	}
	
	public void esperarPeloElemento(By elemento) {
		try {
			new WebDriverWait(getDriver(), 20, 1000).until(ExpectedConditions.presenceOfElementLocated(elemento));
		} catch (Exception e) {
			StringBuilder msg = new StringBuilder();
			mensagemDeErro = "Demorou mais de 20s para encontrar o elemento ".concat(elemento.toString());
			msg.append("\n################################################\n");
			msg.append(mensagemDeErro);
			msg.append("\n################################################");

		}
	}
	
	public void esperarCarregarBarraInferior() {
		try {

			new WebDriverWait(getDriver(), CINCO)
					.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("barraInferior")));
		} catch (Exception e) {
			mensagemDeErro = "Não carregou a Barra inferior";
			Assert.fail(mensagemDeErro);
		}
	}

}
