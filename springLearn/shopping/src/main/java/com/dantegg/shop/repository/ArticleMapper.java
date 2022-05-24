package com.dantegg.shop.repository;

import com.dantegg.shop.bean.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author dantegg
 */
public interface ArticleMapper {

    /**
     * @return List<Article>
     */
    List<Article> searchArticles(@Param("typeCode") String typeCode, @Param("secondType") String secondType, @Param("title") String title);

}