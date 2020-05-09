package com.javabykiran.dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javabykiran.model.StateMaster;
import com.javabykiran.model.User;
import com.javabykiran.model.Users;
import com.javabykiran.model.downloads_list;
<<<<<<< HEAD
import com.javabykiran.model.links;
import com.javabykiran.model.operators;
=======
>>>>>>> 050e5b00767e0d942f18cd082c835d8965312b53

@Repository
public class User_Dao {

	@Autowired
	private SessionFactory sf;

	public Serializable register(User user) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Serializable id = session.save(user);
		transaction.commit();
		return id;
	}

	public Users addUser(Users users) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(users);
		transaction.commit();
		return users;
		
	}

	public void update(Users users) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(users);
		tx.commit();
	}

	public List<Users> userList() {
		Session session = sf.openSession();
		List<Users>list=session.createCriteria(Users.class).list();
		return list;
	}

	public Users getUsers(int id) {
		return (Users) sf.openSession().get(Users.class, id);

	}

	public void deleteUser(int id) {
		Session session = sf.openSession();
		Transaction tx  = session.beginTransaction();
		Users users = (Users) session.load(Users.class, id);
		if (null != users) {
			session.delete(users);
		}
		tx.commit();
	}

	public void deleteSelected(int[] ids) {
		Session session = sf.openSession();
		for(int i = 0;i<ids.length;i++) {
		Transaction tx  = session.beginTransaction();
		Users users = (Users) session.byId(Users.class).load(ids[i]);
		session.delete(users);
		tx.commit();
	}
	}

	public List<StateMaster> getState() {
		Session session = sf.openSession();
		   List<StateMaster> statesList=session.createCriteria(StateMaster.class).list();
		   return statesList;
		   }

	public StateMaster getStateByID(int sid) {
		return (StateMaster) sf.openSession().get(StateMaster.class,sid);
	}

	public List<downloads_list> showDownloadlist() {
		Session session = sf.openSession();
		List<downloads_list> list=session.createCriteria(downloads_list.class).list();
		
		return list;
	}
<<<<<<< HEAD

	public List<links> showlistoflinks() {
		Session session = sf.openSession();
		List<links> list=session.createCriteria(links.class).list();
		
		return list;
	}

	public List<operators> showlistofoperators() {
		Session session = sf.openSession();
		List<operators> list=session.createCriteria(operators.class).list();
		
		return list;
	}
=======
>>>>>>> 050e5b00767e0d942f18cd082c835d8965312b53
	}
	


