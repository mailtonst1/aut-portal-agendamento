package br.com.riachuelo.steps;

import br.com.riachuelo.pageobjects.CalendarioRecebimentoPage;
import br.com.riachuelo.pageobjects.HomePage;
import br.com.riachuelo.pageobjects.MenuPage;
import br.com.riachuelo.pageobjects.TurnosRecebimentoPage;
import cucumber.api.java8.Pt;
import org.junit.Assert;

public class ContextosGeraisSteps extends BaseSteps implements Pt{
    public ContextosGeraisSteps(){

        /* Feature:  Calendario Recebimento*/
        /* Cenário: Finalizando os testes de calendario é excluindo vestigios de testes*/

        Dado( "^que eu acesse o Calendario de recebimento$", () -> {
                    HomePage.clicoBtnMenu();
                    MenuPage.clicarNaOpcaoMenuCalendarioRecebimento();
                    CalendarioRecebimentoPage.selecionoSecaoListaRecebimento();
                    HomePage.clicoBtnMenu();
        });

        E( "^que eu exclua a parametrização de agendamento criada$", () -> {
            try {
                new Thread().sleep(1000);
                CalendarioRecebimentoPage.clicoEmExcluirParametrizacao();
                new Thread().sleep(1000);
                CalendarioRecebimentoPage.clicarNoBotaoOk();
            }catch (InterruptedException e){

            }
        });

        E( "^que eu acesse o turno de recebimento$", () -> {
            HomePage.clicoBtnMenu();
            MenuPage.clicarNaOpcaoMenuTurnoRecebimento();
            TurnosRecebimentoPage.clicarNaSecaoListaDeTurno();
            HomePage.clicoBtnMenu();
        });

        E( "^que pesquiso pelo turno criado pela automação$", () -> {
            TurnosRecebimentoPage.pesquisoPorItemInseridoAutomatico();
        });
        Quando( "^seleciono pra excluir o turno$", () -> {
            TurnosRecebimentoPage.clicoEmExcluirTurno();
            TurnosRecebimentoPage.clicarNoBotaoOk();
        });

       Então( "^é exibido mensagem de turno excluido com sucesso$", () -> {
           Assert.assertEquals(TurnosRecebimentoPage.mensagemTurnoExcluidoComSucessoSpan(),"Turno excluído com sucesso!");
        });




    }
}