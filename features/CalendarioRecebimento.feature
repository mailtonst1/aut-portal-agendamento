#language:pt
#encoding:utf-8


@calendario
Funcionalidade: Fluxos de testes - Tela: Calendário de Recebimento

    #-- Fluxo Principal --#
    # --Criando uma parametrização de recebimento--#
    Esquema do Cenário: Validar a parametrização no calendário de recebimento
      Dado que exista um turno cadastrado no sistema
      E que eu esteja na página de Calendário de Recebimento
      E    seleciono a seção parametrizar
      E    seleciono o cd da seção parametrização
      E    seleciono a origem da seção parametrização
      E    seleciono o fluxo de recebimento da seção parametrização
      E    seleciono um dia útil da semana da seção parametrização
      E    seleciono o turno da seção parametrização
      E    preencho com a quantidade de docas da seção parametrização <docas>
      Quando seleciono o botão parametrização
      Então devo vê uma mensagem de calendario cadastrado com sucesso na tela
      E     seleciono ok na mensagem de confirmação
      Exemplos:
        | docas |
        | 200   |

    Cenário: Finalizando os testes de calendario é excluindo vestigios de testes
      Dado que eu acesse o Calendario de recebimento
      E que eu exclua a parametrização de agendamento criada
      E que eu acesse o turno de recebimento
      E que pesquiso pelo turno criado pela automação
      Quando seleciono pra excluir o turno
      Então é exibido mensagem de turno excluido com sucesso



