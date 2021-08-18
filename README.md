# Selenium WebDriver Tests in Java

Selenium WebDriver is a open source web framework for cross-browser tests, end-to-end tests. Allows writing scripts for testing web applications.
From its [site](https://www.selenium.dev/documentation):
"Selenium is an umbrella project for a range of tools and libraries that enable and support the automation of web browsers. It provides extensions to emulate user interaction with browsers, a distribution server for scaling browser allocation, and the infrastructure for implementations of the W3C WebDriver specification that lets you write interchangeable code for all major web browsers."
This very simple project was made with Java, SpringBoot, Maven, and ZK.

## Configuration
Follow these steps:
- Add the Selenium WebDriver to your project. You can download the *.jar* files from the [Selenium](https://www.selenium.dev/downloads) site. Or add as a [Maven](https://maven.apache.org) dependency of your project, to the *pom.xml* file, inside the *\<dependencies\>* tag. You can choose it for a specific web browser or use one that lets you test in any browser.
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-chrome-driver</artifactId>
</dependency>

- Use a driver for the web browser that you are using. Search the internet: "*web_browser_name* WebDriver". Chose one that matches your operating system and supports the version of your web browser. Download and extract its contents to a folder in your project. If you are using Linux or Mac OS, remember to give executable permission to it.

## Example
This example presumes a Maven application, and the Chrome driver saved in the *drivers* folder of the application.
In a project, it starts as a [Junit](https://junit.org) test:
- In the *src/test/java* folder create a class (*.java* file).
- In the class create a method and use the *@Test* annotation from *org.junit.jupiter.api.Test* (Junit). The content of the method will be:
*//sets where did you put the driver in your project*
*System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");*
*WebDriver browser = new ChromeDriver();*
*browser.navigate().to\("http://localhost:8080"\);*
*browser.quit();*

The example will open the Chrome browser, enter the page of the application, and finally close the browser.

## Important
When using it, try to use their [Guidelines](https://www.selenium.dev/documentation/guidelines).

## References
This work is based in the "Selenium: Testes automatizados de aceitação em Java" course taught by professor Rodrigo Ferreira, by [Alura](https://www.alura.com.br).

