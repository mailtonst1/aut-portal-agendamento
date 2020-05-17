package br.com.riachuelo.steps.turnosRecebimento;

import br.com.riachuelo.steps.BaseSteps;
import cucumber.api.java8.Pt;

import java.util.concurrent.TimeUnit;

import static br.com.riachuelo.utils.Browser.driver;

public class ContextoSteps extends BaseSteps implements Pt{

    public ContextoSteps(){

        Dado("que eu esteja acessando o sistema com usuário de administrador", () -> {
            driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
            driver.get("http://rch-sl04:4200/agendamento/#/login?token=GRP-US-S-PAG-ADMCD");
            
            /*
            LoginPage.preencherInputUsuario( "54514294000956");
            LoginPage.preencherInputSenha("1EIJvDb@=v32X0k7TT3Q");
            LoginPage.clicarBtLogin();
            */


        });




    }
}
