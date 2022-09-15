package com.syntax.class08;

public class Notes {
    /*
    Skip to content
Search or jump to…
Pull requests
Issues
Marketplace
Explore

@mrdagdemir
SyntaxTechnologies
/
SeleniumBasics13
Public
Code
Issues
Pull requests
Actions
Projects
Security
Insights
SeleniumBasics13/Notes/ClassNotes08
@Moazzam19
Moazzam19 review05
Latest commit 5854224 on Aug 4
 History
 1 contributor
57 lines (45 sloc)  1.58 KB

Selenium Class 8

Implicit wait:
will be applied for findElement() methods

Explicit Wait or WebDriver Wait:
is used to tell the webdriver to wait for a certain condition
before throwing an exception for a specified condition

Explicit wait works with ExpectedConditions class and waits until
a certain condition is met or the given time is achieved

* sign in xpath is a wild card which can Identify any tagname
//*[@name = 'websubmit']

Fluent wait -- global wait
it is used to tell the webdriver to wait for certain condition as wel as its frequency
before throwing an exception

Implicit wait -- wait to locate the element
Explicit wait -- wait until certain condition is met
Fluent wait -- sets timeout, polling time and ignores needed exception in the give time period

WebTables:
Webtables are elements on the web page, which are constructed by having rows columns and headers

Types of WebTables:
1. Static webtables
2. Dynamic webtable

WebTables consist of different sections or parts:
<table>
    <thead>
        <tr>
            <th></th> -- column data or heading data
        </tr>
    </thead>
    <tbody>
        <tr>
            <td></td> -- table data
        </tr>
    </tbody>
</table>

HW

go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled

create a package and name it as utils
create a class and name as CommonMethods
create functions (methods) to open and quit the browsers
open method has to accept a url as a parameter
Footer

     */
}
