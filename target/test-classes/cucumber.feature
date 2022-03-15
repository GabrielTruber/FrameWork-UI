#Author: e2etreinamentos@e2etreinamentos.com.br

Feature: Realizar pesquisa no google
	Eu como usuario quero realizar pesquisar no google para receber as informacoes
	
	Background: Acessar o google
	Given que eu esteja no "https://www.google.com.br"
	
	
	Scenario: Pesquisar E2E Treinamentos
	When pesquisar "E2E Treinamentos"
	Then valido o nome da escola "E2E Treinamentos"

	
  Scenario: Pesquisar Inovacao
	When pesquisar "Inovação"
	Then valido inovacao "Inovação"
	
	Scenario: Pesquisar Felicidade
	When pesquisar "Felicidade"
	Then valido felicidade "Felicidade" 
	