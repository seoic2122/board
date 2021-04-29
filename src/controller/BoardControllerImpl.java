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
		System.out.println("■ 컨트롤러 이동");
		
		String title = (String) request.getParameter("title");
		
		System.out.println("■ 넘어온 제목 : "+title);
		// 받은 데이터를 저장하는 서비스 호출
		BoardService bs = new BoardService();
		bs.insertTitle(title);
		
		// 저장후 리스트를 조회하는 메소드를 호출
		// 1.저장된 리스트를 조회해온다.
		ArrayList<String> list = bs.selectList();

		request.setAttribute("list", list );		
		
		System.out.println("■ list.jsp 로 이동 (저장된 데이터와 함께)");
		
		// request.setAttribute("id", id);
		HttpUtil.forward(request, response, "/list.jsp");
		
	}
	


}
