package d01_hello;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 设置请求字符编码
        req.setCharacterEncoding("UTF-8");

        // 2. 获取请求参数
        String name = req.getParameter("name");

        // 3. 设置响应字符编码并写入响应内容
        resp.setContentType("text/plain;charset=utf-8");
        resp.getWriter().write("Hello, " + (name != null ? name : "Servlet")); // Hello, 猪猪侠
    }
}
