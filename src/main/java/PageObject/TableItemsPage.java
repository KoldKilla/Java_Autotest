package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TableItemsPage {
    WebDriver driver;

    private final By tableHeader = By.xpath(".//h5[text()='Список товаров']");

    private By tableNameText = By.xpath(".//th[text()='Наименование']");
    private By tableTypeText = By.xpath(".//th[text()='Тип']");
    private By tableExoticTest = By.xpath(".//th[text()='Экзотический']");
    private By addButton = By.xpath(".//button[text()='Добавить']");

    private By nameCell = By.xpath((".//tbody/tr[last()]/td[1]"));
    private By typeCell = By.xpath((".//tbody/tr[last()]/td[2]"));
    private By exoticCell = By.xpath((".//tbody/tr[last()]/td[3]"));


    public TableItemsPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Проверить название столбцов в таблице")
    public TableItemsPage checkTable(String expectedNameText, String expectedTypeText, String expectedExoticText){

        String nameText = driver.findElement(tableNameText).getText();
        String typeText = driver.findElement(tableTypeText).getText();
        String exoticText = driver.findElement(tableExoticTest).getText();

        assertEquals(expectedNameText, nameText);
        assertEquals(expectedTypeText, typeText);
        assertEquals(expectedExoticText, exoticText);
        return this;
    }

    @Step("Нажать на кнопку 'Добавить'")
    public TableItemsPage clickAddButton() {
        driver.findElement(addButton).click();
        return this;
    }

    @Step("Проверить добавление нового товара в таблицу")
    public TableItemsPage checkNewRawTable(String expectedNameCellText, String expectedTypeCellText, String expectedExoticCellText){

        String nameCellText = driver.findElement(nameCell).getText();
        String typeCellText = driver.findElement(typeCell).getText();
        String exoticCellText = driver.findElement(exoticCell).getText();

        assertEquals(expectedNameCellText, nameCellText);
        assertEquals(expectedTypeCellText, typeCellText);
        assertEquals(expectedExoticCellText, exoticCellText);
        return this;
    }

}
