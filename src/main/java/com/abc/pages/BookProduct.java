package com.abc.pages;

import com.abc.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BookProduct {
    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;

    public BookProduct(){
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }

    public void loadURL(String url){
        String URL = driver.getCurrentUrl();
        driver.get(url);
    }

    public void select_Books_from_the_Category_list() throws Throwable {
        WebElement allCategoryDropDownElement = driver.findElement(By.id("searchDropdownBox"));
        allCategoryDropDownElement.click();
        WebElement booksElement = driver.findElement(By.xpath("//option[contains(text(),'Books')]"));
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        Thread.sleep(2000);
        allCategoryDropDownElement.click();
    }

    public void search_for_the_search_term_Automation(String bookType) throws Throwable {
        WebElement searchBarElement = driver.findElement(By.id("twotabsearchtextbox"));
        searchBarElement.sendKeys(bookType);
        searchBarElement.sendKeys(Keys.ENTER);
    }

    public void select_Customer_Reviews_as_4_Stars_Up() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement reviewElement = driver.findElement(By.id("p_72/1250221011"));
        js.executeScript("arguments[0].scrollIntoView();", reviewElement);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id( "p_72/1250221011")));
        reviewElement.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

    public void select_Language_as_English() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[7]/ul[5]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]")));

        WebElement languageElement = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[7]/ul[5]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]"));
        js.executeScript("arguments[0].scrollIntoView();", languageElement);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        languageElement.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public Object get_the_name_of_the_second_item_from_the_Product_List_page() throws Throwable {
        WebElement item2 = driver.findElement(By.xpath("//span[contains(text(),'Network Programmability and Automation: Skills for')]"));
        String itemName = item2.getText();
        return itemName;
    }

    public void click_the_second_item_from_the_Product_List_page_and_navigate_to_the_Product_Detail_page() throws Throwable {
        WebElement item2 = driver.findElement(By.xpath("//span[contains(text(),'Network Programmability and Automation: Skills for')]"));
        item2.click();
    }

    public void get_the_Unit_price_of_the_item_displayed_in_the_Product_Detail_page() throws Throwable {
        WebElement item2UnitPriceEleemnt = driver.findElement(By.xpath("//span[contains(text(),'$22.41 - $31.99')]"));
        String item2UnitPrice = item2UnitPriceEleemnt.getText();
    }

    public void verify_whether_the_item_name_of_the_Product_Detail_page_is_same_as_the_item_name_obtained_from_the_Product_List_page() throws Throwable {
        WebElement item2UnitPriceEleemnt = driver.findElement(By.id("//span[@id='productTitle']"));
        String item2NameDEtailedPage = item2UnitPriceEleemnt.getText();

        Assert.assertEquals(item2NameDEtailedPage, get_the_name_of_the_second_item_from_the_Product_List_page());
    }

    public void set_the_Quantity_to(String quantity) throws Throwable {
    }

    public void click_on_Add_to_Cart() throws Throwable {
    }

    public void click_on_Go_to_Cart() throws Throwable {
    }

    public void verify_whether_the_cart_details_are_correct() throws Throwable {
    }

    public void clear_the_cart_and_verify_the_total_amount_is_equal_to_$(String amount) throws Throwable {
    }
}
