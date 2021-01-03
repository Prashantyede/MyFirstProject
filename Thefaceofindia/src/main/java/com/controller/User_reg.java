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
 * Servlet implementation class User_reg
 */
public class User_reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_reg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	try (PrintWriter out=response.getWriter()){
		String u_FName=request.getParameter("bfnm");
		String u_LName=request.getParameter("blnm");
		String u_Mob=request.getParameter("bcont");
		String u_Email=request.getParameter("bem");
		String u_addr=request.getParameter("badd");
		String u_Pass=request.getParameter("bpass");
		String u_Password=request.getParameter("bpassword");
		 
		//create instance object of the SendEmail Class
        com.model.SendEmail sm = new com.model.SendEmail();
        //get the 6-digit code
        String code = sm.getRandom();
		
		User u=new User();
		//u.setUid(id);
		u.setuFName(u_FName);
		u.setuLName(u_LName);
		u.setuMob(u_Mob);
		u.setuEmail(u_Email);
		u.setuAddr(u_addr);
		u.setuPass(u_Pass);
		u.setuPassword(u_Password);
	    u.setCode(code);
		OpDao.insertUser(u);
		
        
        //call the send email method
        boolean test = sm.sendEmail(u);
        
   		//check if the email send successfully
        if(test){
            HttpSession session  = request.getSession();
            session.setAttribute("authcode", u);
            response.sendRedirect("verify.jsp");
        }else{
   		  out.println("Failed to send verification email");
   	   }
		out.println("<html><center><h1><font color=red> Register Succsessfully ..</font></h1> </center></html>");
	    out.println("<html><center><h1><font color=red> Please Login ..</font></h1> </center></html>");
	   
	    out.println("<html><center><button> <a href=\"User_Login.jsp\">Login</a></button></html></center>");
	
	}
	
	}

}
