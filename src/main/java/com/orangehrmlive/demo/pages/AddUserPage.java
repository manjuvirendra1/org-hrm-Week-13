package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {

    By enterUsername = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/input[1]");
    By userRoleSelect = By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i");
    By selectAdmin = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");
    By statusSelect = By.xpath("//div[@class='oxd-form-row']/div/div[4]/div/div[2]/div/div");
    By selectDisable = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]");
    By selectEnable = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Enabled')]");
    By clickSearch = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    By verifyResult = By.xpath("//div[@class='orangehrm-paper-container']/div[2]/div[1]/span[1]");
    By clickCheckbox = By.xpath("//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    By clickDelete = By.xpath("//div[@class='oxd-table-cell-actions']/button[1]/i[1]");
    By popUp = By.xpath("//div[@class='orangehrm-modal-footer']/button[2]");
    By verifyMsg = By.xpath("//div[@class='orangehrm-paper-container']/div[2]/div[1]/span[1]");
    By searchBtn = By.xpath("//div[@class='oxd-table-filter-area']/form[1]/div[2]/button[2]");
    By verifyNoRecord = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']");

    public void enterUser() {
        sendTextToElement(enterUsername, "Bhavna Patel");
    }

    public void SelectUserRole() throws InterruptedException {
        clickOnElement(userRoleSelect);
        Thread.sleep(1000);
        clickOnElement(selectAdmin);
    }

    public void SelectStatusDisable () throws InterruptedException {
        clickOnElement(statusSelect);
        Thread.sleep(1000);
        clickOnElement(selectDisable);
    }

    public void SelectStatusEnable () throws InterruptedException {
        clickOnElement(statusSelect);
        Thread.sleep(1000);
        clickOnElement(selectEnable);
    }

    public void ClickSearchButton() {
        clickOnElement(clickSearch);
    }

    public String VerifyResultList() {
        return getTextFromElement(verifyResult);
    }

    public void clickOnCheckbox() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(clickCheckbox);
    }

    public void ClickDeleteButton() throws InterruptedException {
        clickOnElement(clickDelete);
        Thread.sleep(1000);
    }

    public void PopUpClick() throws InterruptedException {
        clickOnElement(popUp);
        Thread.sleep(1000);
    }

    public void VerifyMsgCheck() {
        clickOnElement(verifyMsg);
    }

    public void SearchButtonDelete() {
        clickOnElement(searchBtn);
    }

    public String VerifyNoRecordFound() {
        return getTextFromElement(verifyNoRecord);
    }




}