package br.com.riachuelo.steps;

import br.com.riachuelo.pageobjects.HomePage;
import br.com.riachuelo.pageobjects.MenuPage;
import br.com.riachuelo.pageobjects.TurnosRecebimentoPage;
import cucumber.api.java8.Pt;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TurnosRecebimentoSteps implements Pt{
    public TurnosRecebimentoSteps(){

        Dado("^que exista um turno cadastrado no sistema$", () -> {
            HomePage.clicoBtnMenu();
            MenuPage.clicarNaOpcaoMenuTurnoRecebimento();
            TurnosRecebimentoPage.selecionoSecaoNovo();
            HomePage.clicoBtnMenu();
            TurnosRecebimentoPage.clicarNoCampoCd();
            TurnosRecebimentoPage.selecionoOpcaoCd();
            TurnosRecebimentoPage.clicarNoCampoTurno();
            TurnosRecebimentoPage.selecionoOpcaoTurno();
            TurnosRecebimentoPage.selecinoTabNoCampoTurno();
            TurnosRecebimentoPage.clicoNoCampodData();
            TurnosRecebimentoPage.selecionoDataAtual();
            TurnosRecebimentoPage.clicarNoCampoHoraInicio();
            TurnosRecebimentoPage.preencherInputHoraIncial("2200");
            TurnosRecebimentoPage.clicarNoCampoHoraFinal();
            TurnosRecebimentoPage.preencherInputHoraFinal("0400");
            TurnosRecebimentoPage.selecionarBotaoSalvar();
            TurnosRecebimentoPage.clicarNoBotaoOk();
        });

        Dado("^que eu esteja na página de Turnos Recebimento$", () -> {
            HomePage.clicoBtnMenu();
            MenuPage.clicarNaOpcaoMenuTurnoRecebimento();
            HomePage.clicoBtnMenu();
            assertEquals(MenuPage.validarTituloNaPaginaTurnoRecebimento(),"Parametrização de Turno");
        });

        E("^seleciono a secao lista de turnos$", () -> {
            TurnosRecebimentoPage.clicarNaSecaoListaDeTurno();
        });

        E("^seleciono a seção novo$", () -> {
            TurnosRecebimentoPage.selecionoSecaoNovo();
        });

        E("^seleciono a opção CD270 da seção novo$", () -> {
            TurnosRecebimentoPage.clicarNoCampoCd();
            TurnosRecebimentoPage.selecionoOpcaoCd();
        });

        E("^seleciono a opção turno da seção novo$", () -> {
            TurnosRecebimentoPage.clicarNoCampoTurno();
            TurnosRecebimentoPage.selecionoOpcaoTurno();
            TurnosRecebimentoPage.selecinoTabNoCampoTurno();
        });

        E("^seleciono a data atual da seção novo$", () -> {
            TurnosRecebimentoPage.clicoNoCampodData();
            TurnosRecebimentoPage.selecionoDataAtual();
        });
        E("preencho com o horario inicial da seção novo(.*)", (String inicio) -> {
            TurnosRecebimentoPage.clicarNoCampoHoraInicio();
            TurnosRecebimentoPage.preencherInputHoraIncial(inicio);
        });
        E("preencho com o horario de termino da seção novo(.*)", (String fim) -> {
            TurnosRecebimentoPage.clicarNoCampoHoraFinal();
            TurnosRecebimentoPage.preencherInputHoraFinal(fim);
        });

        Quando("^seleciono o botao salvar turnos$", () -> {
            TurnosRecebimentoPage.selecionarBotaoSalvar();
        });

        Quando("^seleciono o campo horario de termino da seção de novo$", () -> {
            TurnosRecebimentoPage.dispararMensagemDeErroCampoHoraFinal();
        });

        /*Passos dos fluxos de mensagem de erro*/

        Quando("^não preencho o campo cd da seção de novo$", () -> {
            TurnosRecebimentoPage.dispararMensagemDeErroCampoCd();
        });
        E("^não preencho o campo turno da seção de novo$", () -> {
            TurnosRecebimentoPage.dispararMensagemDeErroCampoTurno();
        });
        E("^não preencho o calendario data da seção de novo$", () -> {
            TurnosRecebimentoPage.dispararMensagemDeErroCalendarioData();
        });
        E("^não preencho o campo horario inicial da seção de novo$", () -> {
            TurnosRecebimentoPage.dispararMensagemDeErroCampoHoraInicial();
        });

        Quando("^não preencho o campo horario de termino da seção de novo$", () -> {
            TurnosRecebimentoPage.dispararMensagemDeErroCampoHoraFinal();
        });

        Então("^é exibida mensagem de campo obrigatorio no cd$", () -> {
            assertEquals(TurnosRecebimentoPage.vejoMensagemDeErroCampoCd(),"CD é obrigatório");
        });
        E("^é exibida mensagem de campo obrigatorio no turno$", () -> {
            assertEquals(TurnosRecebimentoPage.vejoMensagemDeErroCampoTurno(),"Turno é obrigatório");
        });
        E("^é exibida mensagem de data obrigatoria no calendário$", () -> {
            assertEquals(TurnosRecebimentoPage.vejoMensagemDeErroCampoData(),"Intervalo de datas é obrigatório");
        });
        E("^é exibida mensagem de campo obrigatorio no horario inicial$", () -> {
            assertEquals(TurnosRecebimentoPage.vejoMensagemDeErroCampoHorarioInicial(),"Horário de início é obrigatório");
        });
        E("^é exibida mensagem de campo obrigatorio no horario de termino$", () -> {
            assertEquals(TurnosRecebimentoPage.vejoMensagemDeErroCampoHorarioFinal(),"Horário de término é obrigatório");
        });

        Então("^é exibido uma mensagem de turno cadastrado com sucesso$", () -> {
            assertEquals(TurnosRecebimentoPage.mensagemTurnoCadastradoSucessoSpan(),"Turno cadastrado com sucesso!");
            TurnosRecebimentoPage.clicarNoBotaoOk();
        });

        E("^finalizo o testes de turnos de recebimento excluindo o turno criado$", () -> {
            TurnosRecebimentoPage.clicarNoBotaoOk();
            TurnosRecebimentoPage.clicoEmExcluirTurno();
            Assert.assertEquals(TurnosRecebimentoPage.vejomensagemDeTurnoExcuidoComSucesso(),"Turno excluído com sucesso!");
        });

        E("^pesquiso por hora inicial na lista de turnos(.*)$", (String pesquisoPorItem) -> {
            TurnosRecebimentoPage.pesquisoPorItem(pesquisoPorItem);
            
        });
        E("^edito o horario inicial na lista de turno(.*)$", (String editarHoraInicio) -> {
            TurnosRecebimentoPage.editarHoraInicialTurno(editarHoraInicio);
        });
        E("^edito o horario de termino na lista de turnos(.*)$", (String editarHoraTermino) -> {
            TurnosRecebimentoPage.editarHoraTerminoTurno(editarHoraTermino);
        });
        Então("^é exibido uma mensagem de sucesso na lista de turnos$", () -> {
            assertTrue(TurnosRecebimentoPage.verificarMensagemDeTurnoAtualizadoComSucesso());
        });
        E("seleciono o botão editar turnos", () -> {
            TurnosRecebimentoPage.clicarEditarTurnos();
        });

    }
}
