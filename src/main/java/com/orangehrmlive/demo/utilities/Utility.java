package com.orangehrmlive.demo.utilities;

import com.orangehrmlive.demo.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utility extends ManageBrowser {


    //This method will click on element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //This method will use to wait until  VisibilityOfElementLocated
    public WebElement waitUntilVisibilityOfElementLocated(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    public WebElement waitUntilVisibilityOfElementClickable(By by, int time) {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(time));
        WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(by));
        element1.click();
        return element1;
    }

    //This method will select the option by visible text
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    //This method verify the text with element
    public boolean verifyText(WebDriver driver, By locator, String expectedText) {
        WebElement element = driver.findElement(locator);
        String actualText = element.getText();
        return actualText.equals(expectedText);
    }

    // This method will send text on element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //This method will be clear the qty.
    public void clearQty(By by) {
        driver.findElement(by).sendKeys(Keys.CONTROL + "a");
        driver.findElement(by).sendKeys(Keys.DELETE);
    }

    //This method will get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    // This method will use to hover mouse on element and click
    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.moveToElement(driver.findElement(by)).click().build().perform();
    }

    //This method will use to hover mouse on element
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    public void assertEquals(String actualMessage1, String expectedMessage1) {
    }

    public WebElement dropDownMenu(By by) {
        return driver.findElement(by);

    }
}