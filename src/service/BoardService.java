package service;

import java.util.ArrayList;

public class BoardService {

	public void insertTitle(String title){
		// ���� �����͸� �����Ѵ�.
		System.out.println("�� �����ϴ� �޼ҵ带 ȣ���Ѵ�. ");
		
		
		System.out.println("�� ���� �Ϸ�");
		
	}
	

	public ArrayList<String> selectList(){
		System.out.println("�� ��ȸ �޼ҵ� ���� ");
		ArrayList<String> list = new ArrayList();
		
		String query = "SELECT * FROM LICENSE";
		// list = executeQuery(query);
		
		// �����
		//list.add(title);          // list[title 1]
		list.add("title dummy2"); // list[title 1, title 2]
		list.add("title dummy3"); // list[title 1, title 2, title3]
		
		return list;
	}
}
