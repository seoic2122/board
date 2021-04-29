package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;



public class BoardControllerImpl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("�� ��Ʈ�ѷ� �̵�");
		
		String title = (String) request.getParameter("title");
		
		System.out.println("�� �Ѿ�� ���� : "+title);
		// ���� �����͸� �����ϴ� ���� ȣ��
		BoardService bs = new BoardService();
		bs.insertTitle(title);
		
		// ������ ����Ʈ�� ��ȸ�ϴ� �޼ҵ带 ȣ��
		// 1.����� ����Ʈ�� ��ȸ�ؿ´�.
		ArrayList<String> list = bs.selectList();

		request.setAttribute("list", list );		
		
		System.out.println("�� list.jsp �� �̵� (����� �����Ϳ� �Բ�)");
		
		// request.setAttribute("id", id);
		HttpUtil.forward(request, response, "/list.jsp");
		
	}
	


}
