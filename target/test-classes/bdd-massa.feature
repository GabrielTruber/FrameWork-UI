#Author: e2etreinamentos@e2etreinamentos.com.br

Feature: Pesquisar google
		Eu como usuario quero realizar pesquisar no google para receber as informacoes
	
	
		Scenario Outline: Pesquisar no google
		Given que eu esteja no "https://google.com.br"
		When pesquisar <pesquisa>
		Then visualizo as <informacoes>


		Examples: 
      | pesquisa             |informacoes       			| 
      | "Banco itau"          |"Banco itau"           |    
      | "Banco bradesco"			|"Banco bradesco"			  |
			|	"Banco original" 			|"Banco original" 			|	