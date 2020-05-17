package br.com.riachuelo.pageobjects;

import org.openqa.selenium.By;

public class CalendarioRecebimentoPage extends BasePage {

    /* seção de parametrização*/

    private static final By campoCdLabel = By.cssSelector("mat-select[formcontrolname='cd']");
    private static final By opcaoCdLabel = By.cssSelector("mat-option:nth-child(3)");
    private static final By campoOrigemLabel = By.cssSelector("mat-select[formcontrolname='origemRecebimento']");
    private static final By campoFluxoLabel = By.cssSelector("mat-select[formcontrolname='fluxosRecebimento']");
    private static final By opcaoOrigemLabel = By.cssSelector("mat-option:nth-child(3)");
    private static final By opcaoFluxoLabel = By.cssSelector("mat-option:nth-child(7)");
    private static final By campoTurnoLabel = By.cssSelector("mat-select[formcontrolname='numerosTurnos']");
    private static final By opcaoTurno10CampoLabel = By.cssSelector("mat-option:nth-child(1)");
    private static final By campoNumeroDocas = By.cssSelector("input[placeholder='Número de docas']");


    private static final By edicaoOpcaoCdLabel = By.xpath("//div/mat-option[2]");
    private static final By edicaoOpcaoOrigemLabel = By.xpath("//div/mat-option[2]");
    private static final By edicaoOpcaoFluxoLabel = By.xpath("//div/mat-option[2]");

    private static final By mensagemSucessoSpan = By.xpath("//*[contains(text(),'Calendário de Recebimento efetuado com sucesso!')]//ancestor::simple-snack-bar");

    private static final By diaUtiul = By.cssSelector(".ui-datepicker-today");
    private static final By parametrizarButton = By.xpath("//*[contains(text(),'Parametrizar ')]//ancestor::button");
    private static final By botaoLimparButton = By.xpath("//*[contains(text(),' Limpar Toda Seleção ')]//ancestor::button");
    private static final By botaoDiasUteisButton = By.xpath("//*[contains(text(),' Dias Úteis ')]//ancestor::button");
    private static final By secaoParametrizarLink = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-calendario-recebimento > nav  a:nth-child(1)");

    private static final By btnEditarParametrizacao = By.xpath("//*[contains(text(),' Parametrização ')]//ancestor::a");
    private static final By botaoOkMensagem = By.cssSelector("snack-bar-container simple-snack-bar div button");


    /* seção lista de recebimento - Pesquisar */

    private static final By secaoListaRecebimento = By.xpath("//*[contains(text(),' Lista de Recebimento ')]//ancestor::a");
    private static final By campoPesquisarSpan = By.xpath("//*[contains(text(),'Pesquisa')]//ancestor::mat-form-field//input");
    private static final By verificaPesquisaItemCd = By.xpath("//mat-row//mat-cell[1]");
    private static final By verificaPesquisaItemOrigem = By.xpath("//mat-row//mat-cell[3]");
    private static final By verificaPesquisaItemFluxo = By.xpath("//mat-row//mat-cell[4]");
    private static final By verificaPesquisaItemTurno = By.xpath("//mat-row//mat-cell[5]");
    private static final By verificaPesquisaItemQtDocas = By.xpath("//mat-row//mat-cell[6]");
    private static final By btnEditar = By.xpath("//mat-row[1]//mat-cell//button[@mattooltip='Editar']");
    private static final By btnExcluir = By.xpath("//mat-row[1]//mat-cell//button[@mattooltip='Excluir']");
    private static final By simBtnExcluir = By.xpath("//*[contains(text(),'Sim')]//ancestor::button");
    private static final By mensagemExclusaoParametroSucesso = By.xpath("//*[contains(text(),'Parametrização excluída com sucesso!')]//ancestor::simple-snack-bar");


    private static final By mensagenObrigatorioCampoCd = By.xpath("//*[contains(text(),'Selecione um CD')]//ancestor::mat-error");
    private static final By mensagenObrigatorioCampoOrigem = By.xpath("//*[contains(text(),'Selecione ao menos uma Origem')]//ancestor::mat-error");
    private static final By mensagenObrigatorioCampoFluxo = By.xpath("//*[contains(text(),'Selecione ao menos um Fluxo de Recebimento')]//ancestor::mat-error");
    private static final By mensagenObrigatorioCampoTurno = By.xpath("//*[contains(text(),'Turno é obrigatório')]//ancestor::mat-error");
    private static final By mensagenObrigatorioCampoNumeroDocas = By.xpath("//*[contains(text(),'Número de docas é obrigatório')]//ancestor::mat-error");
    private static final By mensagenObrigatorioCalendarioRecebimento = By.xpath("//*[contains(text(),'* Selecione ao menos uma data.')]//ancestor::mat-error");


