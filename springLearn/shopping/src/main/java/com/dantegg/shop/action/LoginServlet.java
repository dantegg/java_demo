package com.dantegg.shop.action;

import com.dantegg.shop.bean.User;
import com.dantegg.shop.service.ShopService;
import com.dantegg.shop.utils.Constants;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private HttpServletRequest request;

    private HttpServletResponse response;

    private ShopService shopService;

    @Override
    public void init() throws ServletException {
        super.init();
        ServletContext servletContext = this.getServletContext();
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        shopService = (ShopService) context.getBean("shopService");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.request = req;
        this.response = resp;
        String method = req.getParameter("method");
        if ("getjsp".equals(method)) {
            req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);
        } else if ("login".equals(method)) {
            login();
        }
    }

    private void login() {
        try {
            String loginName = request.getParameter("loginName");
            String password = request.getParameter("passWord");
            Map<String, Object> results = shopService.login(loginName, password);
            if((Integer) results.get("code") == 0 ) {
                User user = (User) results.get("msg");
                request.setAttribute(Constants.USER_SESSION, user);
                request.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request, response);
            } else {
                String msg = (String) results.get("msg");
                request.setAttribute("msg", msg);
                request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);

            }
        } catch (Exception e ) {
            System.out.println(e);
        }

    }
}
