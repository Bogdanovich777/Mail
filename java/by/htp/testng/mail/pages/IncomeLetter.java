package by.htp.testng.mail.pages;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IncomeLetter extends AbstractPage{
	
	private final String BASE_URL = "https://e.mail.ru/messages/inbox/?back=1";
	
	@FindBy(css = "a.b-toolbar__btn > span:nth-child(2)")
	private WebElement buttonWriteLetter;
	
	public void writeLetterClick(){
		buttonWriteLetter.click();
	}
	
	public IncomeLetter(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
	}
}