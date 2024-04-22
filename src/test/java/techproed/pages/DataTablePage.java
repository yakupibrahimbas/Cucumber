package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class DataTablePage {


    public DataTablePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath= "//span[.='New']")
    public WebElement newButton;

    @FindBy(id= "DTE_Field_first_name")
    public WebElement firstName;

    @FindBy(xpath= "//button[.='Create']")
    public WebElement createButton;

    @FindBy(xpath= "//input[@type='search']")
    public WebElement searchName;


    @FindBy(xpath= "//table//tr[1]//td[2]")
    public WebElement firstCell;


}