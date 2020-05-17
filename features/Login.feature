#language: pt
#encoding:utf-8


Funcionalidade: Fluxos básicos - Tela de Login

    Cenario: Validar mensagens de campos obrigatórios da tela de login
        Dado que não preencho um CNPJ
        Quando não preencho uma senha
        Então vejo mensagagem no campo login sinalizando campo obrigatorio obrigatório
        E vejo mensagem no campo senha sinalizando campo obrigatório

    Esquema do Cenário: Validar mensagens de formato invalido no campo de login
        Dado que preencho um login CNPJ <cnpj> invalidos
        Quando preencho uma senha <senha> invalida
        Então devo vê mensagagem de formato invalido no campo de login
        E devo vê mensagagem de senha fora do padrao aceitavel
        E limpo os campos
        Exemplos:
            |        cnpj              |  senha               |
            |  23142323400095          | 21212121212121212122 |

    Esquema do Cenário: Validar fluxo de login com sucesso informando CNPJ de ADM e uma senha valida
        Dado    que preencho o login com CNPJ <cnpj> e a senha <senha> validos
        Quando  confirmo para o botão entrar
        Então   devo acessar a tela inicia do sistema com sucesso
        E finalizo teste saindo do sistema
        Exemplos:
            |        cnpj        |  senha               |
            | 54514294000956     | 1EIJvDb@=v32X0k7TT3Q |


# --> Problema de acesso quando tenta logar com login de fornecedor

#    Esquema do Cenário: Validar fluxo de login com sucesso informando CNPJ de fornecedor e uma senha valida
#      Dado    que preencho o login com CNPJ <cnpj> e a senha <senha> validos
#      Quando  confirmo para o botão entrar
#      Então   devo acessar a tela inicia do sistema com sucesso
#      E finalizo teste saindo do sistema
#      Exemplos:
#        |        cnpj        |  senha              |
#        | 54514294000956     | Riachu#01           |