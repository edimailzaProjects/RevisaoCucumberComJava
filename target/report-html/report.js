$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/bancoCucumber.feature");
formatter.feature({
  "name": "Cadastro de contas",
  "description": "\tComo um usuario \n\tGostaria de cadastrar contas\n\tPara que eu possa distribuir meu dinheiro de uma forma mais organizada",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Deve validar regras cadastro contas",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "adiciono a conta \"\u003cconta\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "name": "recebo a mensagem \"\u003cmensagem\u003e\"",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "conta",
        "mensagem"
      ]
    },
    {
      "cells": [
        "Conta de Teste",
        "Conta adicionada com sucesso!"
      ]
    },
    {
      "cells": [
        "",
        "Informe o nome da conta"
      ]
    },
    {
      "cells": [
        "Conta mesmo nome",
        "Já existe uma conta com esse nome!"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que desejo adicionar uma conta",
  "keyword": "Dado "
});
formatter.match({
  "location": "BancoSteps.queDesejoAdicionarUmaConta()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deve validar regras cadastro contas",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "name": "adiciono a conta \"Conta de Teste\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "BancoSteps.adicionoAConta(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "recebo a mensagem \"Conta adicionada com sucesso!\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "BancoSteps.receboAMensagem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que desejo adicionar uma conta",
  "keyword": "Dado "
});
formatter.match({
  "location": "BancoSteps.queDesejoAdicionarUmaConta()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deve validar regras cadastro contas",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "name": "adiciono a conta \"\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "BancoSteps.adicionoAConta(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "recebo a mensagem \"Informe o nome da conta\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "BancoSteps.receboAMensagem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que desejo adicionar uma conta",
  "keyword": "Dado "
});
formatter.match({
  "location": "BancoSteps.queDesejoAdicionarUmaConta()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deve validar regras cadastro contas",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "name": "adiciono a conta \"Conta mesmo nome\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "BancoSteps.adicionoAConta(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "recebo a mensagem \"Já existe uma conta com esse nome!\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "BancoSteps.receboAMensagem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});