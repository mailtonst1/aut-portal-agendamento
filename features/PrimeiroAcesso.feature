#language: pt
#encoding:utf-8


Funcionalidade: Fluxos básicos - Tela Primeiro Acesso

    Contexto:
        Dado que eu esteja acessando a tela de primeiro acesso

    Cenario: Validar mensagens de campos obrigatórios da tela de primeiro acesso
        Dado que não preencho o campo email
        E que não preencho o campo CNPJ
        E que não preencho o campo senha
        Quando não preencho o campo confirmar senha
        Então na tela de primeiro acesso vejo mensagagem no campo email sinalizando campo obrigatorio
        E na tela de primeiro acesso vejo mensagem no campo CNPJ sinalizando campo obrigatório
        E na tela de primeiro acesso vejo mensagem no campo senha sinalizando campo obrigatório
        E na tela de primeiro acesso vejo mensagem no campo confirmar senha sinalizando campo obrigatório
        E finalizo o testes retornando a tela de login

