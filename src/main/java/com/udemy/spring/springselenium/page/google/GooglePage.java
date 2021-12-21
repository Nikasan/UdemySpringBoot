package com.udemy.spring.springselenium.page.google;

import com.udemy.spring.springselenium.veron.annotation.Page;
import com.udemy.spring.springselenium.page.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;

/**
 * Created by Nikasan
 */
@Page
public class GooglePage extends Base {

    @Lazy
    @Autowired
    private SearchComponent searchComponent;

    @Lazy
    @Autowired
    private SearchResult searchResult;

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public SearchResult getSearchResult() {
        return searchResult;
    }

    @Value("${application.url}")
    private String url;

    public void goTo() {
        this.driver.get(url);
    }

    @Override
    public boolean isAt() {
        return this.searchComponent.isAt();
    }

    public void close(){
        this.driver.quit();
    }
}
