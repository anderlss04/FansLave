package Acciones;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Acciones extends UIInteractionSteps {

  public void moverCursorAUnElementoHacerScrollYHacerClick(WebElement element)
    throws AWTException {
    // Obtener la ubicación del elemento
    Point elementLocation = element.getLocation();

    // Crear una instancia de la clase Robot
    Robot robot = new Robot();

    robot.setAutoDelay(105); // Ajustar la velocidad a la que se mueve el cursor

    //si el elemento esta por debajo de la ventana del navegador, hacer scroll hacia abajo
    if (elementLocation.getY() > 650) {
      robot.mouseWheel(1);
    }

    //si el elemento esta por encima de la ventana del navegador, hacer scroll hacia arriba
    if (elementLocation.getY() < 0) {
      robot.mouseWheel(-1);
    }

    robot.delay(500);

    // obtener la nueva ubicación del elemento
    elementLocation = element.getLocation();

    // Mover el cursor del ratón a la ubicación del elemento
    robot.mouseMove(elementLocation.getX() + 20, elementLocation.getY() + 150);
    robot.delay(500); // Pausa antes de hacer clic
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Presionar el botón izquierdo del ratón
    robot.delay(70); // Pausa antes de soltar el botón izquierdo del ratón
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Soltar el botón izquierdo del ratón
  }

  public void moverCursorAElemento(WebElement element) throws AWTException {
    // Obtener la ubicación del elemento
    Point elementLocation = element.getLocation();

    // Crear una instancia de la clase Robot
    Robot robot = new Robot();

    robot.setAutoDelay(75); // Ajustar la velocidad a la que se mueve el cursor

    // Mover el cursor del ratón a la ubicación del elemento
    robot.mouseMove(elementLocation.getX() + 20, elementLocation.getY() + 150);
  }

  public void cerrarPestañaNavegadorAnterior() throws AWTException {
    // Crear una instancia de la clase Robot
    Robot robot = new Robot();

    // Presionar la tecla CTRL + TAB para cambiar de pestaña
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_TAB);

    robot.delay(19);

    // Soltar ambas teclas
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_TAB);

    robot.delay(19);

    // Presionar la tecla CTRL + W para cerrar la pestaña actual
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_W);

    robot.delay(19);

    // Soltar ambas teclas
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_W);
  }

  public void cambiarDePestañaNavegador() throws AWTException {
    // Crear una instancia de la clase Robot
    Robot robot = new Robot();

    // Presionar la tecla CTRL + número de pestaña para cambiar de pestaña
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_0 + 1);

    robot.delay(9);

    // Soltar ambas teclas
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_0 + 1);
  }

  public void hacerScrollAElemento(WebElement element) throws AWTException {
    // Obtener la ubicación del elemento
    Point elementLocation = element.getLocation();

    // Obtener la ubicación actual de la ventana del navegador
    Dimension windowSize = getDriver().manage().window().getSize();
    int windowHeight = (int) windowSize.getHeight();
    int windowPositionY = getDriver().manage().window().getPosition().getY();

    // Calcular la posición del elemento relativa a la ventana del navegador
    int elementPositionY = elementLocation.getY() + 150;

    // Crear una instancia de la clase Robot
    Robot robot = new Robot();

    // Mover el cursor del ratón a la ubicación del elemento
    robot.mouseMove(elementLocation.getX(), elementLocation.getY());

    // Hacer scroll hacia arriba o hacia abajo según la posición del elemento
    robot.setAutoDelay(80); // Ajustar la velocidad a la que se mueve el cursor
    if (elementPositionY < 0) {
      // El elemento está por encima de la ventana del navegador, hacer scroll hacia arriba
      robot.mouseWheel(-1);
    } else if (elementPositionY > windowHeight) {
      // El elemento está por debajo de la ventana del navegador, hacer scroll hacia abajo
      robot.mouseWheel(1);
    }
  }

  public void hacerScrollAbajo(WebElement element) throws AWTException {
    // Obtener la ubicación del elemento
    Point elementLocation = element.getLocation();

    // Crear una instancia de la clase Robot
    Robot robot = new Robot();

    robot.setAutoDelay(75); // Ajustar la velocidad a la que se mueve el cursor

    // Mover el cursor del ratón a la ubicación del elemento
    robot.mouseMove(elementLocation.getX() + 20, elementLocation.getY() + 150);

    // Simular el scroll hacia abajo
    robot.setAutoDelay(80); // Ajustar la velocidad a la que se mueve el cursor
    robot.mouseWheel(1); // Hacer scroll hacia abajo
  }

  public void hacerScrollArriba(WebElement element) throws AWTException {
    // Obtener la ubicación del elemento
    Point elementLocation = element.getLocation();

    // Crear una instancia de la clase Robot
    Robot robot = new Robot();

    robot.setAutoDelay(75); // Ajustar la velocidad a la que se mueve el cursor

    // Mover el cursor del ratón a la ubicación del elemento
    robot.mouseMove(elementLocation.getX() + 20, elementLocation.getY() + 150);

    // Simular el scroll hacia arriba
    robot.setAutoDelay(80); // Ajustar la velocidad a la que se mueve el cursor
    robot.mouseWheel(-1); // Hacer scroll hacia arriba
  }

  public void escribirTextoEnInput(WebElement element, String text)
    throws AWTException {
    // Obtener la ubicación del elemento
    Point elementLocation = element.getLocation();

    // Crear una instancia de la clase Robot
    Robot robot = new Robot();

    robot.setAutoDelay(75); // Ajustar la velocidad a la que se mueve el cursor

    // Mover el cursor del ratón a la ubicación del elemento
    robot.mouseMove(elementLocation.getX() + 20, elementLocation.getY() + 150);

    // Hacer clic en el elemento
    robot.setAutoDelay(75); // Ajustar la velocidad a la que se mueve el cursor
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Presionar el botón izquierdo del ratón
    robot.delay(70); // Pausa antes de soltar el botón izquierdo del ratón
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Soltar el botón izquierdo del ratón

    // Escribir el texto en el elemento considerando si es mayuscula o no
    robot.setAutoDelay(75); // Ajustar la velocidad a la que se escribe el texto
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (Character.isUpperCase(c)) {
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(Character.toUpperCase(c));
        robot.keyRelease(Character.toUpperCase(c));
        robot.keyRelease(KeyEvent.VK_SHIFT);
      } else {
        robot.keyPress(Character.toUpperCase(c));
        robot.keyRelease(Character.toUpperCase(c));
      }
    }
  }

  // cerrar ventana de chrome con robot
  public void cerrarVentanaChrome() throws AWTException {
    // Crear una instancia de la clase Robot
    Robot robot = new Robot();

    // Presionar la tecla ALT + F4 para cerrar la ventana actual
    robot.keyPress(KeyEvent.VK_ALT);
    robot.keyPress(KeyEvent.VK_F4);

    robot.delay(19);

    // Soltar ambas teclas
    robot.keyRelease(KeyEvent.VK_ALT);
    robot.keyRelease(KeyEvent.VK_F4);
  }
}
