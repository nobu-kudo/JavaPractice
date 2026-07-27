package mvchealth;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/login.jsp")
               .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
    	
        // ===== デバッグ開始 =====
        System.out.println("① doPost開始");

        // ログイン画面から入力された値を取得
        String loginId = request.getParameter("loginId");
        String password = request.getParameter("password");

        System.out.println("loginId = [" + loginId + "]");
        System.out.println("password = [" + password + "]");
        
        System.out.println("loginId = " + loginId);

        // DAOを作成
        UserDao dao = new UserDao();
        System.out.println("② UserDao作成");

        // ログイン判定
        User user = dao.login(loginId, password);
        System.out.println("③ login終了");

        // 判定結果
        if (user != null) {
            request.getSession().setAttribute("loginUser", user);

            response.sendRedirect(
                request.getContextPath() + "/input.jsp"
            );
        } else {
            request.setAttribute("errorMessage", "ログインIDまたはパスワードが違います。");

            request.getRequestDispatcher("/WEB-INF/login.jsp")
                   .forward(request, response);
        }
    }
}
