package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page class for the home page. Contains methods to interact with elements on the home page.
 */
public class Homepage extends Basepage {
	
	
	//Constructor
	public Homepage(WebDriver driver) {
        super(driver);
    }

    // Define locators
    @FindBy(xpath ="//button[@id='rcc-confirm-button']") WebElement acceptButton;
    
    
    //Action Methods
    //Accepts cookies if the consent button is visible.//
    public void acceptCookies() {
        try {
            if (acceptButton.isDisplayed()) {
                acceptButton.click();
            }
        } catch (Exception e) {
            System.out.println("Cookie consent button not found or already accepted.");
        }
    }

     /* Checks if the cookie consent popup is visible.
        @return boolean - true if popup is visible, false otherwise. */
    public boolean isCookieConsentPopupVisible() {
        try {
            return acceptButton.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
