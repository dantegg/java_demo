package com.dantegg.shop.service;

import com.dantegg.shop.bean.Article;
import com.dantegg.shop.bean.ArticleType;

import java.util.List;
import java.util.Map;

public interface ShopService {

    List<ArticleType> getArticleTypes();

    Map<String, Object> login(String loginName, String password);

    List<ArticleType> loadFirstArticleTypes();

    List<Article> searchArticles();
}
