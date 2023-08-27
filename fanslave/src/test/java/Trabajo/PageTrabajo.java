package Trabajo;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageTrabajo extends PageObject {

  @FindBy(id = "silentSucheAktionen")
  public static WebElement divFacebook;

  @FindBy(id = "silentSucheAktionenInsta")
  public static WebElement divInstagram;

  @FindBy(id = "silentSucheAktionenTraffic")
  public static WebElement divTraffic;
}
