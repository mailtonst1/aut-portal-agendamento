package br.com.riachuelo.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Element extends Browser {
    protected static WebElement element(By by) {
        return driver.findElement(by);
    }

    protected static List<WebElement> elements(By by) {
        return driver.findElements(by);
    }

    protected static boolean exist(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by).isDisplayed();

    }

    protected static boolean elementIsVisible(By by) {
        return driver.findElement(by).isDisplayed();
    }

    protected static boolean elementNotPresent(By by) {
        return waitNot.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(by)));
    }

    protected static void waitElement(By by) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    protected static void waitElementClick(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    protected static void waitElementToNotBeVisible(By by) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    protected static void waitElementToIsBeVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected static void elementVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
