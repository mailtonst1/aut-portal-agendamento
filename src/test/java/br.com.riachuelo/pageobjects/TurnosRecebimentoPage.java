package br.com.riachuelo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TurnosRecebimentoPage extends BasePage {

    /*Elementos da seção da pagina*/
    private static final By secaoNovoLink = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-turno-recebimento > nav > div.mat-tab-link-container > div > div > a:nth-child(1)");
    private static final By secaoListaTurnoLink = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-turno-recebimento > nav > div.mat-tab-link-container > div > div > a.mat-tab-link.ng-star-inserted.mat-tab-label-active");

    /*Elementos da seção - Novo*/
    private static final By campoCdLabel = By.cssSelector("mat-select[placeholder='Selecione o CD']");
    private static final By opcaoCdLabel = By.cssSelector("#mat-option-12 > span");
    private static final By campoTurnoLabel = By.cssSelector("mat-select[placeholder='Selecione um Turno']");
    private static final By opcaoTurno = By.cssSelector("mat-option[ng-reflect-value='4']");
    private static final By campoData = By.cssSelector("input[placeholder='Selecione a data']");
    private static final By diaAtual = By.cssSelector(".mat-calendar-body-today");
    private static final By botaoSalvarButton = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-turno-recebimento > div.tab-content-container > app-turno-recebimento-edicao > mat-card > form > div:nth-child(2) > button");
    private static final By campoHorarioInicio = By.cssSelector("input[placeholder='Horário Início']");
    private static final By campoHorarioFim = By.cssSelector("input[placeholder='Horário Término ']");


    /*Elementos da seção - Lista de turnos*/
    private static final By campoPesquisa = By.cssSelector("body > app-root > app-navbar > mat-sidenav-container > mat-sidenav-content > div > app-turno-recebimento > div.tab-content-container > app-turno-recebimento-lista > mat-form-field > div > div.mat-form-field-flex > div input");
    private static final By mensagemTurnoCadastradoSucessoSpan = By.cssSelector("snack-bar-container > simple-snack-bar > span");
    private static final By mensagemDeErroCampoCd = By.cssSelector("mat-form-field:first-child mat-error");
    private static final By mensagemDeErroCampoTurno = By.cssSelector("mat-form-field:nth-child(2) mat-error");
    private static final By mensagemDeErroCampoData = By.cssSelector("mat-form-field:nth-child(3) mat-error");
    private static final By mensagemDeErroCampoHorarioInicial = By.cssSelector("mat-form-field:nth-child(4) mat-error");
    private static final By mensagemDeErroCampoHorarioTermino = By.cssSelector("mat-form-field:nth-child(5) mat-error");
    private static final By mensagemDeTurnoAtualizadoComSucesso = By.xpath("//*[contains(text(),'Turno atualizado com sucesso!')]//ancestor::simple-snack-bar");
    private static final By mensagemDeTurnoExcuidoComSucesso = By.cssSelector("snack-bar-container > simple-snack-bar > span");

    /*Elementos da seção - Editar turnos*/
    private static final By botaoEditarTurnos = By.xpath("//mat-row[1]//mat-cell//button[1]");
    private static final By botaoExcluirTurnos = By.cssSelector("button[mattooltip='Excluir']");
    private static final By btnExcluir = By.xpath("//mat-row[1]//mat-cell//button[@mattooltip='Excluir']");
    private static final By simBtnExcluir = By.cssSelector("app-confirm-dialog > div > button[ng-reflect-dialog-result='true']");
    private static final By botaoOkMensagem = By.xpath("//*[contains(text(),'OK')]//ancestor::simple-snack-bar//button");


    public static String vejoMensagemDeErroCampoCd(){
        return getText(mensagemDeErroCampoCd);
    }
    public static String vejoMensagemDeErroCampoTurno(){
        return getText(mensagemDeErroCampoTurno);
    }
    public static String vejoMensagemDeErroCampoData(){
        return getText(mensagemDeErroCampoData);
    }
    public static String vejoMensagemDeErroCampoHorarioInicial(){
        return getText(mensagemDeErroCampoHorarioInicial);
    }
    public static String vejoMensagemDeErroCampoHorarioFinal(){
        return getText(mensagemDeErroCampoHorarioTermino);
    }

    public static String vejomensagemDeTurnoExcuidoComSucesso() {
        return getText(mensagemDeTurnoExcuidoComSucesso);
    }

    public static void clicarNoBotaoOk() {
        click(botaoOkMensagem);
    }
    public static void clicarNoCampoCd() { click(campoCdLabel); }
    public static void clicarNoCampoData() { click(campoData); }
    public static void selecionarBotaoSalvar() { click(botaoSalvarButton); }
    public static void clicarNoCampoHoraInicio() { click(campoHorarioInicio); }
    public static void clicarNoCampoHoraFinal(){
        click(campoHorarioFim);
    }
    public static void selecionoSecaoNovo(){
        waitElement(secaoNovoLink);
        click(secaoNovoLink);
    }

    public static void clicarNoCampoPesquisar() {
        click(campoPesquisa);
    }

    public static void clicarNaSecaoListaDeTurno() {
        waitElement(secaoListaTurnoLink);
        click(secaoListaTurnoLink);
    }

    public static void selecionoOpcaoCd(){
        click(opcaoCdLabel);
    }

    public static void clicarNoCampoTurno() {
        click(campoTurnoLabel);
    }

    public static void selecionoOpcaoTurno(){
        click(opcaoTurno);
    }
    public static void selecinoTabNoCampoTurno(){
        selecinoTab(campoTurnoLabel);
        selecinoTab(campoTurnoLabel);
    }
    public static void preencherInputHoraIncial(String horarioInicio){
        waitElement(campoHorarioInicio);
        preencherInput(campoHorarioInicio, horarioInicio);
    }
    public static void preencherInputHoraFinal(String horarioTermino){
        preencherInput(campoHorarioFim, horarioTermino);
        selecinoTab(campoHorarioFim);
    }
    public static void clicoNoCampodData(){
        click(campoData);
        element(campoData).sendKeys(Keys.ENTER);
    }

    public static void selecionoDataAtual(){
        click(diaAtual);
        click(diaAtual);
    }

    public static String mensagemTurnoCadastradoSucessoSpan(){
        waitElement(mensagemTurnoCadastradoSucessoSpan);
        return getText(mensagemTurnoCadastradoSucessoSpan);
    }
    public static String mensagemTurnoExcluidoComSucessoSpan(){
        waitElement(mensagemDeTurnoExcuidoComSucesso);
        return getText(mensagemDeTurnoExcuidoComSucesso);
    }

    public static void dispararMensagemDeErroCampoCd(){
        clickElementNotInteractable(campoCdLabel);
        selecinoTab(campoCdLabel);
    }
    public static void dispararMensagemDeErroCampoTurno(){
        waitElement(campoTurnoLabel);
        selecinoTab(campoTurnoLabel);
    }
    public static void dispararMensagemDeErroCalendarioData(){
        waitElement(campoData);
        selecinoTab(campoData);
    }
    public static void dispararMensagemDeErroCampoHoraInicial(){
        clicarNoCampoHoraInicio();
        waitElement(campoHorarioInicio);
        selecinoTab(campoHorarioInicio);
    }
    public static void dispararMensagemDeErroCampoHoraFinal(){
        waitElement(campoHorarioFim);
        selecinoTab(campoHorarioFim);
        selecinoTab(campoHorarioFim);
    }
    public static void pesquisoPorItem(String pesquisoPorItem){
        clicarNoCampoPesquisar();
        preencherInput(campoPesquisa, pesquisoPorItem);
    }
    public static void pesquisoPorItemInseridoAutomatico(){
        clicarNoCampoPesquisar();
        preencherInput(campoPesquisa, "22:00");
    }
    public static void clicarEditarTurnos() {
        click(botaoEditarTurnos);
    }
    public static void editarHoraInicialTurno(String editarItem) {
        preencherInput(campoHorarioInicio, editarItem);
    }
    public static void editarHoraTerminoTurno(String editarItem) {
        preencherInput(campoHorarioFim, editarItem);
    }
    public static boolean verificarMensagemDeTurnoAtualizadoComSucesso(){
        return exist(mensagemDeTurnoAtualizadoComSucesso);

    }
    public static void inserirAutomaticoHoraInicial(){
        preencherInput(campoHorarioInicio, "2200");
    }
    public static void inserirAutomaticoHoraTermino(){
        preencherInput(campoHorarioFim, "0100");
    }

    public static void clicoEmExcluirTurno(){
        click(btnExcluir);
        waitElement(simBtnExcluir);
        click(simBtnExcluir);
    }

}