    public static void clicarNoCampoCd() {
        click(campoCdLabel);
    }
    public static void clicarNoCampoOrigem(){
        click(campoOrigemLabel);
    }
    public static void clicarNoCampoFluxo(){
        click(campoFluxoLabel);
    }
    public static void clicarNoCampoTurno() { click(campoTurnoLabel); }
    public static void clicarNoCampoNumeroDocas() {click(campoNumeroDocas);}
    public static void selecionoDiaUtil(){
        click(diaUtiul);
    }
    public static void selecionoBotaoParametrizar(){
        click(parametrizarButton);
    }
    public static void selecionarBotaoLimparDiasUteis(){
        click(botaoLimparButton);
    }
    public static void clicarNaSecaoParametrizar() { click(secaoParametrizarLink);}
    public static void clicarNoBotaoDiasUteis(){ click(botaoDiasUteisButton);}


    public static String mensagemDeCalendarioCadastradoComSucesso() {
        return getText(mensagemSucessoSpan);
    }
    public static void selecionoOpcaoCd(){
        clicarNoCampoCd();
        waitElement(opcaoCdLabel);
        click(opcaoCdLabel);
        selecinoTab(opcaoCdLabel);
    }
    public static void selecionoOpcaoOrigem(){
        clicarNoCampoOrigem();
        waitElement(opcaoOrigemLabel);
        click(opcaoOrigemLabel);
        selecinoTab(opcaoOrigemLabel);
    }
    public static void selecionoOpcaoFluxo(){
        clicarNoCampoFluxo();
        waitElement(opcaoFluxoLabel);
        click(opcaoFluxoLabel);
        selecinoTab(opcaoFluxoLabel);
    }
    public static void selecionoOpcaoTurno10(){
        clicarNoCampoTurno();
        waitElement(opcaoTurno10CampoLabel);
        click(opcaoTurno10CampoLabel);
        selecinoTab(opcaoTurno10CampoLabel);
    }

    /*-- Passos de pesquisar e vrificar resultado da pesquisa --*/


    public static void preencherInputDocas(String docas){
        clicarNoCampoNumeroDocas();
        waitElement(campoNumeroDocas);
        preencherInput(campoNumeroDocas, docas);
    }

    public static void inserirNumeroDeDocasEmPesquisar(){
        waitElement(campoPesquisarSpan);
        click(campoPesquisarSpan);
        preencherInput(campoPesquisarSpan, "100");
    }

    public static void preencherValorNumeroDeDocas(){
        waitElement(campoNumeroDocas);
        click(campoNumeroDocas);
        preencherInput(campoNumeroDocas, "100");
    }

    public static void limparCampoPesquisa(){
        waitElement(campoPesquisarSpan);
        click(campoPesquisarSpan);
        preencherInput(campoPesquisarSpan, "   ");
    }
    public static void preencherPesquisaItemCd(String pesquisoCd){
        waitElement(campoPesquisarSpan);
        click(campoPesquisarSpan);
        preencherInput(campoPesquisarSpan, pesquisoCd);
    }
    public static void preencherPesquisaItemOrigem(String pesquisoOrigem){
        waitElement(campoPesquisarSpan);
        click(campoPesquisarSpan);
        preencherInput(campoPesquisarSpan, pesquisoOrigem);
    }
    public static void preencherPesquisaItemFluxo(String pesquisoFluxo){
        waitElement(campoPesquisarSpan);
        click(campoPesquisarSpan);
        preencherInput(campoPesquisarSpan, pesquisoFluxo);
    }
    public static void preencherPesquisaItemTurno(String pesquisoTurno){
        waitElement(campoPesquisarSpan);
        click(campoPesquisarSpan);
        preencherInput(campoPesquisarSpan, pesquisoTurno);
    }
    public static void preencherPesquisaItemDocas(String pesquisoDocas){
        waitElement(campoPesquisarSpan);
        click(campoPesquisarSpan);
        preencherInput(campoPesquisarSpan, pesquisoDocas);
    }
    public static void selecionoSecaoListaRecebimento(){
        waitElement(secaoListaRecebimento);
        click(secaoListaRecebimento);
    }
    public static boolean verificarPesquisaItemCd(){
        return exist(verificaPesquisaItemCd);
    }
    public static boolean verificarPesquisaItemOrigem(){
         return exist(verificaPesquisaItemOrigem);
    }
    public static boolean verificarPesquisaItemFluxo(){
        return exist(verificaPesquisaItemFluxo);
    }
    public static boolean verificarPesquisaItemTurno(){
        return exist(verificaPesquisaItemTurno);
    }
    public static boolean verificarPesquisaItemDocas(){
        return exist(verificaPesquisaItemQtDocas);
    }

