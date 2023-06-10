//package Practice4;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
///*Servlet and INterfaces*/
///**
// * Servlet implementation class practice_project_4
// */
//@WebServlet("/practice_project_4")
//public class practice_project_4 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	
//    /**
//     * Default constructor. 
//     */
//    public practice_project_4() {
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		PrintWriter scout = response.getWriter();
//	}
//
//	
//
//}
package Practice4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class practice_project_4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {		
		super.init();
		System.out.println("Inside Init method");
	}
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside doGet method");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@Override
	public void destroy() {
		System.out.println("Inside Destroy method");
		super.destroy();
	}

}
