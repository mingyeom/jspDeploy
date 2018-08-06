package kr.or.ddit.jstl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LocaleSelect
 */
@WebServlet("/localeSelect")
public class LocaleSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 서블릿에서는 파라미터 locale을 받는다.
		// 만약 locale 파라미터가 없을 경우 기본 값 ko
		// localeSelect.jsp로 forward
		
		String locale = request.getParameter("locale");
		if (locale == null) {
			request.setAttribute("locale", "ko");
		} else {
			request.setAttribute("locale", locale);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/jstl/localeSelect.jsp");
		rd.forward(request, response);

	}

}
