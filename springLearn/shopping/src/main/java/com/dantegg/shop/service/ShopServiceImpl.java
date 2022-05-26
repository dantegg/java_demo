package com.dantegg.shop.service;

import com.dantegg.shop.bean.Article;
import com.dantegg.shop.bean.ArticleType;
import com.dantegg.shop.bean.User;
import com.dantegg.shop.repository.ArticleMapper;
import com.dantegg.shop.repository.ArticleTypeMapper;
import com.dantegg.shop.repository.UserMapper;
import com.dantegg.shop.utils.Pager;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dantegg
 */
@Service("shopService")
public class ShopServiceImpl implements ShopService {

    //得到数据层访问对象
    @Resource
    private ArticleTypeMapper articleTypeMapper;

    @Resource
    private ArticleMapper articleMapper;

    @Resource
    private UserMapper userMapper;

    public List<ArticleType> getArticleTypes() {
        return articleTypeMapper.getArticleTypes();
    }

    public Map<String, Object> login(String loginName, String password) {
        Map<String, Object> results = new HashMap<String, Object>();
        if (StringUtils.isNullOrEmpty(loginName) || StringUtils.isNullOrEmpty(password)) {
            results.put("code", 1);
            results.put("msg", "参数为空");
        } else {
            User user = userMapper.login(loginName);
            if(user != null) {
                if (user.getPassword().equals(password)) {
                    results.put("code", 0);
                    results.put("msg", user);
                } else {
                    results.put("code", 2);
                    results.put("msg", "密码错误");
                }
            } else {
                results.put("code", 1);
                results.put("msg", "登录名错误");
            }
        }
        return results;
    }

    public List<ArticleType> loadFirstArticleTypes() {
        List<ArticleType> articleTypes = articleTypeMapper.getFirstArticleTypes();
        return articleTypes;
    }

    public List<Article> searchArticles(String typeCode, String secondType, String title, Pager pager) {
        return articleMapper.searchArticles(typeCode, secondType, title, pager);
    }

    public List<ArticleType> loadSecondTypes(String typeCode) {
        return articleTypeMapper.loadSecondTypes(typeCode + "%", typeCode.length() + 4);
    }
}
