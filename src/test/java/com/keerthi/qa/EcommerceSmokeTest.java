package com.keerthi.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EcommerceSmokeTest extends BaseTest {

    @Test
    void validLoginShouldOpenProducts() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        assertTrue(driver.getCurrentUrl().contains("inventory.html"));
        assertTrue(driver.getTitle().contains("Swag Labs"));
    }

    @Test
    void invalidLoginShouldShowError() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid_user", "wrong_password");

        assertTrue(loginPage.isErrorDisplayed(), "Login error should be displayed");
    }

    @Test
    void addProductShouldUpdateCart() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductPage productPage = new ProductPage(driver);
        productPage.addBackpackToCart();

        assertEquals("1", productPage.getCartCount());
    }

    @Test
    void cartShouldContainSelectedProduct() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductPage productPage = new ProductPage(driver);
        productPage.addBackpackToCart();
        productPage.openCart();

        CartPage cartPage = new CartPage(driver);
        assertEquals("Sauce Labs Backpack", cartPage.getFirstItemName());
    }
}
