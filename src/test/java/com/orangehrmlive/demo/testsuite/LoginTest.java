package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashBoardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DashBoardPage dashBoardPage = new DashBoardPage();
@Test
    public void verifyUserShouldLoginSuccessFully(){
    loginPage.enterUsername("Admin");
    loginPage.enterPassword("admin123");
    loginPage.clickLoginButton();
    String expectedMessage = "Dashboard";
    String actualMessage = dashBoardPage.getDashboardText();
    assertEquals(actualMessage, expectedMessage);
}

@Test
    public void verifyThatTheLogoDisplayOnLoginPage(){
    String expectedMessage = "orangehrm-logo";
    String actualMessage = loginPage.getLogoHRForALL();
    assertEquals(actualMessage, expectedMessage);
}

@Test
    public void verifyUserShouldLogOutSuccessFully(){
    loginPage.enterUsername("Admin");
    loginPage.enterPassword("admin123");
    loginPage.clickLoginButton();
    dashBoardPage.clickOnUserProfileLogo();
    dashBoardPage.mouseHooverOnLogoutAndClick();
    String expectedMessage = "Login";
    String actualMessage = loginPage.loginPanelDisplayed();
    assertEquals(actualMessage, expectedMessage);

}





}