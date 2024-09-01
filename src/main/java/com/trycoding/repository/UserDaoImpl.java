package com.trycoding.repository;

import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trycoding.entity.Employee;
import com.trycoding.entity.User;
@Repository
public class UserDaoImpl implements UserDao{
	
	private HibernateTemplate hibernateTemplate;
	

	public UserDaoImpl(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	@Override
	public int saveUser(User usr) {
		return (Integer) hibernateTemplate.save(usr);
	}

	@Override
	public User loginUser(String email, String password) {
		// select * from user_dtls usr where usr.email=? and usr.password=?
		String sql = "from User where email = :eml and password = :pwd";
		
		User usr = (User) hibernateTemplate.execute(s ->{
			Query q = s.createQuery(sql);
			q.setString("eml", email);
			q.setString("pwd", password);
			return q.uniqueResult();
			
		});
		
		return usr;
		
		
	}

}
