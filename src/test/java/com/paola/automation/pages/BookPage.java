package com.paola.automation.pages;

import com.paola.automation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BookPage  {

    public BookPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(css="[href='#books']")
    public WebElement booksPage;

@FindBy(xpath = "//table[@id='tbl_books']//tbody/tr")
public List<WebElement> books;

@FindBy(id="tbl_books_info")
    public WebElement bookCount;

@FindBy(xpath = "//input[@type='search']")
public WebElement search;

}


