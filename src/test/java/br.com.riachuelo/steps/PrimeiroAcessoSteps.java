package br.com.riachuelo.steps;

import br.com.riachuelo.pageobjects.PrimeiroAcessoPage;
import cucumber.api.java8.Pt;

import static org.junit.Assert.assertEquals;

public class PrimeiroAcessoSteps implements Pt {
	public PrimeiroAcessoSteps() {

        Dado("que eu esteja acessando a tela de primeiro acesso", () -> {
            PrimeiroAcessoPage.clicarBtnPrimeiroAcesso();
        });

		Dado("que não preencho o campo email", () -> {
            PrimeiroAcessoPage.clicarNoCampoEmail();
		});

        E("que não preencho o campo CNPJ", () -> {
            PrimeiroAcessoPage.clicarNoCampoCNPJEmpresa();
        });

        E("que não preencho o campo senha", () -> {
            PrimeiroAcessoPage.clicarNoCampoDigiteSenha();
        });

        Quando("não preencho o campo confirmar senha", () -> {
            PrimeiroAcessoPage.clicarNoCampoConfirmeSenha();
        });

        Então("na tela de primeiro acesso vejo mensagagem no campo email sinalizando campo obrigatorio", () -> {
            assertEquals(PrimeiroAcessoPage.vericarMensagemCampoObrigatorioEmail(),"E-mail é obrigatório");
        });

        E("na tela de primeiro acesso vejo mensagem no campo CNPJ sinalizando campo obrigatório", () -> {
            assertEquals(PrimeiroAcessoPage.vericarMensagemCampoObrigatorioCNPJ(),"CNPJ é obrigatório");
        });

        E("na tela de primeiro acesso vejo mensagem no campo senha sinalizando campo obrigatório", () -> {
            assertEquals(PrimeiroAcessoPage.vericarMensagemCampoObrigatorioDigiteSenha(),"Senha é obrigatória");
        });

        E("na tela de primeiro acesso vejo mensagem no campo confirmar senha sinalizando campo obrigatório", () -> {
            assertEquals(PrimeiroAcessoPage.vericarMensagemCampoObrigatorioConfirmeSenha(),"Confirmação da senha é obrigatória");
        });

        E("finalizo o testes retornando a tela de login", () -> {
            PrimeiroAcessoPage.clicarBtnRetornarLogin();
        });

    }

}