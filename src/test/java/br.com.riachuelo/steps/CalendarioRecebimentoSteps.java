package br.com.riachuelo.steps;

import br.com.riachuelo.pageobjects.CalendarioRecebimentoPage;
import br.com.riachuelo.pageobjects.HomePage;
import br.com.riachuelo.pageobjects.MenuPage;
import cucumber.api.java8.Pt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalendarioRecebimentoSteps implements Pt{
    public CalendarioRecebimentoSteps(){

        Dado("^que eu esteja na página de Calendário de Recebimento$", () -> {
            HomePage.clicoBtnMenu();
            MenuPage.clicarNaOpcaoMenuCalendarioRecebimento();
            HomePage.clicoBtnMenu();
            assertEquals(MenuPage.validarTituloNaPaginaCalendarioRecebimento(),"Calendário de Recebimento");
        });

        E("^seleciono a seção parametrizar$", () -> {
            CalendarioRecebimentoPage.clicarNaSecaoParametrizar();
        });

        E("^seleciono o cd da seção parametrização$", () -> {
            CalendarioRecebimentoPage.selecionoOpcaoCd();
        });

        E("^seleciono a origem da seção parametrização$", () -> {
            CalendarioRecebimentoPage.selecionoOpcaoOrigem();
        });

        E("^seleciono o fluxo de recebimento da seção parametrização$", () -> {
            CalendarioRecebimentoPage.selecionoOpcaoFluxo();
        });

        E("seleciono o turno da seção parametrização$", () -> {
            CalendarioRecebimentoPage.selecionoOpcaoTurno10();
        });

        E("preencho com a quantidade de docas da seção parametrização(.*)", (String docas) -> {
            CalendarioRecebimentoPage.preencherInputDocas(docas);
        });

        E("^seleciono um dia útil da semana da seção parametrização$", () -> {
            CalendarioRecebimentoPage.selecionarBotaoLimparDiasUteis();
            CalendarioRecebimentoPage.selecionoDiaUtil();
        });

        Quando("^seleciono o botão parametrização", () -> {
            try {
                new Thread().sleep(2000);
                CalendarioRecebimentoPage.selecionoBotaoParametrizar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Então("devo vê uma mensagem de calendario cadastrado com sucesso na tela", () -> {
            assertEquals(CalendarioRecebimentoPage.mensagemDeCalendarioCadastradoComSucesso(),"Calendário de Recebimento efetuado com sucesso!");
        });


        E("^seleciono ok na mensagem de confirmação$", () -> {
           CalendarioRecebimentoPage.clicarNoBotaoOk();
        });
        

        E("^que seleciono a seção lista de recebimento$", () -> {
            CalendarioRecebimentoPage.selecionoSecaoListaRecebimento();
        });
        Quando("^pesquiso por item cd(.*)", (String pesquisoItemCd) -> {
            CalendarioRecebimentoPage.preencherPesquisaItemCd(pesquisoItemCd);
        });
        Quando("^pesquiso por item  tipo Origem(.*)", (String pesquisoItemOrigem) -> {
            CalendarioRecebimentoPage.preencherPesquisaItemOrigem(pesquisoItemOrigem);
        });
        Quando("^pesquiso por item tipo Fluxo(.*)", (String pesquisoItemFluxo) -> {
            CalendarioRecebimentoPage.preencherPesquisaItemFluxo(pesquisoItemFluxo);
        });
        Quando("^pesquiso por item  tipo Turno(.*)", (String pesquisoTurno) -> {
            CalendarioRecebimentoPage.preencherPesquisaItemTurno(pesquisoTurno);
        });
        Quando("^pesquiso por item tipo docas(.*)", (String pesquisoItemDocas) -> {
            CalendarioRecebimentoPage.preencherPesquisaItemDocas(pesquisoItemDocas);
        });



        Então("^verifico se tem um item  tipo cd na lista de recebimento$", () -> {
            assertTrue(CalendarioRecebimentoPage.verificarPesquisaItemCd());
            CalendarioRecebimentoPage.limparCampoPesquisa();
        });
        Então("^verifico se tem um item  tipo origem na lista de recebimento$", () -> {
            assertTrue(CalendarioRecebimentoPage.verificarPesquisaItemOrigem());
            CalendarioRecebimentoPage.limparCampoPesquisa();
        });
        Então("^verifico se tem um item  tipo fluxo na lista de recebimento$", () -> {
            assertTrue(CalendarioRecebimentoPage.verificarPesquisaItemFluxo());
            CalendarioRecebimentoPage.limparCampoPesquisa();
        });
        Então("^verifico se tem um item  tipo turno na lista de recebimento$", () -> {
            assertTrue(CalendarioRecebimentoPage.verificarPesquisaItemTurno());
            CalendarioRecebimentoPage.limparCampoPesquisa();
        });
        Então("^verifico se tem um item  tipo numero de docas na lista de recebimento$", () -> {
            assertTrue(CalendarioRecebimentoPage.verificarPesquisaItemDocas());
            CalendarioRecebimentoPage.limparCampoPesquisa();
        });



        E("^seleciono o editar$", () -> {
            CalendarioRecebimentoPage.clicarNoBotaoEditarParametrizacao();
        });
        E("^que edito o cd de parametrização$", () -> {
            CalendarioRecebimentoPage.editoOpcaoCd();
        });
        E("^que edito a origem$", () -> {
            CalendarioRecebimentoPage.editoOpcaoOrigem();
        });
        E("^que edito o fluxo de recebimento$", () -> {
            CalendarioRecebimentoPage.editoOpcaoFluxo();
        });
        E("^que edito um dia útil da semana$", () -> {
            CalendarioRecebimentoPage.selecionarBotaoLimparDiasUteis();
            CalendarioRecebimentoPage.selecionoDiaUtil();
        });
        E("^que edito o turno$", () -> {
            CalendarioRecebimentoPage.editoOpcaoTurno1();
        });
        E("^que edito a quantidade de docas(.*)", (String editoDocas) -> {
            CalendarioRecebimentoPage.editoDocas(editoDocas);
        });



        Quando("^seleciono excluir item$", () -> {
            CalendarioRecebimentoPage.clicoEmExcluirParametrizacao();
            CalendarioRecebimentoPage.clicarNoBotaoOk();
        });

        Então("^verifico mensagem de item excluído com sucesso na tela$", () -> {
            assertTrue(CalendarioRecebimentoPage.verificoMensagemExclusaoSucesso());
        });


        /*--Fluxo alternativos: Mensagens de campo obrigatório--*/


        E("^que não seleciono a opção no campo cd$", () -> {
            CalendarioRecebimentoPage.acionarMensagemObrigatoriaCd();
        });
        E("^que não seleciono a opção no campo origem$", () -> {
            CalendarioRecebimentoPage.acionarMensagemObrigatoriaOrigem();
        });
        E("^que não seleciono a opção no campo fluxo de recebimento$", () -> {
            CalendarioRecebimentoPage.acionarMensagemObrigatoriaFluxo();
        });
        E("^que não seleciono a opçao no campo turno$", () -> {
            CalendarioRecebimentoPage.acionarMensagemObrigatoriaTurno();
        });
        Quando("^nao preencho a quantidade no campo número de docas$", () -> {
            CalendarioRecebimentoPage.acionarMensagemObrigatoriaNumeroDocas();
        });
        Então("^é exibido mensagem de campo obrigatorio no campo cd$", () -> {
            assertTrue(CalendarioRecebimentoPage.verificarMensagemObrigatorioCd());
        });
        E("^é exibido mensagem de campo obrigatorio no campo fluxo de recebimento$", () -> {
            assertTrue(CalendarioRecebimentoPage.verificarMensagemObrigatorioFluxo());
        });
        E("^é exibido mensagem de campo obrigatorio no campo turno$", () -> {
            assertTrue(CalendarioRecebimentoPage.verificarMensagemObrigatorioTurno());
        });
        E("^é exibido mensagem de campo obrigatorio no campo numero docas$", () -> {
            assertTrue(CalendarioRecebimentoPage.verificarMensagemObrigatorioNumeroDocas());
        });

        /*--Fluxo alternativos: Mensagens de data obrigatorio--*/


        E("^que seleciono um o botão limpar toda seleção do calendário$", () -> {
            CalendarioRecebimentoPage.selecionarBotaoLimparDiasUteis();
            CalendarioRecebimentoPage.selecionoDiaUtil();
            CalendarioRecebimentoPage.selecionoDiaUtil();

        });
        Então("^é exibido uma mensagem de data obrigatória no calendario$", () -> {
            assertTrue(CalendarioRecebimentoPage.verificaMensagemDeErroCalendarioRecebimento());

        });
        Quando("^não seleciono um dia útil$", () -> {
            CalendarioRecebimentoPage.selecionoDiaUtil();
            CalendarioRecebimentoPage.selecionoDiaUtil();
        });


    }
}