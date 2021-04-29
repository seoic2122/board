package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public interface Controller {

	// ���
	/**
	 * �� ���κ��� request �� ���ʷ� �޴� �κ��̴�.
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
