package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginAction
 */
@WebServlet("/loginAction")
public class loginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId="aaaa";
		String userPw="0000";
		
		String id = request.getParameter("inputId");	
		String pw = request.getParameter("inputPw");	
		
		if(id.equals(userId) && pw.equals(userPw)){
			HttpSession session = request.getSession();
			session.setAttribute("loginId",id);
			session.setMaxInactiveInterval(60*30); //30��
			response.sendRedirect("/welcom.jsp");
		}else{
			String message="";
			
			message=(id.equals("") || pw.equals(""))? "���̵�� ��й�ȣ�� �Է��ϼ���." :"���̵�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�."; 
		
			request.setAttribute("message", message);
			request.getRequestDispatcher("/").forward(request, response);
		}
	}

}
