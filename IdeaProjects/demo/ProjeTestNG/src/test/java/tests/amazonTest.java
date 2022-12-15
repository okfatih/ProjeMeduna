package tests;

import org.bouncycastle.est.LimitedSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AmazonPages;
import pages.MarktplaatsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.List;

public class amazonTest extends TestBaseRapor {

    AmazonPages amazonPages = new AmazonPages();
    MarktplaatsPage marktplts = new MarktplaatsPage();


    @Test
    public void test2(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        amazonPages.changebutton.click();
       // amazonPages.allbuton.click();

    ;
        Select select = new Select(amazonPages.allDropDownmenu);
        select.selectByIndex(3);
        List<WebElement> drop = select.getOptions();
        drop.stream().forEach(t-> System.out.println(t.getText()));

    }
    @Test
    public void test3() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
      //  select = new Select(amazonPages.allDropDownmenu);



    }

}
