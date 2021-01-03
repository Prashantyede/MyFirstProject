package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.OpDao;

/**
 * Servlet implementation class User_Login_Serv
 */
public class User_Login_Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_Login_Serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		
		String u_Email=request.getParameter("t5");
		String u_Pass=request.getParameter("pass");
		
		   boolean login= OpDao.checkUserLogin(u_Email, u_Pass);
		   if(login==true)
			{
				
				session.setAttribute("u_Pass", u_Pass);
				response.sendRedirect("User_Dashboard.html");
			}
			else
			{
				
				//response.sendRedirect("LoginTenant.jsp");
				out.println("<html><center><h1><font color=red> Login Failed... ..</font></h1> </center></html>");
			}
	       
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}


