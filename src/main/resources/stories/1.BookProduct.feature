Feature: Order Product from Amazon

#Testcase : Verification of Successful Order Product
 Scenario: Testcase: Verification of Successful Order Product
  Given Open the browser and launch the application
  When Select ‘Books’ from the Category list
  And Search for the search term as 'Automation'
  And Select Customer Reviews as 4 Stars & Up
  And Select Language as English

  And Get the name of the second item from the Product List page
  And Click the second item from the Product List page and navigate to the Product Detail page
  And Get the Unit price of the item displayed in the Product Detail page
  And Verify whether the item name of the Product Detail page is same as the item name obtained from the Product List page
  And Set the Quantity to 2
  And Click on Add to Cart
  And Click on Go to Cart
  And Verify whether the cart details are correct
# (Item name, Quantity and Total Price).
  And Clear the cart and verify the total amount as '$0.00'