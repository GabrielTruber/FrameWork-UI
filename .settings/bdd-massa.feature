#Author: e2etreinamentos@e2etreinamentos.com.br

Feature: Pesquisa google
		Eu como usuario quero realizar pesquisar no google para receber as informacoes
	
	
		Scenario Outline: Pesquisar no google
		Given que eu esteja no "https://google.com.br"
		When pesquisar <pesquisar>
		Then visualizo as informacoes


		Examples: 
      | pesquisa                |
      | "Banco Itau"			|
      | "Inovacao" 							|
			|	"Felicidade"						|