    /*-- Passos do Editar parametrização --*/

    public static void clicarNoBotaoEditarParametrizacao(){
        waitElement(btnEditar);
        click(btnEditar);
    }
    public static void editoOpcaoCd(){
        clicarNoCampoCd();
        click(opcaoCdLabel);
        waitElement(edicaoOpcaoCdLabel);
        click(edicaoOpcaoCdLabel);
        selecinoTab(edicaoOpcaoCdLabel);
    }
    public static void editoOpcaoOrigem(){
        clicarNoCampoOrigem();
        click(opcaoOrigemLabel);
        waitElement(edicaoOpcaoOrigemLabel);
        click(edicaoOpcaoOrigemLabel);
        selecinoTab(edicaoOpcaoOrigemLabel);
    }
    public static void editoOpcaoFluxo(){
        clicarNoCampoFluxo();
        click(opcaoFluxoLabel);
        click(edicaoOpcaoFluxoLabel);
        selecinoTab(edicaoOpcaoFluxoLabel);
    }
    public static void editoOpcaoTurno1(){
        clicarNoCampoTurno();
        selecinoTab(opcaoTurno10CampoLabel);
    }
    public static void editoDocas(String docas){
        preencherInput(campoNumeroDocas, docas);
    }

    public static boolean verificoMensagemExclusaoSucesso(){
        waitElement(mensagemExclusaoParametroSucesso);
        return exist(mensagemExclusaoParametroSucesso);
    }

    /*--Fluxo alternativos: Mensagens de campo obrigatório--*/

    public static void acionarMensagemObrigatoriaCd(){
        clicarNoCampoCd();
        selecinoTab(campoCdLabel);
    }
    public static void acionarMensagemObrigatoriaOrigem(){
        clicarNoCampoOrigem();
        selecinoTab(campoOrigemLabel);
    }
    public static void acionarMensagemObrigatoriaFluxo(){
        clicarNoCampoFluxo();
        selecinoTab(campoFluxoLabel);
    }
    public static void acionarMensagemObrigatoriaTurno(){
        clicarNoCampoTurno();
        selecinoTab(campoTurnoLabel);
    }
    public static void acionarMensagemObrigatoriaNumeroDocas(){
        clicarNoCampoNumeroDocas();
        selecinoTab(campoNumeroDocas);
    }

    public static boolean verificarMensagemObrigatorioCd(){
        return  exist(mensagenObrigatorioCampoCd);
    }
    public static boolean verificarMensagemObrigatorioOrigem(){
        return  exist(mensagenObrigatorioCampoOrigem);
    }
    public static boolean verificarMensagemObrigatorioFluxo(){
        return  exist(mensagenObrigatorioCampoFluxo);
    }
    public static boolean verificarMensagemObrigatorioTurno(){
        return  exist(mensagenObrigatorioCampoTurno);
    }
    public static boolean verificarMensagemObrigatorioNumeroDocas(){ return  exist(mensagenObrigatorioCampoNumeroDocas);
    }

    /*-- Passos: excluir um item na lista de recebimento --*/

    public static void clicoEmExcluirParametrizacao(){
        click(btnExcluir);
        waitElement(simBtnExcluir);
        click(simBtnExcluir);
    }

    public static boolean verificaMensagemDeErroCalendarioRecebimento(){
        return exist(mensagenObrigatorioCalendarioRecebimento);
    }

    public static void clicarNoBotaoOk() {
        waitElement(botaoOkMensagem);
        click(botaoOkMensagem);
    }











}
