package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valentin on 16.09.2017.
 */
public class SendStatus extends BasePage{

	@FindBy(xpath="//li[@class='new']/a")
	private WebElement inboxSendStatus;

    public void toMailPage() {
        inboxSendStatus.click();
    }
}
