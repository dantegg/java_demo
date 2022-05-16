package com.dantegg.shop.repository;

import com.dantegg.shop.bean.Article;

import java.util.List;

/**
 * @author dantegg
 */
public interface ArticleMapper {

    List<Article> searchArticles();

}