*** Settings ***
Library    SeleniumLibrary
*** Variables ***
${browser}      firefox
${url}         https://the-internet.herokuapp.com/

*** Test Cases ***
Testing dropDown menu
    open browser    ${url}      ${browser}
    maximize browser window
    title should be    The Internet
    click link      xpath=//a[@href="/dropdown"]
    select from list by label   dropdown   Option 1
    sleep    0.5
    #dropdown index ile
    select from list by index   dropdown    2
    #Dropdown value ile
    select from list by value    dropdown    1