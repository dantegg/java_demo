package com.dantegg.shop.service;

import com.dantegg.shop.bean.ArticleType;
import com.dantegg.shop.repository.ArticleTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dantegg
 */
@Service("shopService")
public class ShopServiceImpl implements ShopService {

    //得到数据层访问对象
    @Resource
    private ArticleTypeMapper articleTypeMapper;

    public List<ArticleType> getArticleTypes() {
        return articleTypeMapper.getArticleTypes();
    }
}
