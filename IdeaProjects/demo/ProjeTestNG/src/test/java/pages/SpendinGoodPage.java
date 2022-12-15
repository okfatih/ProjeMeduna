package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SpendinGoodPage {
    public SpendinGoodPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement signIn;

    @FindBy (xpath = "//a[@class='nav-link']")
    public WebElement signUp;

    @FindBy (xpath = "//*[text()='Become a Vendor']")
    public WebElement becomeaVendor;

    @FindBy (xpath = "//div[@id='wcfm_membership_registration_form_expander']")
    public WebElement registirationForm;

    @FindBy (xpath = "//*[@id='user_email']")
    public WebElement emailKutusu;

    @FindBy (xpath = "//div[@class='email']")
    public WebElement gecicEmail;

    @FindBy(xpath = "//*[@id='renew']")
    public WebElement yenilemeTusu;
    @FindBy(xpath = "//*[@class='wcfm-text wcfm_email_verified_input']")
    public WebElement VerificationCodeBox;

    @FindBy(xpath = "//*[@class='wcfm-text wcfm_submit_button wcfm_email_verified_button']")
    public WebElement ReSendCode;

    @FindBy(xpath = "//*[@id='passoword']")
    public WebElement Password;

    @FindBy(xpath = "//*[@id='confirm_pwd']")
    public WebElement ConfirmPassword;

    @FindBy(xpath = "//*[@id='wcfm_membership_register_button']")
    public WebElement RegisterButton;
    @FindBy(xpath = "//*[@class='button button-large']")
    public WebElement NotRıghtNowButton;
    //verification code div.email
    @FindBy (xpath = "//*[@class='email']")
    public WebElement geciciEmail;

    @FindBy (css = "a#renew")
    public WebElement emailBoxRefresh;

    @FindBy(xpath = "//tbody//tr[1]")
    public WebElement geciciEmailBox;

    @FindBy(xpath = "//*[@id='body_content_inner']")
    public WebElement verificationCode;


    @FindBy (xpath = "//div[@class=' elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-4d24946b']")
    public WebElement browseCategories;

    @FindBy (xpath = "//*[@id='product_cat']")
    public WebElement allCategories;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id='product_cat']")
    public WebElement allCategories1;

  // //div[@class=' elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-4d24946b']

//===============================
}
