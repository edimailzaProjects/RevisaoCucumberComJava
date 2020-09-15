#language: pt

@funcionais
Funcionalidade: Cadastro de contas

	Como um usuario 
	Gostaria de cadastrar contas
	Para que eu possa distribuir meu dinheiro de uma forma mais organizada
	
Contexto:
	Dado que desejo adicionar uma conta
	
Esquema do Cenario: Deve validar regras cadastro contas
	Quando adiciono a conta "<conta>"
	Entao recebo a mensagem "<mensagem>"
	Exemplos:
   | conta 						| mensagem 														| 
   | Conta de Teste 	| Conta adicionada com sucesso!  			|
   |    							| Informe o nome da conta 						|
   | Conta mesmo nome | Já existe uma conta com esse nome! 	|
 