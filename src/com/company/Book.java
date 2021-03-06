package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Book {
    private String author;
    private String title;
    private String description;

    public Book(String author, String title, String description) {
        this.author = author;
        this.title = title;
        this.description = description;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void getDistplayText() {

        System.out.println("Author: " + author +
                " Title: " + title +
                " Descriptions: " + description);
    }
}