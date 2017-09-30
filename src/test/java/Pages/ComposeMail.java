package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Valentin on 14.09.2017.
 */
public class ComposeMail extends BasePage {

	@FindBy(xpath="//*[@id='to']")
	private WebElement toEmail;

	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjEmail;

	@FindBy(xpath="//textarea[@id='text']")
	private WebElement textEmail;

	@FindBy(xpath="(//input[@class='bold'])[1]")
	private WebElement btnSend;

	public void sendEmai(String recipient, String subject, String textMessage) {
		toEmail.sendKeys(recipient);
		subjEmail.sendKeys(subject);
		textEmail.sendKeys(textMessage);
		btnSend.click();
	}


}
