package testCases;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Homepage;
import testBase.Basetest;

/**
 * Test class for the home page Contains test cases related to cookie handling.
 */
public class TC_001_HomeTest extends Basetest {

//validating cookie is accepted or not
    @Test
    public void testAcceptCookies() {
        Homepage homePage = new Homepage(driver);
        homePage.acceptCookies();
        Assert.assertFalse(homePage.isCookieConsentPopupVisible(), "Cookie consent popup should not be visible.");
    }

//validating size of the cookie
    @Test
    public void testVerifyCookies() {
        Homepage homePage = new Homepage(driver);
        homePage.acceptCookies();
        Set <Cookie> cookie = driver.manage().getCookies(); 
        int size = cookie.size();
        for(Cookie cookiename:cookie) {
        	System.out.println(cookiename.getName()+" "+ cookiename.getValue());
        	}
        Assert.assertEquals(size, 8, "Cookie value should match the expected value.");   
        }
    
   
//validating title of the page
    @Test
    public void testVerifyHomepageTitle() {
        String expectedTitle = "Construction App for Project Management | Ed Controls"; 
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Homepage title does not match the expected title.");
    }
}
