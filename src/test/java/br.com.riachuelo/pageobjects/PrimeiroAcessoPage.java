package br.com.riachuelo.pageobjects;

import org.openqa.selenium.By;

public class PrimeiroAcessoPage extends BasePage {

    private static final By campoEmail = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-cadastro-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(1) > mat-form-field > div  input");
    private static final By campoCNPJEmpresa = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-cadastro-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(2) > mat-form-field > div input");
    private static final By campoDigiteSenha = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-cadastro-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(3) > mat-form-field > div input");
    private static final By campoConfirmeSenha = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-cadastro-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(4) > mat-form-field > div input");
    private static final By btnRetornaTelaLogin = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-cadastro-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(6) > a");
    private static final By btnPrimeiroAcesso = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-login-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(4) > a:nth-child(3)");

    private static final By mensagemCampoObrigatorioEmail = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-cadastro-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(1) > mat-form-field > div > div.mat-form-field-subscript-wrapper > div > mat-error");
    private static final By mensagemCampoObrigatorioCNPJ = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-cadastro-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(2) > mat-form-field > div > div.mat-form-field-subscript-wrapper > div > mat-error");
    private static final By mensagemCampoObrigatorioDigiteSenha = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-cadastro-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(3) > mat-form-field > div > div.mat-form-field-subscript-wrapper > div > mat-error");
    private static final By mensagemCampoObrigatorioConfirmeSenha = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-cadastro-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(4) > mat-form-field > div > div.mat-form-field-subscript-wrapper > div > mat-error");


    public static void clicarNoCampoEmail(){
        click(campoEmail);
        selecinoTab(campoEmail);
    }
    public static void clicarNoCampoCNPJEmpresa(){
        selecinoTab(campoCNPJEmpresa);
    }
    public static void clicarNoCampoDigiteSenha(){
        click(campoDigiteSenha);
        selecinoTab(campoDigiteSenha);
    }
    public static void clicarNoCampoConfirmeSenha(){
        click(campoConfirmeSenha);
        selecinoTab(campoConfirmeSenha);
    }

    public static void clicarBtnRetornarLogin(){
        click(btnRetornaTelaLogin);
    }

    public static void clicarBtnPrimeiroAcesso(){
        click(btnPrimeiroAcesso);
    }

    public static String vericarMensagemCampoObrigatorioEmail(){
        return element(mensagemCampoObrigatorioEmail).getText();
    }

    public static String vericarMensagemCampoObrigatorioCNPJ(){
        return element(mensagemCampoObrigatorioCNPJ).getText();
    }

    public static String vericarMensagemCampoObrigatorioDigiteSenha(){
        return element(mensagemCampoObrigatorioDigiteSenha).getText();
    }

    public static String vericarMensagemCampoObrigatorioConfirmeSenha(){
        return element(mensagemCampoObrigatorioConfirmeSenha).getText();
    }



}
