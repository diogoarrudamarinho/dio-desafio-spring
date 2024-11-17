package com.project_dio.bank.dto;

import java.util.List;

import com.project_dio.bank.entities.Account;
import com.project_dio.bank.entities.Card;
import com.project_dio.bank.entities.Feature;
import com.project_dio.bank.entities.News;
import com.project_dio.bank.entities.User;

public class UserDTO {
    
    private Long id;
    private String name;
    private Account account;
    private List<Feature> features;
    private Card card;
    private List<News> news;

    public UserDTO() {
    }

    public UserDTO(User entity) {
        this.account = entity.getAccount();
        this.card = entity.getCard();
        this.features = entity.getFeatures();
        this.id = entity.getId();
        this.name = entity.getName();
        this.news = entity.getNews();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public Card getCard() {
        return card;
    }

    public List<News> getNews() {
        return news;
    }
    
}
