package com.dantegg.shop.action;

import com.dantegg.shop.bean.Article;
import com.dantegg.shop.bean.ArticleType;
import com.dantegg.shop.service.ShopService;
import com.dantegg.shop.utils.Pager;
import com.mysql.jdbc.StringUtils;
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

@WebServlet("/list")
public class ListServlet extends HttpServlet {

    // 定义业务层对象

    private ShopService shopService;

    private HttpServletRequest request;

    private HttpServletResponse response;

    @Override
    public void init() throws ServletException {
        super.init();
        ServletContext servletContext = this.getServletContext();
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        shopService = (ShopService) context.getBean("shopService");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String method = request.getParameter("method");
            this.request = request;
            this.response = response;
            if ("getAll".equals(method)) {
                getAll();
            } else if ("deleteById".equals(method)) {
                deleteById();
            }

        } catch (Exception e )   {
            e.printStackTrace();
        }

    }

    private void deleteById() throws ServletException, IOException {
        try {
            String id = request.getParameter("id");
            shopService.deleteById(id);
            request.setAttribute("tip", "删除成功");

        } catch (Exception e ) {
            e.printStackTrace();
            request.setAttribute("tip", "删除失败");

        }
        request.getRequestDispatcher("/list?method=getAll").forward(request, response);
    }

    private void getAll() throws ServletException, IOException {
        Pager pager = new Pager();
        String pageIndex = request.getParameter("pageIndex");
        if(!StringUtils.isNullOrEmpty(pageIndex)) {
            int pSize = Integer.valueOf(pageIndex);
            pager.setPageIndex(pSize);

        }
        String secondType = request.getParameter("secondType");
        request.setAttribute("secondType", secondType);
        String  typeCode = request.getParameter("typeCode");
        String title = request.getParameter("title");
        request.setAttribute("title", title);
        if(!StringUtils.isNullOrEmpty(typeCode)) {
            List<ArticleType> secondTypes = shopService.loadSecondTypes(typeCode);
            request.setAttribute("secondTypes", secondTypes);
            request.setAttribute("typeCode", typeCode);
        }

        List<ArticleType> firstArticleTypes = shopService.loadFirstArticleTypes();
        List<Article> articles = shopService.searchArticles(typeCode, secondType, title, pager);
        request.setAttribute("firstArticleTypes", firstArticleTypes);
        request.setAttribute("articles", articles);
        request.setAttribute("pager", pager);
        request.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request, response);
    }
}
