package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class MainPage {
    public MainPage(WebDriver driver) {
        MainPage.driver = driver;
    }

    private static WebDriver driver;



    public final MainPage openSite() {
        driver.get("http://localhost:8080");
        return this;
    }

    private By dropDownMenuSandBox = By.xpath(".//a[@id='navbarDropdown']");
    private By dropDownMenuItemsText = By.xpath(".//a[text()='Товары']");

    @Step("Нажать на меню 'Песочница'")
    public MainPage clickDropDownMenuSandBox(){
        driver.findElement(dropDownMenuSandBox).click();
        return this;
    }
    @Step("Нажать на ссылку 'Товары'")
    public MainPage clickDropDownMenuItemsText(){
        driver.findElement(dropDownMenuItemsText).click();
        return this;
    }
}

