package Login;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://es.fanslave.com/contacto/registro?view=login")
public class PageLogin extends PageObject {

  @FindBy(xpath = "//input[@id='username']")
  public static WebElement campoUsuarioLogin;

  @FindBy(xpath = "//input[@id='password']")
  public static WebElement campoPasswordLogin;

  @FindBy(xpath = "//button[normalize-space()='Identificarse']")
  public static WebElement botonLogarse;
}
