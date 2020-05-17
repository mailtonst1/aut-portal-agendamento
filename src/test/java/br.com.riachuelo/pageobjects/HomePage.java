package br.com.riachuelo.pageobjects;


import org.openqa.selenium.By;

public class HomePage extends BasePage {


    private static final By tituloAgendamento = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > mat-toolbar > span");
    private static final By btnSair = By.cssSelector("mat-sidenav > div > mat-nav-list > div:nth-child(10) > a");
    private static final By btnMenu = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > mat-toolbar > button");


    public static String vejoTituloAgendamento(){
        return element(tituloAgendamento).getText();
    }

    public static void clicoBtnMenu(){
        waitElement(btnMenu);
        click(btnMenu);
    }
    public static void clicoBtnSair(){
        click(btnSair);
    }
}
