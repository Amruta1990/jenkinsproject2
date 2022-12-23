package com.AmrutaIT.SpringDataJPAFirstProject.Service;

import java.util.List;

import com.AmrutaIT.SpringDataJPAFirstProject.Model.User;

public interface ServiceI {
	public void saveUser(User user);
	
	public void saveAllUser(List<User> user);
	
	public User findById(Integer Id);
	
	public List<User> getAllUserData(List<Integer> lid);
	
	public List<User> getAllUser();
	
	public  boolean countExists(Integer id);
	
	public long countRecords();
	
	public void delete(int id);
	
	public void deleteByObject(User u);
	
	public void deleteAllByIdContact(List<Integer>list);
	
	public void deleteallcontact();
	
	
		
	
		
	
		
	
	
	

}
