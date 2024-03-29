package com.dantegg.shop.action;

import com.dantegg.shop.bean.ArticleType;
import com.dantegg.shop.service.ShopService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author dantegg
 */
@WebServlet("/getArticleTypes")
public class   ArticleTypeServlet extends HttpServlet {
    // 定义业务层对象

    private ShopService shopService;

    @Override
    public void init() throws ServletException {
        super.init();
        ServletContext servletContext = this.getServletContext();
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        shopService = (ShopService) context.getBean("shopService");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);
        List<ArticleType> articleTypes = shopService.getArticleTypes();
        System.out.println(articleTypes);

    }
}
