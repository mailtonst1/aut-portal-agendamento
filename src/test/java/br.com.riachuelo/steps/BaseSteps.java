package br.com.riachuelo.steps;

import br.com.riachuelo.utils.Browser;
import cucumber.api.java8.Pt;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static br.com.riachuelo.utils.Browser.driver;

public class BaseSteps implements Pt {
	public BaseSteps() {
		Before(() -> {
			//driver.navigate().to("http://rch-sl04:4200/agendamento/#/login?token=GRP-US-S-PAG-ADMCD");
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			Browser.loadPage("http://rch-sl04:4200/agendamento/#/login?token=GRP-US-S-PAG-ADMCD");
		});

		After(scenario -> {
			if (scenario.isFailed()) {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			}
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.sessionStorage.clear();");
		});

	}
}



