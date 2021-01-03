package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.OpDao;
import com.model.User;

/**
 * Servlet implementation class ForgotPass_Serv
 */
public class ForgotPass_Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotPass_Serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
				PrintWriter out=response.getWriter();
				HttpSession session=request.getSession();
				
				String u_Email=request.getParameter("email");
				String u_Pass=request.getParameter("password");
				String u_Password=request.getParameter("Conpassword");
				
				User u=new User();
				u.setuPass(u_Pass);
				u.setuPassword(u_Password);
			  
				OpDao.updateUser(u);
				out.println("<html><center><h1><font color=red> Register Succsessfully ..</font></h1> </center></html>");
			    out.println("<html><center><h1><font color=red> Please Login ..</font></h1> </center></html>");
			   
			    out.println("<html><center><button> <a href=\"User_Login.jsp\">Login</a></button></html></center>");
			
	}

}
