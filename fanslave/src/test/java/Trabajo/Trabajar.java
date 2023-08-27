package Trabajo;

import Espera.Espera;
import Pages.PageFacebook;
import Pages.PageInstagram;
import Pages.PageTrafic;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Acciones.Acciones;

public class Trabajar extends UIInteractionSteps {

	List<WebElement> divsFacebook = new ArrayList<WebElement>();
	List<WebElement> divsInstagram = new ArrayList<WebElement>();
	List<WebElement> divsTrafic = new ArrayList<WebElement>();
	Acciones accion = new Acciones();
	public PageTrabajo pageTrabajo;
	PageFacebook pageFacebook;
	PageInstagram pageInstagram;
	public Espera esperar;
	Random r = new Random();
	Duration tiempo = Duration.ofSeconds(20);

	public void facebook() throws AWTException {
		Espera.obligatoriamente(r.nextInt(3000 - 1000 + 1) + 1000);

		if(PageTrabajo.divFacebook.findElements(By.tagName("div")).size() == 0) {
			String cadena = PageTrabajo.divFacebook.getText();

			if(cadena.indexOf("èrrp") != -1) {
				int num = Integer.parseInt(cadena.charAt(cadena.indexOf("minute")-2) + "0500");
				Espera.obligatoriamente(num);
			}else if(cadena.indexOf("second") != -1) {
				int num = Integer.parseInt(cadena.charAt(cadena.indexOf("second")-2) + "000") +1;
				Espera.obligatoriamente(num);
			}

		}

		while (PageTrabajo.divFacebook.findElements(By.tagName("div")).size() != 0) {
			divsFacebook = PageTrabajo.divFacebook.findElements(By.tagName("div"));

			int numDiv = r.nextInt( (divsFacebook.size()-1) - 0 + 1) + 0;

			if (divsFacebook.get(numDiv).getAttribute("class").equals("aktion")) {

				esperar.queSeaClicable(tiempo, divsFacebook.get(numDiv).findElements(By.tagName("a")).get(0));
				accion.moverCursorAUnElementoHacerScrollYHacerClick(divsFacebook.get(numDiv).findElements(By.tagName("a")).get(0));

				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);

				esperar.cambiarPestañaNueva();
				//				Espera.obligatoriamente(60000);
				esperar.queSeaVisible(Duration.ofSeconds(40), PageFacebook.botonMeGusta);
				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);

				accion.hacerScrollAbajo(PageFacebook.divScroll);
				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);
				accion.hacerScrollArriba(PageFacebook.divScroll);

