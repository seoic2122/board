package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// ��Ʈ�ѷ�,
// ������ ���� ���޹���(request) ������ �޾Ƽ� ���𰡸� �ϴ� ��
public class BoardController extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		request.setAttribute("result","resultObject");
		
		String type= request.getParameter("type");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list.jsp");

		if(type.equals("")){
			
		}else
		
		dispatcher.forward(request, response);
	}

}
