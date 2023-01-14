*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${browser}
${url}         https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml

*** Test Cases ***
Testing Radio Buttons and Check Boxes
    open browser    ${url} ${browser}    firefox
    maximize browser window
    sleep    1

    input text    name1        Roland

    select radio button    software    Excel

*** Keywords ***
