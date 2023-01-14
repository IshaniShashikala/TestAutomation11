package com.abc.stepDefinition;

import com.abc.pages.BookProduct;
import com.abc.util.Config;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BookProductSteps {
    private  BookProduct bookProduct = new BookProduct();
    private Config config = new Config();
    String url = config.getUrl();

    @Given("^Open the browser and launch the application$")
    public void open_the_browser_and_launch_the_application() throws Throwable {
        bookProduct.loadURL(url);
    }

    @When("^Select ‘Books’ from the Category list$")
    public void select_Books_from_the_Category_list() throws Throwable {
        bookProduct.select_Books_from_the_Category_list();
    }

    @When("^Search for the search term as '(.*?)'$")
    public void search_for_the_search_term_Automation(String bookType) throws Throwable {
        bookProduct.search_for_the_search_term_Automation(bookType);
    }

    @When("^Select Customer Reviews as 4 Stars & Up$")
    public void select_Customer_Reviews_as_4_Stars_Up() throws Throwable {
        bookProduct.select_Customer_Reviews_as_4_Stars_Up();
    }

    @Given("^Select Language as English$")
    public void select_Language_as_English() throws Throwable {
        bookProduct.select_Language_as_English();
    }

    @Given("^Get the name of the second item from the Product List page$")
    public void get_the_name_of_the_second_item_from_the_Product_List_page() throws Throwable {
        bookProduct.get_the_name_of_the_second_item_from_the_Product_List_page();
    }

    @Given("^Click the second item from the Product List page and navigate to the Product Detail page$")
    public void click_the_second_item_from_the_Product_List_page_and_navigate_to_the_Product_Detail_page() throws Throwable {
        bookProduct.click_the_second_item_from_the_Product_List_page_and_navigate_to_the_Product_Detail_page();
    }

    @Given("^Get the Unit price of the item displayed in the Product Detail page$")
    public void get_the_Unit_price_of_the_item_displayed_in_the_Product_Detail_page() throws Throwable {
        bookProduct.get_the_Unit_price_of_the_item_displayed_in_the_Product_Detail_page();
    }

    @Given("^Verify whether the item name of the Product Detail page is same as the item name obtained from the Product List page$")
    public void verify_whether_the_item_name_of_the_Product_Detail_page_is_same_as_the_item_name_obtained_from_the_Product_List_page() throws Throwable {
        bookProduct.verify_whether_the_item_name_of_the_Product_Detail_page_is_same_as_the_item_name_obtained_from_the_Product_List_page();
    }

    @Given("^Set the Quantity to 2$")
    public void set_the_Quantity_to(String quantity) throws Throwable {
        bookProduct.set_the_Quantity_to(quantity);
    }

    @Given("^Click on Add to Cart$")
    public void click_on_Add_to_Cart() throws Throwable {
        bookProduct.click_on_Add_to_Cart();
    }

    @Given("^Click on Go to Cart$")
    public void click_on_Go_to_Cart() throws Throwable {
        bookProduct.click_on_Go_to_Cart();
    }

    @Given("^Verify whether the cart details are correct$")
    public void verify_whether_the_cart_details_are_correct() throws Throwable {
        bookProduct.verify_whether_the_cart_details_are_correct();
    }

    @Given("^Clear the cart and verify the total amount as '(.*?)'$")
    public void clear_the_cart_and_verify_the_total_amount_is_equal_to_$(String amount) throws Throwable {
        bookProduct.clear_the_cart_and_verify_the_total_amount_is_equal_to_$(amount);
    }
}
