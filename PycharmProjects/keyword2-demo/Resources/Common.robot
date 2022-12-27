*** Settings ***
Library    SeleniumLibrary

*** Keywords ***
Begin Web Test
    Open Browser   about:blank     edge

End Web Test
    close browser


Insert Testing Data
    log    I am setting up the test data

Cleanup Testing Data
    log    I am cleaning up the test data