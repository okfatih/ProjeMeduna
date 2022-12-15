package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPages {
    public AmazonPages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//div[@id='nav-search-dropdown-card']")
    public WebElement allDddm;

    @FindBy (xpath = "(//*[@class='a-button-input'])[1]")
    public WebElement changebutton;

    @FindBy (xpath = "//div[@class='nav-search-scope nav-sprite']")
    public WebElement allbuton;

    @FindBy (xpath = "//*[@id='searchDropdownBox']")
    public WebElement allDropDownmenu;
    @FindBy (xpath = "//*[@id='gdpr-consent-banner-accept-button']")
    public WebElement cookiesAccept;
}
