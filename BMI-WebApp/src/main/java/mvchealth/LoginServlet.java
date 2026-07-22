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
		 // ログイン画面から入力された値を取得
	    String loginId = request.getParameter("loginId");
	    String password = request.getParameter("password");
	}
	}

