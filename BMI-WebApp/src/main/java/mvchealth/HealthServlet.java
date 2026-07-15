package mvchealth;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HealthServlet
 */
@WebServlet("/bmi")
public class HealthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// formのデータを取得
		request.setCharacterEncoding("UTF-8"); // 文字コードの設定
		String height = request.getParameter("height"); // 身長(cm)の文字列を取得
		String weight = request.getParameter("weight"); // 体重(kg)の文字列を取得
		
		BmiModel bmiModel = new BmiModel(); // インスタンスの生成
		// BMI値を求めるメソッドの実行
		double bmi = bmiModel.calcBmi(height,weight);
		
		// 結果をJSPで表示するためにrequestスコープにデータを保存(JSPとの共有)
		request.setAttribute("height",height);  // 身長(cm)文字列を保存
		request.setAttribute("weight", weight); // 体重(kg)文字列を保存
		request.setAttribute("bmi", bmi);  // BMI値を保存
		
		// 結果を表示するJSPファイルに切り替える(forward()メソッド)
		request.getRequestDispatcher("/WEB-INF/view/bmi.jsp").forward(request, response);
	}

}