				esperar.queSeaClicable(tiempo, PageFacebook.botonMeGusta);
				accion.moverCursorAUnElementoHacerScrollYHacerClick(PageFacebook.botonMeGusta);

				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);
				esperar.queSeaVisible(tiempo, PageFacebook.divScroll);
				accion.moverCursorAElemento(PageFacebook.divScroll);

				esperar.cambiarPestañaNueva();
				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);
				accion.cerrarPestañaNavegadorAnterior();

				Espera.obligatoriamente(2000);

			}

		}

	}

	public void instagram() throws AWTException {
		Espera.obligatoriamente(r.nextInt(4000 - 2500 + 1) + 2500);

		if(PageTrabajo.divInstagram.findElements(By.tagName("div")).size() == 0) {
			String cadena = PageTrabajo.divInstagram.getText();

			if(cadena.indexOf("èrrp") != -1) {
				int num = Integer.parseInt(cadena.charAt(cadena.indexOf("minute")-2) + "0500");
				Espera.obligatoriamente(num);
			}else if(cadena.indexOf("second") != -1) {
				int num = Integer.parseInt(cadena.charAt(cadena.indexOf("second")-2) + "000")+1;
				Espera.obligatoriamente(num);
			}

		}
		
		Espera.obligatoriamente(r.nextInt(4000 - 2500 + 1) + 2500);

		while (PageTrabajo.divInstagram.findElements(By.tagName("div")).size() != 0) {
			divsInstagram = PageTrabajo.divInstagram.findElements(By.tagName("div"));

			int numDiv = r.nextInt( (divsInstagram.size()-1) - 0 + 1) + 0;

			if (divsInstagram.get(numDiv).getAttribute("class").equals("aktion")) {

				esperar.queSeaClicable(Duration.ofSeconds(45), divsInstagram.get(numDiv).findElements(By.tagName("a")).get(0));
				accion.moverCursorAUnElementoHacerScrollYHacerClick(divsInstagram.get(numDiv).findElements(By.tagName("a")).get(0));

				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);

				esperar.cambiarPestañaNueva();
				//				Espera.obligatoriamente(60000);
				esperar.queSeaVisible(Duration.ofSeconds(45), PageInstagram.botonSeguir);
				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);

				accion.hacerScrollAbajo(PageInstagram.divScroll);
				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);
				accion.hacerScrollArriba(PageInstagram.divScroll);

				esperar.queSeaClicable(tiempo, PageInstagram.botonSeguir);
				accion.moverCursorAUnElementoHacerScrollYHacerClick(PageInstagram.botonSeguir);

				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);
				esperar.queSeaVisible(tiempo, PageInstagram.divScroll);
				accion.moverCursorAElemento(PageInstagram.divScroll);

				esperar.cambiarPestañaNueva();
				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);
				accion.cerrarPestañaNavegadorAnterior();

				Espera.obligatoriamente(2000);

			}

		}

	}

	public void trafic() throws AWTException {
		Espera.obligatoriamente(r.nextInt(4000 - 2500 + 1) + 2500);

		if(PageTrabajo.divTraffic.findElements(By.tagName("div")).size() == 0) {
			String cadena = PageTrabajo.divTraffic.getText();

			if(cadena.indexOf("èrrp") != -1) {
				int num = Integer.parseInt(cadena.charAt(cadena.indexOf("minute")-2) + "0500");
				Espera.obligatoriamente(num);
			}else if(cadena.indexOf("second") != -1) {
				int num = Integer.parseInt(cadena.charAt(cadena.indexOf("second")-2) + "000")+1;
				Espera.obligatoriamente(num);
			}

		}
		
		Espera.obligatoriamente(r.nextInt(4000 - 2500 + 1) + 2500);

		while (PageTrabajo.divTraffic.findElements(By.tagName("div")).size() != 0) {
			divsTrafic = PageTrabajo.divTraffic.findElements(By.tagName("div"));

			int numDiv = r.nextInt( (divsTrafic.size()-1) - 0 + 1) + 0;

			if (divsTrafic.get(numDiv).getAttribute("class").equals("aktion")) {

				esperar.queSeaClicable(Duration.ofSeconds(45), divsTrafic.get(numDiv).findElements(By.tagName("a")).get(0));
				accion.moverCursorAUnElementoHacerScrollYHacerClick(divsTrafic.get(numDiv).findElements(By.tagName("a")).get(0));

				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);

				esperar.cambiarPestañaNueva();
				//				Espera.obligatoriamente(60000);
				esperar.queSeaVisible(Duration.ofSeconds(45), PageTrafic.divScroll);
				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);

				accion.hacerScrollAbajo(PageTrafic.divScroll);
				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);

				esperar.queSeaClicable(tiempo, PageTrafic.divScroll);
				accion.moverCursorAUnElementoHacerScrollYHacerClick(PageTrafic.divScroll);

				accion.hacerScrollArriba(PageTrafic.divScroll);
				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);

				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);

				esperar.cambiarPestañaNueva();
				Espera.obligatoriamente(r.nextInt(2000 - 900 + 1) + 900);
				accion.cerrarPestañaNavegadorAnterior();

				Espera.obligatoriamente(2000);


			}
		}
	}
}
