package com.AmrutaIT.SpringDataJPAFirstProject.Service;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.AmrutaIT.SpringDataJPAFirstProject.Model.User;
import com.AmrutaIT.SpringDataJPAFirstProject.Repository.UserRepo;
@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	private UserRepo userRepo;
//save
	@Override
	public void saveUser(User user) {
		userRepo.save(user);
		
		
	}
//saveall
	@Override
	public void saveAllUser(List<User> user) {
		userRepo.saveAll(user);
		
	}
@Override
public User findById(Integer Id) {
	User findById = userRepo.findById(Id).get();
	return findById;
}
@Override
public List<User> getAllUserData(List<Integer> lid) {
	
	List<User> findAllById = (List<User>) userRepo.findAllById(lid);
	
	
		return findAllById ;
}
@Override
public List<User> getAllUser() {
	List<User> findAll = (List<User>) userRepo.findAll();
	return findAll;
}
@Override
public boolean countExists(Integer id) {
	boolean existsById = userRepo.existsById(id);
	
	return existsById;
}
@Override
public long countRecords() {
	long count = userRepo.count();
	return count;
	

	
	
	
}
@Override
public void delete(int id) {
	userRepo.deleteById(id);
	
	
}

@Override
public void deleteByObject(User u) {
	userRepo.delete(u);
	
	
	
	
	
}
@Override
public void deleteAllByIdContact(List<Integer> list) {
	userRepo.deleteAllById(list);
	
}
@Override
public void deleteallcontact() {
	userRepo.deleteAll();
	
}

		 
			
		
	
	
	
}

	
	
	


