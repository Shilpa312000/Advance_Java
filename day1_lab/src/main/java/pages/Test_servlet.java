package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test_servlet
 */
@WebServlet("/Test")

/* run time annotation,class level,mandatory,meant for web container 
 * when deploy web app wc create a map
 * key=url pattern
 * value=F.Q servlet class name(pages.Test_servlet
 * URL--http://localhost:8080/day1_lab/Test
 * http=app layer protocol(scheme)
 * host=DNS qualified host name(www.abc.com)OR IP address
 * port=TCP port no. i.e 8080(default)
 * URI=/day1_lab/Test
 * /day1_lab=context(=web app) root
 * /Test=URL pattern*/

public class Test_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init()
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("in init");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("in destory");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw=response.getWriter()){
			//add dynamic contents to pw buffer
			pw.print("<h1>hello from servlets"+LocalDateTime.now()+"</h1>");
			System.out.println("in doget");
		}
		
	}

}
