package br.com.riachuelo.pageobjects;

import org.openqa.selenium.By;


public class MenuPage extends BasePage {

    private static final By opcaoMenuCalendarioRecebimentoLink = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav > div > mat-nav-list > div:nth-child(4) > a");
    private static final By opcaoMenuTempoDescarregamentoLink = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav > div > mat-nav-list > div:nth-child(5) > a");
    private static final By opcaoMenuTurnosRecebimentoLink = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav > div > mat-nav-list > div:nth-child(3) > a");
    private static final By tituloCalendarioRecebimentoText = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-calendario-recebimento > div.page-title");
    private static final By tituloTempoDescarregametoText = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-tempo-descarregamento > div.page-title");
    private static final By tituloTurnoRecebomentoText = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-turno-recebimento > div.page-title");

    public static void clicarNaOpcaoMenuCalendarioRecebimento(){
        click(opcaoMenuCalendarioRecebimentoLink);
    }

    public static void clicarNaOpcaoMenuTempoDescarregamento(){
        click(opcaoMenuTempoDescarregamentoLink);
    }

    public static void clicarNaOpcaoMenuTurnoRecebimento() {
        click(opcaoMenuTurnosRecebimentoLink);
    }

    public static String validarTituloNaPaginaCalendarioRecebimento(){
        return element(tituloCalendarioRecebimentoText).getText();
    }

    public static String validarTituloNaPaginaTurnoRecebimento(){
        return getText(tituloTurnoRecebomentoText);
    }

    public static String validarTituloNaPaginaTempoDescarregamento(){
        return element(tituloTempoDescarregametoText).getText();
    }

}
