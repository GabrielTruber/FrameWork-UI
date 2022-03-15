package Elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// elementos web

	private By pesquisar = By.name("q");
	private By e2etreinamentos = By.xpath("//h2[@class='qrShPb kno-ecr-pt PZPZlf q8U8x']/span[1]");
	private By inovacao = By.xpath("//h2[@class='qrShPb kno-ecr-pt PZPZlf q8U8x']/span");
	private By felicidade = By.xpath("*//h2[@class='qrShPb kno-ecr-pt PZPZlf q8U8x']/span");

	// Metodos publicos dos elementos

	public By getPesquisar() {
		return pesquisar;
	}

	public By getE2Etreinamentos() {
		return e2etreinamentos;
	}

	public By getInovacao() {
		return inovacao;
	}

	public By getFelicidade() {
		return felicidade;
	}
}
