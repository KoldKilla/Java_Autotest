package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//Элементы страницы оформления заказа сайта:
public class ModalWindow {
    private final WebDriver driver;
    private By headerModalWindow = By.xpath(".//h5[text()='Добавление товара']");

    private By nameInputField = By.id("name");
    private By typeDropDownMenu = By.id("type");

    private By vegetablesType = By.xpath(".//option[@value = 'VEGETABLE']");
    private By fruitType = By.xpath(".//option[@value = 'FRUIT']");
    private By exoticCheckBox = By.id("exotic");
    private By addButton = By.xpath(".//button[text()='Сохранить']");

    public ModalWindow(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Проверить заголовок модального окна добавления товара")
    public ModalWindow checkModalWindowHeader() {
        driver.findElement(headerModalWindow).isDisplayed();
        return this;
    }

    @Step("Ввести наименование товара")
    public ModalWindow sendName(String textName) {
        driver.findElement(nameInputField).sendKeys(textName);
        return this;
    }

    @Step("Нажать на меню с типом товара")
    public ModalWindow clickTypeDropDownMenu(){
        driver.findElement(typeDropDownMenu).click();
        return this;
    }

    @Step("Выбрать тип товара 'Овощ'")
    public ModalWindow clickVegetablesType() {
        driver.findElement(vegetablesType).click();
        return this;
    }

    @Step("Выбрать тип товара 'Фрукт'")
    public ModalWindow clickFruitType() {
        driver.findElement(fruitType).click();
        return this;
    }

    @Step("Нажать на чекбокс 'Экзотический'")
    public ModalWindow clickExoticCheckBox() {
        driver.findElement(exoticCheckBox).click();
        return this;
    }

    @Step("Нажать на кнопку 'Сохранить'")
    public ModalWindow clickSaveButton() {
        driver.findElement(addButton).click();
        return this;
    }
}
