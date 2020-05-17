#language: pt
#encoding: utf-8

@turnos
Funcionalidade: Fluxos básicos - Tela: Turnos de Recebimentos

    Contexto: E necessário está acessando o sistema com usuário de administrador
    e estar na tela de turnos de recebimento
        Dado que eu esteja na página de Turnos Recebimento

            ## Fluxo - Validar mensagem
            Cenário: Validar as mensagens de campo obrigatorio
                E   seleciono a seção novo
                Quando  não preencho o campo cd da seção de novo
                E       não preencho o campo turno da seção de novo
                E       não preencho o calendario data da seção de novo
                E       não preencho o campo horario inicial da seção de novo
                E       não preencho o campo horario de termino da seção de novo
                Então   é exibida mensagem de campo obrigatorio no cd
                E       é exibida mensagem de campo obrigatorio no turno
                E       é exibida mensagem de data obrigatoria no calendário
                E       é exibida mensagem de campo obrigatorio no horario inicial
                E       é exibida mensagem de campo obrigatorio no horario de termino

            @FluxoPrincipal
            Esquema do Cenário: Validar a criação de um turno de recebimento com sucesso
                E   seleciono a seção novo
                E   seleciono a opção CD270 da seção novo
                E   seleciono a opção turno da seção novo
                E   seleciono a data atual da seção novo
                E   preencho com o horario inicial da seção novo<horarioInicio>
                E   preencho com o horario de termino da seção novo<horarioTermino>
                Quando  seleciono o botao salvar turnos
                Então é exibido uma mensagem de turno cadastrado com sucesso
                E finalizo o testes de turnos de recebimento excluindo o turno criado

                Exemplos:
                    |   horarioInicio |    horarioTermino    |
                    |   2200          |    0400              |

        ##-- Editando um item na lista de turnos--##
        #    Esquema do Cenário: Editando uma item da lista de recebimento
        #        E   seleciono a secao lista de turnos
        #        E   pesquiso por hora inicial na lista de turnos<horarioInicio>
        #        E   seleciono o botão editar turnos
        #        E   edito o horario inicial na lista de turno<editoHorarioInicio>
        #        E   edito o horario de termino na lista de turnos<editoHorarioTermino>
        #        Quando seleciono o botao salvar turnos
        #       Então  é exibido uma mensagem de sucesso na lista de turnos
        #        Exemplos:
        #            | horarioInicio  | editoHorarioInicio   |   editoHorarioTermino |
        #            | 22:00           |  2100                |   0600               |

