package br.com.riachuelo.steps;

import br.com.riachuelo.pageobjects.HomePage;
import cucumber.api.java8.Pt;

import static org.junit.Assert.assertEquals;

public class HomeSteps implements Pt {
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
