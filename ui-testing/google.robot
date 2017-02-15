*** Settings ***
Library    Selenium2Library

*** Testcases ***
Search data with google
  Open Browser   http://www.google.com
  Input Text    name=q    Hello
