package br.com.riachuelo.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Browser {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static WebDriverWait waitNot;

	synchronized static WebDriver getCurrentDriver() {
		if (driver == null) {
			try {
				driver = new ChromeDriver();
				wait = new WebDriverWait(driver, 50);
				waitNot = new WebDriverWait(driver, 1);
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
			} finally {
				Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
			}
		}
		return driver;
	}

	public static String loadPage(String url) {
		getCurrentDriver().get(url);
		return url;
	}

	public static String getUrl() {
		return getCurrentDriver().getCurrentUrl();
	}

	private static class BrowserCleanup implements Runnable {
		@Override
		public void run() {
			try {
				getCurrentDriver().quit();
				driver = null;
			} catch (UnreachableBrowserException e) {
			}
		}
	}
}