# Selenium Automation Project 🚀

Welcome to my automation project! Below is a brief overview of the core functionality of each script in the src folder. Each file demonstrates the power of Selenium WebDriver through various web automation scenarios.

## 📄 **End2End.java**
**Objective**: Automates the complete airline ticket purchasing process on a Spanish Airline's webpage.  
✨ **Highlights**:  
- Seamlessly navigates the website.  
- Selects flights, adds passenger details, and completes the checkout process.

---

## 🖱️ **actionsDemo.java**
**Objective**: Interacts with an e-commerce webpage using advanced mouse actions.  
✨ **Highlights**:  
- Hovers over product categories to reveal submenus.  
- Demonstrates smooth user interaction with dropdowns and menus.

---

## 🔗 **Scope.java**
**Objective**: Explores the structure of an e-commerce webpage by analyzing links.  
✨ **Highlights**:  
1. **All Links**: Counts the total number of links on the entire page.  
2. **Footer Links**: Narrows down the scope to count links only in the footer section.  
3. **Column-Specific Links**: Focuses further to count and interact with links in the first column of the footer.  
4. **Validation**: Clicks on each link in the first column and verifies if pages open correctly by printing their titles.

---

## 🪟 **WindowHandles.java**
**Objective**: Manages multiple browser windows in an e-commerce webpage.  
✨ **Highlights**:  
- Opens a new tab, extracts text, and pastes it back into the original window.  
- Demonstrates seamless handling of multiple tabs and their contents.

---

## 🔍 **WindowHandles2.java**
**Objective**: A deeper dive into link counting and interaction within an e-commerce webpage.  
✨ **Highlights**:  
1. **All Links**: Counts the total number of links on the page.  
2. **Footer Links**: Restricts the scope to count links only in the footer section.  
3. **Column-Specific Links**: Refines the scope to focus on links in the first column of the footer.  
4. **Validation**: Clicks through each link in the column, opens the respective pages, and prints their titles.

---

## 🔒 **SSLCheck.java**
**Objective**: By-pass the Security Certication SSL and go to the actual WebPage.  
✨ **Highlights**:  
- Using differents Browsers, by-pass Security Certications and land on the desired WebPage.

---

## 📸 **Screeshot.java**
**Objective**: Take a screenshot of the actual WebPage.  

---

## 🔗❌ **BrokenLinks.java**
**Objective**: Iterate over all links in the page to validate broken links mechanism.  
✨ **Highlights**:  
- Importance of Soft Assertions in Selenium WebDriver.

---

## 📋✔️ **SortedList.java**
**Objective**: Automating Pagination Scenarios to search the data choosen.              
✨ **Highlights**:  
- We can perform various aggregate operations on the data returned from collections classes by drastically reduce the complexity of the code. 
- Importance of using streams(). and Lambda Expressions (->)
  
---

## 🛠️📋 **FilterWebTable.java**
**Objective**: Filter the Web table using Selenium java streams            
✨ **Highlights**:  
- The importance of using .filter() with Lambda Expresions (->) .contains() .collect() to drastically reduce the complexity of using loops
- Using assertions to test our lists. 

---

## 🛠️📋📸 **NewWindow.java**
**Objective**: Invoking multiple Windows/Tabs from Selenium, grabing some reference/text in the child Window and paste it into the parent one.
- Take a partial WebElement partial Screenshot with Selenium.
- Get the Height & Width of the WebElement for UX validation.
✨ **Highlights**:  
- The importance of using hadles.iterator() & .switchTo().window()
-  The importance of using FileUtils.jar

---

## 🌟 **Contribute & Support**
Feel free to explore the code and adapt it for your own automation needs!  
If you find this helpful, don’t forget to **⭐ star the repository** and share it with others. 😊








