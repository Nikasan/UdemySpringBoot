package com.udemy.spring.springselenium.page.google;

import com.udemy.spring.springselenium.veron.annotation.PageFragment;
import com.udemy.spring.springselenium.page.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Nikasan
 */
@PageFragment
public class SearchComponent extends Base {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(xpath = "//div[.= 'Souhlasím']")
    private WebElement cookieButton;


    @FindBy(name = "btnK")
    private List<WebElement> searchButtons;

    public void search(final String str) {
        this.searchBox.sendKeys(str);
        this.searchBox.sendKeys(Keys.TAB);
        this.searchButtons
                .stream()
                .filter(e -> e.isDisplayed() && e.isEnabled())
                .findFirst()
                .ifPresent(WebElement::click);
    }

    @Override
    public boolean isAt() {
        cookieButton.click();
        return this.wait.until((d) -> this.searchBox.isDisplayed());
    }
}
