package testes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

import java.io.IOException;

import Elementos.ElementosWeb;

public class Steps {

	Metodos metodo = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu esteja no google")  
	public void que_eu_esteja_no_google() {

		metodo.abrirNavegador("https://www.google.com.br");
	}

	@When("pesquisar o nome da escola")
	public void pesquisar_o_nome_da_escola() {
		metodo.escrever("E2E Treinamentos", el.getPesquisar());
		metodo.submit(el.getPesquisar());
	}

	@Then("valido as informacoes")
	public void valido_as_informacoes() {
		metodo.fecharNavegador();

	}

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {

		metodo.abrirNavegador(site);
	}

	@When("pesquisar {string}")
	public void pesquisar(String texto) {

		metodo.escrever(texto, el.getPesquisar());
		metodo.submit(el.getPesquisar());;

	}

	@Then("valido o nome da escola {string}")
	public void valido_o_nome_da_escola(String textoEsperado) {

		metodo.validarTexto(textoEsperado, el.getE2Etreinamentos());
		metodo.fecharNavegador();

	}

	@Then("valido inovacao {string}")
	public void valido_inovacao(String textoEsperado) {

		metodo.validarTexto(textoEsperado, el.getInovacao());
		metodo.fecharNavegador();

	}

	@Then("valido felicidade {string}")
	public void valido_felicidade(String textoEsperado) {

		metodo.validarTexto(textoEsperado, el.getFelicidade());
		metodo.fecharNavegador();
	}
	

	@Then("visualizo as {string}")
	public void visualizo_as(String teste) throws IOException {
		
		metodo.screnShot(teste);
		metodo.fecharNavegador();

	}

}
