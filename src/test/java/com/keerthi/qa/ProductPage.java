package com.keerthi.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private final WebDriver driver;
    private final By backpack = By.id("add-to-cart-sauce-labs-backpack");
    private final By cart = By.className("shopping_cart_link");
    private final By cartBadge = By.className("shopping_cart_badge");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addBackpackToCart() {
        driver.findElement(backpack).click();
    }

    public String getCartCount() {
        return driver.findElement(cartBadge).getText();
    }

    public void openCart() {
        driver.findElement(cart).click();
    }
}
