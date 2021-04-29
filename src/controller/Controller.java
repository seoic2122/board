package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public interface Controller {

	// 사양
	/**
	 * 웹 으로부터 request 를 최초로 받는 부분이다.
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
