package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PageTrafic extends PageObject{
	
	@FindAll({
			@FindBy(css = "body")
	})
	public static WebElement divScroll;
}
