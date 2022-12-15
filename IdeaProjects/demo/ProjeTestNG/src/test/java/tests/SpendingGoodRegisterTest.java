package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPages;
import pages.SpendinGoodPage;
import pages.SpendingGood2;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static utilities.Driver.getDriver;

public class SpendingGoodRegisterTest extends TestBaseRapor {
    SpendinGoodPage spending = new SpendinGoodPage();


Actions actions = new Actions(Driver.getDriver());
    @Test(groups = "testCase01")
    public void test01() {
        extentTest = extentReports.createTest("RegisterTest", "can Register with valid credentials");
        extentTest.info("User goes to spendingGood website");
        Driver.getDriver().get(ConfigReader.getProperty("spendingUrl"));
        ReusableMethods.waitFor(1);
        extentTest.info("User clicks sign in button");
        spending.signIn.click();
        ReusableMethods.waitFor(1);
        extentTest.info("Then user clicks signUp button");
        spending.signUp.click();
        ReusableMethods.waitFor(1);
        extentTest.info("User click become a vendor button");
        spending.becomeaVendor.click();
        ReusableMethods.waitFor(1);
        extentTest.info("User verifies the visibility of registiration Form");
        Assert.assertTrue(spending.registirationForm.isDisplayed());
    }

@Test
public void test3(){
        Driver.getDriver().get(ConfigReader.getProperty("spendingUrl"));
        Select select = new Select(spending.allCategories);
        String  kategoriler[];
        select.selectByIndex(1);
        List<WebElement> drop = select.getOptions();
          drop.forEach(t-> System.out.println(t.getText()));


}


    @Test
    public void test2() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("spendingUrl"));
        ReusableMethods.waitFor(1);
        Select select = new Select(spending.allCategories);
        select.selectByIndex(1);




        spending.signIn.click();
        spending.signUp.click();


        spending.becomeaVendor.click();
        spending.emailKutusu.click();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://www.mohmal.com/tr/inbox");
        List<String>windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowList.get(1));
        ReusableMethods.waitFor(1);
        String email = spending.gecicEmail.getText();
        System.out.println(email);
        Driver.getDriver().switchTo().window(windowList.get(0));
        spending.emailKutusu.sendKeys(email);
        ReusableMethods.waitFor(1);
        Driver.getDriver().switchTo().window(windowList.get(1));
        ReusableMethods.waitFor(4);
        spending.yenilemeTusu.click();
        ReusableMethods.waitFor(1);
        Driver.getDriver().navigate().refresh();
        spending.gecicEmail.click();
        WebElement iframe = Driver.getDriver().findElement(By.cssSelector("div>#read>div>iframe")); //iframe gir
        Driver.getDriver().switchTo().frame(iframe);
        int code =  Integer.parseInt(spending.verificationCode.getText().replaceAll("\\D", ""));
        String code2 = String.valueOf(code);
        Driver.getDriver().switchTo().defaultContent(); //iframe den cikis
        Driver.getDriver().switchTo().window(windowList.get(0));
        Thread.sleep(1000);
        spending.VerificationCodeBox.sendKeys(code2);
        Thread.sleep(1000);
        spending.Password.sendKeys("Team05");
        Thread.sleep(1000);
        spending.ConfirmPassword.sendKeys("Team05");
        Thread.sleep(1000);
        spending.RegisterButton.click();
        Thread.sleep(1000);

    }

    @Test
    public void testCase01() {
        SpendingGood2 spending = new SpendingGood2();
        extentTest = extentReports.createTest("Us022 TC01", "Tumunu gor linki olmali ve tıklandiğinda o kategorinin ana sayfalarina girmel");

        extentTest.info("1.Kullanici https://spendinggood.com a gider");
        Driver.getDriver().get(ConfigReader.getProperty("spendingUrl"));

        extentTest.info("User sign in kısmına tıklar");
        spending.signIn.click();



        extentTest.info("3.User, acilan sayfada username or email address kısmına gecerli bir email girer");
        spending.userName.sendKeys(ConfigReader.getProperty("spenduserName"));
        extentTest.info("3.User, password kısmına gecerli bir sifre girer");
        spending.passWord.sendKeys(ConfigReader.getProperty("spendpassword"));

        extentTest.info("5.User, email ve password girdikten sonra asagida bulunan sign in buttonuna tıklar ve giris apar");
        spending.signInButton.click();

        extentTest.info("6.User acilan sayfada All Categories secenegini tıklar ve ortaya cikan tüm kategorileri gorur");


        Select select = new Select(spending.allCategories);
        select.selectByIndex(1);
      List<WebElement>allCategoriesdropdown = select.getOptions();
        allCategoriesdropdown.forEach(t-> System.out.print(t.getText()+" "));
        String istenenMenu = "Best Seller";
        Assert.assertTrue(spending.allCategories.getText().contains(istenenMenu));

    }

    @Test
    public void testCase03() {
        SpendingGood2 spending = new SpendingGood2();
        extentTest = extentReports.createTest("Us022 TC01", "Tumunu gor linki olmali ve tıklandiğinda o kategorinin ana sayfalarina girmel");

        extentTest.info("1.Kullanici https://spendinggood.com a gider");
        Driver.getDriver().get(ConfigReader.getProperty("spendingUrl"));

//        extentTest.info("User sign in kısmına tıklar");
//        spending.signIn.click();
//
//
//
//        extentTest.info("3.User, acilan sayfada username or email address kısmına gecerli bir email girer");
//        spending.userName.sendKeys(ConfigReader.getProperty("spenduserName"));
//        extentTest.info("3.User, password kısmına gecerli bir sifre girer");
//        spending.passWord.sendKeys(ConfigReader.getProperty("spendpassword"));
//
//        extentTest.info("5.User, email ve password girdikten sonra asagida bulunan sign in buttonuna tıklar ve giris apar");
//        spending.signInButton.click();
        spending.dailyDeals.click();

        extentTest.info("Drop down menude azdan coga fiyat artan seceneğini görür");
        Select select = new Select(spending.dailyDealsDropDown);
        select.selectByIndex(4);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[text()='Sort by price: low to high']")).isDisplayed());


    }

    @Test
    public void testCase04() {
        SpendingGood2 spending = new SpendingGood2();
        extentTest = extentReports.createTest("Us022 TC01", "Tumunu gor linki olmali ve tıklandiğinda o kategorinin ana sayfalarina girmel");

        extentTest.info("1.Kullanici https://spendinggood.com a gider");
        Driver.getDriver().get(ConfigReader.getProperty("spendingUrl"));
        spending.dailyDeals.click();
        Select select = new Select(spending.dailyDealsDropDown);

        select.selectByIndex(5);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[text()='Sort by price: low to high']")).isDisplayed());
        List<WebElement>sortByElementleri = select.getOptions();
        Assert.assertTrue(sortByElementleri!=null);
        sortByElementleri.stream().forEach(t-> System.out.println(t.getText()));
    }
}

