*** Settings ***
Library    SeleniumLibrary


*** Variables ***
${browser}      firefox
${url}    https://the-internet.herokuapp.com/



*** Test Cases ***
Testing Checkboxes
    open browser    ${url}    ${browser}
    maximize browser window

    title should be    The Internet
    click link      xpath=//a[@href="/checkboxes"]
    ${"h3"}         set variable    xpath=//h3

   element should be visible    ${"h3"}

   wait until element is visible   xpath=//*[text()=" checkbox 1"]
   select checkbox          xpath=(//*[@type='checkbox'])[1]
    unselect checkbox       xpath=(//*[@type='checkbox'])[2]
    go back

    #Dropdownmenu
    click link      xpath=//a[@href="/dropdown"]

*** Keywords ***
