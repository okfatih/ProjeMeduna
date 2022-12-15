package pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MarktplaatsPage {
    public MarktplaatsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//*[@class='hz-Dropdown-input'])[1]")
    public WebElement mrktplaatsDD;

}
