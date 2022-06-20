package com.sonos.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

	// public => método main, pode ser acessado de qualquer diretótio;
	// static => uma única ocorrência, método estático, não depende de nenhuma
	// WebDriver => permite utilizar diferentes navegadores EX: chromedriver,
	//geckodriver
	public static boolean initialized = false;

	private static WebDriver driver;
	public static boolean isRodandoViaRunner = false;
	public static boolean isLogado = false;
	
	BasePage pageSonos = new BasePage();

	public static boolean startDriver() {
		if (!initialized) {
			initialized = true;
			System.setProperty("webdriver.chrome.driver", ElementsCore.CAMINHO_DRIVER);
			setupDriver();
			return true;
		}
		return false;
	}

	public static WebDriver getDriver() {
		/*
		 * if(driver == null) { switch (Properties.browser) { case FIREFOX: driver = new
		 * FirefoxDriver(); break; case CHROME: driver = new ChromeDriver(); break;
		 * 
		 * } driver.manage().window().setSize(new Dimension(1200, 765)); }
		 */
		return driver;
	}

	public static void killDriver() {
		driver.quit();
		initialized = false;
		setLogado(false);
	}

	/*
	 * public static void acessarSonosLocalhost() {
	 * driver.get("http://localhost:8080/PortalSonos/"); 
	 * setLogado(false); }
	 */

	public static boolean isInitialized() {
		return initialized;
	}

	private static void setupDriver() {
		driver = new ChromeDriver(getOptions());
		driver.get(ElementsCore.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new WebDriverWait(getDriver(), 5, 5);
		driver.findElement(ElementsCore.BTN_LOGIN).click();
	}

	private static ChromeOptions getOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--incognito");
		//options.addArguments("--headless", "--window-size=1366,768");
		return options;
	}

	public static void setIsRodandoViaRunnerTrue() {
		isRodandoViaRunner = true;
	}

	public static boolean isRodandoViaRunner() {
		return isRodandoViaRunner;
	}

	public static void setLogado(boolean isLogadoParametro) {
		isLogado = isLogadoParametro;
	}

	public static boolean isLogado() {
		return isLogado;
	}

}
