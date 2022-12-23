package com.AmrutaIT.SpringDataJPAFirstProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.sql.Delete;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.AmrutaIT.SpringDataJPAFirstProject.Model.User;
import com.AmrutaIT.SpringDataJPAFirstProject.Repository.UserRepo;
import com.AmrutaIT.SpringDataJPAFirstProject.Service.ServiceImpl;

import ch.qos.logback.core.Context;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

@SpringBootApplication
public class SpringDataJpaFirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaFirstProjectApplication.class, args);
		ServiceImpl bean = context.getBean(ServiceImpl.class);
		//save
		User u = new User();
		u.setName("Amruta");
		u.setAge(7);
		u.setAddress("nashik");
		bean.saveUser(u);
		System.out.println(u);
		//save All
		User u1 = new User();
		u1.setName("Aatharav");
		u1.setAge(5);
		u1.setAddress("pune");
		bean.saveUser(u1);
		System.out.println(u1);
		
		User u2 = new User();
		u2.setName("Mahendra");
		u2.setAge(35);
		u2.setAddress("pune");
		bean.saveUser(u2);
		System.out.println(u2);
//		
//		List<User> list= new ArrayList();
//		list.add(u);
//		list.add(u1);
//		list.add(u2);
//		
//		bean.saveAllUser(list);
//		System.out.println(list);
		
		
		
	
//findbyId	(get data By Id)
		
		//User findById = bean.findById(1);
		//System.out.println(findById);
		
		
	//findallById
		
//		List<Integer> asList = Arrays.asList(2,3);
//		List<User> allUserData = bean.getAllUserData(asList);
//		for(User user : allUserData) {
//			System.out.println(user); 
//		}
		
		
//find all
//		List<User> allUser = bean.getAllUser();
//		for(User us:allUser) {
//			System.out.println(us);
//		}
//	
		//ExistById
		
//		boolean countExists =bean.countExists(1);
//		System.out.println(countExists);
//		
		//count
//		long countRecords = bean.countRecords();
//		System.out.println(countRecords);
		
		//Delete id
		
		//bean.delete(2);
		//System.out.println("delete successfully");
		
		
		//DeletebyId
		
	
		
		
		
		
//		User user = new User();
//		user.setId(3);
//		bean.deleteByObject(user);
//	}
		//delete all by id
//		List<Integer> asList = Arrays.asList(1,4);
//		bean.deleteAllByIdContact(asList);		

		//deleteAllContact.
		
		bean.deleteallcontact();
	
	
	}
}
