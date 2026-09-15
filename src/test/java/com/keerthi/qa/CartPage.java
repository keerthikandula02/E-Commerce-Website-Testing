package com.keerthi.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private final WebDriver driver;
    private final By cartItem = By.className("inventory_item_name");
    private final By checkoutButton = By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstItemName() {
        return driver.findElement(cartItem).getText();
    }

    public void checkout() {
        driver.findElement(checkoutButton).click();
    }
}
