import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import PageObject.MainPage;
import PageObject.ModalWindow;
import PageObject.TableItemsPage;


public class OderItemsTest extends BaseTest {
    @Test
    @DisplayName("Добавление товара с типом Овощ - экзотический")
    public void OrderExoticVegetables() {
        new MainPage(driver)
                .openSite()
                .clickDropDownMenuSandBox()
                .clickDropDownMenuItemsText();

        new TableItemsPage(driver)
                .checkTable("Наименование", "Тип", "Экзотический")
                .clickAddButton();

        new ModalWindow(driver)
                .checkModalWindowHeader()
                .sendName("Test1")
                .clickFruitType()
                .clickVegetablesType()
                .clickExoticCheckBox()
                .clickSaveButton();
        new TableItemsPage(driver)
                .checkNewRawTable("Test1", "Овощ", "true");
    }

    @Test
    @DisplayName("Добавление товара с типом Овощ - не экзотический")
    public void OrderNonExoticVegetables() {
        new MainPage(driver)
                .openSite()
                .clickDropDownMenuSandBox()
                .clickDropDownMenuItemsText();

        new TableItemsPage(driver)
                .checkTable("Наименование", "Тип", "Экзотический")
                .clickAddButton();

        new ModalWindow(driver)
                .checkModalWindowHeader()
                .sendName("Test2")
                .clickTypeDropDownMenu()
                .clickVegetablesType()
                .clickSaveButton();
        new TableItemsPage(driver)
                .checkNewRawTable("Test2", "Овощ", "false");
    }

    @Test
    @DisplayName("Добавление товара с типом Фрукт - не экзотический")
    public void OrderNonExoticFruit() {
        new MainPage(driver)
                .openSite()
                .clickDropDownMenuSandBox()
                .clickDropDownMenuItemsText();

        new TableItemsPage(driver)
                .checkTable("Наименование", "Тип", "Экзотический")
                .clickAddButton();

        new ModalWindow(driver)
                .checkModalWindowHeader()
                .sendName("Test 21234234")
                .clickTypeDropDownMenu()
                .clickFruitType()
                .clickSaveButton();
        new TableItemsPage(driver)
                .checkNewRawTable("Test 21234234", "Фрукт", "false");
    }

    @Test
    @DisplayName("Добавление товара с типом Фрукт - экзотический")
    public void OrderExoticFruit() {
        new MainPage(driver)
                .openSite()
                .clickDropDownMenuSandBox()
                .clickDropDownMenuItemsText();

        new TableItemsPage(driver)
                .checkTable("Наименование", "Тип", "Экзотический")
                .clickAddButton();

        new ModalWindow(driver)
                .checkModalWindowHeader()
                .sendName("Test@@")
                .clickTypeDropDownMenu()
                .clickFruitType()
                .clickExoticCheckBox()
                .clickSaveButton();
        new TableItemsPage(driver)
                .checkNewRawTable("Test@@", "Фрукт", "true");
    }
}
