package br.com.riachuelo.pageobjects;

import br.com.riachuelo.utils.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class BasePage extends Element {

    /* Função que preenche campo imput*/
    static void preencherInput(By by, String text) {
        waitElement(by);
        element(by).sendKeys(text);
    }

    static void esperar(Integer esperar){
        driver.manage().timeouts().implicitlyWait(esperar, TimeUnit.SECONDS);
    }

    /* Função que clica em campo ou em botão*/
    static void click(By by) {
        waitElement(by);
        waitElementClick(by);
        element(by).click();
    }

    static void clickElementNotInteractable(By by) {
        elementVisible(by);
        waitElementClick(by);
        element(by).click();
    }

    /* Função que limpra campo imput*/
    static void clear(By by) {
        element(by).clear();
    }

    protected static String getText(By by) {
        waitElement(by);
        return element(by).getText();
    }

    /* Função que seleciona a tecla tab sobre um campo*/
    protected static void selecinoTab(By by) {
        element(by).sendKeys(Keys.TAB);
    }


}
