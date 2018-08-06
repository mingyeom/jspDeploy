package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SumCalculation
 */
@WebServlet("/sumCalculation")
public class SumCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumCalculation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		
		int result = 0;
		
		if (Integer.parseInt(start) < Integer.parseInt(end)) {
			
			for (int i = Integer.parseInt(start)+1; i < Integer.parseInt(end); i++) {
				result += i;
			}
			//System.out.println("합 : " + result);
			//request.getParameter 사용자가 보낸 파라미터를 받아오는 작업
			//request객체에 일시적으로 값을 저장하는 방법
			request.setAttribute("sumResult", result);
			
			//session에 sumResult를 저장한다.
			HttpSession session = request.getSession();
			session.setAttribute("sumResult", result);
			
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/sumResult.jsp");
			rd.forward(request, response);
		} 
	}

}
