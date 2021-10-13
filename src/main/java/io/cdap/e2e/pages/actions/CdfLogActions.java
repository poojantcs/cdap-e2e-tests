package io.cdap.e2e.pages.actions;

import io.cdap.e2e.pages.locators.CdfLogLocators;
import org.openqa.selenium.support.PageFactory;
import io.cdap.e2e.utils.SeleniumDriver;

public class CdfLogActions {
    public static CdfLogLocators cdfLogLocators = null;

    static {

        cdfLogLocators = PageFactory.initElements(SeleniumDriver.getDriver(), CdfLogLocators.class);

    }

    public static void validateErrorPopupLog() throws InterruptedException {
        Thread.sleep(4000);
        cdfLogLocators.errorMessagePopup.click();
    }

    public static void validateErrorPopupLog(String error) throws InterruptedException {
        Thread.sleep(4000);

        cdfLogLocators.errorMessagePopup.click();
    }


    public static void dismissPopup()  {
        cdfLogLocators.dismissable.click();
    }

    public static void goToLogs() {
        cdfLogLocators.goToLogs.click();
    }

    public static void validateFailed() {
        cdfLogLocators.validateFailed.isDisplayed();
    }
    public static void validateCategoryError() {
        cdfLogLocators.validateCategoryError.isDisplayed();
    }

    public static void validateLogError() {
        cdfLogLocators.validateCategoryError.isDisplayed();
    }
    public static void goToAdvanceLogs() {
        cdfLogLocators.getGoToAdvanceLogs.click();
    }

    public static void validateSucceeded() {
        cdfLogLocators.validateSucceeded.isDisplayed();
    }

    public static void closeLogs() {
        cdfLogLocators.closeLogs.click();
    }

}