package service;

import java.util.ArrayList;

public class BoardService {

	public void insertTitle(String title){
		// 받은 데이터를 저장한다.
		System.out.println("■ 저장하는 메소드를 호출한다. ");
		
		
		System.out.println("■ 저장 완료");
		
	}
	

	public ArrayList<String> selectList(){
		System.out.println("■ 조회 메소드 실행 ");
		ArrayList<String> list = new ArrayList();
		
		String query = "SELECT * FROM LICENSE";
		// list = executeQuery(query);
		
		// 참고용
		//list.add(title);          // list[title 1]
		list.add("title dummy2"); // list[title 1, title 2]
		list.add("title dummy3"); // list[title 1, title 2, title3]
		
		return list;
	}
}
