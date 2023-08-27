package Steps;

import java.awt.AWTException;

import Login.Logarse;
import Trabajo.Trabajar;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TrabajarSteps {
	@Steps
	Logarse login;
	@Steps
	Trabajar trabajarEn;

    
    @Given("el usuario esta logeado con {string} y {string}")
    public void el_usuario_esta_logeado_con_y(String usuario, String password) throws AWTException {
        login.iniciar();
        login.logarse(usuario, password);
    }

    @When("el usuario accede a la pagina de trabajo y comienza a trabajar")
    public void el_usuario_accede_a_la_pagina_de_trabajo_y_comienza_a_trabajar() throws AWTException {
    	trabajarEn.facebook();
    	trabajarEn.instagram();
    	trabajarEn.trafic();
        
    }

    @Then("el usuario termina el trabajo por hoy")
    public void el_usuario_termina_el_trabajo_por_hoy() {
        System.out.println("Ya termino el trabajo por hoy \nGran dia!!!!!");
    }
    
}
