package br.com.riachuelo.steps;

import br.com.riachuelo.pageobjects.LoginPage;
import cucumber.api.java8.Pt;
import static org.junit.Assert.assertEquals;

public class LoginSteps implements Pt {
	public LoginSteps() {

		Dado("^que preencho o login com CNPJ (.*) e a senha (.*) validos$", (String cnpj, String senha) -> {
			LoginPage.preencherInputUsuario(cnpj);
            LoginPage.preencherInputSenha(senha);
		});


		Quando("confirmo para o botão entrar", () -> {
			LoginPage.clicarBtLogin();
		});

		/* Cenários de exceção  - campos Obrigatorios*/
                /* Passos do cenário - Validar mensagens de campos obrigatórios da tela de login*/

        Dado("^que não preencho um CNPJ$", () -> {
            LoginPage.clicarCampoLoginCnpj();
        });

        Quando("não preencho uma senha", () -> {
            LoginPage.clicarCampoSenha();

        });
        Então("vejo mensagagem no campo login sinalizando campo obrigatorio obrigatório", () -> {
            assertEquals(LoginPage.verificaCampoLoginObrigatorio(),"CNPJ é obrigatório");
        });
        E("vejo mensagem no campo senha sinalizando campo obrigatório", () -> {
            assertEquals(LoginPage.verificaCampoSenhaObrigatorio(),"Senha é obrigatório");
        });

        /* Cenários de exceção  - campos Obrigatorios*/

        Dado("que preencho um login CNPJ (.*) invalidos", (String cnpj) -> {
            LoginPage.preencherInputUsuario(cnpj);
        });

        Quando("preencho uma senha (.*) invalida", (String senha) -> {
            LoginPage.preencherInputSenha(senha);
        });

        Então("devo vê mensagagem de formato invalido no campo de login", () -> {
            assertEquals(LoginPage.verificaCampoLoginInvalido(),"Formato inválido de CNPJ");
        });

        E("devo vê mensagagem de senha fora do padrao aceitavel", () -> {
            assertEquals(LoginPage.verificaCampoLoginInvalido(),"Formato inválido de CNPJ");
        });

        E("limpo os campos", () -> {
            LoginPage.limparCampologin();
            LoginPage.limparCampoSenha();
        });




	}

}
