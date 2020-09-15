#language:pt

@unitarios
Funcionalidade: Locadora
  Como um usuario
	Eu quero cadastrar alugueis de filmes
	Para controlar precos e datas de entrega

  Cenario: Deve alugar um filme com sucesso
    Dado um filme
      | estoque |     2 |
      | preco   |     3 |
      | tipo    | comum |
    Quando alugar
    Entao o preco do aluguel sera R$3
    E a data de entrega sera em 1 dias
    E o estoque do filme sera 1 unidade

  Cenario: Nao deve alugar filme sem estoque
    Dado um filme com estoque de 0 unidades
    Quando alugar
    Entao nao sera possivel por falta de estoque
    E o estoque do filme sera 0 unidade

  
  Esquema do Cenario: Deve dar condicoes especiais conforme o tipo de aluguel
    Dado um filme com estoque de 2 unidades
    E quero que o preco seja R$<preco>
    E que o tipo do aluguel seja <tipo>
    Quando alugar
    Entao o preco do aluguel sera R$<valor>
    E a data de entrega sera em <qtDias> dias
    E a pontuacao recebida sera <pontuacao> pontos

    Exemplos: 
      | preco | tipo        | valor | qtDias | pontuacao |
      |     4 | "estendido" |     8 |      3 |         2 |
      |     4 | "comum"     |     4 |      1 |         1 |
      |    10 | "estendido" |    20 |      3 |         2 |
      |     5 | "semanal"   |    15 |      7 |         3 |
