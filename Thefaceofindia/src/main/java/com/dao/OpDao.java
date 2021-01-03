package com.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbutils.HbSession;
import com.model.User;
public class OpDao {

	
	
	//***********User Registration ***********//
	public static void insertUser(User u) {
		// TODO Auto-generated method stub
		Session session=HbSession.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.save(u);
		tx.commit();
		
	}
	
	
	//********************** Validate Login for User ***********************//
	public static boolean checkUserLogin(String u_Email,String u_Pass) {
		// TODO Auto-generated method stub
		boolean login=true;
		try {
		Session session=HbSession.getSessionFactory().openSession();
		Query q=session.createQuery("from User where Email='"+u_Email+"' and Password='"+u_Pass+"'");
		List<User>list=q.list();
		session.close();
		if(list.isEmpty()) {
			return login=false;
		}
		}
		catch(Exception e){
			  // TODO: handle exception
				System.out.println("Ex:"+e);
				}
		return login;		
	}

	public static void updateUser(User u) {
		// TODO Auto-generated method stub
		
	}	
}

    