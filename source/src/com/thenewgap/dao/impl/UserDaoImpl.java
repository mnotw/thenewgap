package com.thenewgap.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.thenewgap.dao.UserDao;
import com.thenewgap.model.User;
@Component("userDao")
public class UserDaoImpl implements UserDao {
	@Resource(name="hibernateTemplate")
	private HibernateTemplate template;
	
	
	public void insertUser(User user){
		 long x=(Long) template.save(user);
		 System.out.println(x);
	}
 
	public void deleteById(long id){
		User user=(User) template.get(User.class, id);
		template.delete(user);
	}
	
	public List<User> findAll(){
		@SuppressWarnings("unchecked")
		List<User> list=template.find ( "from User" );
		return list;
	}
	
	public void Update(User user){
		template.update(user);
	}

	public List<User> findByName(String name) {
		List<User> list=template.find("from User u where u.name=?", name);  
		return list;
	}

	public User findById(long id) {
		return template.get(User.class, id);
	}
}
