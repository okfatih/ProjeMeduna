*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${browser}    chrome
${url}          https://demo.nopcommerce.com
*** Test Cases ***
TestingInputBox
    open browser     ${url}  ${browser}
    maximize browser window
    title should be    nopCommerce demo store
    click link    xpath=//*[@href="/login?returnUrl=%2F"]
    ${"email_txt"}  set variable    id:Email

    element should be visible    ${"email_txt"}
    element should be enabled    ${"email_txt"}

    input text    ${"email_txt"}       EdmunDorf@gmail.com
    sleep    1
    clear element text    ${"email_txt"}
    sleep    1



*** Keywords ***

