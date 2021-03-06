package com.venomvendor.dailyhunt.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "articles"
})
public class GetPosts extends ResponseStatus {

    @JsonProperty("articles")
    private List<Article> articles = new ArrayList<>();

    /**
     * No args constructor for use in serialization
     */
    public GetPosts() {
    }

    /**
     * @param articles
     */
    public GetPosts(List<Article> articles) {
        this.articles = articles;
    }

    /**
     * @return The articles
     */
    @JsonProperty("articles")
    public List<Article> getArticles() {
        return articles;
    }

    /**
     * @param articles The articles
     */
    @JsonProperty("articles")
    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

}
