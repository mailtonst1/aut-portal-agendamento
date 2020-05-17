package br.com.riachuelo.pageobjects;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private static final By seletorInputCnpj = By.cssSelector("input[placeholder='Digite seu CNPJ']");
    private static final By seletorInputSenha = By.cssSelector("input[placeholder='Digite sua senha']");
    private static final By seletorBtLogin = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-login-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(3) > button");

    private static final By seletorLinkEsqueciSenha = By.xpath("//*[contains(text(),' Esqueci minha senha ')]//parent::a");
    private static final By seletorLinkCadastrar = By.xpath("//*[contains(text(),' Cadastrar ')]//parent::a");
    private static final By seletorErrorCNPJObrigatoria = By.xpath("//*[contains(text(),'CNPJ é obrigatório')]//ancestor::mat-error");

    private static final By alertErrorCampoCnpjObrigatoria = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-login-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(1) > mat-form-field > div > div.mat-form-field-subscript-wrapper > div  > mat-error");
    private static final By alertErrorCampoSenhaObrigatoria = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-login-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(2) > mat-form-field > div > div.mat-form-field-subscript-wrapper > div >mat-error");
    private static final By alertErrorCampoCnpjInvalido = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-login-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(1) > mat-form-field > div > div.mat-form-field-subscript-wrapper > div  > mat-error");
    private static final By alertErrorCampoSenhaFormatoinvalido = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-login-fornecedor > div > div > mat-card > mat-card-content > form > div > div:nth-child(2) > mat-form-field > div > div.mat-form-field-subscript-wrapper > div >mat-error");


    public static void preencherInputUsuario(String cnpj){
        click(seletorInputCnpj);
        preencherInput(seletorInputCnpj, cnpj);
    }

    public static void preencherInputSenha(String senha){
        click(seletorInputSenha);
        preencherInput(seletorInputSenha, senha);
    }
    public static void clicarCampoLoginCnpj(){
        click(seletorInputCnpj);
        selecinoTab(seletorInputCnpj);
    }
    public static void clicarCampoSenha(){
        click(seletorInputSenha);
        selecinoTab(seletorInputSenha);
    }
    public static void clicarBtLogin(){
        click(seletorBtLogin);
    }
    public static String verificaCampoLoginObrigatorio(){
        return element(alertErrorCampoCnpjObrigatoria).getText();
    }
    public static String  verificaCampoSenhaObrigatorio(){
        return element(alertErrorCampoSenhaObrigatoria).getText();
    }
    public static String verificaCampoLoginInvalido(){
        return element(alertErrorCampoCnpjInvalido).getText();
    }
    public static String verificaCampoSenhaFormatoInvalido(){
        return element(alertErrorCampoCnpjInvalido).getText();
    }

    public static void limparCampologin(){
        click(seletorInputCnpj);
        clear(seletorInputCnpj);
    }

    public static void limparCampoSenha(){
        click(seletorInputSenha);
        clear(seletorInputSenha);
    }



}
