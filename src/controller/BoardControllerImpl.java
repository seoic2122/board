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
		
		System.out.println("■ 컨트롤러 이동");
		
		// 받은 데이터를 저장
		System.out.println("■ 저장");
		String title = (String) request.getParameter("title");
		
		System.out.println("■ 넘어온 제목 : "+title);
		// TODO. 1 저장하는 메소드/함수 호출
		this.insertQuery(title);
		

		// 저장된 데이터 리스트와 함께 list.jsp 로 이동한다.

		// 1.저장된 리스트를 조회해온다.
		ArrayList<String> list = selectQuery();
		System.out.println("■ 조회 메소드 실행 ");
		request.setAttribute("list", list );		
		
		System.out.println("■ list.jsp 로 이동 (저장된 데이터와 함께)");
		
		// request.setAttribute("id", id);
		HttpUtil.forward(request, response, "/list.jsp");
	}
	
	
	/**
	 * 제목을 DB 에 저장하는 메소드
	 * @param title
	 */
	private void insertQuery(String title){
		System.out.println("■ 저장하는 메소드를 호출한다. ");
		
		System.out.println("■ 저장 완료");
		
	}
	
	private ArrayList<String> selectQuery(){
		ArrayList<String> list = new ArrayList();
		
		list.add("title 1"); // list[title 1]
		list.add("title 2"); // list[title 1, title 2]
		list.add("title 3"); // list[title 1, title 2, title3]
		
		
		
		return list;
	}

}
