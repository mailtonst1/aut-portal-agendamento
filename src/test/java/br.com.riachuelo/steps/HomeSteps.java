package br.com.riachuelo.steps;

import br.com.riachuelo.pageobjects.HomePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomeSteps extends BaseSteps {
	public HomeSteps() {





		Então("devo acessar a tela inicia do sistema com sucesso", () -> {
			assertEquals(HomePage.vejoTituloAgendamento(),"AGENDAMENTO");
		});

		E("finalizo teste saindo do sistema", () -> {
			HomePage.clicoBtnMenu();
			HomePage.clicoBtnSair();
		});

	}

}
