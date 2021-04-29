package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class BoardControllerImpl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("�� ��Ʈ�ѷ� �̵�");
		
		// ���� �����͸� ����
		System.out.println("�� ����");
		String title = (String) request.getParameter("title");
		
		System.out.println("�� �Ѿ�� ���� : "+title);
		// TODO. 1 �����ϴ� �޼ҵ�/�Լ� ȣ��
		this.insertQuery(title);
		

		// ����� ������ ����Ʈ�� �Բ� list.jsp �� �̵��Ѵ�.

		// 1.����� ����Ʈ�� ��ȸ�ؿ´�.
		ArrayList<String> list = selectQuery();
		System.out.println("�� ��ȸ �޼ҵ� ���� ");
		request.setAttribute("list", list );		
		
		System.out.println("�� list.jsp �� �̵� (����� �����Ϳ� �Բ�)");
		
		// request.setAttribute("id", id);
		HttpUtil.forward(request, response, "/list.jsp");
	}
	
	
	/**
	 * ������ DB �� �����ϴ� �޼ҵ�
	 * @param title
	 */
	private void insertQuery(String title){
		System.out.println("�� �����ϴ� �޼ҵ带 ȣ���Ѵ�. ");
		
		System.out.println("�� ���� �Ϸ�");
		
	}
	
	private ArrayList<String> selectQuery(){
		ArrayList<String> list = new ArrayList();
		
		list.add("title 1"); // list[title 1]
		list.add("title 2"); // list[title 1, title 2]
		list.add("title 3"); // list[title 1, title 2, title3]
		
		
		
		return list;
	}

}
