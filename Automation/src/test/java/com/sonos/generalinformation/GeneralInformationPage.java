package com.sonos.generalinformation;

import com.sonos.core.BasePage;

public class GeneralInformationPage extends BasePage {
	
	//BasePage pageSonos = new BasePage();
	
	
	public void accessGeneralInformationTab() {
		procurarElemento(GeneralInformationElements.GENINF_TAB).click();
	}

	
}
