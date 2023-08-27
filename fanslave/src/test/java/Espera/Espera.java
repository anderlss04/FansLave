package Espera;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Espera extends UIInteractionSteps {

  /*
	public void totalIframe() {
		System.out.println("MARCOS TOTAL DE IFRAME " + this.getDriver().findElements(By.tagName("iframe")).size());
	}
	 */
  public void pararCarga() {
    JavascriptExecutor executor = (JavascriptExecutor) getDriver();
    executor.executeScript("window.stop();");
  }

  //de por vida del driver
  public void implicitamente(int tiempo) {
    this.getDriver()
      .manage()
      .timeouts()
      .implicitlyWait(Duration.ofSeconds(tiempo));
  }

  public static void obligatoriamente(long tiempo) {
    try {
      Thread.sleep(tiempo);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  // presente, visible y habilitado
  public void queSeaClicable(Duration tiempo, WebElement element) {
    WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
    wait.until(ExpectedConditions.elementToBeClickable(element));
  }

  // presente, visible y habilitado
  public void queSeaClicable(
    Duration tiempo,
    WebElement element,
    Duration tiempo2
  ) {
    FluentWait<WebDriver> wait = new WebDriverWait(getDriver(), tiempo)
      .pollingEvery(tiempo2)
      .ignoring(NoSuchElementException.class);

    wait.until(ExpectedConditions.elementToBeClickable(element));
  }

  public void queSeaClicable(Duration tiempo, By xpath) {
    WebElement element = getDriver().findElement(xpath);
    WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
    wait.until(ExpectedConditions.elementToBeClickable(element));
  }

  // presente, visible, hablilitado y NO estar oculto por otro elemento
  public void queSeaVisible(Duration tiempo, WebElement element) {
    WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
    wait.until(ExpectedConditions.visibilityOf(element));
  }

  public void queSeaVisible(Duration tiempo, List<WebElement> elementos) {
    WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
    wait.until(ExpectedConditions.visibilityOfAllElements(elementos));
  }

  public void queSeaSeleccionado(Duration tiempo, WebElement element) {
    WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
    wait.until(ExpectedConditions.elementToBeSelected(element));
  }

  public void queSeaVisibleAlerta(Duration tiempo) {
    WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
    wait.until(ExpectedConditions.alertIsPresent());
  }

  /*
	public void dobleClick(WebElement webElement) {
		Actions action;
		try {
			action = new Actions(getDriver());
			action.doubleClick(webElement).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	 */
  public void hastaQueLaPaginaCargue(long tiempo) {
    getDriver().manage().timeouts().pageLoadTimeout(tiempo, TimeUnit.SECONDS);
  }

  public void abrirNuevaPestaniaNavegador() {
    //this.implicitamente(10);
    //#abrimos la nueva pestaña  AVERIGUAR COMO SE USA
    //getDriver().execute_script("window.open('https://www.qalovers.com', 'new tab')");
  }

  public void queElElementoNoSeaObsoleto(WebElement element, String texto) {}

  public void cambiarPestañaNueva() {
    String currentWindowHandle = getDriver().getWindowHandle(); // obtener el identificador de la ventana actual
    Set<String> windowHandles = getDriver().getWindowHandles(); // obtener todos los identificadores de ventana
    for (String windowHandle : windowHandles) {
      if (!windowHandle.equals(currentWindowHandle)) {
    	  getDriver().switchTo().window(windowHandle); // cambiar a la segunda ventana de la lista
        break;
      }
    }
  }
  
}
