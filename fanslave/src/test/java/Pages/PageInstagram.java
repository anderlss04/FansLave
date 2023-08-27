package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PageInstagram extends PageObject{
	
	@FindAll({
			@FindBy(css = "button[class='_acan _acap _acas _aj1-']"),
			@FindBy(xpath = "//*[@id=\"mount_0_0_dc\"]/div/div/div[1]/div/div/div/div[1]/div[1]/div[2]/section/main/div/header/section/div[1]/div[2]/div/div[1]/button"),
			@FindBy(css = "#mount_0_0_dc > div > div > div.x9f619.x1n2onr6.x1ja2u2z > div > div > div > div.x78zum5.xdt5ytf.x10cihs4.x1t2pt76.x1n2onr6.x1ja2u2z > div.x9f619.xnz67gz.x78zum5.x168nmei.x13lgxp2.x5pf9jr.xo71vjh.x1uhb9sk.x1plvlek.xryxfnj.x1c4vz4f.x2lah0s.x1q0g3np.xqjyukv.x1qjc9v5.x1oa3qoh.x1qughib > div.xh8yej3.x1gryazu.x10o80wk.x14k21rp.x1porb0y.x17snn68.x6osk4m > section > main > div > header > section > div.x6s0dn4.x78zum5.x1q0g3np.xs83m0k.xeuugli.x1n2onr6 > div.x9f619.xjbqb8w.x78zum5.x168nmei.x13lgxp2.x5pf9jr.xo71vjh.xmn8rco.x1n2onr6.x1plvlek.xryxfnj.x1c4vz4f.x2lah0s.x1q0g3np.xqjyukv.x1qjc9v5.x1oa3qoh.x1nhvcw1 > div > div.x9f619.xjbqb8w.x78zum5.x168nmei.x13lgxp2.x5pf9jr.xo71vjh.x1i64zmx.x1n2onr6.x1plvlek.xryxfnj.x1iyjqo2.x2lwn1j.xeuugli.xdt5ytf.xqjyukv.x1qjc9v5.x1oa3qoh.x1nhvcw1 > button"),
			@FindBy(xpath = "//button[@class='_acan _acap _acas _aj1-']"),
			@FindBy(xpath = "(//div[contains(@class,'x9f619 xjbqb8w')]//button)[1]"),
			@FindBy(xpath = "(//button[contains(@class,'_acan _acap')])[1]")
	})
	public static WebElement botonSeguir;
	
	@FindAll({
		@FindBy(xpath = "//main[@role='main']"),
		@FindBy(tagName = "main"),
		@FindBy(xpath = "//main[contains(@class,'x78zum5 xdt5ytf')]")
	})
	public static WebElement divScroll;

}
