*** Settings ***
Library    SeleniumLibrary


*** Keywords ***
Search for Products
    go to       http://www.amazon.com
    wait until page contains    Today's Deal
    input text    twotabsearchtextbox    Ferrari 458
    click button    nav-search-submit-button
    wait until page contains    results for "Ferrari 458"

Select Product from Search Results
    sleep    2s
    click element    xpath=//*[@id="search"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[3]/div[1]/h2/a/span
    wait until page contains    Back to results

Add a product to Cart
    click button    add-to-cart-button
    wait until page contains    Added to Cart

Begin checkout
    click element      name=proceedToRetailCheckout
    wait until page contains    Sign in

