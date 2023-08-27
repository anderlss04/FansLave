package Login;

import Acciones.Acciones;
import Espera.Espera;
import java.awt.AWTException;
import java.time.Duration;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class Logarse extends UIInteractionSteps{
	PageLogin pageLogin;
	Espera esperar;
	Acciones accion;
	
	public void iniciar() {
		pageLogin.open();
	}
	
	public void logarse(String usuario, String contraseña) throws AWTException {
		
		esperar.queSeaClicable(Duration.ofSeconds(10), PageLogin.campoUsuarioLogin);
		accion.escribirTextoEnInput(PageLogin.campoUsuarioLogin, usuario);
		
		esperar.queSeaClicable(Duration.ofSeconds(10), PageLogin.campoPasswordLogin);
		accion.escribirTextoEnInput(PageLogin.campoPasswordLogin, contraseña);
		
		esperar.queSeaClicable(Duration.ofSeconds(10), PageLogin.botonLogarse);
		accion.moverCursorAUnElementoHacerScrollYHacerClick(PageLogin.botonLogarse);
		
	}

}
