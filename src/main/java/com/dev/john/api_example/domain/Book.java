package com.dev.john.api_example.domain;

imports lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Book {
    public String title;
    public String author;
    public String area;
    public String publisher;
    @JsonProperty("year_of_publish")
    public String yearOfPublish;
    public String isbn;
}