*** Settings ***
Resource    ../Resources/Common.robot
Resource    ../Resources/AmazonApp.robot
Suite Setup     Insert Testing Data
Test Setup    Begin Web Test
Test Teardown    End Web Test
Suite Teardown    Cleanup Testing Data

*** Variables ***


*** Test Cases ***
User can search for product
    Search for Products

User selects and buys the product
    Search for Products
    Select Product from Search Results
    Add a product to Cart
    Begin checkout




